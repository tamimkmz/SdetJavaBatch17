package Class7;

public class T6NestedLoop {
    public static void main(String[] args) {
//1 means line one and 4 means four columns
       for(int i=1; i<=4; i++) {
//                       1 means line one// 6 means six #/ in row
           for (int j = 1; j <=6; j++) {
               if(i==2&&j==3 || i==3&&j==3 ||i==2&&j==4||i==3&&j==4){
                   System.out.print(" ");

               }else {
                   System.out.print("#");
               }
           }
           System.out.println();
        }

    }

}
