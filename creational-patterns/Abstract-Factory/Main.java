public class Main {
    public static void main(String[] args) {
        System.out.println("1. Testing client code with the first factory type...");
        ClientMethod(new VictorianFurnitureFactory());

        System.out.println("2. Testing the same client code with the secode facotry type...");
        ClientMethod(new ModernFurnitureFactory());

    }

    public static void ClientMethod(IFurnitureFactory factory) {
        IChair chairProduct = factory.CreateChair();
        System.out.println(chairProduct.SitOn());

        ICoffeeTable tableProduct = factory.CreateCoffeeTable();
        System.out.println(tableProduct.SomeUsefulFunction());
    }
}