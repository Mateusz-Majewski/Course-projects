package majewski.mateusz;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer bob = new BaseballPlayer("Bob");
        SoccerPlayer mark = new SoccerPlayer("Mark");


        Team<FootballPlayer> redDragons = new Team<>("Red Dragons");
        redDragons.addPlayer(joe);

        Team<BaseballPlayer> redChickens = new Team<>("Red Chickens");
        redChickens.addPlayer(bob);

        Team<SoccerPlayer> redBirds = new Team<>("Red Birds");
        redBirds.addPlayer(mark);


        FootballPlayer tim = new FootballPlayer("Tim");
        BaseballPlayer john = new BaseballPlayer("John");
        SoccerPlayer matt = new SoccerPlayer("Matt");

        Team<FootballPlayer> blueDragons = new Team<>("Blue Dragons");
        blueDragons.addPlayer(tim);

        Team<BaseballPlayer> blueChickens = new Team<>("Blue Chickens");
        blueChickens.addPlayer(john);

        Team<SoccerPlayer> blueBirds = new Team<>("Blue Birds");
        blueBirds.addPlayer(matt);


        redDragons.matchResult(blueDragons, 3, 2);
        System.out.println(redDragons.ranking());
    }
}
