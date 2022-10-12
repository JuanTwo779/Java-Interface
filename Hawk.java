public class Hawk implements Predator{

    @Override
    public void hunt() {
        System.out.println("*The hawk is hunting*");
    }

    @Override
    public void kill() {
        System.out.println("*The hawk has killed its prey*");

    }
}
