import java.util.ArrayList;
import java.util.Scanner;

public class Exo_71{

	static Scanner scanner = new Scanner(System.in);
	static String[] plat = {"Crevette", "Salade", "Frite", "Hamburger", "Gâteau"};
	static float[] prixPlat = {8.99f, 5.60f, 6.40f, 10.99f, 7.99f};
	static int facture = 0;
	int numeroCommande = 0;
	
	public static void main(String[] args){
		
		boolean boucle = true;
		while(boucle){
			
			System.out.println("Menu : \n1. Ajouter un item \n2. Retirer un item \n3. Afficher le reçu \n4. Terminer la transaction \nTotal de la facture actuelle : " + facture +"$");
			System.out.println();
			System.out.print("Entrez votre choix : ");
			int choix = scanner.nextInt();
			
			switch(choix) {
				case 1:
					for(int i = 0 ; i < plats.length ; i++){
                    String prixFormatter = String.format("%.02f$", prix[i]);
                    System.out.println((i+1) + ". " + plats[i] + " ".repeat(24 - plats[i].length() - prixFormatter.length()) + prixFormatter);
					}
					System.out.println();
					System.out.println("Entrez le numéro de l'item : ");
					
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					boucle = false;
					System.out.println("Merci pour votre visite!");
					break;
				default:
					System.out.println("Veuillez faire un choix valide");
					System.out.println();
					break;
			}
		}
	}
}