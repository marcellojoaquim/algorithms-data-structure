## Listas lineares

### Intridução

Dentre as estruturas de dados não primitivas, as listas lineares são as de manipulação mais simples. Uma lista linear agrupa informações referentes a um conjunto de elementos que se relacionam. 

Uma lista linear é um conjunto de n >= 0 nós tal que L[1], L[2], ..., L[n] e sua propriedade estrutural decorre da posição relativa dos nós dentro da sequência linear.
- se n > 0, L[1] é o primeiro nó.
- para 1 < k <= n, o nó L[k] é precedido por L[k-1].

## Operações
As operações mais comuns em listas são, busca, inclusão e remoção de um elemento, essas operações podem ser consideradas básicas.
Outras operações:
- Alterar um elemento
- Combinação de lista em uma única lista
- Ordenação segundo um determinado critério
- Determinação do primeiro ou do último
- Determinação da cardinalidade

Casos particulares:

- Se inserções e remoções são permitidas apenas nas extremidades a lista recebe o nome de Deque (double ended queue)
- Se inserções e remoções são permitidas apenas em um extremo, ela é chamada de pilha
- Se inserções são realizadas em um extremo e remoção no outro extremo, ela é chamada fila

## Armazenamento

O tipo de armazenamento é classificado de acordo com a posição relativa na memória de dois nós consecutivos na lista.

### Alocação sequencial
A maneira mais simples de manter uma lista linear na memória do computador é alocar os nós em posições contíguas, o endereço do nó n+1 da lista se encontra x unidades adiante de n+1.
- A implementação de alocação sequencial em linguagens de alto nível é geralmente realizada com a reserva prévia de memória para cada estrutura utilizada.
- O armazenamento sequencial é uma boa escolha para o caso de filas e pilhas.

#### Listas lineares em alocação sequencial
- Cada nó é formado por campos que armazenam informações que são os elementos da lista.
- Cada nó possui um identificador chave, todas as chaves devem ser distintas.

A implementacao de um nó está na classe No
As implementações dos algoritmos busca1 e busca2 estão na classe ListaMethods

- busca1 e busca2 
O algoritmo busca1 para cada elemento na busca, são realizados dois testes i <= n e l[i].getChave() == x
Já o algoritmo busca2 utiliza a estratégia de otimização atraves de sentinela, neste caso eliminamos uma das validações adicioanando 
o elemento com valor buscado ao final do algoritmo, evitando assim o teste de final de lista.
- A complexidade de pior caso para ambos os algoritmos é O(n) porém o segundo tem uma execução mais rápida.


