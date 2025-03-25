package personne;

import java.time.LocalDate;

public class Personne {
    private String nom = "Inconnu";
    private byte age = -1;
    private String ville = "Non renseignée";
    private String dateNaissance = "0000-00-00";

    public void setNom(String nom){
        if(nom != "Inconnu"){
            this.nom = nom;
        }
    }

    public String getNom(){
        return this.nom;
    }

    public void setAge(byte age){
        if (age >= 0 &&  age <= 125){
            this.age = age;
        } 
        else {
            System.out.println("Erreur l'age est invalide");
        }
    }

    public byte getAge(){
        return this.age;
    }

    public void setVille(String ville){
        if(ville != "Non renseignée"){
            this.ville = ville;
        }
    }

    public String getVille(){
        return this.ville;
    }

    public void setDateNaissance(String dateNaissance){
        LocalDate dateActuel = LocalDate.now();
        
    }

    public void ageActuel(){
        LocalDate dateActuel = LocalDate.now();
    }
}