public class Main {
    public static void main(String[] args) {
        Army bossArmy = new Army("Boss army");
        Enemy enemy = new Enemy("Gigel");
        Enemy enemy2 = new Enemy("Ionel");
        Enemy enemy3 = new Enemy("Marcel");
        Army wave1 = new Army("Wave 1");
        Army wave2 = new Army("Wave 2");
        
        wave1.addEnemy(enemy);
        wave2.addEnemy(enemy2);
        wave2.addEnemy(enemy3);
        wave2.addEnemy(wave1);
        
        bossArmy.addEnemy(wave2);
        
        bossArmy.atack("Gun");
    }
}
