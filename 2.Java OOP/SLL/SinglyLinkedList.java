public class SinglyLinkedList{ 
    private Node head; 

    public SinglyLinkedList(){
        this.head = null;
    }

    public Node add(int value){
        if(this.head == null){
            this.head = new Node(value); 
            return this.head;
        }
        Node runner = this.head; 

        while(runner.next != null){
            runner = runner.next;
        }

        runner.next = new Node(value); 
        return this.head;
    }

    public Node remove(){
        Node runner = this.head;
        
        while(runner.next.next != null){
            runner = runner.next; 
        }

        runner.next = null; 

        return this.head;
    }

    public Node removeAt(int index){
        Node runner = this.head;
        Node temp = null;
        int counter = 0; 

        while(runner.next != null){
            if (counter == index){
                temp.next = temp.next.next;
                break; 
            }
            
            temp = runner; 
            runner = runner.next; 
            counter++;
        }
        return this.head;
    }

        
    public void printValues(){
        Node runner = this.head; 

        while(runner != null){
            System.out.println(runner.value);

            runner = runner.next; 
        }
    }
}