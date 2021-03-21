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
