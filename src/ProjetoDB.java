public class ProjetoDB implements Icrud<Projeto>{

    @Override
    public void adicionar(Projeto ob) {
        if(Usuario.projetos.add(ob)){
            System.out.println("projeto adicionado");
        }else {
            System.out.println("erro");
        }
    }

    @Override
    public void remover(Projeto ob) {
        Usuario.projetos.remove(ob);
    }

    @Override
    public Projeto pesquisar(int id) {
        for (Projeto projeto:Usuario.projetos
             ) {
            if(projeto.getiD() == id){
                return projeto;
            }
        }
        return null;
    }

    @Override
    public void listarNaoArquivadas() {
        for (Projeto projeto:Usuario.projetos){
            if(!projeto.getArquivado()){
                System.out.println(projeto.projetoInfo());
            }
        }
    }

    @Override
    public void listarArquivadas() {
        for (Projeto projeto:Usuario.projetos){
            if(projeto.getArquivado()){
                System.out.println(projeto.projetoInfo());
            }
        }
    }
}
