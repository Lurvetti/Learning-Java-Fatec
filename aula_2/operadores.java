public class operadores {
    public static void main(String args[]){
        
        int x = 5;
        int y = x--;
        int z = --x;
        System.out.println("valor z = " + z);
        System.out.println("valor x = " + x);
        System.out.println("valor y = " + y);
        
        z *= x;
        System.out.println("valor z = " + z);

        System.out.println("Resto da divisão de 5 por 2: " + 5 % 2);

        if(x % 2 == 0){
            System.out.println("x is even");
        }else{
            System.out.println("x is odd");
        }
    }
}