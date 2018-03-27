package br.com.ivana.springPost.model;



import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Pokedex implements Serializable{

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private Integer count;
		
	@Embedded
	@OneToMany
	@OrderColumn
	private Pokemon[] results;
	
	
	
	public Pokemon[] getResults() {
		return results;
	}
	@Override
	public String toString() {
		return "Pokedex [count=" + count + ", previous="  + ", results=" + getResults()[0].toString()+ "]";
	}
	public void setResults(Pokemon[] results) {
		this.results = results;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Pokedex() {
		super();
	}
	public Pokedex(Integer count,  Pokemon[] results) {
		super();
		this.count = count;
		
		this.results = results;
	}
	
	
	
}
