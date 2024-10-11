package models;

public class Hash<T> {
    private T[] data;

    @SuppressWarnings("unchecked")
    public Hash(int size) {
        this.data[size] = (T) new Object();
    }

    public void inserir(T chave) {
        
    }
}
