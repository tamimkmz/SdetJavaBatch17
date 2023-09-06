package Class15;


public class T2Student {
private String name;
private double mark1;
private  double mark2;
private  double mark3;

public T2Student(String sname, double smark1, double smark2, double smark3){
        name=sname;
        mark1=smark1;
        mark2=smark2;
        mark3=smark3;

    }
    public void printAvg(){
      double avg=(mark1+mark2+mark3)/3;
        System.out.println(name+" Got "+avg);
    }


        public void printName() {
            System.out.println(name);
        }

        }

