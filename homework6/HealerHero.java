package homework6;

public class HealerHero extends SuperHero {
    int healPower;
    public HealerHero(String name, int attack, int health, int defence, int healPower) {
        super(name, attack, health, defence);
        this.healPower = healPower;//величина, на которую хилер может лечить
    }
    public void heal(SuperHero hero) {// метод, позволяющий лечить другого героя
        hero.health += this.healPower;
            System.out.println(this.name + " healing " + hero.name + " >> " + this.healPower
                    + " HP " + hero.name + " = " + hero.health);

    }
}
