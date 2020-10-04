
package app;

/**
 *
 * @author anock
 */
public class Senha {
    
    String tipo;
    int numero;

    public Senha(String tipo, int numero) {
        this.tipo = tipo;
        this.numero = numero;
    }
    
    

    public Senha() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
       
}
