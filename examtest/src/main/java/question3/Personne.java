package question3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Personne {
    private String nom = "Inconnu";
    private String ville = "Non renseignée";
    private String dateNaissance = "0000-00-00";

    // Constructeur
    public Personne(String nom, String ville, String dateNaissance) {
        this.nom = nom;
        this.ville = ville;
        this.setDateNaissance(dateNaissance);
    }

    // Getter et Setter pour nom
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return this.nom;
    }

    // Getter et Setter pour ville
    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getVille() {
        return this.ville;
    }

    public void setDateNaissance(String dateNaissance) {
        if(isDateValide(dateNaissance)) {
            this.dateNaissance = dateNaissance;
        } else {
            System.out.println("Date invalide ou future. La date de naissance n'a pas été modifiée.");
        }
    }

    public String getDateNaissance() {
        return this.dateNaissance;
    }

    public boolean isDateValide(String dateNaissance) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate date = LocalDate.parse(dateNaissance, formatter);

            return !date.isAfter(LocalDate.now());
        } catch (Exception e) {
            return false;
        }
    }

    public int getAge() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dateNaissanceLocal = LocalDate.parse(this.dateNaissance, formatter);
        LocalDate maintenant = LocalDate.now();

        int age = maintenant.getYear() - dateNaissanceLocal.getYear();

        if (maintenant.getMonthValue() < dateNaissanceLocal.getMonthValue() || 
            (maintenant.getMonthValue() == dateNaissanceLocal.getMonthValue() && maintenant.getDayOfMonth() < dateNaissanceLocal.getDayOfMonth())) {
            age--;
        }

        return age;
    }

    public String sePresenter() {
        return "Je m'appelle " + this.nom + " et j'ai " + this.getAge() + " ans.";
    }
    public static boolean compare(Personne p1, Personne p2) {
        return p1.getNom().equals(p2.getNom()) && p1.getVille().equals(p2.getVille());
    }

    public static void main(String[] args) {
        Personne bob = new Personne("Bob", "Chicoutimi", "1997-04-20");
        System.out.println(bob.getAge());
        //Affiche ://27System.out.println(bob.sePresenter());
        //Affiche :// Je m'appelle Bob et j'ai 27 ans
     }
}
