public class Main {
    public static void main(String[] args) {

        Isda fish = new Isda();
        fish.flee();
        fish.hunt();
        fish.kill();

        System.out.println("");

        Hawk buddy = new Hawk();
        buddy.hunt();
        buddy.kill();
    }


}
