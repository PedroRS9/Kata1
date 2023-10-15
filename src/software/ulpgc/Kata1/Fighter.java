package software.ulpgc.Kata1;

public class Fighter {
    private String name;
    private int hp;
    private int attack;
    private int defense;

    public Fighter(String name, int hp, int attack, int defense) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public String getHpString(){
        return String.format("%s tiene %d puntos de vida", name, hp);
    }

    @Override
    public String toString() {
        return "Fighter{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", attack=" + attack +
                ", defense=" + defense +
                '}';
    }

    public void attack(Fighter rival){
        rival.hp -= attack - (rival.defense / 3);
    }
}
