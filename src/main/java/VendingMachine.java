import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private Map<String, Slot<? extends Product>> slots;

    public VendingMachine() {
        this.slots = new HashMap<>();
    }

    public <T extends Product> void addProduct(String code, Slot<T> slot){
            slots.put(code, slot);
    }


    public Product dispenseProduct(String code){
        Slot<? extends Product> slot = slots.get(code);
        if(slot != null && slot.getQuantity() > 0
        ){
            slot.setQuantity(slot.getQuantity() - 1);
            return slot.getProduct();
        }
        else{
            System.out.println("Product not available or no more Product");
            return null;
        }

    }

    public void displayAll(){
        for(Map.Entry<String, Slot<? extends Product>> entry: slots.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
