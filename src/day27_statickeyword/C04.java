package day27_statickeyword;

public class C04 {
    int x;
    static int y;
    C04(int i){
        x+=i;
        y+=i;
    }

    public static void main(String[] args) {
        new C04(2);
        C04 dnm =new C04(3);
        System.out.println(dnm.x+","+dnm.y);

    }
}
