package td03;
import java.util.Scanner;
public class tab {

	public static final int nmax = 40;
	
	
	public static void remplir(float t[]) {
		Scanner a=new Scanner(System.in);
		for(int i=0;i<nmax;i++) {	
			System.out.println("Saisir T [ "+i+" ] = ");
			t[i]=a.nextFloat();
		}
	}
static float somme_element(float t[]) {
	float s=0;
	for(int i=0;i<t.length;i++) {
		s=s+t[i];
	}
	return s;
	}

static public float[] additionner (float t1[], float t2[]){
	   int  i=0,n=t1.length;
	   float add[] = new float[n];
	    if (t1.length == t2.length) {
	    	for (i = 0; i <t2.length; i++) {
	            add[i] = t1[i] + t2[i];
	        	}} 
	    else {
	         System.out.println("On ne peut pas additionner ces deux tableaux, car ils ont des longueurs différentes.");
	    
	    }
	    return add;	
}
public static float[] produit(float x, float t[]) {
	for(int i=0; i<t.length ;i++){
		t[i]=t[i]*x;
	}
	return t;
}

public static void lister(float t[]) {
	for(int i=0; i<t.length ;i++){
		System.out.println("t[" + i + "] = " + t[i]);
	}
}
public static int getNmax() {
	return nmax;
}

public  void additionner(float x, float t[] ) {
	for(int i=0; i<t.length ;i++){
		t[i]=t[i]+x;
	}

}



}