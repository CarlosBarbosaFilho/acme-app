/**
 * 
 */
package br.com.acme.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author carlos
 *
 */
@SpringBootApplication(
	scanBasePackages = { "br.com.acme.api",
						 "br.com.acme.service"})
@EnableJpaRepositories("br.com.acme.repository")
@EntityScan("br.com.acme.model")
public class AcmeApi {
	public static void main(String[] args) {
		SpringApplication.run(AcmeApi.class, args);
	}
}
