package day14_methodcreation;

public class C01_Methodcreation {
    public static void main(String[] args) {
        String input="nuri";
        tersteYazdır(input);

    }
    public static void tersteYazdır(String input){
        String tersInput=input.substring(3)+
                input.substring(2,3)+
                input.substring(1,2)+
                input.substring(0,1);
        System.out.println("girdiğiniz ismin tersi: "+tersInput);


    }
}
