import java.util.List;

public class Receipt {
    List<Item> items;

    public Receipt(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    void addItems (Item item) {
        this.items.add(item);
    }

    void deleteItems (Item item) {
        this.items.remove(item);
    }

    double sumItems () {
        double zbir=0;
        for(int i=0;i< items.size();i++){
            zbir+=items.get(i).getPrice();
        }
        return zbir;
   }


}
