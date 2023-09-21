import java.util.ArrayList;

public class Projeto {
    static ArrayList<Tarefa> tarefas = new ArrayList<>();
    static ArrayList<Documento> documentos = new ArrayList<>();

    private static int count = 0;
    private final int iD;
    private final String nome;
    private final String dataFinal;
    private final String prioridade;
    private boolean arquivado;
    private final String responsavel;

    public Projeto(String nome, String dataFinal, String prioridade, String responsavel) {
        this.iD = count++;
        this.nome = nome;
        this.dataFinal = dataFinal;
        this.prioridade = prioridade;
        this.arquivado = false;
        this.responsavel = responsavel;

    }

    public void arquivar(){
        if(this.getArquivado()){
            this.setArquivado(false);
            System.out.println("Arquivada");
        }else {
            this.setArquivado(true);
            System.out.println("Desarquivada");
        }
    }

    public void setArquivado(boolean arquivado) {
        this.arquivado = arquivado;
    }

    public boolean getArquivado() {
        return arquivado;
    }

    public int getiD() {
        return iD;
    }

    @Override
    public String toString() {
        return ", nome='" + nome + '\'' +
                ", dataFinal='" + dataFinal + '\'' +
                ", prioridade='" + prioridade + '\'' +
                ", arquivado=" + arquivado +
                ", responsavel='" + responsavel + '\'' +
                ", ";
    }

    public String projetoInfo() {
        return "Projeto{" +
                "quantidade de tarefas=" + tarefas.size() +
                ",quantidade de documentos=" + documentos.size() +
                ", iD=" + iD +
                ", nome='" + nome + '\'' +
                ", dataFinal='" + dataFinal + '\'' +
                ", prioridade='" + prioridade + '\'' +
                ", arquivado=" + arquivado +
                ", responsavel='" + responsavel + '\'' +
                '}';
    }

}
