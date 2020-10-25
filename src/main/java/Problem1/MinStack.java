package Problem1;

public class MinStack extends ArrayStack<Integer> {
    // okay to add member variables
    // can only use Stack interface and ArrayStack from this folder
    // do not use Java Stack
    private ArrayStack<Integer> minis;

    public MinStack(int size) {
        // homework
        super(size); // place holder
        minis = new ArrayStack<Integer>(size);
    }

    @Override
    public boolean push(Integer val) {
        // homework
        super.push(val);
        if (minis.peek() == null || val < minis.peek()) {
            minis.push(val);
        }
        return true; // place holder
    }

    @Override
    public Integer pop() {
        // homework
        if (!(minis.peek() == null) && super.peek() == minis.peek()) {
            minis.pop();
        }
        return super.pop();
    }

    public Integer getMin() {
        // homework
        // loop of any kind is not allowed
        return minis.peek(); // place holder
    }
}

