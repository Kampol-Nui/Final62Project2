
public interface CustomerService {
    public abstract boolean addGameToCart(GameStore gameStore, CustomerAccount ca, String title);
    public abstract boolean removeGameFromCart(CustomerAccount ca, String title);

}
