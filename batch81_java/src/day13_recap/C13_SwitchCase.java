package day13_recap;

public class C13_SwitchCase {
    public static void main(String[] args) {
        String gun="çarşamba" ;

        switch (gun) {
            case "pazartesi":
            case"saslı":
                System.out.println("java dersi");
                break;
            case "çarşamba":
            case"cumartesi":
                System.out.println("sql dersi");
                break;
            case "perşembe":
            case"cuma":
                System.out.println("selenium dersi");
                break;
            default:
                System.out.println("izin günü");

        }
    }
}
