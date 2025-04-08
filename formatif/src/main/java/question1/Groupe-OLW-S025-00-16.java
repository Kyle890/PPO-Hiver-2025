package question1;

import java.util.ArrayList;
import java.util.Collections;

class Groupe {
    private String nomCours;
    private ArrayList<Etudiant> etudiants;

    public Groupe(String nomCours, ArrayList<Etudiant> etudiants) {
        this.setNomCours(nomCours);
        this.etudiants = etudiants;
    }

    public void setNomCours(String nomCours) {
        this.nomCours = nomCours;
    }

    public String getNomCours(){
        return this.nomCours;
    }

    public Etudiant getEtudiant(int index) {
        return etudiants.get(index);
    }

    public int nbEtudiants() {
        return etudiants.size();
    }

    public void afficheResultats() {
        for (int i = 0; i < this.etudiants.size(); i++) {
            this.etudiants.get(i).afficheResultat();
        }
    }

    public void trierParNote() {
        Collections.sort(etudiants, (e1, e2) -> {
            // Comparaison par note finale, de manière décroissante
            int comparison = Byte.compare(e2.noteFinale(), e1.noteFinale());
            if (comparison == 0) {
                // Si les notes finales sont égales, on trie par nom complet (ordre alphabétique)
                return e1.getNomComplet().compareTo(e2.getNomComplet());
            }
            return comparison;
        });
    }
}
