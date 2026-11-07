package entities;

public class SalleRadiologie {
	private int ID_Salle,NumeroEtage,EquipementAttribueID;
	private String Nom;
	private String TypeSalle;
	private String NormeBlindagePlomb;
	public int getID_Salle() {
		return ID_Salle;
	}
	public void setID_Salle(int iD_Salle) {
		ID_Salle = iD_Salle;
	}
	public int getNumeroEtage() {
		return NumeroEtage;
	}
	public void setNumeroEtage(int numeroEtage) {
		NumeroEtage = numeroEtage;
	}
	public int getEquipementAttribueID() {
		return EquipementAttribueID;
	}
	public void setEquipementAttribueID(int equipementAttribueID) {
		EquipementAttribueID = equipementAttribueID;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getTypeSalle() {
		return TypeSalle;
	}
	public void setTypeSalle(String typeSalle) {
		TypeSalle = typeSalle;
	}
	public String getNormeBlindagePlomb() {
		return NormeBlindagePlomb;
	}
	public void setNormeBlindagePlomb(String normeBlindagePlomb) {
		NormeBlindagePlomb = normeBlindagePlomb;
	}
	public String getStatutDispo() {
		return StatutDispo;
	}
	public void setStatutDispo(String statutDispo) {
		StatutDispo = statutDispo;
	}
	public SalleRadiologie(int iD_Salle, int numeroEtage, int equipementAttribueID, String nom, String typeSalle,
			String normeBlindagePlomb, String statutDispo) {
		super();
		ID_Salle = iD_Salle;
		NumeroEtage = numeroEtage;
		EquipementAttribueID = equipementAttribueID;
		Nom = nom;
		TypeSalle = typeSalle;
		NormeBlindagePlomb = normeBlindagePlomb;
		StatutDispo = statutDispo;
	}
	private String StatutDispo;
}
