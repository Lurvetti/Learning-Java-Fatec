# Tratamento de exceções em Java

* Uma exceção **não é um erro**, por que se o programa compilou e executou, significa que este não apresentava erro;

* Uma exceção é um sinal que indica algum tipo de **condição  excepcional** ocorrida durante a execução de um determinado programa e que **não foi mapeada ou verificada durante a compilação** do programa;

* Duas atividades associadas à manipulação de uma exceção:
  * **geração** - sinalizção que uma condição excepcional ocorreu;
  * **captura** - manipulação (tratamento) da situação excepcional, onde as ações necessárias para a recuperação da situação do problema são definidas.

* Para cada exceção que pode ocorrer durante a execução do código, um bloco de ações de tratamento (um exception handler) deve ser especificado;

## No Java

* Duas importantes estruturas:

```java
try{} catch (Exception e){}
try{} catch (Exception e){} finally{}
```

* O **finally** garante que um certo código seja executado!

* Podemos criar/customizar exceções de acordo com regras de negócio; **VER EXEMPLO 3**

* Métodos de **throwable** - utilizados quando queremos utilizar métodos para tratar de exceções, que **devem ser feitas em algum lugar**

* Lançar exceções artificialmente - **throw**

---

## **Acessando o Banco de Dados JDBC**

* SQLite;

* Conexão através do Java Database Connectivity - API definida nos pacotes java.sql e javax.sql utilizada para estabelecer uma conexão com um BD a um programa java;

* A API JDBC é um conjunto de classes e interfaces que provê um padrão para tornar possívlle, aos devs, a construção de softtware que acesse BD;

* Provê acesso universla a dados par a linguagem de programação Java;

* Permite o acesso a qualquer tipo de fonte de dados (BDR, planilhas e arquivos de dados);
