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
        GameStore gameStore = new GameStore();
        GameStore gameStore2 = new GameStore();
        Person person = new Person("Kumpol", "kumpol@gmail.com", "0945481112");
        Person person2 = new Person("asds", "asdsd@gmail.com", "16545416");
        Cart c1 = new Cart();
        Game game1 = new Game("01","TOMB RIDER",20);
        Game game2 = new Game("02","RE7",60);
        Game game3 = new Game("03","RE8",90);
        //GameLibrary lb1 = new GameLibrary();
        CustomerAccount cus1 = new CustomerAccount(c1,500,"asdas","asdasd",AccountStatus.ACTIVE,person2);
        
        AdminAccount admin = new  AdminAccount("NobodyFound", "007", AccountStatus.ACTIVE, person,c1);
          //admin.setStoreSize(10);
        //gameStore.addGameToStore(game3);
         // admin.addGame(game3);
//        admin.addGame(game2);
//        admin.addGame(game1);
          //admin.listGameFromStore();
        //ArrayList<AdminAccount> ad = new ArrayList<AdminAccount>();
          gameStore.addGame(admin, game1);
          gameStore.addGame(admin, game2);
          gameStore.addGame(admin, game3);
          System.out.println(game1.getStatus());
          gameStore.changeStatus(admin, "RE7", GameStatus.DISCOUNTED);
          System.out.println(game2.getStatus());
//        admin.addGame(admin,game1);
//        admin.addGame(admin,game2);
//        admin.addGame(admin,game3);
//        cus1.customerAddGameToCart(c1, gameStore, "TOMB RIDER");
//        cus1.customerAddGameToCart(c1, gameStore, "RE7");
            c1.addGameTOCart(gameStore,cus1, "TOMB RIDER");
            c1.addGameTOCart(gameStore,cus1, "RE7");
            c1.addGameTOCart(gameStore,cus1, "asdasd");
//          cus1.customerAddGameToCart( "TOMB RIDER");
//          cus1.customerAddGameToCart( "RE7");
        c1.listGameFromCart();
        System.out.println("-----------------");
        c1.removeGameFromCart(cus1,"RE7");
        c1.removeGameFromCart(cus1,"asdasd");
//        cus1.customerRemoveGameFromCart("RE7");
//        cus1.customerRemoveGameFromCart("asds");
        c1.listGameFromCart();
        System.out.println("-----------------");
//        c1.getItemInCart();
         //gameStore.addGame(admin, game3);
         //gameStore.addGame(cu1, game1);
         //gameStore.addGame(admin, game2);
         //gameStore.addGame(admin, game3);
        gameStore.listGameFromStore();
        gameStore2.listGameFromStore();
       // admin.removeGame(admin, game2);
        gameStore.removeGame(admin, game2);
        
        System.out.println("-----------------");
        gameStore.listGameFromStore();
        c1.listGameFromCart();
        
        
        System.out.println("-----------------");
//        admin.removeGame(admin, game1);
          gameStore.removeGame(admin, game1);
        gameStore.listGameFromStore();
     

        
        
        System.out.println("-----------------");
        gameStore.removeGame(admin, game3);
        gameStore.listGameFromStore();
        
        System.out.println("-----------------");
        gameStore.removeGame(admin, game3);
        gameStore.listGameFromStore();
        
        
        c1.removeGameFromCart(cus1,"TOMB RIDER");
        c1.listGameFromCart();
       
    }

}