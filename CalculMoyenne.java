package td03;
import java.util.Scanner;
public class CalculMoyenne {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entrez le nombre d'étudiants : ");
        	int nb = scanner.nextInt();
        while(nb<=0 || nb>tab.getNmax()) {
        	System.out.print("le nombre est invalide\n");
        		System.out.print("Entrez le nombre d'étudiants : ");
        		nb = scanner.nextInt();
        }
        
        float[] noteCtrl = new float[nb];
        float[] noteExam = new float[nb];
        
        System.out.println("Entrer les notes de contrôle :");
        for (int i = 0; i < nb; i++) {
        	
            System.out.print("l'étudiant N°" + (i + 1) + "= ");
            noteCtrl[i] = scanner.nextFloat();
            while(noteCtrl[i]<=0 || noteCtrl[i]>=20) {
            	System.out.print("Redonner le note de l'étudiant N°" + (i + 1) + "= ");
                noteCtrl[i] = scanner.nextFloat();
            }
        }
        System.out.println("Affichage les notes de contrôle :");
		        for(int i=0;i<nb;i++) {
		        	 System.out.println("l'etudient N°"+ (i+1) +":"+noteCtrl[i]+"\n");
		        }
        
        
        System.out.println("Entrer les notes d'examen :");
        for (int i = 0; i < nb; i++) {
            System.out.print("l'étudiant N°" + (i + 1) + "=");
            noteExam[i] = scanner.nextFloat();
            while( noteExam[i]<=0 || noteExam[i]>=20) {
            	System.out.print("Redonner le note de l'étudiant N°" + (i + 1) + "= ");
            	noteExam[i] = scanner.nextFloat();
            }
        }
        System.out.println("Affichage les notes d'examen :");
		        for(int i=0;i<nb;i++) {
		        	 System.out.println("l'etudient N°"+ (i+1) +":"+noteExam[i]+"\n");
		        }
		        
		       			        
        System.out.println("La moyenne de ses etudient est :");      	
        float[] moy = new float[nb];
        float s=0;
        for(int i=0;i<nb;i++) {
        	System.out.print("La moyenne de l'etudient "+ (i+1) +" est = ");
        	moy[i] =noteCtrl[i] + 2*noteExam[i] ;
        	System.out.println(moy[i]);
        	s += moy[i];    
        }
        System.out.println("La moyenne de la classe est :");
        System.out.println(s/nb);
        
	}

}
