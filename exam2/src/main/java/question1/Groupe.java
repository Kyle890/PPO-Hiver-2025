package question1;

import java.util.ArrayList;
import java.util.Collections;

public class Groupe {
    private String nomCours;
    private ArrayList<Etudiant> etudiants;

    public Groupe(String nomCours, ArrayList<Etudiant> etudiants ){
        setNomCours(nomCours);
        this.etudiants = etudiants;
    }

    public void setNomCours(String nomCours) {
        this.nomCours = nomCours;
    }

    public String getNomCours() {
        return nomCours;
    }

    public Etudiant getEtudiant(int index) {
        return this.etudiants.get(index);
    }

    public int nbEtudiants(){
        return etudiants.size();
    }

    public void afficheResultats(){
        for(int i = 0; i < etudiants.size(); i++) {
            etudiants.get(i).afficheResultat();
        }
    }

    public void trierParNote(){
        Collections.sort(etudiants, (e1, e2) -> {
            int comparaison = Byte.compare(e2.noteFinale(), e1.noteFinale());
            if (comparaison == 0) {
                return e1.getNomComplet().compareTo(e2.getNomComplet());
            }
            return comparaison;
        });
    }
}   
