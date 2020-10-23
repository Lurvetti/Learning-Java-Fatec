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

* O **finally** garabte que um certo código seja executado!
