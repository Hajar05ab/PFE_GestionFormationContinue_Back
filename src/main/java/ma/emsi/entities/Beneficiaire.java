package ma.emsi.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Beneficiaire extends Personne {
	
	@OneToMany
	private List <Affectation> affectation;
	
	@OneToMany
	private List <Diplome> diplome;
	
	@OneToOne
	private Abscence abscence;
	
	@OneToMany
	private List <ForContinue> forContinue;
	
	

}
