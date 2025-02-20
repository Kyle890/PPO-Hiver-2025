public class Examen {
    String nomEtudiant;
    byte note;

    public Examen(String nomEtudiant, byte note){
        this.nomEtudiant = nomEtudiant;
        this.note = note;
    }

    public void afficheResultat(){
        convertNote();
    }

    public void convertNote(){
        if(this.note > 90){
            System.out.println(this.nomEtudiant + " : A");
        }
        else if (this.note > 80){
            System.out.println(this.nomEtudiant + " : B");
        }
        else if(this.note > 70){
            System.out.println(this.nomEtudiant + " : C");
        }
        else if(this.note > 60){
            System.out.println(this.nomEtudiant + " : D");
        }
        else{
            System.out.println(this.nomEtudiant + " : E");
        }
    }


    public static void main(String[] args) {
        Examen Kersen = new Examen("Kersen", (byte)96);
        Kersen.afficheResultat();

    }
}
