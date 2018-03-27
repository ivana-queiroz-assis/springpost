package br.com.ivana.springPost.ws;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import br.com.ivana.springPost.model.Pokedex;
import br.com.ivana.springPost.model.Pokemon;

@Component
public class ConsumindoPokemons implements CommandLineRunner {

	private static void getAllPokemon() {

		RestTemplate r = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.add("user-agent",
				"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

		ResponseEntity<Pokedex> response = r.exchange("https://pokeapi.co/api/v2/pokemon/", HttpMethod.GET, entity,
				Pokedex.class);

		
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		getAllPokemon();
	}

}
