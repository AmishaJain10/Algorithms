//package LinkedList;
//
//public class LinkedList {
//
//    private class Node {    //Node class o create Node object
//        int data;
//        Node next;
//
//        Node(int data) {
//
//            this.data = data;
//            next = null;
//        }
//    }
//
//    private Node head;
//    private int size;
//
//    LinkedList() {
//        size = 0;
//        head = null;
//    }
//
//
//    // Create a new node and append to end of existing Linked List
//    public void add(int data) {
//        Node newNode = new Node(data);
//        if (head == null) {
//            head = newNode;
//        } else {
//            Node nextNode = head;
//            while (nextNode.next != null) {
//                nextNode = nextNode.next;
//            }
//            nextNode.next = newNode;
//        }
//        ++size; // size of linked list
//    }
//
//    //Prints node data (Integer here) of Linked List
//    public String toString() {
//        if (head == null) {
//            return "null";
//        }
//        Node nextPointer = head;
//        StringBuilder sb = new StringBuilder("[");
//        while (nextPointer != null) {
//            sb.append(nextPointer.data);
//            sb.append(",");
//            nextPointer = nextPointer.next;
//        }
//        sb.append("]");
//        return sb.toString();
//    }
//
//
//    // returns size of Linked List
//    public int size(){
//       return size;
//    }
//
//    //Rturn true if data matches with Linked List nodes
//    boolean contains(int data) {
//        Node node=head;
//        while(node!=null){
//            if(node.data==data){
//                return true;
//            }
//            node=node.next;
//        }
//        return false;
//    }
//
//    //delete node from LL when data of Node matches with given node
//    boolean delete(int data){
//        Node pointerNode=head;
//        while(pointerNode.next.data==data&&pointerNode.next!=null){
//            pointerNode.next=pointerNode.next.next;
//            System.out.println("Node delete with data "+data);
//            return true;
//        }
//        System.out.println("Node  with data "+data+" is not found in Linked List");
//        return false;
//    }
//
//   Node sort(Node node) {
//
//   }
//
//
//
//
//
//
//
//}
//
//
//
//
//
//
//
//
