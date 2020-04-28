
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
        GameStore gameStore = new GameStore("STIM");
        GameStore gameStore2 = new GameStore("ORIJUN");
        Person person = new Person("Kumpol", "kumpol@gmail.com", "0945481112");
        Person person2 = new Person("asds", "asdsd@gmail.com", "16545416");
        Person person3 = new Person("test", "testt@gmail.com", "testtt");
        Cart c1 = new Cart("CART 1");
        Cart c2 = new Cart("CART 2");
        Game game1 = new Game("01", "TOMB RIDER", 20);
        Game game2 = new Game("02", "RE7", 60);
        Game game3 = new Game("03", "RE8", 100);
        Game game4 = new Game("04", "RE9", 40);
        GameLibrary lb1 = new GameLibrary();
        GameLibrary lb2 = new GameLibrary();
        CustomerAccount cus1 = new CustomerAccount(c1, "asdas", "asdasd", AccountStatus.ACTIVE, person2);
        CustomerAccount cus2 = new CustomerAccount(c2, "customer2", "testpass", AccountStatus.ACTIVE, person3);
//        cus1.TopupMoney(800);
        //cus2.TopupMoney(1000);
        AdminAccount admin = new AdminAccount("NobodyFound", "007", person);
        AdminAccount admin2 = new AdminAccount("NobodyFound", "007", person);

        System.out.println("=============================TEST FOR ADMIN========================================================");
//        gameStore.listGameFromStore();
//        System.out.println("-----------------------------------------------------------------");
        gameStore.addGame(admin, game1);
        gameStore.addGame(admin, game2);
        gameStore.addGame(admin, game3);
        gameStore.listGameFromStore();
        System.out.println("-----------------------------------------------------------------");
//        gameStore.addGame(admin, game1);
//        gameStore.listGameFromStore();
//        System.out.println("-----------------------------------------------------------------");
//        gameStore.addGame(admin, null);
//        gameStore.listGameFromStore();
//        System.out.println("-----------------------------------------------------------------");
//        gameStore2.listGameFromStore();
//        System.out.println("-----------------------------------------------------------------");
//        gameStore.removeGame(admin, game2);
//        gameStore.listGameFromStore();
//        System.out.println("-----------------------------------------------------------------");
//        gameStore.removeGame(admin, game2);
//        gameStore.listGameFromStore();
//        System.out.println("-----------------------------------------------------------------");
//        gameStore2.removeGame(admin, game4);
//        gameStore2.listGameFromStore();
//        System.out.println("-----------------------------------------------------------------");
        System.out.println("=============================TEST FOR ADMIN========================================================");
        System.out.println("                                                                                                   ");
        System.out.println("=============================TEST FOR CUSTOMER=====================================================");
        c1.addGameToCart(null, null, null);
        c1.listGameFromCart();
        System.out.println("-----------------------------------------------------------------");
        c1.addGameToCart(gameStore, cus1, "RE8");
        c2.addGameToCart(gameStore, cus2, "RE7");
        c2.addGameToCart(gameStore, cus2, "RE8");
//        c1.addGameToCart(gameStore, cus1, "RE8");
        c1.listGameFromCart();
        System.out.println("-----------------------------------------------------------------");
//        c1.removeGameFromCart(null, "RE7");
//        c1.listGameFromCart();
//        System.out.println("-----------------------------------------------------------------");
//        c1.removeGameFromCart(cus1, "RE7");
//        c1.listGameFromCart();
//        System.out.println("-----------------------------------------------------------------");
//        System.out.println("                                                                   ");
        

//        cus1.TopupMoney(1000);
//        System.out.println(cus1.getMyMoney());
        lb1.payGame(cus1);
        System.out.println("-----------------------------------------------------------------");

//        cus2.TopupMoney(1000);
//        System.out.println(cus2.getMyMoney());
        lb2.payGame(cus2);
        System.out.println("-----------------------------------------------------------------");

        //lb2.payGame(cus2);
//        System.out.println(c1.getTotalprice());
//        System.out.println(cus1.getMyMoney());
        System.out.println("-----------------------------------------------------------------");
        System.out.println(lb2.getMyGameLibrary(cus1));
        cus2.listBuyingHistory();
        //System.out.println(lb1.getMyGameLibrary(cus2));
        // dataaccess.DBconnection.SelectLastMoney(cus1.getUniqueId());

//        cus2.TopupMoney(1000);
//        c2.addGameToCart(gameStore, cus1, "RE7");
//        lb2.payGame(cus2);
//        System.out.println(lb1.getMyGameLibrary(cus2));
//        c1.addGameToCart(gameStore, cus1, "TOMB RIDER");
//        c1.listGameFromCart();
        // cus1.addCustomerToServer(500,"Nui","1231231",c1);
        // System.out.println(lb1.getMyGameLibrary(null));
        admin.readCustomer(admin, "file_asdas.dat");
    }
        
}
