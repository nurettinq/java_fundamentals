package day09_ternary;

public class C06_SwitchCase {
    public static void main(String[] args) {
       String input="PAzAR";
       input=input.toLowerCase();

       switch (input) {
           case "pazartesi":

           case "salı":

           case "çarşamba":

           case "perşembe":

           case "cuma":
               System.out.println("hafa içi");
               break;

           case "cumartesi":

           case "pazar":
               System.out.println("hafa sonu");
               break;
           default:
               System.out.println("lütfen geçerli bir gün giriniz");
       }
    }
}
