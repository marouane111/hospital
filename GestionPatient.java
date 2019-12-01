package Hopital;
import java.util.LinkedList;

public class GestionPatient {
	protected LinkedList<Patient> patients;
	
	public Patient getPatient(int numPatient) {
		int i=0;
		while(i<patients.size()) {
			if(numPatient == patients.get(i).NumPatient) return patients.get(i);
			i++;
		}
		return null;
	}
	
	public DossierAdmin getDossierAdmin(Patient p) {
		int i=0;
		while(i<patients.size()) {
			if(p.equals(patients.get(i))) return (DossierAdmin)patients.get(i);
		}
		
	}
	
}
