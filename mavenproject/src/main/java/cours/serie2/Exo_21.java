package cours.serie2;

import java.util.ArrayList;

public class Exo_21 {
    public static void main(String[] args) {
        
    }
}

enum Categorie {VOYAGE, SANTÉ, HABITATION, NOURRITURE, ÉDUCATION, LOISIR, DIVER};

class Depense{
    private String nom = "";
    private float cout;
    private Categorie categorie = Categorie.DIVER;

    public void setNom(String nom){
        if(nom != null && !nom.isEmpty()){
            this.nom = nom;
        }
        else{
            System.out.println("Le nom ne peut pas être vide");
        }
    }

    public String getNom(){
        return this.nom;
    }

    public void setCout(float cout){
        if(cout >= 0){
            this.cout = cout;
        }
        else{
            System.out.println("Cout impossible");
        }
    }

    public float getCout(){
        return this.cout;
    }

    public void setCategorie(Categorie categorie){
        this.categorie = categorie;
    }

    public Categorie getCategories(){
        return this.categorie;
    }

    public Depense(String nom, float cout, Categorie categorie){
        this.setNom(nom);
        this.setCout(cout);
        this.setCategorie(categorie);
        
    }

    @Override
    public String toString(){
        return String.format("%-39s%-10s%10.2f$", this.nom, this.cout);
    }
}

class Budget{
    private double montantTotal = 0;
    private double montantUtilise= 0;
    private ArrayList<Depense> depenses = new ArrayList<>();
 
    public void setMontantTotal(double montantTotal){
        this.montantTotal = montantTotal;
    }
    public double getMontantTotal(){
        return this.montantTotal;
    }
 
    public void setMontantUtilise(double montantUtilise){
        this.montantUtilise = montantUtilise;
    }
    public double getMontantUtilise(){
        return this.montantUtilise;
    }
 
    public void setDepense(ArrayList<Depense> depenses){
        this.depenses = depenses;
    }
    public ArrayList<Depense> getDepenses(){
        return this.depenses;
    }
 
    public Budget(double montantTotal){
        
    }

    public void ajouterDepense(Depense depense){
        this.depenses.add(depense);
        this.montantUtilise += depense.getCout();
    }

    public void modifierDepense(int indice, Depense depense){
        double mem = this.depenses.get(indice).getCout();
        this.depenses.set(indice, depense);
        this.montantUtilise = (this.depenses.get(indice).getCout() - mem) + this.montantUtilise;
    }

    public void retirerDepense(int indice){
        this.montantUtilise = (this.montantUtilise - (this.depenses.get(indice).getCout()));
        this.depenses.remove(indice);
    }

    public Depense getOneDepense(int indice){
        return this.depenses.get(indice);
    }
}
