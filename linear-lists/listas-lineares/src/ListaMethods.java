public class ListaMethods {

  //Para cada elemento na busca o algoritmo realiza dois testes: i <= n e l[i].getChave() == x
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


  //
  public int busca2(int x, No[] l) {
    int i = 0;
    No no = new No(x, "Novo no", "novo endereco");
    while (l[i].getChave() != x) {
      if(i == l[i].getChave()){
        return l[i].getChave();
      }
      i++;
    }
    return no.getChave();
  }

}
