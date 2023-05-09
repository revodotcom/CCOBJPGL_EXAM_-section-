public class Pandacan implements Locations {

    int airFare = 200;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}
    

