package HW1.courses;

public class Height implements Course {
    private double height;
    private String type = "jump";

    public Height(double length){
        this.height = length;
    }

    @Override
    public String getType(){
        return type;
    }

    @Override
    public double getSize() {
        return height;
    }

    @Override
    public void setSize(double height) {
        this.height = height;
    }

    @Override
    public String getInfo(){
        return ("need to " + type + " " + String.format("%.2f", height) + "m");
    }
}

