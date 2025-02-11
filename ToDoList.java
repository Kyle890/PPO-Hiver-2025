import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList{
	
	static ArrayList<String> taches = new ArrayList<String>();
	static ArrayList<Boolean> isDone = new ArrayList<Boolean>();
	
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		String choix;
		
		while(true){
			System.out.println("Menu : \n1. Ajouter une tâche \n2. Marquer une tâche comme terminée \n3. Afficher les tâches \n4. Terminer le programme\n" + "-".repeat(40)+ "\nNombre de tâches : " + taches.size());
			System.out.println("-".repeat(60));
			System.out.println();
			
			System.out.print("Entrez votre choix : ");
			choix = scanner.nextLine();
			
			if(choix.equals("1")){
				System.out.print("Entrez la tâche à ajouter : ");
				choix = scanner.nextLine();
				taches.add(choix);
				isDone.add(false);
				System.out.print("Tâche ajoutée : " + choix);
				System.out.println();
				System.out.println("-".repeat(60));
				System.out.println();
				System.out.println();
			}
			else if(choix.equals("2")){
				afficherTaches();
				System.out.print("Entrez le numéro de la tâche à marquer comme terminée : ");
				choix = scanner.nextLine();
				isDone.set(Integer.parseInt(choix) - 1, true);
				System.out.printf("Tâche terminée : %s\n", taches.get(Integer.parseInt(choix) - 1));
			}
			else if(choix.equals("3")){
				afficherTaches();
			}
			else if(choix.equals("4")){
				System.out.println("Tâches :");
				afficherTaches();
				System.out.println("Merci d'avoir utilisé le gestionnaire de tâches!");
				break;
			}
			else{
				System.out.println("Ceci n'est pas un choix valide.");
				System.out.println();
			}
		}
	}
	
	public static void afficherTaches(){
		
	}
}