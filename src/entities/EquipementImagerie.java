package entities;

public class EquipementImagerie {
	private int ID_Equipement;
	private String Type ;
	private String Marque;
	private float HeuresCumulees;
	private float HeuresRestantesMaintenance;
	private String Statut;
	public EquipementImagerie(int iD_Equipement, String type, String marque, float heuresCumulees,
			float heuresRestantesMaintenance, String statut) {
		super();
		ID_Equipement = iD_Equipement;
		Type = type;
		Marque = marque;
		HeuresCumulees = heuresCumulees;
		HeuresRestantesMaintenance = heuresRestantesMaintenance;
		Statut = statut;
	}
	public int getID_Equipement() {
		return ID_Equipement;
	}
	public void setID_Equipement(int iD_Equipement) {
		ID_Equipement = iD_Equipement;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getMarque() {
		return Marque;
	}
	public void setMarque(String marque) {
		Marque = marque;
	}
	public float getHeuresCumulees() {
		return HeuresCumulees;
	}
	public void setHeuresCumulees(float heuresCumulees) {
		HeuresCumulees = heuresCumulees;
	}
	public float getHeuresRestantesMaintenance() {
		return HeuresRestantesMaintenance;
	}
	public void setHeuresRestantesMaintenance(float heuresRestantesMaintenance) {
		HeuresRestantesMaintenance = heuresRestantesMaintenance;
	}
	public String getStatut() {
		return Statut;
	}
	public void setStatut(String statut) {
		Statut = statut;
	}
			

}
