package kendi_kendime_2;

import static java.lang.Integer.parseInt;

public class C10_UniqueSum {
    public static void main(String[] args) {
       // Type code to find the sum of the unique digits of an integer
    int digit=1234634755;
    String num=String.valueOf(digit);
    int  box=0;
        for (int i = 0; i <num.length(); i++) {
            String cv=num.substring(i,i+1);
            if(num.indexOf(cv)==num.lastIndexOf(cv)){
                box=Integer.parseInt(cv)+box;

            }


        }

        System.out.println(box);


    }
}
