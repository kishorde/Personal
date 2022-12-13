/*
 * package com.cybage.config;
 * 
 * import org.springframework.context.annotation.Configuration; import
 * org.springframework.http.HttpMethod; import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter; import
 * org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; import
 * org.springframework.security.crypto.password.PasswordEncoder;
 * 
 * 
 * @EnableWebSecurity
 * 
 * @Configuration public class SecurityConfig extends
 * WebSecurityConfigurerAdapter{
 * 
 * public void configure(AuthenticationManagerBuilder auth) throws Exception {
 * 
 * 
 * auth.inMemoryAuthentication().passwordEncoder(passwordEncoder()).withUser(
 * "kishoruser")
 * .password(passwordEncoder().encode("kishoruser")).roles("USER").and()
 * .withUser("Adminuser").password(passwordEncoder().encode("adminuser")).roles(
 * "ADMIN");
 * 
 * 
 * 
 * 
 * }
 * 
 * 
 * private PasswordEncoder passwordEncoder() { // TODO Auto-generated method
 * stub return new BCryptPasswordEncoder(); }
 * 
 * 
 * @Override protected void configure(HttpSecurity http) throws Exception {
 * http.httpBasic() .and() .authorizeRequests() .antMatchers(HttpMethod.POST
 * ,"/product/**").hasRole("ADMIN")
 * .antMatchers(HttpMethod.GET,"/product/**").hasAnyRole("ADMIN")
 * .antMatchers(HttpMethod.GET,"/product/").hasAnyRole("USER").and().csrf().
 * disable(); }
 * 
 * 
 * 
 * }
 */