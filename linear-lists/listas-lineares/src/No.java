public class No {
  
  private int chave;
  private String nome;
  private String endereco;

  public No(int chave, String nome, String endereco) {
    this.chave = chave;
    this.nome = nome;
    this.endereco = endereco;
  }

  public int getChave() {
    return chave;
  }

  public void setChave(int chave) {
    this.chave = chave;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  @Override
  public String toString() {
    return "No [chave=" + chave + ", nome=" + nome + ", endereco=" + endereco + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + chave;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    No other = (No) obj;
    if (chave != other.chave)
      return false;
    return true;
  }

}
