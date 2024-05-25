package funcionario;

public abstract class Diretor extends Funcionario implements Autentica{
  protected double pagProducao;

  public Diretor() {
  }

  public Diretor(int codigo) {
    super(codigo);
  }

  public Diretor(int codigo, int codigoAux, String nome, double pagProducao) {
    super(codigo, codigoAux, nome);
    this.pagProducao = pagProducao;
  }

  public void ajustaPagProducao(double vlrAjuste) {
    this.pagProducao = this.pagProducao + vlrAjuste;
  }

  public double getPagProducao() {
    return pagProducao;
  }

  public void setPagProducao(double pagProducao) {
    this.pagProducao = pagProducao;
  }
  public boolean autentica(int senha) {
    if (senha == 123456) {
      return true;
    }
    else {
      return false;
    }
  }
}