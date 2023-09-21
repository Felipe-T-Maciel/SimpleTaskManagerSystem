public class DocumentoDB implements Icrud<Documento>{


    @Override
    public void adicionar(Documento ob) {
        if(Projeto.documentos.add(ob)){
            System.out.println("documento adicionado");
        }else {
            System.out.println("erro");
        }
    }

    @Override
    public void remover(Documento ob) {
        Projeto.documentos.remove(ob);
    }

    @Override
    public Documento pesquisar(int id) {
        return null;
    }

    @Override
    public void listarNaoArquivadas() {
        for (Documento documento:Projeto.documentos){
            if(!documento.getArquivado()){
                System.out.println(documento);
            }
        }
    }

    @Override
    public void listarArquivadas() {
        for (Documento documento:Projeto.documentos){
            if(documento.getArquivado()){
                System.out.println(documento);
            }
        }
    }


}
