package Chapter7.turtle;

public class Pen {
    private PenPosition penPosition;

    public Pen(){
        this.penPosition = PenPosition.UP;
    }

    public PenPosition getPenPosition() {
        return penPosition;
    }

    public void penUp() {
        penPosition = PenPosition.UP;
    }

    public void penDown() {
        penPosition = PenPosition.DOWN;
    }
}
