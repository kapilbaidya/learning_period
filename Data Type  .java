class DataType {
  public static void main (String[]args){
int items = 25;
float costPerItem = 9.99f;
float totalCost = items * costPerItem;
char currency = '$';

  System.out.println("Number of items: " + items);
  System.out.println("Cost Per Item: " + costPerItem + currency);
  System.out.println("Total Cost: " + totalCost + currency);
  }
}
