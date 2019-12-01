package Hopital;
import java.util.LinkedList;

public class PersonnelMedical extends Personnel{
	protected String Specialite;
	protected LinkedList<InterventionMedicale> intervention;

	public PersonnelMedical(String nom, String prenom,int numEmp,String dateEmb,String dateIntervention, String local, float cout,String denomination, String specialite, float prix) {
		super(nom,prenom,numEmp,dateEmb);
		int i=0;
		intervention=new LinkedList<InterventionMedicale>();
		intervention.add(new InterventionMedicale(dateIntervention,local,cout,denomination,specialite,prix));
		Specialite = intervention.get(i).type.Specialite;
		System.out.println("specialite : "+Specialite);
		i++;
	}

	public PersonnelMedical(String nom, String prenom, int numEmp, String dateEmb) {
		super(nom, prenom, numEmp, dateEmb);
		Specialite=" ";
	}
	
	
	
	
}
