package ch3_15;

public interface Sell {
    void sell();
    default void order(){
        System.out.println("sell");
    }
}
