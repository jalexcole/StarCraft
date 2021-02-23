package StarCraft;

import java.util.ArrayList;
import java.util.Scanner;

import StarCraft.model.Player;
import StarCraft.util.Action;

public class Game implements Runnable{

    // Core game information
    ArrayList<Player> players = new ArrayList<>();
    ArrayList<Action> actionQue = new ArrayList<>();
    
    // Singleton
    private static Game single_instance = null;
    
    ArrayList<Long> teamIds = new ArrayList<>();

    private Map map;

    public Game() {
        
    }

    public void init(){
        // Sets up everything to create a game and play.
    }

    public void createGame(){
        // Generate the map

        // Generate the players
        Scanner scanner = new Scanner(System.in);
        
    }

    public void start(){
        // turn on game loop

        // needs way to exit game loop;
    }

    public void actOnAction(){
        // Check if action is valid

        // Act on action

        // Log action as completed
        
        // Remove action from action que
    }

    public void checkVictory() {

        ArrayList<Long> teamsAlive = new ArrayList<>();

        for(Player player: players) {
            if (player.getBuildings().size() > 0) {
                teamsAlive.add(player.getTeamId());
            }
        }

        if (teamsAlive.indexOf(teamsAlive.get(0)) == teamsAlive.size()) {
            // this team wins
        } else {
            // no victory has happened.
        }




    }

    public static Game getInstance() {
        if (single_instance == null) {
            single_instance = new Game();
        }

        return single_instance;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        getInstance();
        init();
        createGame();
        start();

    }


    
}
