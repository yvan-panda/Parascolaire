package com.zsmart.parascolaire.bean;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;

@Entity
public class Club implements Serializable {
	
	private Long id;
	private String libelle;
	private Date dateCreation;
	private TypeClub typeClub;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public TypeClub getTypeClub() {
		return typeClub;
	}
	public void setTypeClub(TypeClub typeClub) {
		this.typeClub = typeClub;
	}
	
	public Club() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Club(Long id, String libelle, Date dateCreation, TypeClub typeClub) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.dateCreation = dateCreation;
		this.typeClub = typeClub;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateCreation == null) ? 0 : dateCreation.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((libelle == null) ? 0 : libelle.hashCode());
		result = prime * result + ((typeClub == null) ? 0 : typeClub.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Club other = (Club) obj;
		if (dateCreation == null) {
			if (other.dateCreation != null)
				return false;
		} else if (!dateCreation.equals(other.dateCreation))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (libelle == null) {
			if (other.libelle != null)
				return false;
		} else if (!libelle.equals(other.libelle))
			return false;
		if (typeClub == null) {
			if (other.typeClub != null)
				return false;
		} else if (!typeClub.equals(other.typeClub))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Club [id=" + id + ", libelle=" + libelle + ", dateCreation=" + dateCreation + ", typeClub=" + typeClub
				+ "]";
	}
	
	
	
	

}
