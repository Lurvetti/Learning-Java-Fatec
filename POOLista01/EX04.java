public class EX04 {
    public static void main(String[] args){
        //4a
        System.out.println("4a");
        for(int i=0; i<=10; i++){
            System.out.print(i + " ");
        }
        //4b
        System.out.println("\n4b");
        for(int i=0; i<=10; i++){
            System.out.print((i+100) + " ");
        }
        //4c
        System.out.println("\n4c");
        long sum = 0;
        for(int i=5; i<=50; i++){
            sum += i;  
        }
        System.out.println("Soma - " + sum);
        sum = 0;

        for(int i=5; i<=50000; i++){
            sum += i;  
        }
        System.out.println("Soma - " + sum);

        sum = 0;
        for(int i=5; i<=500000; i++){
            sum += i;  
        }
        System.out.println("Soma - " + sum);

        //4d
        System.out.println("\n4d");
        for(int i=0; i<=200; i++){
            if( i % 7 == 0){
                System.out.println(i + " ");
            } 
        }

        //4e
        System.out.println("\n4e");
        String numbers = "1";
        for(int i=2; i<=9; i++){
            numbers += i;
            if(i == 9){ numbers = "\t\t\t" + numbers;}
            System.out.println(numbers);
        }

        //4f
        System.out.println("\n4f");
        int mult79 = 1000;
        while(mult79 % 79 != 0){
            mult79++;
        }
        System.out.println("Primeiro mult de 79 maior que 1000: " + mult79);

        //4g
        for(int i=28; i<=126; i++){
            System.out.print((char) i + " ");
        }
        System.out.println();
    }
}
