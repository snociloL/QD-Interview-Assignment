interface IQueueable {
    void enqueue(String element);
    String dequeue();
    void getQueue();
    int size();
}

class FIFOQUEUE implements IQueueable{
    int size = 5;
    String nodes[] = new String[size];
    int front, rear;

    public FIFOQUEUE() {
        front = -1;
        rear = -1;
    }

    public boolean isEmpty() {
        if(front == -1)
            return true;
        else return false;
    }

    public void enqueue(String element) {
        if(isEmpty()){
            if(front == -1)
                front=0;

            rear ++;
            nodes[rear] = element;
        }
        else 
        rear ++;
        nodes[rear] = element;
    }

    public String dequeue() {
        String temp;
        if(isEmpty())
            return "";
        else {
            temp = nodes[front];
            if(front >= rear){
                front = -1;
                rear = -1;
            }
            else 
                front++;
        }
        return temp;
    }

    public void getQueue() {
        for(int i = 0; i< nodes.length; i++){
            System.out.println(nodes[i]);
        }
    }

    public int size(){
        return rear;
    }
}

class LIFOQUEUE implements IQueueable{
    int size = 5;
    String nodes[] = new String[size];
    int top, bot;

    public LIFOQUEUE() {
        top = -1;
        bot = -1;
    }

    public boolean isEmpty() {
        if(bot == -1)
            return true;
        else 
            return false;
    }

    public void enqueue(String element) {
        if(isEmpty()){
            if(bot == -1)
                bot++;

            top++;
            nodes[top] = element;
        }
        else 
            top++;
            nodes[top] = element;
    }

    public String dequeue() {
        String temp;
        if(isEmpty())
            return "done";
        else {
            temp = nodes[top];
            top--;
        }
        return temp;
    }

    public void getQueue() {
        for(int i = 0; i < top+1; i++){
            System.out.println(nodes[top-i]);
        }
    }

    public int size(){
        return bot;
    }
}