public class Main {

    static TarefaDB tarefaData = new TarefaDB();
    static DocumentoDB documentoDB = new DocumentoDB();
    static ProjetoDB projetoDB = new ProjetoDB();

    public static void main(String[] args) {

        tarefaData.adicionar(new Tarefa("1","01/02","Alta","Felipe","Done"));
        tarefaData.adicionar(new Tarefa("2","01/02","Alta","Junior","Done"));
        tarefaData.adicionar(new Tarefa("3","01/02","Alta","Sla","Done"));

        System.out.println(Projeto.tarefas.get(0).toString());
        System.out.println(Projeto.tarefas.get(1).toString());
        System.out.println(Projeto.tarefas.get(2).toString());
    }
}
