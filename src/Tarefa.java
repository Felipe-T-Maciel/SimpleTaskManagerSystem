public class Tarefa extends Projeto{
    private final String status;
    private static int count = 0;
    private final int iD;
    public Tarefa(String nome, String dataFinal, String prioridade, String responsavel, String status) {
        super(nome, dataFinal, prioridade, responsavel);
        this.iD = count++;
        this.status = status;
    }


    @Override
    public String toString() {
        return "Tarefa{" +
                "ID= "+iD+
                super.toString()+
                "status='" + status + '\'' +
                "} ";
    }
}
