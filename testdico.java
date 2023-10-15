package td03;

public class testdico {

	public static void main(String[] args) {
		 Dictionnaire D =  new Dictionnaire(" Larousse",3);
	        MotDico m=new  MotDico("livre 1","11");
	        MotDico x=new  MotDico("livre 2","22");
	        MotDico a=new  MotDico("livre 3","33");
	        
	        D.ajouterMot(m);
	        D.ajouterMot(x);
	        D.ajouterMot(a);
	        D.listerDico();
	        
	        System.out.println("le mot chercher est ="+D.chercherMot("hello"));
	        System.out.println("le mot chercher est ="+D.chercherMot("livre 3") ); 
	        D.listerDico();
	        System.out.println("le nb de synonyme du mots:"+ D.nbSynonymes(a));
	        
	        D.supprimerMot("livre 1");
	        D.listerDico();
	      

	}

}
