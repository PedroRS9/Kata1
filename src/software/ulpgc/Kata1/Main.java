package software.ulpgc.Kata1;

public class Main {
    public static void main(String[] args) {
        Fighter marth = new Fighter("Marth", 100, 100, 100);
        Fighter roy = new Fighter("Roy", 100, 90, 90);
        System.out.println(marth.getHpString());
        System.out.println(roy.getHpString());
        marth.attack(roy);
        System.out.println(roy.getHpString());
    }
}
