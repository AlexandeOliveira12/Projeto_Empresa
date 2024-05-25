package funcionario;

public class DiretorADM extends Diretor{
  protected double dec4Salario;

  public DiretorADM() {
  }

  public DiretorADM(int codigo) {
    super(codigo);
  }

  public DiretorADM(int codigo, int codigoAux, String nome, double pagProducao,  double dec4Salario) {
    super(codigo, codigoAux, nome, pagProducao);

    this.dec4Salario = dec4Salario;
  }

  public double getDec4Salario() {
    return dec4Salario;
  }

  public void setDec4Salario(double dec4Salario) {
    this.dec4Salario = dec4Salario;
  }
}