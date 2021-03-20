package ro.ctrln.inheritance;

import ro.ctrln.util.ProjectUtils;

public class FalconHeavy extends Battleship implements Starship, Rocket {

    private String destination;

    @Override
    public void warp() {
        ProjectUtils.printMessage("FalconHeavy doesn't warp! She goes to the moon!");
    }

    @Override
    public void setStarshipDestination(String destination) {
        this.destination = getBattleshipName() + " goes to " + destination;
    }

    @Override
    public double computeWarpSpeed(int warpFactor, int lightYearsToDestination) {
        return 0;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "FalconHeavy{" +
                "destination='" + destination + '\'' +
                ", battleshipName = " + getBattleshipName() +
                ", battleshipCapacity = " + getBattleshipCapacity() +
                '}';
    }

    @Override
    public void launchCountdown() {
        for(int i=10; i>=0;i--){
            ProjectUtils.printMessage("Launch sequence: " + i);
        }
    }

    // aceasta metoda este mostenita din clasa parinte Battleship si este suprascrisa
    @Override
    public void escapeProcedure(int escapePods){
        super.escapeProcedure(3);
        ProjectUtils.printMessage("Escape procedure initiated in FalconHeavy class with " + escapePods + " escape pods!" );
        ProjectUtils.printMessage("We are in falconHeavy now! Battleship name is " + this.battleshipName);
    }

    public String escapeProcedure(boolean activated){
        return activated ? "Escape procedure initiated!":"Escape procedure abort!";
    }

    public void escapeProcedure(int escapePods,boolean activated){
        ProjectUtils.printMessage(escapeProcedure(activated));
        if (activated){
            escapeProcedure(escapePods);
        }
    }
    // varargs - transmitem un numar variabil de parametrii
    public void escapeProcedure (boolean ... activated) {
        for (boolean active : activated){
            ProjectUtils.printMessage("Activation sequence: " + active);
        }
    }

    public void escapeProcedure(){
        ProjectUtils.printMessage("Waiting for the escape procedure!");
    }
}
