public class ModernFurnitureFactory implements IFurnitureFactory {
    public ModernFurnitureFactory() {
    }

    public IChair CreateChair() {
        return new ModernChair();
    }

    public ICoffeeTable CreateCoffeeTable() {
        return new ModernCoffeeTable();
    }
}
