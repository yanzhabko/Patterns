package org.example;

public class ControllSystem {
    private Order order;

    public ControllSystem(Order order) {
        this.order = order;
    }

    private final Version version=new Version();

    public Order getOrder() {
        return order;
    }

    public void setOrder(String name,String type) {
        this.order.setName(name);
        this.order.setType(type);
    }

    public void saveOrderToMemento(){
        version.addVersion(order.copy());
    }
    public void restoreVersionFromMemento(int version){
        order= this.version.getVersion(version);
    }
}
