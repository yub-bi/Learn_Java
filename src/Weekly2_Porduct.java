public abstract class Weekly2_Porduct {
  private String productName;
  private int price;
  private int amount;

  public double calculatePrice(){
    return price * amount;
  }
}
