public class Starcity implements Locations {
    
    int airFare = 100;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}
    

