package Review7;

public class Book{
    /*
     Syntax of variable
      dataType name;
      */
    String title;// none primitive
    String author;//none primitive
    int year;// primitive
    double price;// primitive
static int totalBook;
static String type="Audiobook";
    /* syntax of method
    returnType name()
     void read(){}
     I can create my own methods:
     1. with parameter or without
     2. with return or without
     */

   void read(){// without parameter
       System.out.println("I am reading " +title + "book by " + author);

   }
   void changePrice(int newPrice){// with parameter
       System.out.println("The price of the book "+ title+"was changed from "+ price+" to"+newPrice);


   }
       double totalWithTax(double tax){
    double total =price+(price*tax);
    return total;

   }

}
