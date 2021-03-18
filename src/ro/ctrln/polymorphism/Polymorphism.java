package ro.ctrln.polymorphism;

import ro.ctrln.inheritance.*;

public class Polymorphism {

    public static void main(String[] args) {
        Battleship battleship = new Battleship();
        ImperialStarDestroyer imperialStarDestroyer = new ImperialStarDestroyer();
        TieFighter tieFighter = new TieFighter();
        XWingStarFighter xWingStarFighter = new XWingStarFighter();
        FalconHeavy falconHeavy = new FalconHeavy();

        System.out.println("battleship instanceOf Battleship: " + (battleship instanceof Battleship));
        System.out.println("battleship instanceof Object: " + (battleship instanceof Object));
        System.out.println("battleship instanceof ImperialStarDestroyer: " + (battleship instanceof ImperialStarDestroyer));
        System.out.println("battleship instanceof FalconHeavy: " + (battleship instanceof FalconHeavy));

        System.out.println("imperialStarDestroyer instanceof Object: " + (imperialStarDestroyer instanceof Object));
        System.out.println("imperialStarDestroyer instanceof ImperialStarDestroyer: " + (imperialStarDestroyer instanceof ImperialStarDestroyer));
        System.out.println("imperialStarDestroyer instanceof Battleship: " + (imperialStarDestroyer instanceof Battleship));
        //System.out.println("imperialStarDestroyer instanceof TieFighter: " + (imperialStarDestroyer instanceof TieFighter));

        System.out.println("tieFighter instanceof Object: " + (tieFighter instanceof Object));
        System.out.println("tieFighter instanceof TieFighter: " + (tieFighter instanceof TieFighter));
        System.out.println("tieFighter instanceof Starship: " + (tieFighter instanceof Starship));
        //System.out.println("tieFighter instanceof ImperialStarDestroyer: " + (tieFighter instanceof ImperialStarDestroyer));

        System.out.println("xWingStarFighter instanceof Object: " + (xWingStarFighter instanceof Object));
        System.out.println("xWingStarFighter instanceof XWingStarFighter: " + (xWingStarFighter instanceof XWingStarFighter));
        System.out.println("xWingStarFighter instanceof Starship: " + (xWingStarFighter instanceof Starship));
        System.out.println("xWingStarFighter instanceof Rocket: " + (xWingStarFighter instanceof Rocket));

        System.out.println("falconHeavy instanceof Object: " + (falconHeavy instanceof Object));
        System.out.println("falconHeavy instanceof FalconHeavy: " + (falconHeavy instanceof FalconHeavy));
        System.out.println("falconHeavy instanceof Battleship: " + (falconHeavy instanceof Battleship));
        System.out.println("falconHeavy instanceof Starship: " + (falconHeavy instanceof Starship));
        System.out.println("falconHeavy instanceof Rocket: " + (falconHeavy instanceof Rocket));

        //System.out.println("falconHeavy instanceof TieFighter: " + (falconHeavy instanceof TieFighter));








    }
}
