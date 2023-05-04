import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    List<Product> list = new ArrayList<>();
    public int amount = 0;
    public VendingMachine addProduct(Product product){
        list.add(product);
        return this;
    }

    public List<Product> getList() {
        return list;
    }

    public Product findProduct(String string){ // Ищем товар по названию
        for (int i = 0; i < getList().size(); i++) {
            if (getList().get(i).getName().equals(string)){
                return getList().get(i);
            }
        }
        return null;
    }

    public Product sellProduct(Product product){
        try {
        Product prodFound = findProduct(product.getName());
        getList().remove(prodFound);
        amount += prodFound.getCost();
        return prodFound;
            
        } catch (Exception e) {
            throw new RuntimeException("Товар не найден");
        }
    }

    public char[] getAmount() {
        return null;
    }
}