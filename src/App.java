public class App {
    public static void main(String[] args) throws Exception {
       
        // Long exam 1

        // 1. Add 5 new locations to visit
        // 2. Each location should have an airFare.
        // 3. Each time you visit a new location, your budget should decrease.
        // 4. In the visit method, print a message if you can visit the new location and
        // print another message if you cannot visit the location.
        // 5. Each time you visit a location, call the checkBudgetMethod

        Me myself  = new Me();

        Locations pandacan = new Pandacan ();
        Locations moa = new Moa();
        Locations tondo = new Tondo();
        Locations paco = new Paco ();
        Locations dolomite = new Dolomite ();
        Locations starcity = new Starcity ();

        pandacan.accept(myself);
        moa.accept(myself);
        tondo.accept(myself);
        paco.accept(myself);
        dolomite.accept(myself);
        starcity.accept(myself);


    }
}


    

