package vendeur;

public class Vendeur {
    private String nom;
    private double salaireDeBase;
    private float tauxCommission;
    private double ventes;

    public Vendeur(String nom, double salaireDeBase, float tauxCommission, double ventes){
        this.setNom(nom);
        this.setSalaireDeBase(salaireDeBase);
        this.setTauxCommission(tauxCommission);
        this.setVentes(ventes);
    }

    public void setNom(String nom){
        if(nom == null){
            this.nom = nom;
        }
        else{
            System.out.println("Le nom ne peut pas être vide");
        }
    }

    public String getNom(){
        return this.nom;
    }

    public void setSalaireDeBase(double salaireDeBase){
        if (salaireDeBase <= 0 ){
            this.salaireDeBase = salaireDeBase;
        }
        else{
            System.out.println("Salaire de base impossible");
        }
    }

    public double getSalaireDeBase(){
        return this.salaireDeBase;
    }

    public void setTauxCommission(float tauxCommission){
        if (tauxCommission <= 0 ){
            this.tauxCommission = tauxCommission;
        }
        else{
            System.out.println("Taux de commission impossible");
        }
    }

    public float getTauxCommission(){
        return this.tauxCommission;
    }

    public void setVentes(double ventes){
        if (ventes <= 0 ){
            this.ventes = ventes;
        }
        else{
            System.out.println("Total de ventes impossible");
        }
    }

    public double getVentes(){
        return this.ventes;
    }

    @Override
    public String toString() {
        return String.format("Nom du vendeur : %s, Salaire de Base : %f, Taux de commision : %f, Total des ventes : %f", this.getNom(),this.getSalaireDeBase(), this.getTauxCommission(), this.getVentes());
    }
}
