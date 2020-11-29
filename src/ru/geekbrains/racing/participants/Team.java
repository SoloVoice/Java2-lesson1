package ru.geekbrains.racing.participants;

public class Team {
    private String teamName = "МЫ ПРОТИВ ЗДРАВОГО СМЫСЛА";
    Participan[] participants = {
            new Cat("Barsik", Color.RED),
            new Dog("Bobik", Color.BLACK),
            new Duck("Scrooge", Color.WHITE),
            new Robot("Roy Batty", Color.WHITE)
    };

//    public Team() {
//        showStartInfo();
//        showFinishInfo();
//    }

    public void showStartInfo() {
        System.out.println("====================\n" +
                "На СТАРТ выходит команда: " + teamName + "\n" +
                "====================");
        for (Participan i : participants) {
            System.out.println(i.getColor() + " " + i.getType() + " " + i.getName());
        }
        System.out.println("");
    }

    public void showFinishInfo() {
        System.out.println("====================\n" +
                "Результаты гонки:\n" +
                "====================");
        for (Participan i : participants) {
            i.info();
        }
        System.out.println("");
    }

    public Participan[] getInfo() {
        return participants;
    }
}
