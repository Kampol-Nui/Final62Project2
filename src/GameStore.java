
import java.util.ArrayList;
import java.util.Objects;


public class GameStore implements AdminService{


    protected ArrayList<Game> games;
    private GameStatus gamestatus;
    private String name;

    public GameStore(String name) {
        this.name = name;
        games = new ArrayList<>();

    }

    public boolean listGameFromStore() {
        System.out.println("************************ Game in " + this + " *************************");
        if (this.games.isEmpty()) {
            System.out.println("This Store is empty");
            return false;
        }
        for (Game game : games) {
            System.out.print(game + "\t");
            System.out.println("Index is " + games.indexOf(game));

        }
        return true;
    }

    public Game getGame(int i) {
        return games.get(i);

    }

    public ArrayList<Game> getGames() {
        return games;
    }

    @Override
    public boolean addGame(AdminAccount admin, Game game) {
        try {
            Objects.requireNonNull(admin, "AdminAccount cannot be null");
            if (game == null) {
                System.out.println("Game is Not Null");
                return false;
            }
            for (int i = 0; i < this.games.size(); i++) {
                if (this.games.get(i).equals(game)) {
                    System.out.println("You already have this game");
                    return false;
                }
            }
            game.setStatus(GameStatus.ONSALED);
            this.games.add(game);
            System.out.println("Successfully Added");
            return true;
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());

        }
        return false;
    }

    @Override
    public boolean changeStatus(AdminAccount admin, String title, GameStatus status) {
        try {
            for (int i = 0; i < this.games.size(); i++) {
                if (this.games.get(i).getTitle().equals(title)) {
                    this.games.get(i).setStatus(status);
                    return true;
                }

            }
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        System.out.println("not found the game to add");
        return false;
    }

    @Override
    public boolean removeGame(AdminAccount admin, Game game) {
        try {
            Objects.requireNonNull(admin, "AdminAccount cannot be null");
            if (game == null) {
                System.out.println("Game is Not Null");
                return false;
            }
            for (int i = 0; i < this.games.size(); i++) {
                if (this.games.get(i).equals(game)) {
                    this.games.remove(game);
                    System.out.println("Successfully Removed");
                    return true;
                }

            }
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        System.out.println("Not found game to remove");
        return false;
    }

    @Override
    public String toString() {
        return name;
    }

}
