package CreationalPatterns.Builder.Nutrition;

public class NutritionFactsInit {

    public static void main(String[] args) {
        NutritionFacts apple = new NutritionFacts.NutritionFactsBuilder(3, 7).withCalories(20).build();
        System.out.println(apple);

        NutritionFacts tomato = new NutritionFacts.NutritionFactsBuilder(2, 1).build();
        System.out.println(tomato);
    }
}
