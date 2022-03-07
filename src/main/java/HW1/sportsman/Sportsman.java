package HW1.sportsman;

public abstract class Sportsman {
    private String name;
    private double runSpeed;
    private double jumpHeight;

    public abstract double runDistance( double distance);

    public abstract boolean jumpOver ( double height );
}
