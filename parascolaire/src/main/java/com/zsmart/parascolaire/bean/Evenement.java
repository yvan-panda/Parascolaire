package com.zsmart.parascolaire.bean;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;

@Entity
public class Evenement implements Serializable {
	
	private Long id;
	private String description;
	private Date dateDebut;
	private Date dateFin;
	private Double budgetCollecte;
	private Double budgetConsomme;
	private Club club;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public Double getBudgetCollecte() {
		return budgetCollecte;
	}
	public void setBudgetCollecte(Double budgetCollecte) {
		this.budgetCollecte = budgetCollecte;
	}
	public Double getBudgetConsomme() {
		return budgetConsomme;
	}
	public void setBudgetConsomme(Double budgetConsomme) {
		this.budgetConsomme = budgetConsomme;
	}
	public Club getClub() {
		return club;
	}
	public void setClub(Club club) {
		this.club = club;
	}
	public Evenement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Evenement(Long id, String description, Date dateDebut, Date dateFin, Double budgetCollecte,
			Double budgetConsomme, Club club) {
		super();
		this.id = id;
		this.description = description;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.budgetCollecte = budgetCollecte;
		this.budgetConsomme = budgetConsomme;
		this.club = club;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((budgetCollecte == null) ? 0 : budgetCollecte.hashCode());
		result = prime * result + ((budgetConsomme == null) ? 0 : budgetConsomme.hashCode());
		result = prime * result + ((club == null) ? 0 : club.hashCode());
		result = prime * result + ((dateDebut == null) ? 0 : dateDebut.hashCode());
		result = prime * result + ((dateFin == null) ? 0 : dateFin.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Evenement other = (Evenement) obj;
		if (budgetCollecte == null) {
			if (other.budgetCollecte != null)
				return false;
		} else if (!budgetCollecte.equals(other.budgetCollecte))
			return false;
		if (budgetConsomme == null) {
			if (other.budgetConsomme != null)
				return false;
		} else if (!budgetConsomme.equals(other.budgetConsomme))
			return false;
		if (club == null) {
			if (other.club != null)
				return false;
		} else if (!club.equals(other.club))
			return false;
		if (dateDebut == null) {
			if (other.dateDebut != null)
				return false;
		} else if (!dateDebut.equals(other.dateDebut))
			return false;
		if (dateFin == null) {
			if (other.dateFin != null)
				return false;
		} else if (!dateFin.equals(other.dateFin))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Evenement [id=" + id + ", description=" + description + ", dateDebut=" + dateDebut + ", dateFin="
				+ dateFin + ", budgetCollecte=" + budgetCollecte + ", budgetConsomme=" + budgetConsomme + ", club="
				+ club + "]";
	}

	
	



	
	

}
