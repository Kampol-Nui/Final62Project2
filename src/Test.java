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
        //GameStore gameStore = new GameStore();
        Person person = new Person("Kumpol", "kumpol@gmail.com", "0945481112");

        
        Game game1 = new Game("01","TOMB RIDER",20);
        Game game2 = new Game("02","RE7",60);
        Game game3 = new Game("03","RE8",90);
        
        AdminAccount admin = new  AdminAccount("NobodyFound", "007", AccountStatus.ACTIVE, person);
        
        //gameStore.addGameToStore(game3);
          admin.addGame(game3);
//        admin.addGame(game2);
//        admin.addGame(game1);
        
        //gameStore.listGameFromStore();
        

        
       
    }

}
