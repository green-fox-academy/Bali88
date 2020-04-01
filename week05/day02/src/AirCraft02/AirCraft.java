package AirCraft02;

public class AirCraft {

    int maxAmmo;
    int baseDamage;
    int currentAmmo;
    String type;
    boolean isPriority;

    public AirCraft(int maxAmmo, int baseDamage, String type, boolean isPriority) {
        this.maxAmmo = maxAmmo;
        this.baseDamage = baseDamage;
        this.currentAmmo = this.maxAmmo;
        this.type = type;
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }

    public void setMaxAmmo(int maxAmmo) {
        this.maxAmmo = maxAmmo;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public int getCurrentAmmo() {
        return currentAmmo;
    }

    public void setCurrentAmmo(int currentAmmo) {
        this.currentAmmo = currentAmmo;
    }

    public int fight() {
        int damageItDealt = this.currentAmmo * this.baseDamage;
        this.currentAmmo = 0;
        return damageItDealt;
    }

    public int refill(int numbOfRefilledAmmo) {
        int remainingAmo;
        if (numbOfRefilledAmmo <= this.maxAmmo - this.currentAmmo) {
            this.currentAmmo += numbOfRefilledAmmo;
            remainingAmo = this.maxAmmo - this.currentAmmo;
        } else {
            this.currentAmmo = this.maxAmmo;
            remainingAmo = numbOfRefilledAmmo - (this.maxAmmo - this.currentAmmo);
        }
        return remainingAmo;
    }

    public String getType() {
        return this.type;
    }

    public String getStatus() {
        return "Type " + this.type + " Ammo: " + this.currentAmmo + " Base Damage: " + this.baseDamage
                + " All Damage: " + fight();
    }

    public boolean isPriority() {
        return isPriority;
    }

}
