package funcionario;

public class Gerente extends Funcionario{

  public Gerente() {
  }

  public Gerente(int codigo, int codigoAux, String nome) {
    super(codigo, codigoAux, nome);
  }

  public Gerente(int codigo) {
    super(codigo);
  }
}
