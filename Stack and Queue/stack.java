public class stack {
    private int[] arr;
    private int idx;
    public stack() {
        this(5);
    }
    public stack(int n) {
        arr = new int[n];
    }
    public boolean isEmpty() {
        return idx == -1;
    }
    public boolean isfull() {
        return size()==arr.length;

    }

    public int pop() {
        return arr[idx--];
    }

    public int peek() {
        return arr[idx];
    }

    public int size() {
        return idx + 1;
    }
}