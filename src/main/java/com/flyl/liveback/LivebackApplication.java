package com.flyl.liveback;

import org.beetl.core.resource.WebAppResourceLoader;
import org.beetl.ext.spring.BeetlGroupUtilConfiguration;
import org.beetl.ext.spring.BeetlSpringViewResolver;
import org.beetl.sql.core.ClasspathLoader;
import org.beetl.sql.core.Interceptor;
import org.beetl.sql.core.UnderlinedNameConversion;
import org.beetl.sql.core.db.MySqlStyle;
import org.beetl.sql.ext.DebugInterceptor;
import org.beetl.sql.ext.spring4.BeetlSqlDataSource;
import org.beetl.sql.ext.spring4.BeetlSqlScannerConfigurer;
import org.beetl.sql.ext.spring4.SqlManagerFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternUtils;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.io.IOException;

@SpringBootApplication
public class LivebackApplication {

	public static void main(String[] args) {
		SpringApplication.run(LivebackApplication.class, args);
	}

	@Bean(initMethod = "init", name = "beetlConfig")
	public BeetlGroupUtilConfiguration getBeetlGroupUtilConfiguration() {

		BeetlGroupUtilConfiguration beetlGroupUtilConfiguration = new BeetlGroupUtilConfiguration();
		ResourcePatternResolver patternResolver = ResourcePatternUtils.getResourcePatternResolver(new DefaultResourceLoader());
		try {
			String root =  patternResolver.getResource("classpath:templates/").getFile().toString();
			WebAppResourceLoader webAppResourceLoader = new WebAppResourceLoader(root);
			beetlGroupUtilConfiguration.setResourceLoader(webAppResourceLoader);

			beetlGroupUtilConfiguration.setConfigFileResource(patternResolver.getResource("classpath:beetl.properties"));
			return beetlGroupUtilConfiguration;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}

	@Bean(name = "beetlViewResolver")
	public BeetlSpringViewResolver getBeetlSpringViewResolver(@Qualifier("beetlConfig") BeetlGroupUtilConfiguration beetlGroupUtilConfiguration) {
		BeetlSpringViewResolver beetlSpringViewResolver = new BeetlSpringViewResolver();
		beetlSpringViewResolver.setSuffix(".html");
		beetlSpringViewResolver.setContentType("text/html;charset=UTF-8");
		beetlSpringViewResolver.setOrder(0);
		beetlSpringViewResolver.setConfig(beetlGroupUtilConfiguration);
		return beetlSpringViewResolver;
	}

	@Bean(name = "beetlSqlScannerConfigurer")
	public BeetlSqlScannerConfigurer getBeetlSqlScannerConfigurer() {
		BeetlSqlScannerConfigurer conf = new BeetlSqlScannerConfigurer();
		conf.setBasePackage("com.flyl.liveback.dao");
		conf.setDaoSuffix("Dao");
		conf.setSqlManagerFactoryBeanName("sqlManagerFactoryBean");
		return conf;
	}

	@Bean(name = "sqlManagerFactoryBean")
	@Primary
	public SqlManagerFactoryBean getSqlManagerFactoryBean(@Qualifier("datasource") DataSource datasource) {
		SqlManagerFactoryBean factory = new SqlManagerFactoryBean();

		BeetlSqlDataSource source = new BeetlSqlDataSource();
		source.setMasterSource(datasource);;
		factory.setCs(source);
		factory.setDbStyle(new MySqlStyle());
		factory.setInterceptors(new Interceptor[]{new DebugInterceptor()});
		factory.setNc(new UnderlinedNameConversion());
		factory.setSqlLoader(new ClasspathLoader("/sql"));
		return factory;
	}


	@Bean(name="datasource")
	public DataSource getDataSource() {
		System.out.println("-------------------- primaryDataSource init ---------------------");
		return DataSourceBuilder.create().url("jdbc:mysql://qdm16239399.my3w.com/qdm16239399_db").username("qdm16239399").password("Wwaacc11").build();
	}


	@Bean(name="txManager")
	public DataSourceTransactionManager getDataSourceTransactionManager(@Qualifier("datasource") DataSource datasource) {
		DataSourceTransactionManager dsm = new DataSourceTransactionManager();
		dsm.setDataSource(datasource);
		return dsm;
	}
}
