# Aprendendo sobre Classes e objetos

## Classes s�o formas que criam objetos
> - As classes podem ser chamadas de 2 formas
> - Static onde n�o precisa dar new para utilizar o (ponto) por�m somente itens static aparecem como op��o
> - Objeto onde para acessar os atributos e metodos � necess�rio dar new para criar um objeto

## Encapsulamento
> - Pode ser visto como uma burocracia no c�digo, por�m facilita e muito a refatora��o com o min�mo ou nenhum impacto para quem j� consome os objetos dessa classe
>Exemplos:
> - Alterar o nome de um atributo que esta sendo acessado diretamente fora da classe, requer que a la fora seja ajustado tamb�m
> - Mudar privil�gios de altera��o ou leitura sem impactar em que consome, basta alterar a implementa��o nos gets e sets