package question1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random(1);

        
        Groupe groupe4 = new Groupe(
            "420-210",
            new ArrayList<>(
                Arrays.asList(
                    new Etudiant(1832491, "Alice"),
                    new Etudiant(2468103, "Bob"),
                    new Etudiant(3726145, "Charlie"),
                    new Etudiant(4859021, "David"),
                    new Etudiant(5983472, "Eve"),
                    new Etudiant(6129048, "Frank"),
                    new Etudiant(7235146, "Grace"),
                    new Etudiant(8376012, "Hannah"),
                    new Etudiant(9453023, "Isaac"),
                    new Etudiant(1023485, "Jack"),
                    new Etudiant(2135749, "Karen"),
                    new Etudiant(3201854, "Louis"),
                    new Etudiant(4337602, "Mona"),
                    new Etudiant(5498321, "Nathan"),
                    new Etudiant(6571984, "Olivia"),
                    new Etudiant(7612493, "Paul"),
                    new Etudiant(8793461, "Quincy"),
                    new Etudiant(9834527, "Rachel"),
                    new Etudiant(1056743, "Sam"),
                    new Etudiant(2187630, "Tina"),
                    new Etudiant(3265984, "Ursula"),
                    new Etudiant(4306715, "Victor"),
                    new Etudiant(5394120, "Wendy"),
                    new Etudiant(6412309, "Xander"),
                    new Etudiant(7523018, "Yara"),
                    new Etudiant(8654092, "Zane"),
                    new Etudiant(9735084, "Amy"),
                    new Etudiant(1087416, "Ben"),
                    new Etudiant(2158367, "Clara"),
                    new Etudiant(3267419, "Daniel")
                )
            )
        );
        for(int i = 0; i < groupe4.nbEtudiants() ; i++){
            for(int j = 0 ; j < groupe4.getEtudiant(i).getNbEvaluation() ; j++){
                groupe4.getEtudiant(i).getEvaluation(j).setNoteSur100((byte) (random.nextInt(71) + 30));
            }
        }
        groupe4.afficheResultats();
        System.out.println();
        groupe4.trierParNote();
        groupe4.afficheResultats();
        
    }   
}