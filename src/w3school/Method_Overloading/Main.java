package w3school.Method_Overloading;
/*
* Method Overloading*
With method overloading, multiple methods can have the same name with different parameters:
* */
public class Main {

    static int cal(int x, int y){
        return x+y;
    }

    static double cal(double x, double y){
        return  x+y;
    }

    public static void main(String[] args){
        int result1 =cal(4,5);
        double result2 = cal(5.2,8.9);
    }
}
