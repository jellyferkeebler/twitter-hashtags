package myproject.twitterhashtags;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 * Under the covers, the @SpringBootApplication add in
 * 	- @Configuration
 * 	- @EnableAutoConfiguration
 * 	- @ComponentScan
 */
public class TwitterHashtagsApplication {

	public static void main(String[] args) {

		SpringApplication.run(TwitterHashtagsApplication.class, args);
	}

}
