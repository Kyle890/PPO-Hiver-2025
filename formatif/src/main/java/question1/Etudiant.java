package question1;

public class Etudiant {
    private int da = -1;
    private String nomComplet = "";
    private Evaluation[] evaluations = new Evaluation[] {
        new Evaluation("Examen 1", 0.2f),
        new Evaluation("Examen 2", 0.3f),
        new Evaluation("Exament 3", 0.5f)
    };

    public Etudiant(int da, String nomComplet){
        this.setDa(da);
        this.setNomComplet(nomComplet);
    }

    public void setDa(int da){
        if(da != -1){
            this.da = da;
        } else {
            System.out.println("Le da doit être changé");
        }
    }

    public int getDa(){
        return this.da;
    }

    public void setNomComplet(String nomComplet){
        if(nomComplet != ""){
            this.nomComplet = nomComplet;
        } else {
            System.out.println("Le nom complet ne peut pas être vide");
        }
    }

    public String getNomComplet(){
        return this.nomComplet;
    }

    public Evaluation getEvaluation(int index){
        return this.evaluations[index];
    }

    public int getNbEvaluations(){
        return this.evaluations.length;
    }

    public byte noteFinale(){
        byte sommeNotes = 0;
        for (int i = 0; i < this.evaluations.length; i++){
            sommeNotes += this.evaluations[i].notePonderee();
        }

        return sommeNotes;
    }

    public void afficheResultat() {
        System.out.println(this.da + " " + this.nomComplet + " " + this.evaluations[0].notePonderee() + " " + this.evaluations[1].notePonderee() + " " + this.evaluations[2].notePonderee() + " | " +  noteFinale());
    }

    public static void main(String[] args) {
        Etudiant etudiant = new Etudiant(1234567, "Jean Dupont"); 
 
        // Définir les notes obtenues pour chaque examen 
        etudiant.getEvaluation(0).setNoteSur100((byte)80);  // Examen 1 

        etudiant.getEvaluation(1).setNoteSur100((byte)90);  // Examen 2 

        etudiant.getEvaluation(2).setNoteSur100((byte)75);  // Examen Final 
         
 
        // Afficher les résultats 
        etudiant.afficheResultat();
    }
}
