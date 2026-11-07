package entities;

public class ManipulateurRadio {
	private String idManip;
    private String nom,prenom;
    private String Habilitations;
    private float tarifHoraire;
    private String email;
    private String telephone;
    private String stausDispo;
    
	public ManipulateurRadio(String idManip, String nom, String prenom, String habilitations, float tarifHoraire,
			String email, String telephone, String stausDispo) {
		super();
		this.idManip = idManip;
		this.nom = nom;
		this.prenom = prenom;
		Habilitations = habilitations;
		this.tarifHoraire = tarifHoraire;
		this.email = email;
		this.telephone = telephone;
		this.stausDispo = stausDispo;
	}
	public String getIdManip() {
		return idManip;
	}
	public void setIdManip(String idManip) {
		this.idManip = idManip;
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
	public String getHabilitations() {
		return Habilitations;
	}
	public void setHabilitations(String habilitations) {
		Habilitations = habilitations;
	}
	public float getTarifHoraire() {
		return tarifHoraire;
	}
	public void setTarifHoraire(float tarifHoraire) {
		this.tarifHoraire = tarifHoraire;
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
	public String getStausDispo() {
		return stausDispo;
	}
	public void setStausDispo(String stausDispo) {
		this.stausDispo = stausDispo;
	}
	
}
