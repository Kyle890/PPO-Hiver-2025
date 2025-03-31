package question1;

public class Main {
    public static void main(String[] args) {
        Chien chien = new Chien("Rex", 3, "Berger Allemand");
        Chat chat = new Chat("Matou", 12, "Sphinx");
        
    
        System.out.println(chien.sePresenter());
        System.out.println(chien.parler());
    
        System.out.println(chat.sePresenter());
        System.out.println(chat.parler());
    }
}