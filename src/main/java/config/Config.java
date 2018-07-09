package config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

import model.SpringTest;

@Configuration
@Import(value = {ServiceConfig.class,DaoConfig.class})
@PropertySource(value = { "classpath:/application.properties" })
public class Config {
	@Value("${test.msg}")
	private String msg;
	
	
	@Bean
	public SpringTest springTest() {
		return new SpringTest(msg);
	}

}
