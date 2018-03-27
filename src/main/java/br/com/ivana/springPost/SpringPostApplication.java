package br.com.ivana.springPost;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import br.com.ivana.springPost.model.Pokemon;
import br.com.ivana.springPost.ws.ConsumindoPokemons;
import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
@ComponentScan({"br.com.ivana.springPost.ws"})
public class SpringPostApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPostApplication.class, args);
	
	}
}
