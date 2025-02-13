public class TriParSelection{
	public static void main (String[] args){
		
		int[] tableau = new int[10];
		
		for(int i = 0; i < tableau.length; i++){
			tableau[i] = (int)(Math.random() * 101);
		}
		
		System.out.print("Tableau avant le tri : [");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i]);
            if (i < tableau.length - 1) {
				System.out.print(", ");
			}
        }
        System.out.println("]");
		

		for (int i = 0; i < tableau.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < tableau.length; j++) {
                if (tableau[j] < tableau[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = tableau[i];
            tableau[i] = tableau[minIndex];
            tableau[minIndex] = temp;
        }
		
        System.out.print("Tableau après le tri : [");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i]);
            if (i < tableau.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}