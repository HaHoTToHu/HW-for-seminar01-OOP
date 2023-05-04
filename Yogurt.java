public class Yogurt extends Product{
    private String flavour;

    public Yogurt(String name, Integer cost, String flavour){
        super(name, cost);

        this.flavour = flavour;
    }
    @Override
    public String toString(){
        return super.toString() + " " + flavour; // Полиморфизм
    }
}
