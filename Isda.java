public class Isda implements Prey, Predator{

    @Override
    public void flee() {
        System.out.println("*The fish swam away*");
    }

    @Override
    public void hunt() {
        System.out.println("*The fish hunts for smaller fish*");
    }

    @Override
    public void kill() {
        System.out.println("*The fish eats the smaller fish*");
    }
}
