public class Game {

    public static void main(String[] args) {
        Player1 player1 = new Player1("player1", "FireSword", 100);
        System.out.println(player1.getName());
        System.out.println(player1.getHealth());
        System.out.println(player1.getWeapon());

        player1.damageBYGun1();
        player1.damageBYGun1();
        player1.damagebyGun2();

        Player2 player2 = new Player2("player2","IceSword",80,true);
        player2.damageBYGun1();
        player2.damagebyGun2();


    }
}
