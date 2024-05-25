package funcionario;

public class Gerente extends Funcionario implements Autentica{

  public Gerente() {
  }

  public Gerente(int codigo, int codigoAux, String nome) {
    super(codigo, codigoAux, nome);
  }

  public Gerente(int codigo) {
    super(codigo);
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
