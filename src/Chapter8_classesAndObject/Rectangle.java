package Chapter8_classesAndObject;

public class Rectangle {
    private float length = 1;
    private float width = 1;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        if ( length < 0.0) throw new IllegalArgumentException( "the input is most not be lower than 0.0");
        if ( length > 20.0) throw new IllegalArgumentException( "the input most not be higher than 20.0");
        if ( length >= 0.0 && length <= 20.0) {
            this.length = length;
        }
    }

    public float getWidth() {
        return this.width;
    }

    public void setWidth(float width) {
        if ( width < 0.0 || width > 20.0)  throw new IllegalArgumentException( "invalid input");
        if ( width >= 0.0 && width <= 20.0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException( "invalid input");
        }
    }



    public float perimeter(float length, float width){
       float perimeter = 2 * (this.getWidth() + this.getLength());
        return perimeter;
    }
   public float area(float length, float width){
        float area= this.getLength() * this.getWidth();
      return area;
    }

}
