package GroceryManagement2;


	import java.util.Scanner;

	public class Grocerry_sections_prices {
	    static Scanner sc = new Scanner(System.in);
	    static int  Tur_Dal=120,Mug_Dal=120,Masur_Dal=120,Harbhara_Dal=140,Udit_Dal=100,Chana_Dal=100,Vatana_Dal=120,Paneer=90,Yoghurt=50,Butter_Milk=60,Milk=80,Cheese=100,Eggs=10,Otas=50,Butter=120,Gulab_Jamun=90,Rabadi=100,Shri_khand=120,Amra_Khand=140,Fruit_Khand=150;
	    static int  SunFlower_Oil=110,Olive_Oil=105,Star_Oil=115,Gemini_Oil=110,Soya_Sauce=20,Tomato_Sauce=25,Chilli_Sauce=30,Sugar=50,Salt=10,Chilli_Powder=80,Garlic_Paste=10,Mohari=20,Jire=20,Coalgate=40,Oral_B=50,Max_Fresh=30,Patanjali=40,Sibaca=20,Harpic=70,Surf_Exel=70,Lysole=60,Wheel=50,Vim_Dishwasher=60;
	    static int Candy=50,Chocolate=60,Chips=50,Coconut_Cookies=40,Crakers=40,Parle_G=30,Good_Day=40,Happy_Happy=40,Bourbon=30,Hide_Seek=40,Dettol=20,Lifebuoy=20,Santoor=40,Lux=30,Cinthol=40,Vatika_Shampoo=10,Dove_Shampoo=10,Sunsilk_Shampoo=10,ClinicPlus_Shampoo=10;
	    static Boolean G=false;
	    static int sum=0;
	    static String order="";
	    static int qty;

	    public static void grains(int a){
	        switch(a)
	        {
	            case 1:System.out.println("How much Tur_Dal You Want?");
	                qty=sc.nextInt();
	                System.out.println("Tur_Dal ");
	                sum=sum+Tur_Dal*qty;
	                order=order.concat("Tur_Dal"+"\t\t"+" 120 rs "+"\t\t"+qty+"\n");
	                break;

	            case 2:System.out.println("How much Mug_Dal You Want?");
	                qty=sc.nextInt();
	                System.out.println("Mug_Dal");
	                sum=sum+Mug_Dal*qty;
	                order=order.concat("Mug_Dal"+"\t\t"+" 120 rs "+"\t\t"+qty+"\n");
	                break;

	            case 3:System.out.println("How much Masur_Dal You Want?");
	                qty=sc.nextInt();
	                System.out.println("Masur_Dal");
	                sum=sum+Masur_Dal*qty;
	                order=order.concat("Masur_Dal"+"\t"+" 120 rs "+"\t\t"+qty+"\n");
	                break;

	            case 4:System.out.println("How much Harbhara_Dal You Want?");
	                qty=sc.nextInt();
	                System.out.println("Harbhara_Dal");
	                sum=sum+Harbhara_Dal*qty;
	                order=order.concat("Harbhara_Dal"+"\t"+" 140 rs "+"\t\t"+qty+"\n");
	                break;

	            case 5:System.out.println("How much Udit_Dal You Want?");
	                qty=sc.nextInt();
	                System.out.println("Udit_Dal");
	                sum=sum+Udit_Dal*qty;
	                order=order.concat("Udit_Dal"+"\t"+" 100 rs "+"\t\t"+qty+"\n");
	                break;

	            case 6:System.out.println("How much Chana_Dal You Want?");
	                qty=sc.nextInt();
	                System.out.println("Chana_Dal");
	                sum=sum+Chana_Dal*qty;
	                order=order.concat("Chana_Dal"+"\t"+" 100 rs "+"\t\t"+qty+"\n");
	                break;

	            case 7:System.out.println("How much Vatana_Dal You Want?");
	                qty=sc.nextInt();
	                System.out.println("Vatana_Dal");
	                sum=sum+Vatana_Dal*qty;
	                order=order.concat("Vatana_Dal"+"\t"+" 120 rs "+"\t\t"+qty+"\n");
	                break;

	            default:
	                System.out.println("Please select valid option....");

	        }
	    }
	    public static void dairy(int b){
	        switch(b)
	        {
	            case 1:System.out.println("How much Paneer You want?");
	                qty=sc.nextInt();
	                System.out.println("Paneer");
	                sum=sum+Paneer*qty;
	                order=order.concat("Paneer"+"\t\t"+" 90 rs "+"\t\t\t"+qty+"\n");
	                break;

	            case 2:System.out.println("How much Yoghurt You Want?");
	                qty=sc.nextInt();
	                System.out.println("Yoghurt");
	                sum=sum+Yoghurt*qty;
	                order=order.concat("Yoghurt"+"\t\t"+" 50 rs "+"\t\t\t"+qty+"\n");
	                break;

	            case 3:System.out.println("How much Butter_Milk you Want?");
	                qty=sc.nextInt();
	                System.out.println("Butter_Milk");
	                sum=sum+Butter_Milk*qty;
	                order=order.concat("Butter_Milk"+"\t"+" 60 rs "+"\t\t\t"+qty+"\n");
	                break;

	            case 4:System.out.println("How much Milk You Want?");
	                qty=sc.nextInt();
	                System.out.println("Milk");
	                sum=sum+Milk*qty;
	                order=order.concat("Milk"+"\t\t"+" 80 rs "+"\t\t\t"+qty+"\n");
	                break;

	            case 5:System.out.println("How much Cheese You Want?");
	                qty=sc.nextInt();
	                System.out.println("Cheese");
	                sum=sum+Cheese*qty;
	                order=order.concat("Cheese"+"\t\t"+" 100 rs "+"\t\t"+qty+"\n");
	                break;

	            case 6:System.out.println("How much Eggs You Want?");
	                qty=sc.nextInt();
	                System.out.println("Eggs");
	                sum=sum+Eggs*qty;
	                order=order.concat("Eggs"+"\t\t"+" 10 rs "+"\t\t\t"+qty+"\n");
	                break;

	            case 7:System.out.println("How much Otas You Want?");
	                qty=sc.nextInt();
	                System.out.println("Otas");
	                sum=sum+Otas*qty;
	                order=order.concat("Otas"+"\t\t"+" 50 rs "+"\t\t\t"+qty+"\n");
	                break;

	            case 8:System.out.println("How much Butter You Want?");
	                qty=sc.nextInt();
	                System.out.println("Butter");
	                sum=sum+Butter*qty;
	                order=order.concat("Butter"+"\t\t"+" 120 rs "+"\t\t"+qty+"\n");
	                break;

	            case 9:System.out.println("How much Gulab_Jamun You Want?");
	                qty=sc.nextInt();
	                System.out.println("Gulab_Jamun");
	                sum=sum+Gulab_Jamun*qty;
	                order=order.concat("Gulab_Jamun"+"\t"+" 90 rs "+"\t\t\t"+qty+"\n");
	                break;

	            case 10:System.out.println("How much Rabadi You Want?");
	                qty=sc.nextInt();
	                System.out.println("Rabadi");
	                sum=sum+Rabadi*qty;
	                order=order.concat("Rabadi"+"\t\t"+" 100 rs "+"\t\t"+qty+"\n");
	                break;

	            case 11:System.out.println("How much Shri_Khand You Want?");
	                qty=sc.nextInt();
	                System.out.println("Shri_Khand");
	                sum=sum+Shri_khand*qty;
	                order=order.concat("Shri_khand"+"\t"+" 120 rs "+"\t\t"+qty+"\n");
	                break;

	            case 12:System.out.println("How much Amra_Khand You Want?");
	                qty=sc.nextInt();
	                System.out.println("Amra_Khand");
	                sum=sum+Amra_Khand*qty;
	                order=order.concat("Amra_Khand"+"\t"+" 140 rs "+"\t\t"+qty+"\n");
	                break;

	            case 13:System.out.println("How much Fruit_Khand You Want?");
	                qty=sc.nextInt();
	                System.out.println("Fruit_Khand");
	                sum=sum+Fruit_Khand*qty;
	                order=order.concat("Fruit_Khand"+"\t"+" 150 rs "+"\t\t"+qty+"\n");
	                break;

	            default :
	                System.out.println("Please select valid option....");
	        }

	    }
	    public static void fastFood(int c){
	        switch(c)
	        {
	            case 1:System.out.println("How much Candy You want?");
	                qty=sc.nextInt();
	                System.out.println("Candy");
	                sum=sum+Candy*qty;
	                order=order.concat("Candy"+"\t\t"+" 50 rs "+"\t\t\t"+qty+"\n");
	                break;

	            case 2:System.out.println("How much Chocolate You Want?");
	                qty=sc.nextInt();
	                System.out.println("Chocolate");
	                sum=sum+Chocolate*qty;
	                order=order.concat("Chocolate"+"\t"+" 60 rs "+"\t\t\t"+qty+"\n");
	                break;

	            case 3:System.out.println("How much Chips you Want?");
	                qty=sc.nextInt();
	                System.out.println("Chips");
	                sum=sum+Chips*qty;
	                order=order.concat("Chips"+"\t\t"+" 50rs "+"\t\t\t"+qty+"\n");
	                break;

	            case 4:System.out.println("How much Coconut_Cookies You Want?");
	                qty=sc.nextInt();
	                System.out.println("Coconut_Cookies");
	                sum=sum+Coconut_Cookies*qty;
	                order=order.concat("Coconut_Cookies"+"\t"+" 40 rs "+"\t\t\t"+qty+"\n");
	                break;

	            case 5:System.out.println("How much Crakers You Want?");
	                qty=sc.nextInt();
	                System.out.println("Crakers");
	                sum=sum+Crakers*qty;
	                order=order.concat("Crakers"+"\t\t"+" 40 rs "+"\t\t\t"+qty+"\n");
	                break;

	            case 6:System.out.println("How much Parle_G You Want?");
	                qty=sc.nextInt();
	                System.out.println("Parle_G");
	                sum=sum+Parle_G*qty;
	                order=order.concat("Parle_G"+"\t\t"+" 30 rs "+"\t\t\t"+qty+"\n");
	                break;

	            case 7:System.out.println("How much Good_Day You Want?");
	                qty=sc.nextInt();
	                System.out.println("Good_Day");
	                sum=sum+Good_Day*qty;
	                order=order.concat("Good_Day"+"\t"+" 40 rs "+"\t\t\t"+qty+"\n");
	                break;

	            case 8:System.out.println("How much Happy_Happy You Want?");
	                qty=sc.nextInt();
	                System.out.println("Happy_Happy");
	                sum=sum+Happy_Happy*qty;
	                order=order.concat("Happy_Happy"+"\t"+" 40 rs "+"\t\t\t"+qty+"\n");
	                break;

	            case 9:System.out.println("How much Bourbon You Want?");
	                qty=sc.nextInt();
	                System.out.println("Bourbon");
	                sum=sum+Bourbon*qty;
	                order=order.concat("Bourbon"+"\t\t"+" 30 rs "+"\t\t\t"+qty+"\n");
	                break;

	            case 10:System.out.println("How much Hide_Seek You Want?");
	                qty=sc.nextInt();
	                System.out.println("Hide_Seek");
	                sum=sum+Hide_Seek*qty;
	                order=order.concat("Hide_Seek"+"\t"+" 40 rs "+"\t\t\t"+qty+"\n");
	                break;


	            default :
	                System.out.println("Please select valid option....");
	        }
	    }
	    public static void soapsShampo(int d){
	        switch(d)
	        {
	            case 1:System.out.println("How many Coalgate You want?");
	                qty=sc.nextInt();
	                System.out.println("Coalgate");
	                sum=sum+Coalgate*qty;
	                order=order.concat("Coalgate"+"\t"+" 40 rs "+"\t\t\t"+qty+"\n");
	                break;

	            case 2:System.out.println("How much Oral_B You Want?");
	                qty=sc.nextInt();
	                System.out.println("Oral_B");
	                sum=sum+Oral_B*qty;
	                order=order.concat("Oral_B"+"\t\t"+" 50 rs "+"\t\t\t"+qty+"\n");
	                break;

	            case 3:System.out.println("How  much Max_Frash You want?");
	                qty=sc.nextInt();
	                System.out.println("Max_Fresh");
	                sum=sum+Max_Fresh*qty;
	                order=order.concat("Max_Fresh"+"\t"+" 30 rs "+"\t\t\t"+qty+"\n");
	                break;

	            case 4:System.out.println("How much Patanjali you Want?");
	                qty=sc.nextInt();
	                System.out.println("Patanjali");
	                sum=sum+Patanjali*qty;
	                order=order.concat("Patanjali"+"\t"+" 40 rs "+"\t\t\t"+qty+"\n");
	                break;

	            case 5:System.out.println("How much Sibaca You Want?");
	                qty=sc.nextInt();
	                System.out.println("Sibaca");
	                sum=sum+Sibaca*qty;
	                order=order.concat("Sibaca"+"\t\t"+" 20 rs "+"\t\t\t"+qty+"\n");
	                break;

	            case 6:System.out.println("How much Harpic You Want?");
	                qty=sc.nextInt();
	                System.out.println("Harpic");
	                sum=sum+Harpic*qty;
	                order=order.concat("Harpic"+"\t\t"+" 70 rs "+"\t\t\t"+qty+"\n");
	                break;

	            case 7:System.out.println("How much Surf_Exel You Want?");
	                qty=sc.nextInt();
	                System.out.println("Surf_Exel");
	                sum=sum+Surf_Exel*qty;
	                order=order.concat("Surf_Exel"+"\t"+" 70 rs "+"\t\t\t"+qty+"\n");
	                break;

	            case 8:System.out.println("How much Lysole You Want?");
	                qty=sc.nextInt();
	                System.out.println("Lysole");
	                sum=sum+Lysole*qty;
	                order=order.concat("Lysole"+"\t\t"+" 60 rs "+"\t\t\t"+qty+"\n");
	                break;

	            case 9:System.out.println("How much Wheel You Want?");
	                qty=sc.nextInt();
	                System.out.println("Wheel");
	                sum=sum+Wheel*qty;
	                order=order.concat("Wheel"+"\t\t"+" 50 rs "+"\t\t\t"+qty+"\n");
	                break;

	            case 10:System.out.println("How much Vim_Dishwasher You Want?");
	                qty=sc.nextInt();
	                System.out.println("Vim_Dishwasher");
	                sum=sum+Vim_Dishwasher*qty;
	                order=order.concat("Vim_Dishwasher"+"\t"+" 60 rs "+"\t\t\t"+qty+"\n");
	                break;

	            case 11:System.out.println("How much Dettol You Want?");
	                qty=sc.nextInt();
	                System.out.println("Dettol");
	                sum=sum+Dettol*qty;
	                order=order.concat("Dettol"+"\t\t"+" 20 rs "+"\t\t\t"+qty+"\n");
	                break;

	            case 12:System.out.println("How much Lifebuoy You Want?");
	                qty=sc.nextInt();
	                System.out.println("Lifebuoy");
	                sum=sum+Lifebuoy*qty;
	                order=order.concat("Lifebuoy"+"\t"+" 20 rs "+"\t\t\t"+qty+"\n");
	                break;

	            case 13:System.out.println("How much Santoor You Want?");
	                qty=sc.nextInt();
	                System.out.println("Santoor");
	                sum=sum+Santoor*qty;
	                order=order.concat("Santoor"+"\t\t"+" 40 rs "+"\t\t\t"+qty+"\n");
	                break;

	            case 14:System.out.println("How much Lux You Want?");
	                qty=sc.nextInt();
	                System.out.println("Lux");
	                sum=sum+Lux*qty;
	                order=order.concat("Lux"+"\t\t"+" 30 rs "+"\t\t\t"+qty+"\n");
	                break;

	            case 15:System.out.println("How much Cinthol You Want?");
	                qty=sc.nextInt();
	                System.out.println("Cinthol");
	                sum=sum+Cinthol*qty;
	                order=order.concat("Cinthol"+"\t\t"+" 40 rs "+"\t\t\t"+qty+"\n");
	                break;

	            case 16:System.out.println("How much Vatika_Shampoo You Want?");
	                qty=sc.nextInt();
	                System.out.println("Vatika_Shampoo");
	                sum=sum+Vatika_Shampoo*qty;
	                order=order.concat("Vatika_Shampoo"+"\t"+" 10 rs "+"\t\t\t"+qty+"\n");
	                break;

	            case 17:System.out.println("How much Dove_Shampoo You Want?");
	                qty=sc.nextInt();
	                System.out.println("Dove_Shampoo");
	                sum=sum+Dove_Shampoo*qty;
	                order=order.concat("Dove_Shampoo"+"\t"+" 10 rs "+"\t\t\t"+qty+"\n");
	                break;

	            case 18:System.out.println("How much Sunsilk_Shampoo You Want?");
	                qty=sc.nextInt();
	                System.out.println("Sunsilk_Shampoo");
	                sum=sum+Sunsilk_Shampoo*qty;
	                order=order.concat("Sunsilk_Shampoo"+"\t"+" 10 rs "+"\t\t\t"+qty+"\n");
	                break;

	            case 19:System.out.println("How much ClinicPlus_Shampoo You Want?");
	                qty=sc.nextInt();
	                System.out.println("ClinicPlus_Shampoo");
	                sum=sum+ClinicPlus_Shampoo*qty;
	                order=order.concat("ClinicPlus"+"\t"+" 10 rs "+"\t\t\t"+qty+"\n");
	                break;

	            default :
	                System.out.println("Please select valid option....");

	        }
	    }
	    public static void oilnSauce(int e){
	        switch(e)
	        {
	            case 1:System.out.println("How much  SunFlower_Oil You Want?");
	                qty=sc.nextInt();
	                System.out.println("SunFlower_Oil");
	                sum=sum+SunFlower_Oil*qty;
	                order=order.concat("SunFlower_Oil"+"\t"+" 110 rs "+"\t\t"+qty+"\n");
	                break;

	            case 2:System.out.println("How much Olive_Oil You Want?");
	                qty=sc.nextInt();
	                System.out.println("Olive_Oil");
	                sum=sum+Olive_Oil*qty;
	                order=order.concat("Olive_Oil"+"\t"+" 105 rs "+"\t\t"+qty+"\n");
	                break;

	            case 3:System.out.println("How much Star_Oil you Want?");
	                qty=sc.nextInt();
	                System.out.println("Star_Oil");
	                sum=sum+Star_Oil*qty;
	                order=order.concat("Star_Oil"+"\t"+" 115 rs "+"\t\t"+qty+"\n");
	                break;

	            case 4:System.out.println("How much Gemini_Oil You Want?");
	                qty=sc.nextInt();
	                System.out.println("Gemini_Oil");
	                sum=sum+Gemini_Oil*qty;
	                order=order.concat("Gemini_Oil"+"\t"+" 110 rs "+"\t\t"+qty+"\n");
	                break;

	            case 5:System.out.println("How much Soya_Sauce You Want?");
	                qty=sc.nextInt();
	                System.out.println("Soya_Sauce");
	                sum=sum+Soya_Sauce*qty;
	                order=order.concat("Soya_Sauce"+"\t"+" 20 rs "+"\t\t\t"+qty+"\n");
	                break;

	            case 6:System.out.println("How much Tomato_Sauce You Want?");
	                qty=sc.nextInt();
	                System.out.println("Tomato_Sauce");
	                sum=sum+Tomato_Sauce*qty;
	                order=order.concat("Tomato_Sauce"+"\t"+" 25 rs "+"\t\t\t"+qty+"\n");
	                break;

	            case 7:System.out.println("How much Chilli_Sauce You Want?");
	                qty=sc.nextInt();
	                System.out.println("Chilli_Sauce");
	                sum=sum+Chilli_Sauce*qty;
	                order=order.concat("Chilli_Sauce"+"\t"+" 30 rs "+"\t\t\t"+qty+"\n");
	                break;


	            default :
	                System.out.println("Please select valid option....");
	        }
	    }
	    public static void spicesnCondiment(int f){
	        switch(f)
	        {
	            case 1:System.out.println("How much  Sugar You Want?");
	                qty=sc.nextInt();
	                System.out.println("Sugar");
	                sum=sum+Sugar*qty;
	                order=order.concat("Sugar"+"\t\t"+" 50 rs "+"\t\t\t"+qty+"\n");
	                break;

	            case 2:System.out.println("How much Salt You Want?");
	                qty=sc.nextInt();
	                System.out.println("Salt");
	                sum=sum+Salt*qty;
	                order=order.concat("Salt"+"\t\t"+" 10 rs "+"\t\t\t"+qty+"\n");
	                break;

	            case 3:System.out.println("How much Chilli_Powder you Want?");
	                qty=sc.nextInt();
	                System.out.println("Chilli_Powder");
	                sum=sum+Chilli_Powder*qty;
	                order=order.concat("Chilli_Powder"+"\t"+" 80 rs "+"\t\t\t"+qty+"\n");
	                break;

	            case 4:System.out.println("How much Garlic_Paste You Want?");
	                qty=sc.nextInt();
	                System.out.println("Garlic_Paste");
	                sum=sum+Garlic_Paste*qty;
	                order=order.concat("Garlic_Paste"+"\t"+" 10 rs "+"\t\t\t"+qty+"\n");
	                break;

	            case 5:System.out.println("How much Mohari You Want?");
	                qty=sc.nextInt();
	                System.out.println("Mohari");
	                sum=sum+Mohari*qty;
	                order=order.concat("Mohari"+"\t\t"+" 20 rs "+"\t\t\t"+qty+"\n");
	                break;

	            case 6:System.out.println("How much Jire You Want?");
	                qty=sc.nextInt();
	                System.out.println("Jire");
	                sum=sum+Jire*qty;
	                order=order.concat("Jire"+"\t\t"+" 20 rs "+"\t\t\t"+qty+"\n");
	                break;
	        }
	    }
	}

