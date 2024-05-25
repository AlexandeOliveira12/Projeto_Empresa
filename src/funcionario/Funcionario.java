package funcionario;

public abstract class Funcionario {
    protected int codigo;
    protected int codigoAux;
    protected String nome;
    private static final String nomeApp = "AppFuncionario";
    private static int qtdeObjetosFunc;

    public Funcionario() {
        Funcionario.qtdeObjetosFunc++;
    }

    public Funcionario(int codigo) {
        this.codigo = codigo;

        Funcionario.qtdeObjetosFunc++;
    }

    public Funcionario(int codigo, int codigoAux, String nome) {
        this.codigo = codigo + codigoAux;
        this.nome = nome;
        this.codigoAux = codigoAux;

        Funcionario.qtdeObjetosFunc++;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;

        Funcionario.qtdeObjetosFunc++;
    }

    public void setCodigo(int codigo, int codigoAuxiliar) {
        this.codigo = codigo + codigoAuxiliar;

        Funcionario.qtdeObjetosFunc++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;

        Funcionario.qtdeObjetosFunc++;
    }

    public static String getNomeApp() {
        return nomeApp;
    }

    public static int getQtdeObjetosFunc() {
        return qtdeObjetosFunc;
    }


}