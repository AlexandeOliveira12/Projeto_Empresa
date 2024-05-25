package sistenainterno;

import funcionario.*;

public class SistemaInterno {

  public static void main(String[] args) {
    Autentica diretorADM = new DiretorADM();
    login(diretorADM, 123456);
  }

  public static void login(Autentica fa, int senha){
    if (fa.autentica(senha)) {
      System.out.println("Login liberado!");
    }
    else {
      System.out.println("Login falhou!");
    }
  }
}
