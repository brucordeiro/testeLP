
package projetinho1;

/**
 *
 * @author Aluno
 */
public class Projetinho1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota","Corolla");
        carro.andar();
    }
    
}

class Carro{ 
    private String marca;
    private String nome;
    public Carro(String marca, String nome){
        this.marca = marca;
        this.nome = nome;
    }
    public void andar(){
        System.out.println("O carro " + marca + " " + nome + " esta andando" );
    }
}