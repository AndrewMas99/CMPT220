//Andrew Masone
//Fibonacci sequence maker

public class fibo {
    public static void main(String[]args){
        int count=0;
        double var1=1;
        double var2=1;
        double var3;
        while (count<30){
            var3 = var1+var2;
            //System.out.println(var1);
            //System.out.println(var2);
            System.out.println(var3);
            var1=var2;
            var2=var3;
            count++;
        }
    }
}
