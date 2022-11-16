package CreationalPatterns.Builder.Nutrition;

public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class NutritionFactsBuilder{
        //required params
        private final int servingSize;
        private final int servings;
        //optional params - initialized to default values
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public NutritionFactsBuilder(int servingSize, int servings){
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public NutritionFactsBuilder withCalories(int calories){
            this.calories = calories;
            return this;
        }

        public  NutritionFactsBuilder withFat(int fat){
            this.fat = fat;
            return this;
        }

        public NutritionFactsBuilder withCarbohydrate(int carbohydrate){
            this.carbohydrate = carbohydrate;
            return this;
        }

        public NutritionFactsBuilder withSodium(int sodium){
            this.sodium = sodium;
            return this;
        }

        public NutritionFacts build(){
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(NutritionFactsBuilder builder){
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.carbohydrate = builder.carbohydrate;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
    }

    @Override
    public String toString(){
        return "Serving Size: " + this.servingSize + " ,servings: " + this.servings + " ,calories: " + this.calories;
    }

}
