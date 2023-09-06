package Class11;

public class E6StringMethod {
    public static void main(String[] args) {

        String str="ks d nfjA ZSX232 98 ()4!@# %^&A S";
        System.out.println(str.replaceAll("[A-Z]","="));
        System.out.println(str.replaceAll("[A-C]","="));;
        System.out.println(str.replaceAll("[a-z]","="));
        System.out.println(str.replaceAll("[0-9]",""));
        System.out.println(str.replaceAll("[&-;]",""));

        System.out.println(str.replaceAll("[A-Z0-9]","")); //remove all upper case letter from A-Z and
        // numbers from zero to 9



        }
    }
