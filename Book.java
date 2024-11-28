import java.sql.SQLOutput;

public class Book{
    String title;
    String author;
    double price = 0.0;

    Book(){
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public Book (String title,String author,double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public void updatePrice(double newPrice){
        price = newPrice;
        if(price <= 0){
            price *= -1;
        }
    }

    public void applyDiscount(double discount){

         if (discount < 0 || discount > 100.00){
             System.out.println("Error !!");
             return;
         }
         price = price-(price*(discount/100));
    }
}
