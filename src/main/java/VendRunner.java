public class VendRunner {
    public static void main(String[] args) {

        Snack chip = new Snack("chip",1.5,true);
        Snack cookie = new Snack("cookie",1.5,false);
        Beverage coke = new Beverage("coke",2.5, 3.0);
        Beverage juice = new Beverage("juice",2.5, 4.0);

        Slot<Snack> chipslot = new Slot<>(chip, 6);
        Slot<Snack> cookieslot = new Slot<>(cookie, 7);
        Slot<Beverage> juiceslot = new Slot<>(juice, 8);
        Slot<Beverage> cokeslot = new Slot<>(coke, 10);


        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addProduct("A1", chipslot);
        vendingMachine.addProduct("A2", cookieslot);
        vendingMachine.addProduct("A3", juiceslot);
        vendingMachine.addProduct("A6", cokeslot);

        vendingMachine.displayAll();
        vendingMachine.dispenseProduct("A1");
        vendingMachine.displayAll();



    }
}
