package question3;

public class Main {
    public static void main(String[] args) {
        // Création d'un vendeur en magasin
        Vendeur vendeur = new Vendeur("Jean Dupont", 1500, 0.05, 10000);
     
        System.out.println(vendeur);
     
        // Création d'un vendeur en ligne
        VendeurEnLigne vendeurEnLigne = new VendeurEnLigne("Marie Dubois", 1200, 0.008, 50000, 1500);
     
     
        System.out.println(vendeurEnLigne);
     }
     
}