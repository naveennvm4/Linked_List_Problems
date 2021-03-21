public class MyLinkList {
    public MyNode tail;
    public MyNode head;

    public MyLinkList() {
        this.head = null;
        this.tail = null;
    }

    public void add(MyNode myNode) {
        if (this.tail == null)
            this.tail = myNode;
        if (this.head == null)
            this.head = myNode;
        else {
            MyNode tempNode = this.head;
            this.head = myNode;
            this.head.setNext(tempNode);
        }
    }
    public void append(MyNode myNode) {
        if (this.head == null)
            this.head = myNode;
        if (this.tail == null)
            this.tail = myNode;
        else {
            this.tail.setNext(myNode);
            this.tail = myNode;
        }
    }
    public void insert(MyNode myNode, MyNode newNode) {
        MyNode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }
    public MyNode pop() {
        MyNode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }
    public MyNode popLast() {
        MyNode tempNode = head;
        while (!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode = tempNode.getNext();
        return tempNode;
    }
    public boolean searchNode(MyNode key) {
        MyNode tempNode = head;
        while(tempNode !=null && tempNode.getNext()!=null) {
            if (tempNode.getKey()==key.getKey()) {
                return true;
            }
            tempNode = tempNode.getNext();
        }
        return false;
    }
    public void deleteNode(MyNode myNode) {
        MyNode tempNode = head;
        MyNode prevNode = null;
        while(tempNode != null && tempNode.getKey() != myNode.getKey()) {
            prevNode = tempNode;
            tempNode = tempNode.getNext();
        }
        prevNode.setNext(tempNode.getNext());
    }

    public void printMyNodes() {
        StringBuffer myNodes = new StringBuffer("My Node: ");
        MyNode tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if (!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }
}
