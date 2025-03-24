public class Counter {
    // Attribute:
    private int count;

    // Constructor:
    public Counter() {
        count = 0;
    }
    
    // Behaviour:
    public void click() {
        count++;
    }
    public int getCount() {
        return count;
    }
    public void reset() {
        count = 0;
    }
}
