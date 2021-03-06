package br.com.ivana.springPost.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Embeddable
@Entity
public class Pokemon {

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Pokedex getPokedex() {
		return pokedex;
	}
	public void setPokedex(Pokedex pokedex) {
		this.pokedex = pokedex;
	}
	@Override
	public String toString() {
		return "Pokemon [url=" + url + ", name=" + name + "]";
	}
	private String url;
	private String name;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@ManyToOne
	private Pokedex pokedex;
	public Pokemon() {
		super();
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Pokemon(String url, String name) {
		super();
		this.url = url;
		this.name = name;
	}
	
}
