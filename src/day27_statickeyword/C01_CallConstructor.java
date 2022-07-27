package day27_statickeyword;

public class C01_CallConstructor {
    public static void swing(){
        System.out.print("swing");
    }
    public void climb(){
        System.out.println("climb");
    }
    public static void play(){
        swing();

    }

    public static void main(String[] args) {
        C01_CallConstructor rope = new C01_CallConstructor();
        rope.play();
        C01_CallConstructor rope2=null;
        rope2.play();
    }
}
