public class Mage {

    String name;
    int level;
    int damage;
    String type;

    public Mage(String name, int level, int damage, String type) {
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getDamage() {
        return damage;
    }

    public String getType() {
        return type;
    }

    public void getInfo() {

        getName();
        getLevel();
        getDamage();
        getType();

    }

    public void fight(Mage mage) {

        String str = " Win!";

        if (type == "fire" && mage.type == "ice") {
            System.out.println(getName() + str);
            return;
        }
        if (type == "fire" && mage.type == "earth") {
            System.out.println(mage.getName() + str);
            return;
        }
        if (type == "ice" && mage.type == "earth") {
            System.out.println(getName() + str);
            return;
        }
        if (type == "ice" && mage.type == "fire") {
            System.out.println(mage.getName() + str);
            return;
        }
        if (type == "earth" && mage.type == "fire") {
            System.out.println(getName() + str);
            return;
        }
        if (type == "earth" && mage.type == "ice") {
            System.out.println(mage.getName() + str);
            return;
        }
        if (type.equals(mage.type)) {
            if (level > mage.level) {
                System.out.println(getName() + str);
                return;
            }
            if (mage.level > level) {
                System.out.println(mage.getName() + str);
            }
            if (level == mage.getLevel()) {
                if (damage > mage.damage) {
                    System.out.println(getName() + str);
                }
                if (damage < mage.damage) {
                    System.out.println(mage.getName() + str);
                }
                if (damage == mage.damage) {
                    System.out.println("Draw!");
                }
            }
        }
    }
}
