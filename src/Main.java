
public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.remove();
        System.out.println(q.remove());
        q.add(10);
        System.out.println(q.peek());
        q.add(13);
        q.add(14);
        System.out.println(q.peek());
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        q.remove();
        q.remove();
        q.remove();
        System.out.println(q.isEmpty());
        System.out.println(q.size());
        q.remove();
    }
}
