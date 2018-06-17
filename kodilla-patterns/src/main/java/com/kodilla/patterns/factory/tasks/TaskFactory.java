package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPINGTASK = "ShoppingTask ";
    public static final String PAINTINGTASK = "PaintingTask ";
    public static final String DRIVINGTASK = "DrivingTask ";


    public final Task makeTask(final String TaskClass) {
        switch (TaskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Food List","cheese" , 3.0 );
            case PAINTINGTASK:
                return new PaintingTask("Painting List", "Red" , "Wall");
            case DRIVINGTASK:
                return new DrivingTask("Drift List", "Warsaw", "Ferrari");
            default:
                return null;
        }

    }
}
