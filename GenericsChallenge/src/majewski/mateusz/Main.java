package majewski.mateusz;

public class Main {

    public static void main(String[] args) {
        BaseballPlayer john = new BaseballPlayer("John");
        BaseballPlayer matt = new BaseballPlayer("Matt");

        BasketballPlayer mark = new BasketballPlayer("John");
        BasketballPlayer tim = new BasketballPlayer("Matt");

        FootballPlayer luke = new FootballPlayer("Luke");
        FootballPlayer sam = new FootballPlayer("Sam");

        Team<BaseballPlayer> snakes = new Team<>("Snakes");
        Team<BaseballPlayer> sharks = new Team<>("Sharks");

        Team<BasketballPlayer> cows = new Team<>("Cows");
        Team<BasketballPlayer> bulls = new Team<>("Bulls");

        Team<FootballPlayer> rats = new Team<>("Rats");
        Team<FootballPlayer> chickens = new Team<>("Chickens");

        snakes.addPlayer(john);
        sharks.addPlayer(matt);
        cows.addPlayer(mark);
        bulls.addPlayer(tim);
        rats.addPlayer(luke);
        chickens.addPlayer(sam);

        League<Team> firstLeague = new League<>("League number one");

        firstLeague.addTeam(snakes);
        firstLeague.addTeam(sharks);
        firstLeague.addTeam(cows);
        firstLeague.addTeam(bulls);
        firstLeague.addTeam(rats);
        firstLeague.addTeam(chickens);

        snakes.matchResult(sharks, 2, 3);

        firstLeague.showTeams();


    }
}
