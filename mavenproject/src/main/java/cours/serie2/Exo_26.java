package cours.serie2;

public class Exo_26 {
    public static void main(String[] args) {
        Chien chien = new Chien("Rex", 3, "Berger Allemand");
        Chat chat = new Chat("Matou", 12, "Sphinx");
        
    
        chien.sePresenter();
        chien.parler();
    
        chat.sePresenter();
        chat.parler();
    }
}

class Chien extends Animal{
    public Chien(String nom, int age, String race){
        super(nom, age, race);
    }

    public String parler(){
        return "Woof!";
    }

    public void sePresenter(){
        System.out.println("Je suis un " + this.getRace() + ", mon nom est " + this.getNom() + ", j'ai " + this.getAge() + " ans " + parler() + ". ");
    }
}

class Chat extends Animal{
    public Chat(String nom, int age, String race){
        super(nom, age, race);
    }

    public String parler(){
        return "Meow!";
    }

    public void sePresenter(){
        System.out.println("Je suis un " + this.getRace() + ", mon nom est " + this.getNom() + ", j'ai " + this.getAge() + " ans " +  parler() + ". ");
    }
}

class Animal{
    private String nom;
    private int age;
    private String race;

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

    public void setAge(int age){
        if (age >= 0){
            this.age = age;
        }
        else{
            System.out.println("L'age ne peut pas être plus petit que 0.");
        }
    }

    public int getAge(){
        return this.age;
    }

    public void setRace(String race){
        if(race != null && !race.isEmpty()){
            this.race = race;
        }
        else{
            System.out.println("La race ne peut pas être vide");
        }
    }

    public String getRace(){
        return this.race;
    }

    public Animal(String nom, int age, String race){
        this.setNom(nom);
        this.setAge(age);
        this.setRace(race);
    }

}