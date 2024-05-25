package sistenainterno;

import funcionario.*;

public class SistemaInterno {

  public static void main(String[] args) {
    FuncionarioAutenticavel diretorADM = new FuncionarioAutenticavel();
    login(diretorADM, 123456);
  }

  public static void login(FuncionarioAutenticavel fa, int senha){
    if (fa.autentica(senha)) {
      System.out.println("Login liberado!");
    }
    else {
      System.out.println("Login falhou!");
    }
  }
}
