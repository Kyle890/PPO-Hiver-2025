package vendeur;

public class VendeurMagasin extends Vendeur{

    public VendeurMagasin(String nom, double salaireDeBase, float tauxCommission, double ventes){
        super(nom, salaireDeBase, tauxCommission, ventes);
    }

    @Override
    public String toString() {
    
        return "Salaire Total du Vendeur en magasin: " + this.getSalaireDeBase() + (this.getTauxCommission() * this.getVentes());
    }
}
