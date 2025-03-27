package vendeur;

public class VendeurEnLigne extends Vendeur{
    private int nombreClics;

    public void setNombreClics(int nombreClics){
        if (nombreClics <= 0 ){
            this.nombreClics = nombreClics;
        }
        else{
            System.out.println("Salaire de base impossible");
        }
    }

    public int getNombreClics(){
        return this.nombreClics;
    }
    
    public VendeurEnLigne(String nom, double salaireDeBase, float tauxCommission, double ventes) {
        super(nom, salaireDeBase, tauxCommission, ventes);
        this.setNombreClics(nombreClics);
    }

    @Override
    public String toString() {
        return "Salaire Total de Vendeur en Ligne" + this.getNombreClics() * 0.5 + this.getVentes()* this.getTauxCommission();
    }
}
