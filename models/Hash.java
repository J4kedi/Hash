package models;

public class Hash {
    private int[] data;

    public Hash(int size) {
        this.data = new int[size];
    }

    public void inserir(int chave) {
        data[buscar(chave)] = chave;
    }

    public int buscar(int chave) {
        if (!(data[chave % data.length] > -1))
            throw new IllegalArgumentException("Valor não encontrado!");
        return chave;
    }

    public int remover(int chave) {
        data[buscar(chave)] = 0;
        return chave;
    }
}
