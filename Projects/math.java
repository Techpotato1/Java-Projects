public class math
{
    public static void main(String[] args)
    {
        System.out.println(getPresentValue(4,5,3));
    }
    public static double getPresentValue(int pmt, int i, int n)
    {
        double rate = (double) i / 100;
        double tmp = Math.pow((1 + rate), -n);
        double value = pmt * (1 - tmp) / rate;
        return value;
    }  
}