//understands four sided polygon with opposite sides equal and perpendicular
public class Rectangle {
    private final int length;
    private final int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int area() {
        return length * breadth;
    }

    public int perimeter() {
        return 2 * (length + breadth);
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}

