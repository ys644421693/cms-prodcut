package com.cms.product.db;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateSettings;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Map;

@Configuration
@EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactory", transactionManagerRef = "userTransactionManager", basePackages = {"com.management.app.*","com.cms.product.*"})
public class DataSourceConfig {

    Logger logger = LoggerFactory.getLogger(DataSourceConfig.class);

    @Autowired
    private JpaProperties jpaProperties;

    @Autowired
    @Qualifier("dataSourceMaster")
    private DataSource dataSource;

    @Bean(name = "entityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryPrimary(EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(dataSource)
                .packages("com.management.app.*","com.cms.product.*")
                .persistenceUnit("primaryPersistenceUnit")
                .properties(getVendorProperties())
                .build();
        //设置实体类所在位置
    }

    private Map<String, Object> getVendorProperties() {
        Map<String, Object> jpaMap = jpaProperties.getHibernateProperties(new HibernateSettings());
        return jpaMap;
    }

    @Bean(name = "userEntityManagerFactory")
    @Primary
    public EntityManagerFactory userEntityManagerFactory(EntityManagerFactoryBuilder builder) {
        return this.entityManagerFactoryPrimary(builder).getObject();
    }

    @Bean(name = "userTransactionManager")
    @Primary
    public PlatformTransactionManager writeTransactionManager(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(userEntityManagerFactory(builder));
    }
}
