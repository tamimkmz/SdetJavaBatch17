package Review10;

public interface Washable {
    public void wash();

}
class washableTester{
    public static void main(String[] args) {
        Washable[] arr={new Car(),new Horse()};
        for (Washable w: arr){
            w.wash();
        }
    }
}