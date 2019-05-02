
package Composite;

/**
 *
 * @author Victor Oliveira
 */
public class Main {
    public static void main(String[] args) {
        
        Item foto = new Arquivo("fotoViagem", "450KB");
        Item projeto = new Arquivo("projeto", "2GB");
        Item redacao = new Arquivo("redacao", "285KB");
        
        Item raiz = new Pasta("Raiz");
        Item viagens = new Pasta("viagens");
        Item trabalhos = new Pasta("trabalhos");
        Item provas = new Pasta("provas");
        
        raiz.addItem(viagens);
        raiz.addItem(trabalhos);
        viagens.addItem(foto);
        trabalhos.addItem(projeto);
        trabalhos.addItem(redacao);
        trabalhos.addItem(provas);
        
        raiz.exibirItens();
//        viagens.exibirItens();
//        trabalhos.exibirItens();
//        provas.exibirItens();
        
    }
}
