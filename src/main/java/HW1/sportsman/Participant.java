package HW1.sportsman;


import HW1.courses.Course;
import HW1.courses.ObstacleCourse;

public class Participant extends Sportsman {
    private String name;
    private double runSpeed;
    private double jumpHeight;

    public Participant(String name, double speed, double height){
        this.name = name;
        this.runSpeed = speed;
        this.jumpHeight = height;
    }

    public String getName() {
        return name;
    }

    public double getRunSpeed() {
        return runSpeed;
    }

    public double getJumpHeight() {
        return jumpHeight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRunSpeed(double runSpeed) {
        this.runSpeed = runSpeed;
    }

    public void setJumpHeight(double jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public double runDistance(double distance){
        return distance/runSpeed;
    }

    public boolean jumpOver ( double height ){
        return jumpHeight > height;
    }

    @Override
    public String toString(){
        return (name + ", runs with speed " + String.format("%.2f", runSpeed) + "m, jumps on height " + String.format("%.2f",jumpHeight) + "m,");
    }

    public boolean canJumpAllObstacles(ObstacleCourse c){
        for(int i = 0; i < c.getCount(); i ++ ){
            Course obstacle = c.getObstacle(i);
            switch (obstacle.getType()){
                case "run": continue;
                case "jump": {
                    if(!this.jumpOver(obstacle.getSize())) return false;
                }
            }
        }
        return true;
    }

    public double totalRunTime(ObstacleCourse c){
        double totalTime = 0;
        for(int i = 0; i < c.getCount(); i ++ ){
            Course obstacle = c.getObstacle(i);
            switch (obstacle.getType()){
                case "run": {
                    totalTime = totalTime + this.runDistance(obstacle.getSize());
                }
                case "jump": continue;
            }
        }
        return totalTime;
    }
}
