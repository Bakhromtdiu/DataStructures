import org.w3c.dom.Node;

import java.util.NoSuchElementException;

public class LinkedList<t> {
    public class Node {
        private t value;
        private Node next;

        private Node(t value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void print() {
        var node = first;
        while (node != null) {

            System.out.print(node.value + " ");
            node = node.next;

        }
        System.out.println("");


    }

    private boolean isEmpty() {
        return first == null;
    }

    public void addFirst(t item) {

        var node = new Node(item);
        if (isEmpty()) {
            first = last = node;

        } else {
            node.next = first;
            first = node;

        }
        size++;
    }

    public void addLast(t item) {
        var node = new Node(item);
        if (isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public int indexOf(t item) {
        var node = first;
        while (node != null) {
            if (node.value.equals(item)) {
                return size;
            }
            node = node.next;
        }
        return -1;
    }

    public boolean contains(t item) {
        return indexOf(item) != -1;
    }

    public void removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (first == last) {
            first = last = null;
        } else {
            var second = first.next;
            first.next = null;
            first = second;

        }
        size--;
    }
    private Node getPrevious(Node node){
      var temp = first ;
      while (temp.next != null){

         if (temp.next == node){
             return temp ;
         }
         temp = temp.next ;
      }
      return null ;
    }
    public void removeLast(){
        if (isEmpty())
            throw new NoSuchElementException() ;
        if (first==last){
            first = last = null ;
        }
        else {
            var previous = getPrevious(last) ;
            last = previous ;
            last.next = null ;

        }



    }




}
