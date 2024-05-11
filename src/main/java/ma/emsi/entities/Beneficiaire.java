package ma.emsi.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Beneficiaire extends Personne {
	
	@OneToMany(mappedBy = "beneficiaire")
	private List <Affectation> affectation;
	
	@OneToMany(mappedBy = "beneficiaire")
	private List <Diplome> diplome;
	
	@OneToMany(mappedBy = "beneficiaire")
	private List <Abscence> abscence;
	
	@OneToMany
	private List <ForContinue> forContinue;
	
	

}
