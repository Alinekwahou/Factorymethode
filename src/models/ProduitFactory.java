package models;

public class ProduitFactory {
	public static final String TypeproduitA="A";
	public static final String TypeproduitB="B";
	public static final String TypeproduitC="C";
	
	public Produit getmethode(String type) {
		Produit produit=null;
		switch(type) {
		case TypeproduitA:
			produit=new ProduitA();
			break;
		case TypeproduitB:
			produit=new ProduitB();
		break;
		case TypeproduitC:
			produit=new ProduitC();
		break;
		default:
			throw new IllegalArgumentException("produit inconnu");
		}
		
		
		return produit;
		
	};

}
