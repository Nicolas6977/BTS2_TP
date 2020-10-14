package personnes;
import java.sql.Connection;

public class Deposant extends Personne {
  private String civilite;
  private String adresseMessagerie;
  private Adresse adresse;

  public Deposant(String nom, String prenom, Adresse adresse) {
    super(nom, prenom);
    this.adresse = adresse;
  }

  public void stocker(Connection connexion) {}
}