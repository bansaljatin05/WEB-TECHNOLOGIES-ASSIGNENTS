package Assignment4;

public class Ques_3 {

    private static double num;
    public  Ques_3 ( )
    {
        num = 135.0d;
    }

    public boolean isZero ( ) //method to check whether num is zero or not
    {
        return num == 0.0;
    }
    public boolean isPositive ( )//method to check whether num is positive or not
    {
        return num > 0.0;
    }
    public boolean isNegative ( )//method to check whether num is negative or not
    {
        return num < 0.0;
    }
    public boolean isodd( )//method to check whether num is odd or not
    {
        return num % 2 != 0.0;
    }
    public boolean isEven ( )//method to check whether num is even or not
    {
        return num % 2 == 0.0;
    }
    public boolean isPrime ( )//method to check whether num is prime or not
    {
        int i, last_num;

        double a;
        boolean flag;
        a = Math.sqrt(num);
        last_num = (int)a;
        flag = true;
        for (i=2; i<last_num; i++)
        {
            if (num != i)
            {
                if( num % i ==0)
                {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
    public boolean isAmstrong ( )//method to check whether num is amstrong or not
    {
        return num == 0.0;
    }
    public double getFactorial ( )//method to get factorial of num
    {
        double d=1;
        for(int i = 1; i < num; i++)
            d=d*i;
        return d;
    }
    public double getSqrt ( )//method to get square root of num
    {
        double d;
        d = (double) num;
        d= Math.sqrt(d);
        return d;
    }
    public double getReverse ( )//method to get reverse of num
    {
        double d =0;
        double temp;
        int db = (int) num;
        while (db >9)
        {
            temp = db %10;
            d = d * 10 + temp;
            db = db /10;
        }
        d = d * 10 + db;
        return d;
    }
    public double sumDigits( )//method to get sum of digits of num
    {
        double d=0;
        int n = (int) num;
        while( n >9)
        {
            d += n % 10;
            n = n /10;
        }
        d += n;
        return d;
    }
    public void dispBinary ( )//method to display binary of num
    {
        System.out.println("ByteValue :" + Long.toBinaryString((long) num));
    }
    public static void main(String[] args) {

        Ques_3 num = new Ques_3();
        System.out.println(" The given num is : " + Ques_3.num);
        num.dispBinary();
        System.out.println ("isZero: " + num.isZero() );
        System.out.println ("isPositive: " + num.isPositive());
        System.out.println ("isNegative: " + num.isNegative() );
        System.out.println ("isOdd: " + num.isodd());
        System.out.println ("isEven: " + num.isEven());
        System.out.println ("isPrime: " +num.isPrime());
        System.out.println ("isAmstrong: " +num.isAmstrong());
        System.out.println ("getFactorial: " + num.getFactorial());
        System.out.println ("getSqrt: " + num.getSqrt( ));
        System.out.println("getReverse:  " + num.getReverse());
        System.out.println ("sumDigits: " + num.sumDigits( ));

    }
}
