package ru.geekbrains.racing.obstacles;

import ru.geekbrains.racing.participants.Participan;
import ru.geekbrains.racing.participants.Team;

public class Course {
    Obstacle[] obstacles = {new Cross(100), new Wall(10), new Water(15)};
    Team team = new Team();

    public Course(Team team) {
        this.team = team;
        team.showStartInfo();
        racing();
        team.showFinishInfo();
    }
    public void racing() {
        System.out.println("====================\n" +
                "Понеслась!!!\n" +
                "====================");
        for (Participan i : team.getInfo()) {
            for (Obstacle k : obstacles) {
                k.doIt(i);
                if (!i.isOnDistance()) {
                    break;
                }
            }
        }
        System.out.println("");
    }
}
