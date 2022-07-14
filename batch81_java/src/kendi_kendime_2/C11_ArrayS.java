package kendi_kendime_2;

public class C11_ArrayS {
    public static void main(String[] args) {
       int n=getir();
    }

    private static int getir() {
       int  myArray[]={15,4,6,9,-5,1};
       int num=10;
        for (int i = 0; i <myArray.length; i++)  {
            for (int j = 0; j <myArray.length ; j++) {
                if(myArray[i]+ myArray[j]==num){
                    System.out.println(myArray[i]+"+"+ myArray[j] + "="+num);
                }

            }

        }return num;

    }
}
