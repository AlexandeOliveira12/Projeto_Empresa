package driver;

import funcionario.DiretorADM;
import funcionario.DiretorInfraestrutura;
import funcionario.Diretor;
import funcionario.Funcionario;

public class TestaHeranca {
  public static void main(String[] args) {
    //Diretor diretor = new Diretor(10,1000,"Diego");
    //System.out.printf("Diretor - Código:%d \nNome:%s\n",diretor.getCodigo(),diretor.getNome());

    DiretorADM diretorADM = new DiretorADM(1,1000,"Marcelo",15000,10000);
    System.out.printf("Diretor ADM - Código:%d \nNome:%s   14 Salário:%.2f\n",diretorADM.getCodigo(),diretorADM.getNome(),diretorADM.getDec4Salario());
    diretorADM.ajustaPagProducao(1000);
    System.out.println(diretorADM.getPagProducao());

    DiretorInfraestrutura diretorInfraestrutura = new DiretorInfraestrutura(2,1000,"Gustavo",15000);
    System.out.printf("Diretor Infraestrutura - Código:%d \nNome:%s\n",diretorInfraestrutura.getCodigo(),diretorInfraestrutura.getNome());

    System.out.println(Funcionario.getNomeApp());
    System.out.println(Funcionario.getQtdeObjetosFunc());
  }
}