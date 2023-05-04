/* На основе кода с урока добавить еще один класс продукта, (Молоко, шоколад ,и т.п., 
можно добавить несколько классов), они должны наследоваться от класса Product, 
надо переопределить метод toString и попробовать включить эти классы в VendingMachine, 
вывести список товаров из VendingMachine*/

public class Milk extends Product {
    private final String type;

    public Milk(String name, Integer cost, String type){
        super(name, cost);

        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + this.type;
    }
    
}