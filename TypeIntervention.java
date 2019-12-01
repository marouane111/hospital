package Hopital;
public class TypeIntervention {
	protected String Denomination;
	protected String Specialite;
	protected float Prix;
	
	public TypeIntervention(String denomination, String specialite, float prix) {
		Denomination = denomination;
		Specialite = specialite;
		Prix = prix;
	}
	
	public float getPrix() {
		return Prix;
	}
}
