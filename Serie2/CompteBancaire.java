public class CompteBancaire {
    String titulaire;
    double solde;

    public CompteBancaire(String titulaire, double solde){
        this.titulaire = titulaire;
        this.solde = solde;
    }

    public void deposer(double ajout){
        this.solde += ajout;
    }

    public void retirer(double retrait){
        this.solde -= retrait;
        if (retrait > this.solde){
            System.out.println("Solde insuffisant");
        }
    }

    public void afficherSolde(){
        System.out.println("Solde : " + this.solde);
    }

    public void afficherInfo(){
        System.out.println("Titulaire : " + this.titulaire + ", Solde : " + this.solde);
    }

    public static void main(String[] args) {
        CompteBancaire Kersen = new CompteBancaire("Kersen", 0);
        Kersen.deposer(1500.00);
        Kersen.afficherSolde();
        Kersen.retirer(600);
        Kersen.afficherSolde();
        Kersen.deposer(100);
        Kersen.afficherSolde();
        Kersen.retirer(475);
        Kersen.afficherInfo();
    }
}
