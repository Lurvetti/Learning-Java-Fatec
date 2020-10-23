# Polimorfismo

* Mecanismo de POO que possibilida a sobrecarga de métodos e construtores dentro de uma mesma classe ou sobrecarga de métodos em subclasses e a sobrescrita de métodos em subclasses

* Ocorre quando um mesmo trecho de código assume comportamentos diferenciados de acordo com o estado do objeto. Em outras palavras, quando subtipos herdam um comportamento de um supertipo, porém o executam de forma diferenciada

## Conversão de tipos (TypeCasting)

* A operação de cast de objetos é semelhante à operação de cast de tipos primitivos, com a diferença que, no segundo, o tipo e a estrutura da variável são alterados definitivamente e, no primeiro, as características e funcionalidades estarão apenas ocultas, podendo ser restituídos posteriormente

### Cast Up

* **Toda classe criada extende a classe OBJECT**

* Exemplo: vizualizar um objeto da classe Cliente como Pessoa ou Object

### Cast Down

* A operação de cast down é oposta à operação de cast up, isto é, ao invés de generalizarmos um objeto vamos especializá-lo

* Se um objeto é criado e **declarado como Cliente, e sofre um cast up para Pessoa, é possível fazer o cast down** para voltar a visualizá-lo como Cliente, uma vez que foi criado como Cliente. No entanto, **se um objeto é criado e declarado como Pessoa, não é possível fazer o cast down para transformá-lo em Cliente**
