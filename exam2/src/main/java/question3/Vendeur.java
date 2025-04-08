package question3;

public class Vendeur {
    public String nom;
    public int salaireDeBase;
    public double tauxCommission;
    public int montantTotalDesVentes;

    public Vendeur(String nom, int salaireDeBase, double tauxCommission, int montantTotalDesVentes){
        this.nom = nom;
        this.salaireDeBase = salaireDeBase;
        this.tauxCommission = tauxCommission;
        this.montantTotalDesVentes = montantTotalDesVentes;
    }

    @Override
    public String toString() {
        return String.format("Nom : %s \nSalaire de base : %d.00 $ \nTotal des commissions : %f \nSalaire Total : %f", this.nom, this.salaireDeBase, this.montantTotalDesVentes * this.tauxCommission, (this.montantTotalDesVentes * this.tauxCommission) + this.salaireDeBase);
    }
}
