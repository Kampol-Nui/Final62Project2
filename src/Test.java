
import java.util.ArrayList;

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
        Person person2 = new Person("asds", "asdsd@gmail.com", "16545416");
        Cart c1 = new Cart(10);
        Game game1 = new Game("01","TOMB RIDER",20);
        Game game2 = new Game("02","RE7",60);
        Game game3 = new Game("03","RE8",90);
        CustomerAccount cus1 = new CustomerAccount(c1,500,"asdas","asdasd",AccountStatus.ACTIVE,person2);
        AdminAccount admin = new  AdminAccount("NobodyFound", "007", AccountStatus.ACTIVE, person);
          //admin.setStoreSize(10);
        //gameStore.addGameToStore(game3);
         // admin.addGame(game3);
//        admin.addGame(game2);
//        admin.addGame(game1);
          //admin.listGameFromStore();
        //ArrayList<AdminAccount> ad = new ArrayList<AdminAccount>();
        
        admin.addGame(gameStore,admin,game1);
        admin.addGame(gameStore,admin,game2);
        admin.addGame(gameStore,admin,game3);
        cus1.customerAddGameToCart(c1, gameStore, "TOMB RIDER");
        cus1.customerAddGameToCart(c1, gameStore, "RE7");
        c1.listGameFromCart();
//        c1.getItemInCart();
         //gameStore.addGame(admin, game3);
         //gameStore.addGame(cu1, game1);
//         gameStore.addGame(admin, game2);
//         gameStore.addGame(admin, game3);
//        gameStore.listGameFromStore();
//        admin.removeGame(gameStore, admin, game1);
//        System.out.println("-----------------");
//        gameStore.listGameFromStore();
//        
//        
//        System.out.println("-----------------");
//        admin.removeGame(gameStore, admin, game2);
//        gameStore.listGameFromStore();
//        
//        System.out.println("-----------------");
//        admin.removeGame(gameStore, admin, game3);
//        gameStore.listGameFromStore();
//        
//        System.out.println("-----------------");
//        admin.removeGame(gameStore, admin, game3);
//        gameStore.listGameFromStore();
        
        
       
    }

}
