package com.expertzlab.javatraining.lambda;

/**
 * Created by gireeshbabu on 25/11/16.
 */
public class FunctionalInterfaces {

    public static void main(String[] args) {

        FunctionalInterfaces fi = new FunctionalInterfaces();

        /*
        fi.doSomework(new Workable() {
            @Override
            public void doWork() {
                System.out.println("This is a Lambda");
            }
        });
        */

        fi.doSomework(()-> System.out.println("Easy Lambda"));

    }

    public void doSomework(Workable workable){
        workable.doWork();
    }
}

