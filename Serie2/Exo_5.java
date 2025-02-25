public class Exo_5{
    String nom;
    int age;

    public Exo_5(String nom, int age){
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
        Exo_5 Kersen = new Exo_5("Kersen", 17);
        Exo_5 Yassine = new Exo_5("Yassine", 35);
        Kersen.afficherInfo();
        Yassine.afficherInfo();
    }
}