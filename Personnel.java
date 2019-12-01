package Hopital;

public class Personnel extends Personne{
	protected int NumEmp;
	protected String DateEmb;
	public Personnel(String nom, String prenom,int numEmp,String dateEmb) {
		super(nom, prenom);
		NumEmp=numEmp;
		DateEmb=dateEmb;
	}
	
	

}
