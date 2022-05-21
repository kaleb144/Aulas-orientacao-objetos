# Aprendendo sobre Classes e objetos

## Classes são formas que criam objetos
> - As classes podem ser chamadas de 2 formas
> - Static onde não precisa dar new para utilizar o (ponto) porém somente itens static aparecem como opção
> - Objeto onde para acessar os atributos e metodos é necessário dar new para criar um objeto

## Encapsulamento
> - Pode ser visto como uma burocracia no código, porém facilita e muito a refatoração com o minímo ou nenhum impacto para quem já consome os objetos dessa classe
>Exemplos:
> - Alterar o nome de um atributo que esta sendo acessado diretamente fora da classe, requer que a la fora seja ajustado também
> - Mudar privilégios de alteração ou leitura sem impactar em que consome, basta alterar a implementação nos gets e sets