package net.monde.assignment.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.AuthenticationTrustResolver;
import org.springframework.security.authentication.AuthenticationTrustResolverImpl;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
	Environment env;

		@Autowired
		public void configureGlobal(AuthenticationManagerBuilder authenticationMgr) throws Exception {
			authenticationMgr.inMemoryAuthentication()
				.withUser(env.getProperty("username"))
				.password(env.getProperty("password"))
				.authorities("ROLE_USER");
			
		}
		
		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.authorizeRequests()
				.antMatchers("/api/**").access("hasRole('ROLE_USER')")
				.and()
					.formLogin().loginPage("/loginpage")
					.defaultSuccessUrl("/api/v1/projects")
					.failureUrl("/loginpage?error")
					.usernameParameter("username").passwordParameter("password")				
				.and()
					.logout().logoutSuccessUrl("/loginpage?logout"); 
			
			
		}
		
		@Bean
		public AuthenticationTrustResolver getAuthenticationTrustResolver() {
			return new AuthenticationTrustResolverImpl();
		}


}
