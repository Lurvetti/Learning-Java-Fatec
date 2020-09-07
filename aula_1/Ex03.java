public class Ex03 {
    public static void main(String[] args){
        //3a
        short s1, s2, s3;
        s1 = 5;
        s2 = 10;
        s3 = (short) (s1 + s2);
        System.out.println("Soma - " + s3);
        //3b
        long long1, long2, long3;
        long1 = 55555555555l;
        long2 = 66666666666l;
        long3 = long1 + long2;
        System.out.println("Soma long - " + long3);
        //3c
        double d1, d2, d3;
        d1 = 3.4;
        d2 = 5.99;
        d3 = d1 + d2;
        System.out.println("Soma double - " + d3);
        //3d - floats are more preciseP
        float f1, f2, f3;
        f1 = 3.4f;
        f2 = 5.99f;
        f3 = f1 + f2;
        System.out.println("Soma float - " + f3);
    }
}
