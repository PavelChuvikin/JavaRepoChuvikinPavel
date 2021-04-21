package homework6;

public class Lesson06 extends Object {

    private static int round = 1;

    public static void main(String[] args) throws InterruptedException {


        LightHero lightHero = new LightHero("LightHero", 5, 100, 20);
        DarkHero darkHero = new DarkHero("DarkHero", 10, 150, 5);
        HealerHero healerHero = new HealerHero("Healerhero", 0, 120, 20, 3);

        while (!lightHero.isDead() || !darkHero.isDead()) {
            System.out.println("**** Round " + round + " ****");
            if (!healerHero.isDead()) {
                System.out.println(lightHero.getHeroInfo());
                System.out.println(darkHero.getHeroInfo());
                System.out.println(healerHero.getHeroInfo());

                lightHero.attack(darkHero);
                lightHero.attack(healerHero);

                if (darkHero.isDead()) {
                    System.out.println("lightHero win");
                    break;
                }
                if (healerHero.isDead()){
                    System.out.println("Healerhero is dead");
                }
                else {
                    healerHero.heal(darkHero);
                }
            }
            else {
                System.out.println(lightHero.getHeroInfo());
                System.out.println(darkHero.getHeroInfo());

                lightHero.attack(darkHero);

                if (darkHero.isDead()) {
                    System.out.println("lightHero win");
                    break;
                }
            }
            if (!healerHero.isDead()) {
                darkHero.attack(lightHero);
                darkHero.attack(healerHero);

                if (lightHero.isDead()) {
                    System.out.println("darkHero win");
                    break;
                }
                if (healerHero.isDead()){
                    System.out.println("Healerhero is dead");
                }
                else {
                    healerHero.heal(lightHero);
                }
            }
            else {
                darkHero.attack(lightHero);

                if (lightHero.isDead()) {
                    System.out.println("darkHero win");
                    break;
                }
            }
            lightHero.healSelf();
            darkHero.healSelf();
            if (!healerHero.isDead()){
            System.out.println(lightHero.getHeroInfo());
            System.out.println(darkHero.getHeroInfo());
            System.out.println(healerHero.getHeroInfo());}
            else{
            System.out.println(lightHero.getHeroInfo());
            System.out.println(darkHero.getHeroInfo());
            }
            round++;

            Thread.sleep(3000);
        }

    }

/**
 * 1. Посмотреть все предыдущие уроки в части кода: 1-6 уроки
 * 2. Вопросы в комментарии к домашней работе
 * 3. Модифицировать код в части работы с объектами.
 * 4. Тренировка по тестам Java
 */

}
