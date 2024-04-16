public class Calculator2 extends Calculator {
    public Calculator2(float value) {
        super(value);
    }

    public void sqrt(float other) {
        this.value = (float) Math.sqrt(value);
    }

    public void main(String[] args) {
        Calculator2 c = new Calculator2(7);
        c.add(9);
        c.divide(2);
        c.substract(2);
        c.sqrt(9);
        System.out.println(c.getResult());
    }
}
