package models;



public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(12);
		ProduitFactory factory=new ProduitFactory();
		Produit produit=null;
		
		produit=factory.getmethode(factory.TypeproduitA);
		produit.methode();
	    
		produit=factory.getmethode(factory.TypeproduitB);
		produit.methode();
	
		produit=factory.getmethode(factory.TypeproduitC);
		produit.methode();
	String autre="D";
		produit=factory.getmethode(autre);
		produit.methode();
	

	}

}
