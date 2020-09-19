# Static

* pode ser aplicado a métodos e atributos de uma classe;
* atributos **static** pertencem à classe e não aos objetos;
* só existe uma cópia de um atributo **static** de uma classe, mesmo que haja vários objetos da classe;
* **podemos acessar métodos ou atributos static sem a necessidade de criar uma instância da classe;**
* o acesso é feito usando o nome da classe e não do objeto.

```java
public class FuncoesMatematicas {
    public static int exponencial(int x, int y){
        if(y == 0)
            return 1;
    return x * exponencial(x, y-1);
    }

public static int fatorial(int x) {
    if(x == 0)
        return 1;
    return x * fatorial(x-1);
    }
}

public class TesteMatematica{
    public static void main(String[] args){
        System.out.println("2^5 = " + FuncoesMatematicas.exponecial(2, 5));
    }
}
```

## Relacionamento entre Classes ("Tem-um)

Classes podem ter relacionamento entre si

* objetivo: compartilhamento de informações

## ArrayList (listas)

```java
import java.util.ArrayList;

ArrayList<Despesa> despesas = new ArrayList<Despesa>();
despesas.add(new Despesa(LocalDate.of(2020,1,1), "Mercado", 10.89))

despesas.size() // length
despesas.get() // por índice
