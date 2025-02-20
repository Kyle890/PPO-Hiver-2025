public class Etudiant{
    String nom;
    int age;

    public Etudiant(String nom, int age){
        this.nom = nom;
        this.age = age;
    }

    public void afficherInfo(){
        System.out.println("Je m'appelle " + this.nom + " et j'ai " + this.age + " ans");
    }

    public static void afficer(){
        System.out.println("Je suis une classe");
    }

    public static void main (String[] args){
        Etudiant Kersen = new Etudiant("Kersen", 17);
        Etudiant Yassine = new Etudiant("Yassine", 35);
        Kersen.afficherInfo();
        Yassine.afficherInfo();
    }
}