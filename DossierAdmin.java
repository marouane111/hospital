package Hopital;

import java.util.LinkedList;

public class DossierAdmin {
	protected String DateEnregistrement;
	protected String DateSortie;
	static protected int lit=0;
	protected LinkedList<InterventionMedicale> intervent;
	
	public DossierAdmin(String dateEnregistrement, String dateSortie,String dateIntervention, String local, float cout,String denomination, String specialite, float prix) {
		intervent=new LinkedList<InterventionMedicale>();
		intervent.add(new InterventionMedicale(dateIntervention,local,cout,denomination,specialite,prix));
		DateEnregistrement = dateEnregistrement;
		DateSortie = dateSortie;
		lit++;
	}
	
}
