public class LinkedList {
    private ListNode head;

    public LinkedList(
            String data
        )
    {
        this.head = new ListNode(data);
    }

    public void addNode(String data) {
        ListNode newNode = new ListNode(data);
        if (this.head.getNext() == null) {
            this.head.setNext(newNode);
        } else {
            ListNode currentNode = this.head.getNext();
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }
    }

//    public ListNode removeNodeAt(int index) {
//        ListNode node = this.head;
//        int currentIndex = 0;
//        while (node.getNext() !=)null
//    }

    @Override
    public String toString() {
        ListNode node = this.head;
        int index = 0;
        StringBuilder result = new StringBuilder();
        result.append(index + " | " + this.head.getData());
        while (node.getNext() != null) {
            node = node.getNext();
            index++;
            result.append("\n" + index + " | " + node.getData());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList("one");
        list.addNode("two");
        list.addNode("three");
        list.addNode("four");
        System.out.println(list.toString());
    }
}
