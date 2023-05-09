interface Tourist {

    int budget = 0;

    void visit();

    void visit(Starcity starcity);
    void visit(Paco paco);
    void visit(Tondo tondo);
    void visit(Dolomite dolomite);
    void visit(Moa moa);
    void visit(Pandacan pandacan);


    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    
    };

    void checkBudget();
}