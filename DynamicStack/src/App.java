public class App {
    public static void main(String[] args){
        DinamycStack ds = new DinamycStack();
        ds.insert("a"); 
        ds.insert("b");
        ds.insert("c");
        System.out.println("Remover: "+ds.remove());
        ds.insert("d");
        
        String aux;

        while ((aux = ds.remove()) != null) {
            System.out.println("Remover: "+aux);
        }
    }
}
