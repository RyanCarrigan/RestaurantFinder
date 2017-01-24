import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantFinder
	{
	static ArrayList<Restaurant> restaurants = new ArrayList<Restaurant>();
	static boolean switcher=true;
	public static void main(String[] args)
		{
		Database.restaurantBase();
		introduction();
		fF();
		foodType();
//		addRestaurants();
		}
	public static void introduction()
		{
		System.out.println("Hello, welcome to restaurant finder. The purpose of this is to narrow down your options of restaurants until you find what that you like.");
		System.out.println();
		System.out.println("For each question you will be required to add input in the form of selecting one of the options. ");
		System.out.println("EX: What type of food do you want?");
		System.out.println("1) Breakfast");
		System.out.println("2) American");
		System.out.println("3) Mexican");
		System.out.println("4) Asian");
		System.out.println("5) Sushi");
		System.out.println("6) Pizza");
		System.out.println("7) Health");
		System.out.println();
		System.out.println("If I wanted asian food I would type 4 because that is the number that it is on the list. The program will throw out all restaurants that do not serve asian food.");
		}
	public static void foodType()
		{
		System.out.println();
		Scanner userInput2 = new Scanner(System.in);
		System.out.println("What type of food do you want?");
		System.out.println("1) American Food- burgers, fries, sandwiches");
		System.out.println("2) Mexican Food- tacos, burritos, baja");
		System.out.println("3) Asian Food- eggrolls, chow mein, fried rice");
		System.out.println("4) Breakfast Food- pancakes, sausage, eggs, breakfast burritos");
		System.out.println("5) Sushi- rolls, shashimi, sushi platers");
		System.out.println("6) Pizza- do you really need examples?");
		System.out.println("7) Health- salad, fruits, vegetables");
		int foodTypeChoice = userInput2.nextInt();
		String foodType = "";
		if (foodTypeChoice== 1)
			{
			foodType = "'American' ";
			}
		else if (foodTypeChoice == 2)
			{
			foodType = "'Mexican' ";
			}
		else if (foodTypeChoice == 3)
			{
			foodType = "'Asian' ";
			}
		else if (foodTypeChoice == 4)
			{
			foodType = "'Breakfast' ";
			}
		else if (foodTypeChoice == 5)
			{
			foodType = "'Sushi' ";
			}
		else if (foodTypeChoice == 6)
			{
			foodType = "'Pizza' ";
			}
		else 
			{
			foodType = "'Health' ";
			}
		System.out.println(foodType);
		System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s", "-------------------------------", "------------------------------", "------------------------------", "------------------------------", "------------------------------", "------------------------------");
		System.out.println();
		System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s", "| Name ", "| Type of Food ", "| Average Wait Time ", "| Service Rating ", "| Average Price ", "| Fast Food? (true = yes)     |");
		System.out.println();
		System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s", "-------------------------------", "------------------------------", "------------------------------", "------------------------------", "------------------------------", "------------------------------");
		System.out.println();
		for (Restaurant r: restaurants)
			{
			if (r.getTypeOfFood().equals(foodType)&&r.isFastFood==switcher) 
				{
				System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s", "| " +r.getName(),  "| " +r.getTypeOfFood(),  "| " +r.getWaitTime(),  "| " +r.getServiceRate(),  "| " +r.getPrice(),  "| " +r.isFastFood()+ "                       |");
				System.out.println();
				}
			}
		System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s", "-------------------------------", "------------------------------", "------------------------------", "------------------------------", "------------------------------", "------------------------------");
		System.out.println();
		}
	public static void fF()
		{
		Scanner userInput3 = new Scanner(System.in);
		System.out.println();
		System.out.println("Do you want fast food?");
		System.out.println("Yes) I do want fast food.");
		System.out.println("No) I don't want fast food.");
		String fastFood = userInput3.nextLine();
		boolean fF = true;
		if (fastFood.equals("Yes"))
			{
			switcher = true;
			fF = true;
			System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s", "-------------------------------", "------------------------------", "------------------------------", "------------------------------", "------------------------------", "------------------------------");
			System.out.println();
			System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s", "| Name ", "| Type of Food ", "| Average Wait Time ", "| Service Rating ", "| Average Price ", "| Fast Food? (true = yes)     |");
			System.out.println();
			System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s", "-------------------------------", "------------------------------", "------------------------------", "------------------------------", "------------------------------", "------------------------------");
			System.out.println();
			for (Restaurant r: restaurants)
				{
				if (r.isFastFood() == true )
					{
					System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s", "| " +r.getName(),  "| " +r.getTypeOfFood(),  "| " +r.getWaitTime(),  "| " +r.getServiceRate(),  "| " +r.getPrice(),  "| " +r.isFastFood()+ "                        |");
					System.out.println();
					}
				}
			System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s", "-------------------------------", "------------------------------", "------------------------------", "------------------------------", "------------------------------", "------------------------------");
			System.out.println();
			}
		else 
			{
			fF = false;
			switcher=false;
			System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s", "-------------------------------", "------------------------------", "------------------------------", "------------------------------", "------------------------------", "------------------------------");
			System.out.println();
			System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s", "| Name ", "| Type of Food ", "| Average Wait Time ", "| Service Rating ", "| Average Price ", "| Fast Food? (true = yes)     |");
			System.out.println();
			System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s", "-------------------------------", "------------------------------", "------------------------------", "------------------------------", "------------------------------", "------------------------------");
			System.out.println();
			for (Restaurant r: restaurants)
				{
				if (r.isFastFood() != true )
					{
					System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s", "| " +r.getName(),  "| " +r.getTypeOfFood(),  "| " +r.getWaitTime(),  "| " +r.getServiceRate(),  "| " +r.getPrice(),  "| " +r.isFastFood()+ "                       |");
					System.out.println();
					}
				}
			System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s", "-------------------------------", "------------------------------", "------------------------------", "------------------------------", "------------------------------", "------------------------------");
			System.out.println();
			}
		}
	public static void addRestaurants()
		{
		System.out.println();
		Scanner userInput2 = new Scanner(System.in);
		System.out.println("We always want to add more restauraunts to our data base.");
		System.out.println("Do you have a restaurant you would like to add?");
		System.out.println("1) Yes");
		System.out.println("2) No");
		int add = userInput2.nextInt();
		if (add == 1)
			{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Thank you for your help, please type the name of the restaurant and the type of food they serve.");
			String newRestaurant = userInput.nextLine();
			}
		else if (add == 2)
			{
			System.out.println("Thank you for using our restaurant finder. Think of some new restaurants next time so we can add to the expierience of others.");
			}
		}

	}
