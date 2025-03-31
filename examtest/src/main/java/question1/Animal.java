package question1;

public abstract class Animal {
    private String nom;
    private int age;
    private String race;

    public Animal(String nom, int age, String race){
        setNom(nom);
        setAge(age);
        setRace(race);
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public String getNom(){
        return this.nom;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setRace(String race){
        this.race = race;
    }

    public String getrace(){
        return this.race;
    }

    public abstract String parler();

    public abstract String sePresenter();
}
