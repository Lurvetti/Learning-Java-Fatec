public class Ex02 {
    public static void main(String[] args){
        char a = '@';
        byte b = 100;
        short c = 500;
        int d = 2500;
        long e = 30000;
        boolean f = true;
        float g = 5.68f;
        double h = 99.12;
        String i = "Finalmente";

        int x, y;
        float z, w;

        //casting
        x = (int) g;
        y = (int) h;
        z = (float) d;
        w = (float) h;

        System.out.println("a - " + a);
        System.out.println("b - " + b);
        System.out.println("c - " + c);
        System.out.println("d - " + d);
        System.out.println("e - " + e);
        System.out.println("f - " + f);
        System.out.println("g - " + g);
        System.out.println("h - " + h);
        System.out.println("i - " + i);

        System.out.println("\nx - " + x);
        System.out.println("y - " + y);
        System.out.println("z - " + z);
        System.out.println("w - " + w);
    }
}
