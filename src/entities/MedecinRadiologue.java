package entities;

public class MedecinRadiologue {
	private String idMedecin;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private String specialite; // ex: "IRM", "Scanner"
    // Tableau simple pour ses jours de présence (7 jours max)
    private float tarifPourcentageActe ;
    public float getTarifPourcentageActe() {
		return tarifPourcentageActe;
	}
	public void setTarifPourcentageActe(float tarifPourcentageActe) {
		this.tarifPourcentageActe = tarifPourcentageActe;
	}
	public MedecinRadiologue(float tarifPourcentageActe) {
		super();
		this.tarifPourcentageActe = tarifPourcentageActe;
	}
	private String[] joursDisponibles = new String[7];
	
    public String getIdMedecin() {
		return idMedecin;
	}
	public void setIdMedecin(String idMedecin) {
		this.idMedecin = idMedecin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	public String[] getJoursDisponibles() {
		return joursDisponibles;
	}
	public void setJoursDisponibles(String[] joursDisponibles) {
		this.joursDisponibles = joursDisponibles;
	}
	public MedecinRadiologue(String idMedecin, String nom, String prenom, String email, String telephone,
			String specialite, String[] joursDisponibles) {
		super();
		this.idMedecin = idMedecin;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.specialite = specialite;
		this.joursDisponibles = joursDisponibles;
	}

}
