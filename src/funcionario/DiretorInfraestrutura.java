package funcionario;

public class DiretorInfraestrutura extends Diretor{
  public DiretorInfraestrutura() {
  }

  public DiretorInfraestrutura(int codigo) {
    super(codigo);
  }

  public DiretorInfraestrutura(int codigo, int codigoAux, String nome, double pagProducao) {
    super(codigo, codigoAux, nome, pagProducao);
  }

  @Override
  public void ajustaPagProducao(double vlrAjuste) {
    this.pagProducao = this.pagProducao + (vlrAjuste * 2);
  }
}
