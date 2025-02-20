public class AlphabetPratique{
	
	public static void main (String[] args){
		
		if (args.length < 1) {
			System.out.println("Veuillez fournir un nombre et on vous donnera la lettre de l'alphabet qui y correspond.");
			return;
		}
		char lettre = 'a';
		int n = Integer.parseInt(args[0]);
		
		for(int i = 0; i < (n%26); i++){
			System.out.print((char)(lettre + i));
		}
	}
}