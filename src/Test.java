/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MINI
 */
public class Test {

    public static void main(String[] args) {
        GameStore gameStore = new GameStore(3);
        Person person = new Person("Kumpol", "kumpol@gmail.com", "0945481112");

        
        Game game1 = new Game("01","TOMB RIDER",20);
        Game game2 = new Game("02","RE7",60);
        Game game3 = new Game("03","RE8",90);
        
        AdminAccount admin = new  AdminAccount("NobodyFound", "007", AccountStatus.ACTIVE, person);
          //admin.setStoreSize(10);
        //gameStore.addGameToStore(game3);
         // admin.addGame(game3);
//        admin.addGame(game2);
//        admin.addGame(game1);
          //admin.listGameFromStore();
        admin.addGame(gameStore,game1);
        admin.addGame(gameStore,game2);
        admin.addGame(gameStore,game3);
         //gameStore.addGame(admin, game3);
//         gameStore.addGame(admin, game1);
//         gameStore.addGame(admin, game2);
//         gameStore.addGame(admin, game3);
        gameStore.listGameFromStore();
        gameStore.removeGame(admin, game3);
        System.out.println("-----------------");
        gameStore.listGameFromStore();
        
        
        System.out.println("-----------------");
        gameStore.removeGame(admin, game3);
        gameStore.listGameFromStore();
        
        System.out.println("-----------------");
        gameStore.removeGame(admin, game2);
        gameStore.listGameFromStore();
        
        System.out.println("-----------------");
        gameStore.removeGame(admin, game2);
        gameStore.listGameFromStore();
        
       
    }

}
