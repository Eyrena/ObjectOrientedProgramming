package ro.ctrln.abstraction;

import ro.ctrln.util.ProjectUtils;

// interfetele sunt tot clase abstracte cu un numar limitat de capabilitati
public abstract class Trooper {
    private int numberOfCapabilities;

    public int getNumberOfCapabilities(){
        return this.numberOfCapabilities;
    }

    public void setNumberOfCapabilities(int numberOfCapabilities){
        this.numberOfCapabilities = numberOfCapabilities;
    }

    public void fight(String enemy){
        ProjectUtils.printMessage("Fighting the enemy " + enemy);
    }

    public abstract String warCry();

}
