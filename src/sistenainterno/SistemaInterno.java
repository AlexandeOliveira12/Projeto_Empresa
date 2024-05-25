package sistenainterno;

import funcionario.*;

public class SistemaInterno {

  public static void main(String[] args) {
    Funcionario diretorADM = new DiretorADM();
    login(diretorADM, 123456);
  }

  public static void login(Funcionario funcionario, int senha){
    if (funcionario.autentica(senha)) {
      System.out.println("Login liberado!");
    }
    else {
      System.out.println("Login falhou!");
    }
  }
}
