package com.cms.product;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableApolloConfig(value = {"product.Druid-db"},order = 2)
public class ApolloConfig {
}
