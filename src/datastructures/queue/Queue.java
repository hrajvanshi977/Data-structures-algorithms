package datastructures.queue;

/**
 * Date 12/30/2021
 *
 * @author Himanshu Rajvanshi
 * Queue is the data structure that is similar to the queue in the real world.
 * A queue is a data structure in which whatever comes first will go out first, and it follows the FIFO (First-In-First-Out) policy.
 * an insertion takes place from one end while the deletion occurs from another end.
 * The end at which the insertion takes place is known as the rear end, and the end at which the deletion takes place is known as front end.
 * <p>
 * Here we will be implementing queue using linked list, so prior knowledge of  linked list is required.
 *
 */
public class Queue {
    static Queue first, last;
    Integer size;
    Queue next;
    Integer data;

    public Queue() {
        this.size = 0;
    }

    public Queue(Integer data) {
        this.next = null;
        this.data = data;
    }

    /*
    method to add any specific element into the queue
     */
    public void add(Integer number) {
        if (first == null) {
            first = new Queue(number);
            last = first;
        } else {
            Queue nextNewElement = new Queue(number);
            last.next = nextNewElement;
            last = nextNewElement;
        }
        this.size++;
    }

    public Integer poll() {
        try {
            Integer val = first.data;
            first = first.next;
            this.size--;
            return val;
        } catch (Exception e) {
            System.out.println("Queue is Empty");
        }
        return null;
    }

    public static Integer front() {
        try {
            return first.data;
        } catch (Exception e) {
            System.out.println("Queue is Empty");
        }
        return null;
    }

    public Integer size() {
        return this.size;
    }


    public static void main(String[] args) throws Exception {
        Queue queue = new Queue();

        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        System.out.println(queue.size);
    }
}
