package personnes;

public class Personne {
	
	private String nom;
	private String prenom;
	public Personne(String nom, String prenom)
	{
	this.nom = validate(nom, 50);
	this.prenom = validate(prenom, 30);
	}
	protected String validate (String chaine, Integer taille)
	{
	
	return chaine;

	}
	public String toString() {return this.nom + " " + this.prenom; }

}
