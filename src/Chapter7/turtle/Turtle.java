package Chapter7.turtle;

public class Turtle {
    private Pen pen;

    public Turtle(){
        this.pen = new Pen();
    }

    public Pen getPen() {
        return pen;
    }

    public PenPosition getPenPosition() {
        return pen.getPenPosition();
    }

    public void setPenUp() {
        pen.penUp();
    }

    public void setPenDown() {
        pen.penDown();
    }
}
