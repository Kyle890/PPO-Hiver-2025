public class Livre {
    String titre;
    String auteur;
    double prix;
    boolean estDisponible;

    public Livre(String titre, String auteur, double prix, boolean estDisponible){
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.estDisponible = estDisponible;

    }

    public void afficherDetails(){
        System.out.println("Informations sur le livre : \nTitre: " + this.titre + "\nAuteur : " + this.auteur + "\nPrix : " + this.prix);
        if(this.estDisponible){
            System.out.println("Livre : En stock");
        }
        if(!this.estDisponible){
            System.out.println("Livre : Pas disponible");
        } 
    }

    public void emprunter(){
        if(this.estDisponible){
            this.estDisponible = false;
        }
        if(!this.estDisponible){
            System.out.println("Livre n'est pas disponible");
        }
    }

    public void retourner(){
        this.estDisponible = true;
    }

    public static void main(String[] args) {
        Livre livre1 = new Livre(null, null, 0, false);
        Livre livre2 = new Livre(null, null, 0, false);
        Livre livre3 = new Livre(null, null, 0, false);
        Livre livre4 = new Livre(null, null, 0, false);
    }
}
