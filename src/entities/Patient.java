package entities;


public class Patient {
	    private String cinMatricule;
	    private String nom;
	    private String prenom;
	    private String dateNaissance;
	    private String telephone;
	    private String email;
	    private String numAssurance;
	    private double soldeCompte;

	    private String[] historiqueExamensIds = new String[100];

		public Patient(String cinMatricule, String nom, String prenom, String dateNaissance, String telephone,
				String email, String numAssurance, double soldeCompte, String[] historiqueExamensIds) {
			super();
			this.cinMatricule = cinMatricule;
			this.nom = nom;
			this.prenom = prenom;
			this.dateNaissance = dateNaissance;
			this.telephone = telephone;
			this.email = email;
			this.numAssurance = numAssurance;
			this.soldeCompte = soldeCompte;
			this.historiqueExamensIds = historiqueExamensIds;
		}

		public String getCinMatricule() {
			return cinMatricule;
		}

		public void setCinMatricule(String cinMatricule) {
			this.cinMatricule = cinMatricule;
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

		public String getDateNaissance() {
			return dateNaissance;
		}

		public void setDateNaissance(String dateNaissance) {
			this.dateNaissance = dateNaissance;
		}

		public String getTelephone() {
			return telephone;
		}

		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getNumAssurance() {
			return numAssurance;
		}

		public void setNumAssurance(String numAssurance) {
			this.numAssurance = numAssurance;
		}

		public double getSoldeCompte() {
			return soldeCompte;
		}

		public void setSoldeCompte(double soldeCompte) {
			this.soldeCompte = soldeCompte;
		}

		public String[] getHistoriqueExamensIds() {
			return historiqueExamensIds;
		}

		public void setHistoriqueExamensIds(String[] historiqueExamensIds) {
			this.historiqueExamensIds = historiqueExamensIds;
		}


}

