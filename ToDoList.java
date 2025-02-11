import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList{
	public static void main (String[] args){
		ArrayList<String> taches = new ArrayList<String>();
		ArrayList<Boolean> isDone = new ArrayList<Boolean>();
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
				System.out.print("Entrez le numéro de la tâche à narquer comme terminée : ");
				choix = scanner.nextLine();
				isDone.set(Integer.parseInt(choix) - 1, true);
				System.out.printf("Tâche terminée : %s\n", taches.get(Integer.parseInt(choix) - 1));
			}
			else if(choix.equals("3")){
				for(int i = 0; i < taches.size(); i++){
					System.out.printf("")
				}
			}
			else if(choix.equals("4")){
				System.out.println("Tâches :");
				System.out.println();
				for(int i = 0; i <= taches.size(); i++){
					int j = i+j;
					System.out.println(j +": "+ taches.get(i));
				}
				System.out.println("Merci d'avoir utilisé le gestionnaire de tâches!");
				break;
			}
		}
	}
}