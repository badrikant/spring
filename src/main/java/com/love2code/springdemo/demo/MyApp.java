package com.love2code.springdemo.demo;

public class MyApp {

    public static void main(String[] args) {

        Coach theCoach = new TrackCoach();
        System.out.println(theCoach.getDailyWorkout());
    }
}
