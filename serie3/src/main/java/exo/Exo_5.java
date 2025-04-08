package exo;

public class Exo_5 {
    public static void main(String[] args) {
        System.out.println(additionner(16,16));
        System.out.println(additionner(16.5,16.5));;
        System.out.println(additionner(16.5,16));
        System.out.println(additionner(16,16.5));
    }

    public static int additionner(int a, int b){
        return a + b;
    }

    public static double additionner(double a, double b){
        return a + b;
    }

    public static double additionner(double a, int b){
        return a + b;
    }

    public static double additionner(int a, double b){
        return a + b;
    }
}
