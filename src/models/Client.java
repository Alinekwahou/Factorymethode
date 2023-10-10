package models;



public class Client {

	public static void main(String[] args) {
		
		ProduitFactory factory=new ProduitFactory();
		Produit produit=null;
		
		produit=factory.getmethode(factory.TypeproduitA);
		produit.methode();
	    
		produit=factory.getmethode(factory.TypeproduitB);
		produit.methode();
	
		
	String autre="C";
		produit=factory.getmethode(autre);
		produit.methode();
	

	}

}
