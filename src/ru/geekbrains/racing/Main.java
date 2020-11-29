package ru.geekbrains.racing;

import ru.geekbrains.racing.obstacles.*;
import ru.geekbrains.racing.participants.*;

public class Main {
    public static void main(String[] args) {
        Team team = new Team();
        Course course = new Course(team);
    }
}
