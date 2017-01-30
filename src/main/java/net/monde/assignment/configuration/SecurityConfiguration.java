package net.monde.assignment.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
		@Autowired
		public void configureGlobal(AuthenticationManagerBuilder authenticationMgr) throws Exception {
			authenticationMgr.inMemoryAuthentication()
				.withUser("admin1")
				.password("admin1")
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

}
