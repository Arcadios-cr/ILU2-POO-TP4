package produit;

public enum Unite {
	litre("l"), gramme("g"), kilogramme("kg"), centilitre("cl"), millilitre("ml"), piece("p");
	private String nom;
	private Unite(String nom) {
		this.nom=nom;
	}
	public String toString() {
		return nom;
	}
}