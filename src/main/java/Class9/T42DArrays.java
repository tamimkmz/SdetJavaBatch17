package Class9;

public class T42DArrays {
    public static void main(String[] args) {

        String[][] cars = {
                {"jeep", "ford", "cadillac", "dodge"},
                {"Audi", "Honda", "Toyota", "tesla"},
                {"Kia", "Benz", "Hyundai", "Maserati"},
                {"BMW", "Lamborghini", "Ferrari", "Alfa"},

        };
        for (String[] row : cars) {
        for(String col:row){
            System.out.print(col+" ");
        }
            System.out.println();
        }
        System.out.println("=================================");
        for(int i=0; i<cars.length; i++){
         for(int j=0; j<cars[i].length; j++){
             System.out.print(cars[i][j]+" ");
         }
            System.out.println();
        }
    }
}




