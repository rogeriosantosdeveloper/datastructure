public class DinamycStack {
    No top;
    int size;

    DinamycStack (){
        size = 0;
        top = null;
    }
    
    boolean empty(){
        return top == null;
    }

    void insert(String info){
        No no = new No();
        no.info = info;
        no.next = top;
        top = no;
        size++;
    }

    String remove(){
        if(empty()){
            return null;
        }

        String info = top.info;
        top = top.next;

        return info;
    }

}
