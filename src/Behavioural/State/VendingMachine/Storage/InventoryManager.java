package Behavioural.State.VendingMachine.Storage;

public interface InventoryManager {

    void addProduct(Product newProduct);

    void deleteProduct(Product product);

    void updateQuantity(Product product);

    boolean isAvailable(Product product);

    
}
