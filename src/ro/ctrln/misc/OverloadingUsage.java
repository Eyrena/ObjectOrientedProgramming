package ro.ctrln.misc;

import ro.ctrln.inheritance.FalconHeavy;
import ro.ctrln.util.ProjectUtils;

public class OverloadingUsage {
    public static void main(String[] args) {

        FalconHeavy falconHeavy = new FalconHeavy();

        falconHeavy.escapeProcedure(10);
        ProjectUtils.printMessage("=======================================");
        falconHeavy.escapeProcedure(3, true);
        ProjectUtils.printMessage("=======================================");
        falconHeavy.escapeProcedure();
        ProjectUtils.printMessage("=======================================");
        falconHeavy.escapeProcedure(false, true, false, true, true);
        ProjectUtils.printMessage("=======================================");
        ProjectUtils.printMessage(falconHeavy.escapeProcedure(false));

    }
}
