package br.com.ivana.springPost.model;

import java.util.Arrays;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Pokedex {

	@Id
	@GeneratedValue
	private long id;
	private Integer count;
	private String previous;	
	@Embedded
	@OneToMany
	@OrderColumn
	private Pokemon[] results;
	
	
	
	public Pokemon[] getResults() {
		return results;
	}
	@Override
	public String toString() {
		return "Pokedex [count=" + count + ", previous=" + previous + ", results=" + getResults()[0].toString()+ "]";
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
	public Pokedex(Integer count, String previous, Pokemon[] results) {
		super();
		this.count = count;
		this.previous = previous;
		this.results = results;
	}
	
	public String getPrevious() {
		return previous;
	}
	public void setPrevious(String previous) {
		this.previous = previous;
	}
}
