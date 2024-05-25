package funcionario;

public class Supervisor extends Funcionario implements Autentica{
  public boolean autentica(int senha) {
    if (senha == 123456) {
      return true;
    }
    else {
      return false;
    }
  }
}
