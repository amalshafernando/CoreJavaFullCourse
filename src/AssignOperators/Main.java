package AssignOperators;

public class Main {

    public static void main(String[] args){
        int num = 7;

        int result ;

        num =num+1;
        num +=1;
        num++;
        ++num; //post - increment
        num--; ///pre increment

        result = num;
    /*    result1 = num--;
        result2 = num++;
        result3 = num++;
        result4 = num++; */

        System.out.println(result);
      //  System.out.println(result1);
        System.out.println( num++);
        System.out.println(++num);
        System.out.println(num--);


    }
}
