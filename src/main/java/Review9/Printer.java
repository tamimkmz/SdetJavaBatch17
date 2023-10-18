package Review9;

public class Printer {
    private void print() {
        System.out.println("Hello");
    }

    void print(String word) {
        System.out.println(word);

    }

    void print(double weight) {
        System.out.println(weight);// first Java trit o exact match then rey to typecasting
    }

    void print(int age) {
        System.out.println(age);
    }

    void print(String word, int num) {
        System.out.println(word + " " + num);
    }

    void print(int num, String word) {
        System.out.println(word + " " + num);
    }

    //Var args
    void print(int... a) {

        System.out.println(a[0]);
    }

    void print(String... a) {

        System.out.println("pass as many");
    }
}