public class Me implements Tourist {
    
    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");
        checkBudget(); 
    }

    public void visit(Starcity starcity) {
        
        if (budget >=1000){
            budget = budget - starcity.airFare;
        System.out.println("Sarap mag rides");
        }else {
        System.out.println("Wala e");
    }
    checkBudget(); 
}
    public void visit(Paco paco) {
       
        if (budget >=100){
            budget = budget - paco.airFare;
        System.out.println("Puro food stall nakakabusog");
        }else {
        System.out.println("Wala e");
    }
    checkBudget();
}
    public void visit(Moa moa) {
        
        if (budget >=100){
            budget = budget - moa.airFare;
        System.out.println("Kakapagod ikutin");
        }else {
        System.out.println("Wala e");
    }
    checkBudget();
}
    public void visit(Pandacan pandacan) {
        
        if (budget >=100){
            budget = budget - pandacan.airFare;
        System.out.println("Hometown");
        }else {
        System.out.println("Wala e");
    }
    checkBudget(); 
}
    public void visit(Tondo tondo) {

        if (budget >=100){
        budget = budget - tondo.airFare;
        System.out.println("Daming sindikato muuntik na magripuhan");
        }else {
        System.out.println("Wala e");
    }
    checkBudget(); 
}
    public void visit(Dolomite dolomite) {
        if (budget >=100){
        budget = budget - dolomite.airFare;
        System.out.println("Baho ng dagat");
        }else {
        System.out.println("Wala e");
    }
            checkBudget(); 
}
    public void checkBudget() {
        System.out.println("my budget is " + budget);
        
    }

}


