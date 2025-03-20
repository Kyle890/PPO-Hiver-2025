<<<<<<< HEAD
import java.util.Scanner;

public class Exo_15 {
    public static void main(String[] args){
        try {
            System.out.println("Prénom :" + args[0] + " Nom :" + args[1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Vous deviez mettre votre prénom et nom en argument, mais vous pouvez encore le faire ici : ");
            String prenom = scanner.next();
            String nom = scanner.next();
            System.out.println("Prénom :" + prenom + ", Nom :" + nom);

            scanner.close();;
        }
            
=======
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exo_15 {
    public static void main(String[] args) {
        try {
            System.out.println("Bonjour " + args[0] + " " + args[1]);
        } 
        catch (ArrayIndexOutOfBoundsException e){
            try {
                String test = args[0];
            } catch (ArrayIndexOutOfBoundsException f) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Vous deviez mettre votre prénom et nom en argument, mais vous pouvez encore le faire ici : ");
                System.out.println("Bounjour " + scanner.nextLine());
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
>>>>>>> 0903bfcbc6bac8783daee5cda7113d9257255e62
    }
}