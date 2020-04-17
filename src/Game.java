
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MINI
 */
public class Game {
    private String id;
    private String title;
    private double price;

    public Game(String id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    public double getPrice() {
        return price;
    }
    
   

    @Override
    public String toString() {
        return "Game{" + "id=" + id + ", title=" + title + ", price=" + price + '}';
    }

    public String getTitle() {
        return title;
    }

    
    
}
