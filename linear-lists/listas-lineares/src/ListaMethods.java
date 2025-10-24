public class ListaMethods {

  // Para cada elemento na busca o algoritmo realiza dois testes: i <= n e l[i].getChave() == x
  public int busca1(int x, No[] l) {
        int i = 0;
        while (i <= l.length) {
          if(x == l[i].getChave()){
                return i;
            }
            i++;
        }
      return -1;
    }


  // Neste algoritmo que faz exatamento a mesma operação que o busca1 temos uma estratégia diferente com o uso de sentinela,
  // removendo a validação de final de lista.
  public int busca2(int x, No[] l, int tam) {
    
    int i = 0;
    l[tam].setChave(x);

    while (l[i].getChave() != x) {
      i++;
    }

    if(i != tam) {
      return i;
    } else {
      return -1;
    }
  }

}
