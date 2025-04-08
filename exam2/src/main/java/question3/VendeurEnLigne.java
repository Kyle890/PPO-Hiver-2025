package question3;

public class VendeurEnLigne extends Vendeur{
    public int nombreClics;

    public VendeurEnLigne(String nom, int salaireDeBase, double tauxCommission, int montantTotalDesVentes, int nombreClics) {
        super(nom, salaireDeBase, tauxCommission, montantTotalDesVentes);
        this.nombreClics = nombreClics;
    }

    @Override
    public String toString() {
        return String.format("Nom : %s \nSalaire de base : %d.00 $  \nTotal des commissions : %f \nSalaire Total : %f", this.nom, this.salaireDeBase, this.montantTotalDesVentes * this.tauxCommission + this.nombreClics*0.5, (this.montantTotalDesVentes * this.tauxCommission + this.nombreClics*0.5) + this.salaireDeBase);
    }
}
