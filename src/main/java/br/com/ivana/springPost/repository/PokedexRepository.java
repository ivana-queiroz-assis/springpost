package br.com.ivana.springPost.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.ivana.springPost.model.Pokedex;

public interface PokedexRepository extends CrudRepository<Pokedex,Integer>{

	Pokedex findById(int id);

	
	
}