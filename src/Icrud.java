public interface Icrud<Object>{

    void adicionar(Object ob);
    void remover(Object ob);
    Object pesquisar(int id);
    void listarNaoArquivadas();
    void listarArquivadas();

}
