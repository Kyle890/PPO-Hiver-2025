package exo;

import java.util.ArrayList;
import java.util.HashMap;

public class Exo_6 {
    public static void main(String[] args) {
        ArrayList<Forme> liste = new ArrayList<>();
        liste.add(new Cercle(new HashMap<>() {{ put(Dimensions.RAYON,4.5); }}));
        liste.add(new Triangle(new HashMap<>() {{ put(Dimensions.BASE,4.5); put(Dimensions.HAUTEUR, 4.5); }}));
        liste.add(new Rectangle(new HashMap<>() {{ put(Dimensions.BASE,4.5); put(Dimensions.HAUTEUR, 4.5); }}));

        for (Forme forme : liste) {
            System.out.println(forme.getArea());
        }
    }
    
}

enum Dimensions{
    BASE,
    HAUTEUR,
    RAYON
}

class Forme {
    HashMap<Dimensions, Double> dimensions;

    public Forme(HashMap<Dimensions, Double> dimensions){
        setDimensions(dimensions);
    }

    public void setDimensions(HashMap<Dimensions, Double> dimensions) {
        this.dimensions = dimensions;
    }

    public HashMap<Dimensions, Double> getDimensions(){
        return this.dimensions;
    }

    public double getArea(){
        return 0;
    };
}

class Cercle extends Forme{

    public Cercle(HashMap<Dimensions, Double> dimensions){
        super(dimensions);
    }

    @Override
    public double getArea(){
        if (dimensions.get(Dimensions.RAYON) == 0) {
            return 0;
        } else {
            return Math.pow(dimensions.get(Dimensions.RAYON), 2) * Math.PI;
        }
    }

}

class Triangle extends Forme{

    public Triangle(HashMap<Dimensions, Double> dimensions){
        super(dimensions);
    }

    @Override
    public double getArea(){
        return (dimensions.get(Dimensions.BASE) * dimensions.get(Dimensions.HAUTEUR)) * 0.5;
    }

}

class Rectangle extends Forme{

    public Rectangle(HashMap<Dimensions, Double> dimensions){
        super(dimensions);
    }

    @Override
    public double getArea(){
        return dimensions.get(Dimensions.BASE) * dimensions.get(Dimensions.HAUTEUR);
    }

}
