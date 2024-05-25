package funcionario;

public class FuncionarioAutenticavel extends Funcionario{


  public FuncionarioAutenticavel() {
  }

  public FuncionarioAutenticavel(int codigo, int codigoAux, String nome) {
    super(codigo, codigoAux, nome);
  }

  public FuncionarioAutenticavel(int codigo) {
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
