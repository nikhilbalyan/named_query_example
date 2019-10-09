package com.example.demo.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


//@NamedQuery(name = "City.findAllOrderedByNameDescending",
//		query = "SELECT c FROM City c ORDER BY c.name DESC")

//@NamedQueries({
//    @NamedQuery(name = "@Product_FindAllByProductName", 
//      query = "from Product where prodName = :prodName")})
@Entity
@Table(name = "cities")
@NamedQuery(name = "City.findAllOrderedByNameDescending",
query = "SELECT c FROM City c ORDER BY c.name DESC")
public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	private int population;
	
//	public City() {
//	}
//	
//	public City(String name, int population) {
//		this.name = name;
//		this.population = population;
//	}
//	
//	public List<City>(String names, int populations) {
//		this.name = name;
//		this.population = population;
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
	
	@Override
	public int hashCode() {
		int hash = 7;
		hash = 79 * hash + Objects.hashCode(this.id);
		hash = 79 * hash + Objects.hashCode(this.name);
		hash = 79 * hash + this.population;
		return hash;
	}
		
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(getClass() != obj.getClass()) {
			return false;
		}
		final City other = (City) obj;
		if(this.population != other.population) {
			return false;
		}
		if(!Objects.equals(this.name, other.name)) {
			return false;
		}
		return Objects.equals(this.id, other.id);
	}
}
