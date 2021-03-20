package ro.ctrln.util;

import ro.ctrln.polymorphism.StarPort;

public class ProjectUtils {
    public static void printMessage (String message){
        System.out.println(message);
    }

    public static void printMessage (int message){
        System.out.println(message);
    }

    public static void printMessage(Object message) {
        System.out.println(message.toString());
    }
}
