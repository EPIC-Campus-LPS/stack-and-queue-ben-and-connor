
import java.util.NoSuchElementException;

public class Queue {
    private int[] queue;
    private int size = 0;

    /**
     * Adds element tp queue
     * @param element the element you want to be added
     * @return the elements that was added
     */
    public int add(int element) {
        if (this.size == 0) {
            this.queue = new int[this.size + 1];
            this.queue[0] = element;
            ++this.size;
        } else {
            int[] q = new int[this.queue.length + 1];
            System.arraycopy(this.queue, 0, q, 0, this.queue.length);
            q[this.size] = element;
            ++this.size;
            this.queue = q;
        }

        return element;
    }

    /**
     * removes an element from the queue
     * @return the element that was removed
     */
    public int remove() {
        if (this.queue.length == 0) {
            throw new NoSuchElementException("Queue is empty");
        } else {
            int removed = this.queue[0];
            int[] q = new int[this.queue.length - 1];
            System.arraycopy(this.queue, 1, q, 0, this.queue.length - 1);
            --this.size;
            this.queue = q;
            return removed;
        }
    }

    /**
     * shows the element at the head of the queue
     * @return the element at the head of the queue
     */
    public int peek() {
        if (this.queue.length == 0) {
            throw new NoSuchElementException("Queue is empty");
        } else {
            return this.queue[0];
        }
    }

    /**
     * gives the size of the queue
     * @return the size of the queue
     */
    public int size() {
        return this.queue.length;
    }

    /**
     * checks if the queue is empty
     * @return true if the queue is empty
     */
    public boolean isEmpty() {
        return this.queue.length == 0;
    }
}

