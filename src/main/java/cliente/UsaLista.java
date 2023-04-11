package cliente;
/*
*  Professor Gerson Risso
*/
import lista.*;
public class UsaLista {
 
    public static void main(String[] args) {
       Lista lista=new Lista();
       lista.inserir(new Contato("Gerson", "233-2332"));
       lista.inserir(new Contato("Sandra", "546-7473"));
       lista.inserir(new Contato("Anna", "854-6432")); 
       
       lista.elementosNaLista();
    }
}