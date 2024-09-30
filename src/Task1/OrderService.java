package Task1;

public class OrderService {
    int orderCount;

    public void increaseOrderCount() {
        synchronized (this) {
            this.orderCount = +1;
        }

    }


}
