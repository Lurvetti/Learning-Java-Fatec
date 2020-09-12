# Encapsulamento

## Características gerais

* Mecanismo utilizado para disponibilizar métodos, **protegendo o acesso** direto e indevido aos atributos de uma instância (objeto).
* **Evita a interferência** indevida de um objeto sobre os dados de outro objeto
* Transformar os objetos que compõem um aplicação em verdadeiras **caixas-pretas**
* Aplicado de forma a permitir que uma alteração na estrutura interna de uma classe **não prejudique o funcionamento do código externo**
* Com o encapsulamento, os atributos de uma classe são implementados sempre como privados (private) e sua leitura e escrita são realizadas por métodos **Getters e Setters**.

## Modificadores de acesso

* **public**
  * acessados por objetos de outra classe
* **private**
  * acessados somente por objetos da mesma classe
* **friendly**
  * visivel apenas para objetos e classes do mesmo pacote
* **final**
  * constantes

# Construtores

## Características Gerais

* Métodos especiais que são chamados antes da execução de outros códigos
* São executadas na instanciação do objeto
* Uma classe pode ter mais de um construtor, contanto que tenham assinaturas diferentes
* Devem ter exatamente o mesmo nome da Classe
* Não podem retornar nenhum valor, nem mesmo void
* Não recebem nenhum modificador - sempre público

## Sobrecargas de Método

* Executar um método em uma classe passando mais ou menos argumentos, conforme a necessidade
* Linguagens orientadas a objeto permitem a criação de métodos com nomes iguais, contanto que as suas assinaturas sejam diferentes
* Assinatura de um modo é composta de seu nome mais os tipos de argumentos que são passados para esse método, independentemente dos nomes de variávies usadas na declaração do método
* O tipo de retorno não é considerado parte da assinatura: não podemos ter dois métodos com o mesmo nome, tipo de argumentos, mas tipo de retorno diferente
