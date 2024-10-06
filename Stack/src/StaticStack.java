public class StaticStack {
    String vet[];
    int top;

    StaticStack(int size){
        vet = new String[size];
        top = 0;
    }

    void IncreaseSize(int size){
        String vet2[] = new String[vet.length + size];

        for(int i = 0; i <  vet.length; i++){
            vet2[i] = vet[i];
        }
        vet = vet2;
    }

    int size(){
        return top;
    }

    boolean full(){
        return vet.length == top;
    }

    boolean empty(){
        return top == 0;
    }

    boolean insert(String value){
        if(full()){
            return false;
        }

        vet[top] = value;
        top++;
        return true;
    }

    String remove(){
        if(empty()){
            return null;
        }

        top--;
        return vet[top];
    }
}
