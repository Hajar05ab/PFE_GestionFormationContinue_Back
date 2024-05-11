package ma.emsi.ScurityConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {
	 @Bean
	    public InMemoryUserDetailsManager userDetailsService() {
	        return new InMemoryUserDetailsManager(
	                User.withUsername("admin").password(passwordEncoder().encode("12345")).roles("USER", "ADMIN").build(),
	                User.withUsername("hajar").password(passwordEncoder().encode("12345")).roles("USER").build()
	        );
	    }
	 
	 @Bean
	    public PasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();
	    }
  
}

