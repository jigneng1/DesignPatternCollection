public class VictorianFurnitureFactory implements IFurnitureFactory {
    public VictorianFurnitureFactory() {
    }

    @Override
    public IChair CreateChair() {
        return new VictorianChair();
    }

    @Override
    public ICoffeeTable CreateCoffeeTable() {
        return new VictorianCoffeeTable();
    }
}
