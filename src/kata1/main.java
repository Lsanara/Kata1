package kata1;
import  java.time.LocalDate;


public class main {
    public static void main(String[] args) {
        LocalDate birth = LocalDate.parse("2002-03-03");
        person laura = new person("Laura", birth);
        System.out.println(laura.getName() + " tiene " + laura.getAge() + " años");
    }
}
