public class Exo_9 {
    public static void main(String[] args) {
        // Créer un étudiant
        Etudiant etudiant = new Etudiant(1234567, "Jean Dupont");

        // Définir les notes obtenues pour chaque examen
        etudiant.evaluations[0].noteSur100 = 80;  // Examen 1
        etudiant.evaluations[1].noteSur100 = 90;  // Examen 2
        etudiant.evaluations[2].noteSur100 = 75;  // Examen Final

        // Afficher les résultats
        etudiant.afficheResultat();
    }
}


class Etudiant {
    int da;
    String nomComplet;
    Evaluation[] evaluations = {
        new Evaluation("Exam1", 0.2f),
        new Evaluation("Exam2", 0.3f),
        new Evaluation("Exam3", 0.5f),
    };

    public Etudiant(int da, String nomComplet){
        this.da = da;
        this.nomComplet = nomComplet;
    }

    public byte noteFinale(){
        byte note = 0;
        for(int i = 0; i < evaluations.length; i++){
            note += this.evaluations[i].notePonderee();
        }
        return (byte)note;
    }

    public void afficheResultat(){
        System.out.println(this.da+ " " + this.nomComplet + " " + evaluations[0].noteSur100 + " " + evaluations[1].noteSur100 + " " + evaluations[2].noteSur100 + " | " + noteFinale());
    }
}

class Evaluation {
    String nom;
    float ponderation;
    byte noteSur100 = 0;

    public Evaluation(String nom, float ponderation){
        this.nom = nom;
        this.ponderation = ponderation;
    }

    public byte notePonderee(){
        return (byte)(this.noteSur100 * this.ponderation);
    }

    public void afficherEvaluation(){
        System.out.println("Évaluation: " + this.nom);
        System.out.println("Pondération: " + this.ponderation);
        System.out.print("Note pondérée: " + notePonderee());
    }
}