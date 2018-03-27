package br.com.ivana.springPost.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.ivana.springPost.model.Pokemon;
import br.com.ivana.springPost.repository.PokemonRepository;

@Controller
public class PokemonController {
	
	@Autowired
	private PokemonRepository repPokemon;
	
	@RequestMapping(value="/pokemons", method=RequestMethod.GET)
	public ModelAndView newPokemon() {
		ModelAndView mv= new ModelAndView("pokemons");
		Iterable<Pokemon> pokemons= repPokemon.findAll();
		mv.addObject("pokemons",pokemons);
		return mv;
	}
	
	
}
