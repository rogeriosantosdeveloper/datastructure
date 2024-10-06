import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StaticStack stack = new StaticStack(5);
        
        System.out.println("Pilha criada! " + stack.size());

        String enter = "";

        while(enter.compareTo("sair") != 0){
            System.out.println("Entrada de dados: ");
            enter = sc.nextLine();

            if(stack.full()){
                System.out.println("erro, pilha cheia, realocando");
                stack.IncreaseSize(3);
            }
            if(enter.compareTo("sair") != 0){
                stack.insert(enter);
            }
            
        }

        String out;

        while ((out = stack.remove()) != null) {
            System.out.println("Info: " + out);
        }

        sc.close();
    }
}
