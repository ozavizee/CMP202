public interface Electronics {
    boolean onOrOff =false;

    boolean on();

    boolean off();

    default void electornics(){
        if (onOrOff){
            System.out.println("Default");
        }
    }
}
