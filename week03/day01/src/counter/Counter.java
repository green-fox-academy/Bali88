package counter;

public class Counter {
  private int fieldValueCounter = 0;

  public Counter() {
  }

  public void add(int number) {
    this.fieldValueCounter = fieldValueCounter + number;
  }

  public int getFieldValueCounter() {
    return fieldValueCounter;
  }

  public void add() {
    ++fieldValueCounter;
  }

  public void reset() {
    fieldValueCounter = 0;
  }
}
