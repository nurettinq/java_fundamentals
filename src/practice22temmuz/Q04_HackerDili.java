package practice22temmuz;

import java.util.Scanner;

public class Q04_HackerDili {
    public static void main(String[] args) {
        // Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) yazınız.
//    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
//    s -> 5
//    a -> 4
//    e -> 3
//    i -> 1
//    o -> 0
//    Test data
//    hackerDili("java ile hersey guzel")
//    j4v4 1l3 h3r53y guz3l
//    İpucu harfleri değiştirin ve ekrana yazdırın.
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir cumle giriniz");
        String cumle=scan.nextLine().toLowerCase();
        hackerDili();

    }

    private static void hackerDili() {

    }
}
