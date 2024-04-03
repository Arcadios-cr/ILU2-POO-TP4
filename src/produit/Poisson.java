package produit;

public class Poisson extends Produit{
	private String jour;
	public Poisson(String nom, Unite unite, String jour) {
		super(nom,unite);
		this.jour = jour;
	}
	public void decrireProduit(Produit produit) {
		StringBuilder chaine = new StringBuilder();
		chaine.append(produit.getNom());
		chaine.append(" pêché ");
		chaine.append(jour);
		System.out.println(chaine);
	}
}
