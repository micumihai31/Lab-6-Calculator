public class Calculator {
    protected float value;

    public Calculator(float value) {
        this.value = 0;
    }

    public void add(float other) {
        this.value += other;
    }

    public void divide(float other) {
        this.value /= other;
    }

    public void substract(float other) {
        this.value -= other;
    }

    public float getResult() {
        return value;
    }
}
