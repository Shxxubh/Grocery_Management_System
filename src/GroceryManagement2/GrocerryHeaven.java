package GroceryManagement2;

	import java.util.Scanner;

	public class GrocerryHeaven extends Grocerry_sections_prices{

	    static Scanner sc = new Scanner(System.in);

	    public static void main(String[] args) {

	                System.out.println("**********************************************---Welcome to Grocery Heaven---**********************************************************************************************************************************************************************************************************");
	                System.out.println(" ");
	                System.out.println("");

	                Scanner sc=new Scanner(System.in);
	                do {
	                    System.out.println("*********************************************************************************************************************************************************************************************************************************************************************************");
	                    System.out.println("          ||--A.for Grains--||   "+"    ||--B.for Breakfast & Dairy--||   "+"  ||--C.For Fastfood & Snaks--||  "+
	                            "\n||--D.For Soups & Shampoo--||  "+"  ||--E.For Oil & Sauce--||  " +"||--F.For Condiments & Spices--||  "+"  ||--G.For Billing_Receipt--||  ");
	                    System.out.println("");
	                    System.out.println("------------------------------------------------Select Your Choice---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

	                    String UserInput=sc.next();
	                    if("A".equals(UserInput)||"a".equals(UserInput)) {
	                        System.out.println("**********--Grains--**********");
	                        System.out.println("");
	                        System.out.println("1.Tur_Dal"+"\t\t\t"+"120.00");
	                        System.out.println("2.Mug_Dal"+"\t\t\t"+"120.00");
	                        System.out.println("3.Masur_Dal"+"\t\t\t"+"120.00");
	                        System.out.println("4.Harbhara_Dal"+"\t\t\t"+"140.00");
	                        System.out.println("5.Udit_Dal"+"\t\t\t"+"100.00");
	                        System.out.println("6.Chana_Dal"+"\t\t\t"+"100.00");
	                        System.out.println("7.Vatana_Dal"+"\t\t\t"+"120.00");


	                            System.out.print("Add your item : ");
	                             int a=sc.nextInt();
	                             grains(a);

	                    }
	                    else if("B".equals(UserInput)||"b".equals(UserInput)) {
	                        System.out.println("**********--Breakfast & Dairy--**********");
	                        System.out.println("");
	                        System.out.println("1.Paneer"+"\t\t\t"+"90.00");
	                        System.out.println("2.Yoghurt"+"\t\t\t"+"50.00");
	                        System.out.println("3.Butter_Milk"+"\t\t\t"+"60.00");
	                        System.out.println("4.Milk"+"\t\t\t\t"+"80.00");
	                        System.out.println("5.Cheese"+"\t\t\t"+"100.00");
	                        System.out.println("6.Eggs"+"\t\t\t\t"+"10.00");
	                        System.out.println("7.Otas"+"\t\t\t\t"+"50.00");
	                        System.out.println("8.Butter"+"\t\t\t"+"120.00");
	                        System.out.println("9.Gulab_Jamun"+"\t\t\t"+"90.00");
	                        System.out.println("10.Rabadi"+"\t\t\t"+"100.00");
	                        System.out.println("11.Shri_Khand"+"\t\t\t"+"120.00");
	                        System.out.println("12.Amra_Khand"+"\t\t\t"+"140.00");
	                        System.out.println("13.Fruit_Khand"+"\t\t\t"+"150.00");

	                        System.out.print("Add your item : ");
	                        int b=sc.nextInt();
	                        dairy(b);

	                    }
	                    else if("C".equals(UserInput)||"c".equals(UserInput)) {
	                        System.out.println("**********--Fastfood & Snaks--**********");
	                        System.out.println("");
	                        System.out.println("1.Candy"+"\t\t\t\t"+"50.00");
	                        System.out.println("2.Chocolate"+"\t\t\t"+"60.00");
	                        System.out.println("3.Chips"+"\t\t\t\t"+"50.00");
	                        System.out.println("4.Coconut_Cookies"+"\t\t"+"40.00");
	                        System.out.println("5.Crakers"+"\t\t\t"+"40.00");
	                        System.out.println("6.Parle_G"+"\t\t\t"+"30.00");
	                        System.out.println("7.Good_Day"+"\t\t\t"+"40.00");
	                        System.out.println("8.Happy_Happy"+"\t\t\t"+"40.00");
	                        System.out.println("9.Bourbon"+"\t\t\t"+"30.00");
	                        System.out.println("10.Hide_Seek"+"\t\t\t"+"40.00");

	                        System.out.print("Add your item : ");
	                        int c=sc.nextInt();
	                        fastFood(c);

	                    }
	                    else if("D".equals(UserInput)||"d".equals(UserInput)) {
	                        System.out.println("**********--Soups & Shampoo--**********");
	                        System.out.println("");
	                        System.out.println("1.Coalgate"+"\t\t\t"+"40.00");
	                        System.out.println("2.Oral_B"+"\t\t\t"+"50.00");
	                        System.out.println("3.Max_Fresh"+"\t\t\t"+"30.00");
	                        System.out.println("4.Patanjali"+"\t\t\t"+"40.00");
	                        System.out.println("5.Sibaca"+"\t\t\t"+"20.00");
	                        System.out.println("6.Harpic"+"\t\t\t"+"70.00");
	                        System.out.println("7.Surf_Exel"+"\t\t\t"+"70.00");
	                        System.out.println("8.Lysole"+"\t\t\t"+"60.00");
	                        System.out.println("9.Wheel"+"\t\t\t\t"+"50.00");
	                        System.out.println("10.Vim_Dishwasher"+"\t\t"+"60.00");
	                        System.out.println("11.Dettol"+"\t\t\t"+"20.00");
	                        System.out.println("12.Lifebuoy"+"\t\t\t"+"20.00");
	                        System.out.println("13.Santoor"+"\t\t\t"+"40.00");
	                        System.out.println("14.Lux"+"\t\t\t\t"+"30.00");
	                        System.out.println("15.Cinthol"+"\t\t\t"+"40.00");
	                        System.out.println("16.Vatika_Shampoo"+"\t\t"+"10.00");
	                        System.out.println("17.Dove_Shampoo"+"\t\t\t"+"10.00");
	                        System.out.println("18.Sunsilk_Shampoo"+"\t\t"+"10.00");
	                        System.out.println("19.ClinicPlus_Shampoo"+"\t\t"+"10.00");

	                        System.out.print("Add your item : ");
	                        int d=sc.nextInt();
	                        soapsShampo(d);

	                    }
	                    else if("E".equals(UserInput)||"e".equals(UserInput)) {
	                        System.out.println("**********--Oil & Sauce--**********");
	                        System.out.println("");
	                        System.out.println("1.SunFlower_Oil"+"\t\t\t"+"110.00");
	                        System.out.println("2.Olive_Oil"+"\t\t\t"+"105.00");
	                        System.out.println("3.Star_Oil"+"\t\t\t"+"115.00");
	                        System.out.println("4.Gemini_Oil"+"\t\t\t"+"110.00");
	                        System.out.println("5.Soya_Sauce"+"\t\t\t"+"20.00");
	                        System.out.println("6.Tomato_Sauce"+"\t\t\t"+"25.00");
	                        System.out.println("7.Chilli_Sauce"+"\t\t\t"+"30.00");

	                        System.out.print("Add your item : ");
	                        int e=sc.nextInt();
	                        oilnSauce(e);


	                    }
	                    else if("F".equals(UserInput)||"f".equals(UserInput)) {
	                        System.out.println("**********--Condiments & Spices--**********");
	                        System.out.println("");
	                        System.out.println("1.Sugar"+"\t\t\t\t"+"50.00");
	                        System.out.println("2.Salt"+"\t\t\t\t"+"10.00");
	                        System.out.println("3.Chilli_Powder"+"\t\t\t"+"80.00");
	                        System.out.println("4.Garlic_Paste"+"\t\t\t"+"10.00");
	                        System.out.println("5.Mohari"+"\t\t\t"+"20.00");
	                        System.out.println("6.Jire"+"\t\t\t\t"+"20.00");

	                        System.out.print("Add your item : ");
	                        int f=sc.nextInt();
	                        spicesnCondiment(f);

	                    }
	                    else {
	                        G=true;
	                    }
	                }while(!G);

	                sc.close();
	                System.out.println("************ Grocery Heaven *************");
	                System.out.println("--------------------------------------");
	                System.out.println("       Your Orders are:    ");
	                System.out.println("Product"+"\t\t"+"  Price"+"\t\t"+" Quantity");
	                System.out.println("\n"+order);
	                System.out.println("========================================");
	                System.out.println("          Your total bill= "+sum);
	                System.out.println("---------------------------------------");

	                if(sum>=1000 && sum<3000) {
	                    int dis=100-20;
	                    System.out.println("     * ||...20% Discount...|| *     ");
	                    System.out.println("");
	                    System.out.println("You have discount of RS "+(sum-((sum*dis)/100)));
	                    System.out.println("");
	                    System.out.println("Your Discounted Bill "+((sum*dis)/100));
	                    //System.out.println((sum*dis)/100);
	                }
	                else if(sum>=3000){
	                    int dis=100-30;
	                    System.out.println("     * ||...30% Discount...|| *     ");
	                    System.out.println("");
	                    System.out.println("Your Discount is         "+(sum-((sum*dis)/100)));
	                    System.out.println("");
	                    System.out.println("Your Discounted Bill     "+((sum*dis)/100));
	                }
	                else {
	                    System.out.println("Your Bill is under 1000...."+sum);
	                }

	                System.out.println("=========================================");
	                System.out.println("::::::: Thank you-Visit Again ::::::");
	            }

	        }





