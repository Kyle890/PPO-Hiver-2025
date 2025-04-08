package question1;

public class Chat extends Animal {

    public Chat(String nom, int age, String race){
        super(nom, age, race);
    }

    public String parler(){
        return "Meow!";
    }

    public String sePresenter(){
        return String.format("Je suis un %s, mon nom est %s j'ai %d ans " + parler(), this.getRace(), this.getNom(), this.getAge());
    }
}
