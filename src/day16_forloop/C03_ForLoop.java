package day16_forloop;

public class C03_ForLoop {
    public static void main(String[] args) {
        int bas=10;
        int son=30;
        for (int i = bas; i <=son ; i++) {
            if(i!=son){
            System.out.print(i+",");

        }else{
                System.out.println(i);
            }
        }

    }
}
