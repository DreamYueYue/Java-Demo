package com.manulife.eTransfer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;
import org.springframework.security.oauth2.provider.expression.OAuth2WebSecurityExpressionHandler;

/**
 * 资源服务器配置
 */
@Configuration
@EnableResourceServer
@EnableOAuth2Client
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {
    public static final String RESOURCE_ID = "resource";

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        // Flag to indicate that only token-based authentication is allowed on these resources.
        // 表明资源只能基于token认证
        resources.resourceId(RESOURCE_ID).stateless(false);
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers(HttpMethod.OPTIONS, "/api/**").permitAll()
//                .anyRequest().authenticated();
//                .and()
//                .authorizeRequests()
//                .antMatchers("/api/**").authenticated();
//                .and()
//                .exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
//        http.authorizeRequests()
//                .antMatchers(HttpMethod.OPTIONS, "/api/**").permitAll()
//                .and()
//                .authorizeRequests()
//                .expressionHandler(new OAuth2WebSecurityExpressionHandler());
        http.authorizeRequests().antMatchers(HttpMethod.OPTIONS, "/natinality/**").permitAll()
                .and().antMatcher("/natinality/**").authorizeRequests().anyRequest().authenticated()
                .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
    }
}
