package personnes;

public class Deposant extends Personne{
    private String civilite;
    private String adresseMessagerie;
    private Adresse adresse;

public Deposant (String nom, String prenom, Adresse adresse){ 
    super(nom, prenom);
    this.adresse = adresse;
}
public String toString() {
    return super.toString() + " " + this.adresse;
}
}