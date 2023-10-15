package td03;

public class Dictionnaire {
	private int nbMots;
	private MotDico dico[];
	private String nom;
	
	public Dictionnaire(String nom, int n) {
        this.nom = nom;
        this.dico=new MotDico[n];
        
    }
public void ajouterMot(MotDico m) {
	if(nbMots<dico.length) {	
		dico[nbMots]=m;
		nbMots++;
	}else {
		System.out.println(" Le Dictionnaire est plein ");
	}
}
public  void supprimerMot (String mot) {
	boolean supprimer=false;
	for(int i=0 ;i<dico.length ;i++) {
		if(dico[i]!=null && dico[i].getMot()==mot) {
			dico[i]=null;
			break;
		}else if(!(supprimer)) {
			System.out.println("le mot :"+mot+"non trouve dans le dictionnaire");
		
		}
	}}
public int chercherMot(String ch) {
    for (int i = 0; i < dico.length; i++) {
        if ((dico[i] != null) && (dico[i].getMot()==ch)) {
            return i;
        }
    }
    return -1;   
	}
void listerDico() {
    for (int i = 0; i < dico.length; i++) 
    {
        if (dico[i] != null) {
            System.out.println("Le mot du dictionnaire : " + dico[i].getMot());
            System.out.println("La définition du mot : " + dico[i].getDef());
        }
    
}
}



public int nbSynonymes(MotDico m) {
    int nb = 0;
    for (int i = 0; i < dico.length; i++) {
        if ((dico[i] != null) && (dico[i].synonyme(m))) {
            nb++;
        }
    }
    return nb;
}
}
