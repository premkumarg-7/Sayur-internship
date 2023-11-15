import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		HashMap<Integer,String> list =new HashMap<>();
		list.put(1,"Idly");
		list.put(2,"yogurt rice");
		list.put(3,"Lemon rice");
		list.put(4,"Dosa");
		list.put(5,"Pongal");
		
		System.out.println(list);
		System.out.print("Enter the no which recipe you want :");
		Scanner sc= new Scanner(System.in);
		int input=sc.nextInt();
		
		HashMap<Integer,String> recipe=new HashMap<>();
		recipe.put(1,"Here’s a simple and easy recipe for idli:\n Ingredients: \n 1 cup of rice1/4 \n cup of urad dal \n 1/2 teaspoon of fenugreek \n seedsSalt to tasteWater as required");
	    recipe.put(2,"Here’s a simple recipe for yogurt rice:\n Ingredients: \n 1 cup of cooked rice \n 1/2 cup of plain yogurt \n 1/4 cup of milk \n 1/2 teaspoon of mustard seeds \n 1/2 teaspoon of urad dal \n 1/2 teaspoon of asafetida powder \n 1/2 teaspoon of salt \n 1 tablespoon of oil");
	    recipe.put(3,"Here’s a simple recipe for lemon rice: \n Ingredients: \n Rice, lemon juice, salt, oil, mustard seeds, peanuts, turmeric. \n Instructions: Cook rice. In a pan, heat oil and add mustard seeds, peanuts, and turmeric. Add lemon juice and salt. Mix with rice. \n This recipe is adapted. Enjoy your lemon rice! ");
	    recipe.put(4,"Here’s a simple recipe for dosa: \n Ingredients: \n Rice, urad dal, salt. \n Instructions: Soak rice and urad dal separately for 4 hours. Grind them together to make a smooth batter. Add salt to taste. Ferment the batter overnight. Spread the batter on a hot griddle and cook until crispy. \n This recipe is adapted. Enjoy your dosa!");
	    recipe.put(5,"Here’s a simple recipe for pongal: \n Ingredients: \n Rice, moong dal, ghee, cumin seeds, black pepper, ginger, curry leaves, asafoetida, salt. \n Instructions: In a pressure cooker, heat ghee and add cumin seeds, black pepper, ginger, curry leaves, and asafoetida. Add rice and moong dal and stir well. Add water and salt. Pressure cook for 10-12 minutes until the texture of thick porridge. \n This recipe is adapted from 1. Enjoy your pongal!");
	    
	    System.out.println(recipe.get(input));
	}
}

/*
Output :
{1=Idly, 2=yogurt rice, 3=Lemon rice, 4=Dosa, 5=Pongal}
Enter the no which recipe you want :3
Here’s a simple recipe for lemon rice: 
 Ingredients: 
 Rice, lemon juice, salt, oil, mustard seeds, peanuts, turmeric. 
 Instructions: Cook rice. In a pan, heat oil and add mustard seeds, peanuts, and turmeric. Add lemon juice and salt. Mix with rice. 
 This recipe is adapted from 1. Enjoy your lemon rice! 
*/
