package exo;

import java.util.Arrays;

public class Exo_8 {
    public static void main(String[] args) {
    // Array to store 30 articles
        Article[] articles = new Article[30];
        
        // Adding 30 different articles with categories, prices, names, and descriptions
        articles[0]  = new Article(Categorie.JEU, 25.99, "Super Mario", "A fun adventure game for all ages");
        articles[1]  = new Article(Categorie.JEU, 59.99, "FIFA 23", "Football simulation game");
        articles[2]  = new Article(Categorie.NOURRITURE, 1.99, "Pomme", "Fresh red apples");
        articles[3]  = new Article(Categorie.NOURRITURE, 2.99, "Pain", "Freshly baked whole grain bread");
        articles[4]  = new Article(Categorie.LINGE, 12.99, "T-shirt", "Cotton t-shirt with a cool print");
        articles[5]  = new Article(Categorie.LINGE, 39.99, "Jeans", "Blue jeans with a slim fit");
        articles[6]  = new Article(Categorie.ELECTROMENAGER, 299.99, "Aspirateur", "Powerful vacuum cleaner");
        articles[7]  = new Article(Categorie.ELECTROMENAGER, 499.99, "Mixeur", "High-performance blender for smoothies");
        articles[8]  = new Article(Categorie.JEU, 19.99, "Zelda", "The Legend of Zelda: Breath of the Wild. Cotton");
        articles[9]  = new Article(Categorie.JEU, 39.99, "Minecraft", "A sandbox video game where players build and explore");
        articles[10] = new Article(Categorie.NOURRITURE, 5.99, "Poulet", "Fresh chicken fillets");
        articles[11] = new Article(Categorie.NOURRITURE, 1.49, "Banane", "Yellow ripe bananas");
        articles[12] = new Article(Categorie.LINGE, 9.99, "Chaussettes", "Comfortable cotton socks");
        articles[13] = new Article(Categorie.LINGE, 45.99, "Veste", "Warm winter jacket");
        articles[14] = new Article(Categorie.ELECTROMENAGER, 99.99, "Cafetière", "Coffee maker with programmable settings");
        articles[15] = new Article(Categorie.ELECTROMENAGER, 59.99, "Grille-pain", "2-slot toaster with adjustable browning");
        articles[16] = new Article(Categorie.JEU, 29.99, "Call of Duty", "First-person shooter game");
        articles[17] = new Article(Categorie.JEU, 9.99, "Among Us", "Online multiplayer social deduction game");
        articles[18] = new Article(Categorie.NOURRITURE, 3.49, "Fromage", "Aged cheddar cheese");
        articles[19] = new Article(Categorie.NOURRITURE, 4.99, "Salade", "Fresh mixed salad");
        articles[20] = new Article(Categorie.LINGE, 22.99, "Pull", "Soft wool sweater");
        articles[21] = new Article(Categorie.LINGE, 18.99, "Shorts", "Cotton shorts for summer");
        articles[22] = new Article(Categorie.ELECTROMENAGER, 129.99, "Lave-linge", "Front-load washing machine");
        articles[23] = new Article(Categorie.ELECTROMENAGER, 199.99, "Réfrigérateur", "Energy-efficient refrigerator with freezer");
        articles[24] = new Article(Categorie.JEU, 14.99, "Street Fighter", "Fighting game with iconic characters");
        articles[25] = new Article(Categorie.JEU, 24.99, "The Witcher 3", "Action role-playing game with an open world");
        articles[26] = new Article(Categorie.NOURRITURE, 2.49, "Yaourt", "Delicious vanilla yogurt");
        articles[27] = new Article(Categorie.NOURRITURE, 3.99, "Pizza", "Frozen margherita pizza");
        articles[28] = new Article(Categorie.LINGE, 32.99, "Chapeau", "Stylish summer hat");
        articles[29] = new Article(Categorie.ELECTROMENAGER, 4990.99, "Mixeur Industriel", "High-performance blender");


        Utils.afficheListeArticle(Utils.find(articles,"Mixeur", false));
    }
}

enum Categorie {
    JEU,
    NOURRITURE,
    LINGE,
    ELECTROMENAGER
}

class Article {
    private Categorie cat;
    private double prix;
    private String nom;
    private String description;

    public Article(Categorie cat, double prix, String nom, String description) {
        setCat(cat);
        setPrix(prix);
        setNom(nom);
        setDescription(description);
    }
    
    public Categorie getCat() {
        return cat;
    }

    public double getPrix() {
        return prix;
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public void setCat(Categorie cat) {
        this.cat = cat;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Article [cat=" + this.cat + ", prix=" + this.prix + ", nom=" + this.nom + ", description=" + this.description + "]";
    }
}

class Utils{

    public static Article[] find(Article[] biblio, Categorie cat){
        return Arrays.stream(biblio)
            .filter(article -> article.getCat() == cat) // Filter condition
            .toArray(Article[]::new); // Collect the filtered elements into a new array       
    }

    public static Article[] find(Article[] biblio, double prixMax){
        return Arrays.stream(biblio)
            .filter(article -> article.getPrix() <= prixMax) // Filter condition
            .toArray(Article[]::new); // Collect the filtered elements into a new array
            
    }

    public static Article[] find(Article[] biblio, String motCle, boolean addDescription){
        return Arrays.stream(biblio)
        .filter(article -> article.getNom().contains(motCle) || ((addDescription) ? article.getDescription().contains(motCle) : false)) // Filter condition
        .toArray(Article[]::new); // Collect the filtered elements into a new array
    
    }
    
    public static void afficheListeArticle(Article[] biblio){
        for (Article article : biblio) {
            System.out.println(article);
        }
    }
}
