package Hopital;
public class InterventionMedicale {
	protected String DateIntervention;
	protected String Local;
	protected float Cout;
	protected TypeIntervention type;
	
	public InterventionMedicale(String dateIntervention, String local, float cout) {
		DateIntervention = dateIntervention;
		Local = local;
		Cout = cout;
	}
	
	
	public InterventionMedicale(String dateIntervention, String local, float cout,String denomination, String specialite, float prix) {
		DateIntervention = dateIntervention;
		Local = local;
		Cout = cout;
		type = new TypeIntervention(denomination,specialite,prix);
	}
	
	public float CalculCoutTotal() {
		return this.Cout*type.getPrix();
	}
	
	
}
