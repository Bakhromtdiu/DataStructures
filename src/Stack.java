import java.util.Arrays;

public class Stack {

    private int items[];
    private int count;

    public Stack(int size) {
        this.items = new int[size];
    }

    public void push(int item) {
        if (items.length == count)
            throw new StackOverflowError();

        items[count++] = item;
    }

    public int peek() {
        if (count == 0)
            throw new IllegalStateException();
        return items[count - 1];
    }


    public int pop() {

        if (count == 0) {
            throw new IllegalStateException();
        }
        return items[--count];

    }

    public String toString() {
        var content = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(content);
    }
    public void print() {
        for (int i = 0; i < count; i++) {
            if (i == 0)
                System.out.print("[");

            System.out.print(this.items[i]+",");

            if (i ==count-1)
                System.out.println("]");
        }
    }

}
