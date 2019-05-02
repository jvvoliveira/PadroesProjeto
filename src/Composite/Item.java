package Composite;

/**
 *
 * @author Victor Oliveira
 */
public abstract class Item {
    
    public String getNome(){
        throw new UnsupportedOperationException();
    }
    public void setNome(String nome){
        throw new UnsupportedOperationException();
    }
    
    public String getTamanho(){
        throw new UnsupportedOperationException();
    }
    public void setTamanho(String tamanho){
        throw new UnsupportedOperationException();
    }
    
    public void print(){
        throw new UnsupportedOperationException();
    }
    
    
    public void addItem(Item item){
        throw new UnsupportedOperationException();
    }
    public void removeItem(int i){
        throw new UnsupportedOperationException();
    }
    public Item getItem(int i){
        throw new UnsupportedOperationException();
    }
    public void exibirItens(){
        throw new UnsupportedOperationException();
    }
    
}
