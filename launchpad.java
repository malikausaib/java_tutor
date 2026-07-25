class launchpad
{
  /* Method Implementation to calculate the sum of two integers */
  private static int total(int data1, int data2)
  {
    return data1 + data2;
  }

  /* Method Implementation to find the multiplication of two integers */
  private static int findProduct(int data1, int data2)
  {
    return data1*data2;
  }

  /* Method Implementation to find the largest of two integers */
  private static int findLargest(int data1, int data2)
  {
    if(data1>data2){
      return data1;
    }
    else
    {
      return data2;
    }
  }

  //write your code here



  public static void main(String[] args)
  {
    System.out.println("Hello, World!");
    
    /* A method to calculate the sum of two integers */
    int sum = total(5, 10);
    System.out.println("Total: " + sum);

    /* A method to print the multiplication of two integers */
    int product = findProduct(5,10);
    System.out.println("product: " + product);

    /* Find largest of two numbers */
    int largest = findLargest(5,10);
    System.out.println("largest: "+largest);

    
    //write your code here
  }
}