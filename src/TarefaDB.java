public class TarefaDB implements Icrud<Tarefa>{


    @Override
    public void adicionar(Tarefa ob) {
        if(Projeto.tarefas.add(ob)){
            System.out.println("tarefa adicionada");
        }else {
            System.out.println("erro");
        }
    }

    @Override
    public void remover(Tarefa ob) {
        Projeto.tarefas.remove(ob);
    }

    @Override
    public Tarefa pesquisar(int id) {
        return null;
    }

    @Override
    public void listarNaoArquivadas() {
        for (Tarefa tarefa:Projeto.tarefas){
            if(!tarefa.getArquivado()){
                System.out.println(tarefa);
            }
        }
    }

    @Override
    public void listarArquivadas() {
        for (Tarefa tarefa:Projeto.tarefas){
            if(tarefa.getArquivado()){
                System.out.println(tarefa);
            }
        }
    }


}
