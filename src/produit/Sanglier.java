package produit;
import personnages.Gaulois;

public class Sanglier extends Produit{
	private Float poids;
	private Gaulois chasseur;
	public Sanglier(String nom, Unite unite, Float poids, Gaulois chasseur) {
		super(nom,unite);
		this.poids = poids;
		this.chasseur = chasseur;
	}
	public void decrireProduit(Produit produit) {
		StringBuilder chaine = new StringBuilder();
		chaine.append(produit.getNom());
		chaine.append(" de ");
		chaine.append(poids);
		chaine.append(unite);
		chaine.append(" chassé par ");
		chaine.append(chasseur);
		System.out.println(chaine);

	}
}
