package ro.ctrln.incapsulation;

import ro.ctrln.inheritance.FalconHeavy;

public class IncapsulationTrials {
    /*
    1. metodele publice dintr-o superclasa(parinte) trebuiesc declarate publice si in copii
    2. metodele protected intr-o superclasa pot fi declarate fie public fie protected in copii
    3. proprietatie declarate public sau protected in superclasa sunt mostenite in copii
    4. metodele si proprietatile private nu sunt mostenite deloc
    5. clasele declarate finale nu pot fi mostenite
    6. clasele pot fi declarate privat atunci cand sunt interioare


     */
    public static void main(String[] args) {

        FalconHeavy falconHeavy = new FalconHeavy();
        falconHeavy.setBattleshipName("FalconHeavy Incapsulation");
        falconHeavy.escapeProcedure(3);

    }
}
