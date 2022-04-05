package HW1.courses;

public class Distance implements Course {
    private double length;
    private String type = "run";

    public Distance(double length){
        this.length = length;
    }

    @Override
    public String getType(){
        return type;
    }

    @Override
    public double getSize() {
        return length;
    }

    @Override
    public void setSize(double length) {
        this.length = length;
    }

    @Override
    public String getInfo(){
        return ("need to " + type + " " + String.format("%.2f", length) + "m");
    }
}

