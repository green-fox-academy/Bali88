package aircraftCarrier;

public class Aircraft {
  private int maxAmmo;
  private int baseDamage;
  private int ammo;

  public Aircraft(int maxAmmo, int baseDamage) {
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
    this.ammo = 0;
  }

  public int fight() {
    int damage = baseDamage * maxAmmo;
    ammo = 0;
    return damage;
  }

  public int refill(int filledAmmo) {
    this.ammo = this.maxAmmo;
    return filledAmmo - this.maxAmmo;
  }

  public String getType() {
    return getClass().getTypeName();
  }

  public String getStatus() {
    return "Type: " + getType() + " , " + " Ammo: " + ammo + " , " + " Base damage: " + baseDamage +
        " , All damage: " + (ammo * baseDamage);
  }

  public boolean isPriority() {
    String F35 = "F35";
    return getType().equals(F35);
  }
}