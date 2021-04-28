package aps_estuturas;

public class TadFila{

    //Atributo
    private int [] dados;
    private int tamVetor;
    private int posFinal;

    //Construtor
    public TadFila(int tamanhoMax){
        this.dados = new int[tamanhoMax];
        this.tamVetor = tamanhoMax;
        this.posFinal = -1;
    }    

    //Metodo
    public void destroyFila(){
        this.dados = null;
        System.gc();
    }

    public boolean isFull(){
        if(this.posFinal == this.tamVetor -1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isEmpty(){
        if(this.posFinal == -1){
            return true;
        }else{
            return false;
        }
    }

    public void Enqueue(int valor){
        if(isFull()){
            System.out.println("Não inseriu.");
        }else{
            this.dados[this.posFinal + 1] = valor;
            this.posFinal++;
        }
    }

    public int Dequeue(){
        if(isEmpty()){
            System.out.println("Não Existe mais a fila Preferencial..");
            return 0;
        }else{
            int elemento = this.dados[0];
            for(int i = 0; i < this.posFinal; i++){
                this.dados[i] = this.dados[i+1];
            }
            this.posFinal--;
            return elemento;
        }
    }

    public void imprimeFila(){
        if(isEmpty()){
            System.out.println("Vazia!");
        }else{
            for(int i = 0; i <= this.posFinal; i++){
                System.out.println("Cliente: [ " + i + " ] = " + "Senha: " + this.dados[i]);
            }
        }
    }
}