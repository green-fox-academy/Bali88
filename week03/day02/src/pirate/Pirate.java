package pirate;

public class Pirate {
  private int intoxicatedLevel;
  private int energyLevel;
  boolean passedOut = false;
  boolean isAlive = true;

  public void drinkSomeRum() {
    this.intoxicatedLevel++;
  }

  public void howsItGoingMate() {
    if (intoxicatedLevel >= 4 ) {
      System.out.println("Pour me anudder!");
    } else { passedOut = true;
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
    }
  }

  public void die() {
    this.isAlive = false;
  }
  public void brawl(Pirate enemyPirate){

  }
}
