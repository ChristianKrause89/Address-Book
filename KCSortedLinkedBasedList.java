
// COSC 2320 Spring 2015
// Name: Christian Krause
// Programming Assignment 1
// This is my own work; I will not post
package programmingassignment1;

public class KCSortedLinkedBasedList implements KCListADTInterface {

    public class Node {

        Object data;
        Node next;

        Node(Object newData) {
            data = newData;
        }
        public Object getData()
        {
            return data;
        }
        public Node getAddress()
        {
            return next;
        }
    }
    // end Node class

    Node headNode = null;
    int length = 0;

    public boolean KCadd(int newPosition, Object newEntry) {
        boolean isSuccessful = true;
        if ((newPosition >=1)&&(newPosition <= length + 1)) {
            Node newNode = new Node(newEntry);
            if(KCisEmpty()||(newPosition == 1)){
                newNode.next = headNode;
                headNode = newNode;
            }else{
                Node nodeBefore = KCgetNodeAt(newPosition -1);
                Node nodeAfter = nodeBefore.next;
                newNode.next = nodeAfter;
                nodeBefore.next = newNode;

            }
            length++;
        }else
            isSuccessful = false;

        return isSuccessful;
    }

    private Node KCgetNodeAt(int givenPosition) {
        Node currentNode = headNode;
        for (int counter = 1; counter < givenPosition; counter++) {
            currentNode = currentNode.next;
        }

        return currentNode;
    }

    public final void clear() {
        headNode = null;
        length = 0;
    }

    public int KCgetLength() {
        return length;
    }

    public boolean KCisEmpty() {
        boolean result;

        if(length == 0){
            result = true;
        }else{
            result = false;
        }
        return result;
    }

    public Object KCremove(int givenPosition) {
        Object result = null;
        if ((givenPosition >= 1) && (givenPosition <= length)) {
            if (givenPosition == 0) {
                result = headNode.data;
                headNode = headNode.next;
            } else {
                Node nodeBefore = KCgetNodeAt(givenPosition - 1);
                Node nodeToRemove = nodeBefore.next;
                Node nodeAfter = nodeToRemove.next;
                nodeBefore.next = nodeAfter;
                result = nodeToRemove.data;
            }
            length--;
        }
        return result;
    }

    public Object KCgetEntry(int givenPosition) {
        Object result = null;
        result = KCgetNodeAt(givenPosition).data;

        return result;
    }

}
