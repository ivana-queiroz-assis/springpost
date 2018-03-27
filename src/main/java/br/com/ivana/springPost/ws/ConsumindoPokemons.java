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
import br.com.ivana.springPost.repository.PokedexRepository;
import br.com.ivana.springPost.repository.PokemonRepository;

@Component
public class ConsumindoPokemons implements CommandLineRunner {
	
	private static PokedexRepository repo; 
	private static PokemonRepository repoPokemon;
	
	private static void getAllPokemon() {

		RestTemplate r = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.add("user-agent",
				"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

		ResponseEntity<Pokedex> response = r.exchange("https://pokeapi.co/api/v2/pokemon/", HttpMethod.GET, entity,
				Pokedex.class);
		System.out.println(response.getBody().toString());
		Pokedex p= response.getBody();
		p.setId(1);
		int i=0;
		for(Pokemon p1:p.getResults()) {
			p1.setId(i);
			System.out.println(p1.getId());			
			p1.setPokedex(p);
			repoPokemon.save(p1);
			i++;
		}
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		getAllPokemon();
	}

}
