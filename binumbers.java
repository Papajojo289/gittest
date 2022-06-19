class Binumber {
 
        //constructor
         
            private int number1;
            private int number2;

             public int getNumber1()  {
                 return number1;
              }

              public int setNumber1()   {
                  this.number1 = number1;
              }


             public int getNumber2()  {
                 return number2;
              }

              public int setNumber2()   {
                  this.number2 = number2;
              }

            
            public Binumber (int number1, int number2);   {  
                this.number1 = number1;
                this.number2 = number2;
        }
}
            public static void main (String[]args)   {
            Binumber numbers = new Binumber (2,3);

            int add()  {
                //return number1+number2;
                System.out.println(number1 + number2);
            }

             int multiply()  {
                //return number1*number2;
                System.out.println(number1*number2);
            }

            // int doubleValue()   {
             //    this.number1 = number1*2;
              //   this.number2 = number2*2;
             //}

            
	
    
                //System.out.println(numbers.add());
               // System.out.println(numbers.multiply());
                //numbers.doubleValue();
                //System.out.println(numbers.getNumber(1));
                //System.out.println(numbers.getNumber(2));
    
}
//Have a class with the model (dogs, bike, binumber).  Have another class called main to have the Main method to test the code .

public BiNumber (int number1, int number2) 