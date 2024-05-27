class CastingExample{
  public static void main (String[]args){
    int totalFee = 27000;
    int paidFee = 13035;
    float percentage = (float) paidFee / totalFee * 100.0f;
    char percentages = '%';

  System.out.println("Paid Fee: " + percentage + percentages );
  }
}
