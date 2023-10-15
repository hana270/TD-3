package td03;

public class MotDico {
	private static int count;
	private int numero;
	private String mot;
	private String def;
public MotDico(String mot,String def) {
	count++;
	this.numero=count;
	this.def=def;
	this.mot=mot;
}
	
public String getMot() {
	return mot;
}
public String getDef() {
	return def;
}
public int getNum() {
	return numero;
}
public void setDefinition(String s) {
	this.def=s;
}
public void setMot(String s) {
	this.mot=s;
}
public boolean synonyme(MotDico m) {
	if(m.getMot()==mot && m.getDef()==def) {
		return true;
	}
	return false;
}

@Override
public String toString() {
	return "MotDico N ° " + this.numero + ", mot=" + this.mot + ", def=" + this.def;
}

}
