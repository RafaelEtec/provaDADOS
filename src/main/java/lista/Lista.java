package lista;
/*
 *  Professor Gerson Risso
 */
public class Lista {
    private Elemento inicio, atual, aux;
    private int v=1;
    
    public void inserir(Object objeto){
      Contato c=(Contato)objeto;//Cast
      c.setId(v++);
      if(inicio==null){
        inicio=new Elemento(objeto,null);
        aux=inicio;
      }else{
         atual=new Elemento(objeto, null);
         aux.setProx(atual);
         aux=atual;
      }
    }
    
    public void mostrar(){
      Elemento e=inicio;
      while(e!=null){
          System.out.println(e.getObjeto());
          e=e.getProx();
      }
    }
    
    public Object[] buscar(int id){
      Object[] v=new Object[3];
      Elemento e=inicio;
      Contato c;
      while(e!=null){
          c=(Contato)e.getObjeto();
          if(id==c.getId()){
            v[0]=e;
            v[2]=c;
            return v;
          }
          e=e.getProx();
      }
      return null;
    }
    
    public void remover(int id){
      Object[] v=buscar(id);
      if(v!=null){
         Elemento e=(Elemento)v[0];
         if(e==inicio){//Caso 1 - Remoção do primeiro elemento
           inicio=e.getProx();
           e.setProx(null);
         }
      }else{
          System.out.println("Não removido!");
      }
    }
    
    // Questão a)
    public void elementosNaLista() {
        Elemento e=inicio;
        int conta = 0;
        while(e!=null){
            conta++;
        }
        System.out.println("Quantidade de Elementos presentes: " + conta);
    }
}