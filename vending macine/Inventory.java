import java.util.*;
public class Inventory {

    private Map<String, Integer> inventory;

    public Inventory() {
        inventory = new HashMap<>();
    }

    public void addProduct(Product product, int quantity) {
        inventory.put(
            product.getId(),
            inventory.getOrDefault(product.getId(), 0) + quantity
        );
    }

    public void removeProduct(Product product, int quantity) {

        if (!inventory.containsKey(product.getId())) {
            System.out.println("Product not found in inventory.");
            return;
        }

        int currentQuantity = inventory.get(product.getId());

        if (currentQuantity < quantity) {
            System.out.println("Not enough quantity.");
            return;
        }

        inventory.put(
            product.getId(),
            currentQuantity - quantity
        );
    }

    public int getQuantity(Product product) {
        return inventory.getOrDefault(product.getId(), 0);
    }

    public boolean isAvailable(Product product) {
        return inventory.getOrDefault(product.getId(), 0) > 0;
    }
}