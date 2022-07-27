package day13_recap;

public class C03_IfStatement {
    public static void main(String[] args) {
        int not=85;
        if(not>=90&&not<=100){
            System.out.println("A");
        }
        else if(not>=80&&not<=90){
            System.out.println("B");
        }else if(not>=70&&not<=80){
            System.out.println("C");
        }else if(not>=60&&not<=70){
            System.out.println("D");
        }else {
            System.out.println("F");
        }
    }
}
