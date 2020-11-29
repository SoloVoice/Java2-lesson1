package ru.geekbrains.racing.participants;

public interface Participan {
    void run(int distance);
    void jump(int height);
    void info();
    void setOnDistance(boolean onDistance);
    boolean isOnDistance();
    String getType();
    String getName();
    Color getColor();
}
