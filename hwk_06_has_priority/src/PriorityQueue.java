/*
 * CS2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Student Name:
 * Description: Homework 06 - PriorityQueue
 */

public class PriorityQueue<E extends HasPriority> extends LinkedList<E> {

    // TODOd: finish the implementation of the method
    public void push(E value) {

        // create a new Node with customer
        Node node = new Node(value);

        // add the new Node as the front Node if queue is empty
        if(head == null) {
            head = node;
        } else {
            // if the queue is not empty

            // if customer has a higher priority than the front customer, add the new Node as the front Node
            if(value.getPriority() > head.getValue().getPriority()) {
                node.setNext(head);
                head = node;
            } else {
                // if that is not the case, use the previous/current strategy (see Polynomial's addTerm) to add the new Node in the
                // correct location of the queue
                Node current = head;
                Node previous = head;
                while (current != null) {
                    if(node.getValue().getPriority() > current.getValue().getPriority() ) {
                        previous.setNext(node);
                        node.setNext(current);
                        break;
                    }
                    previous = current;
                    current = current.getNext();
                }

                // if you haven't returned at this point, add the new Node at the rear of the queue
                if(current == null) {
                    previous.setNext(node);
                }
            }
        }

    }

    public E pop() throws Exception {
        if (isEmpty())
            throw new Exception("Queue is empty!");
        Node<E> toBeReturned = head;
        head = head.getNext();
        toBeReturned.setNext(null);
        return toBeReturned.getValue();
    }

    public E peek() throws Exception {
        if (isEmpty())
            throw new Exception("Queue is empty!");
        return head.getValue();
    }
}