package Class19;

 class Ali {
    void marry(){
        System.out.println("we want you to marry selma");

    }
}
 public class Alex extends Ali{
    @Override
    void marry() {
        super.marry();
        System.out.println("I want to marry Suzan");
    }
}