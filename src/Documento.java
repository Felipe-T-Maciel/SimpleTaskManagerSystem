public class Documento extends Projeto{

    private final int qtdPaginas;
    private String texto;
    private static int count = 0;
    private final int iD;

    public Documento(String nome, String dataFinal, String prioridade, String responsavel, int qtdPaginas, String texto) {
        super(nome, dataFinal, prioridade, responsavel);
        this.texto = texto;
        this.iD = count++;
        this.qtdPaginas = qtdPaginas;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "ID= "+iD+
                super.toString() +
                "qtdPaginas=" + qtdPaginas +
                "} ";
    }
}
