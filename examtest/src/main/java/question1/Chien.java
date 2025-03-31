package question1;

public class Chien extends Animal {

    public Chien(String nom, int age, String race){
        super(nom, age, race);
    }

    public String parler(){
        return "Woof!";
    }

    public String sePresenter(){
        return String.format("Je suis un %s, mon nom est %s j'ai %d ans " + parler(), this.getrace(), this.getNom(), this.getAge());
    }
}
