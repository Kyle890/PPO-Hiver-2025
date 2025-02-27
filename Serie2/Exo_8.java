public class Exo_8 {
    public static void main(String[] args) {
        Evaluation eval1 = new Evaluation("Mathématiques", 0.4f);
        eval1.noteSur100 = 85;
        eval1.afficherEvaluation();
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