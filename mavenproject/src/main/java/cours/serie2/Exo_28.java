package cours.serie2;

public class Exo_28 {
    public static void main(String[] args) {
        Personne personne = new Personne("Jean", 40, "10 rue des Lilas");
        Etudiant etudiant = new Etudiant("Marie", 22, "15 rue de la Paix", "Informatique", "E123");
        Professeur professeur = new Professeur("Mr. Dupont", 45, "12 avenue des Champs", "Mathématiques", 2500.00);
    
        personne.sePresenter();
        etudiant.seDecrire();
        etudiant.etudier();
        professeur.seDecrire();
        professeur.enseigner();
    }
}

class Personne{
    private String nom;
    private int age;
    private String adresse;

    public void setNom(String nom){
        if(nom != null && !nom.isEmpty()){
            this.nom = nom;
        }
        else{
            System.out.println("Le nom ne peut pas être vide");
        }
    }

    public String getNom(){
        return this.nom;
    }

    public void setAge(int age){
        if (age >= 0){
            this.age = age;
        }
        else{
            System.out.println("L'age ne peut pas être plus petit que 0.");
        }
    }

    public int getAge(){
        return this.age;
    }

    public void setAdresse(String adresse){
        if(adresse != null && !adresse.isEmpty()){
            this.adresse = adresse;
        }
        else{
            System.out.println("L'adresse ne peut pas être vide");
        }
    }

    public String getAdresse(){
        return this.adresse;
    }

    public Personne(String nom, int age, String adresse){
        this.setNom(nom);
        this.setAge(age);
        this.setAdresse(adresse);
    }

    public String sePresenter(){
        return "Je suis "+ this.getNom() + ", j'ai " + this.getAge() + "ans et mon adresse est " + this.getAdresse();
    }

}

class Etudiant extends Personne{
    private String filiere;
    private String numEtudiant;

    public Etudiant(String nom, int age, String adresse, String filiere, String numEtudiant){
        super(nom, age, adresse);
        this.setFiliere(filiere);
        this.setNumEtudiant(numEtudiant);
    }

    public void setFiliere(String filiere){
        if(filiere != null && !filiere.isEmpty()){
            this.filiere = filiere;
        }
        else{
            System.out.println("La filiere ne peut pas être vide");
        }
    }

    public String getFiliere(){
        return this.filiere;
    }

    public void setNumEtudiant(String numEtudiant){
        if(numEtudiant != null && !numEtudiant.isEmpty()){
            this.numEtudiant = numEtudiant;
        }
        else{
            System.out.println("Le numéro d'étudiant ne peut pas être vide");
        }
    }

    public String getNumEtudiant(){
        return this.numEtudiant;
    }

    public String seDecrire(){
        super.sePresenter();
        return "L'étudiant" + this.getNom() + "étudie " + this.getFiliere() + ", je suis en " + this.getFiliere() +", Numéro étudiant:" +this.getNumEtudiant();
    }

    public String etudier(){
        return  "L'étudiant " + this.getNom() + " étudie " + this.getFiliere();
    }
}

class Professeur extends Personne{
    private String matiere;
    private double salaire;

    public Professeur(String nom, int age, String adresse, String matiere, double salaire){
        super(nom, age, adresse);
        this.setMatiere(matiere);
        this.setSalaire(salaire);
    }

    public void setMatiere(String matiere){
        if(matiere != null && !matiere.isEmpty()){
            this.matiere = matiere;
        }
        else{
            System.out.println("La matiere ne peut pas être vide");
        }
    }

    public String getMatiere(){
        return this.matiere;
    }

    public void setSalaire(double salaire){
        if(salaire >= 0){
            this.salaire = salaire;
        }
        else{
            System.out.println("Le numéro d'étudiant ne peut pas être vide");
        }
    }

    public double getSalaire(){
        return this.salaire;
    }

    public String seDecrire(){
        super.sePresenter();
        return "Je suis "+ this.getNom() + ", j'ai " + this.getAge() + "ans et mon adresse est " + this.getAdresse() + "j'enseigne la matière " + this.getMatiere() +", salaire: " + this.getSalaire();
    }

    public String enseigner(){
        return "Le professeur "+ this.getNom() +"enseigne " + this.getMatiere();
    }
}
