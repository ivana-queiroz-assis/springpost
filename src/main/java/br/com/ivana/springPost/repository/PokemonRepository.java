package br.com.ivana.springPost.repository;

import org.springframework.data.repository.CrudRepository;


import br.com.ivana.springPost.model.Pokemon;



public interface PokemonRepository extends CrudRepository<Pokemon,String>{

	Pokemon findById(int id);
	
}
