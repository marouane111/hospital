package Hopital;

public class Patient extends Personne{
	protected int NumPatient;
	protected String DateEnregistrement;
	protected DossierAdmin dossier;
	
	public Patient(String nom, String prenom,int numPatient,String dateEnregistrement) {
		super(nom, prenom);
		NumPatient=numPatient;
		DateEnregistrement=dateEnregistrement;
	}
	
	public Patient(String nom, String prenom,int numPatient,String dateenregistrement,String dateEnregistrement, String dateSortie,String dateIntervention, String local, float cout,String denomination, String specialite, float prix) {
		super(nom, prenom);
		NumPatient=numPatient;
		DateEnregistrement=dateenregistrement;
		dossier =new DossierAdmin(dateEnregistrement,dateSortie,dateIntervention,local,cout,denomination,specialite,prix);
	
	}
	
	public DossierAdmin getDossierAdmin() {
		return dossier;
	}
	
}
