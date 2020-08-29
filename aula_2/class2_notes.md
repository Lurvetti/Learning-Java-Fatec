
# Class 2 - Review

* Classe Scanner - Entrada de dados
    * java.utilpacote
    * para usar: criar um objeto de classe
    * usar qualquer um do métodos disponíveis para entrada de dados
    ```java
        nextBoolean()
        nextInt()

        /*exemplo*/
        Scanner meuScanner = new Scanner(System.in);
        System.out.println("Digite o seu nome:");

        String name = meuScanner.nextLine();
        System.out.println("Seu nome é: " + nome);
    ```
* Java Operadores
    * % resto de divisão
    * z = ++x; z recebe o valor de x + 1
    * z = x++; z recebe o valor de x e x é incrementado
    * && e
    * || ou
    * nome == "Lucas"
* Estruturas de Decisão
    * if, switch
    ```java
    if(numero % 2 == 0){
        System.out.println("O número é par")
    }else{
        System.out.println("O número é ímpar");
    }
* Loops
    * for, while
    ```java
    while (i <=10){
        a = a + i;
    }
    for (i=1; i<=10; i++){
        a = a + 1;
    }
* Arrays
    ```java
    String[] carros = {"Volvo", "BMW", "Ford"};
    int[] numeros = {1, 32, 4, 77};
    numeros[0];

    //tamanho do array
    System.out.println(carros.length);
    ````