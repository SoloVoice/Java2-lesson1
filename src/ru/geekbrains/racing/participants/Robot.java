package ru.geekbrains.racing.participants;

public class Robot implements Participan, Swimable {
    static String type = "Replicant";
    String name;
    Color color;

    private static int maxRunDistance = 5000;
    private static int maxJumpHeight = 100;
    private static int maxSwimDistance = 100;

    boolean onDistance;

    public Robot(String name, Color color) {
        this.name = name;
        this.color = color;
        this.onDistance = true;
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setOnDistance(boolean onDistance) {
        this.onDistance = onDistance;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(color.getEnglishColorName() + " " + type + " " + name + " - Run OK");
        } else {
            System.out.println(color.getEnglishColorName() + " " + type + " " + name + " - Run FAILED");
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(color.getEnglishColorName() + " " + type + " " + name + " - Jump OK");
        } else {
            System.out.println(color.getEnglishColorName() + " " + type + " " + name + " - Jump FAILED");
            onDistance = false;
        }
    }

    @Override
    public void info() {
        System.out.println(color.getEnglishColorName() + " " + type + " " + name + ": " + onDistance);
    }

    @Override
    public void swim(int distance) {
        if (distance <= maxSwimDistance) {
            System.out.println(color.getEnglishColorName() + " " + type + " " + name + " - Swim OK");
        } else {
            System.out.println(color.getEnglishColorName() + " " + type + " " + name + " - Swim FAILED");
            onDistance = false;
        }
    }
}
