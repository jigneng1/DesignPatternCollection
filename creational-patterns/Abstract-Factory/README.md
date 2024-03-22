# Abstract Factory
Provide an interface for creating families of related or dependent objects without specifying their concrete classes

### Structure 
- **Abstract Product** </br> declare interfaces for a set of distinct but related products which make up a product family. ***( IChair, ICoffeeTable )***
- **Concrete Products** </br> are various implementations of abstract products, grouped by variants. Each **abstract product** must be implemented in all given variants ***(Victorian/Modern)***.
- **The Abstract Factory** </br> interface declares a set of methods for creating each of the abstract products ***(IFurnitureFacory)***.
- **Concrete Factories** </br> implement creation methods of the abstract factory. Each concrete factory corresponds to a specific variant of products and creates only those product variants. ***(ModernFurnitureFactory, VictorianFurnitureFactory)***
</br>

![UML diagram](https://github.com/jigneng1/DesignPatternCollection/assets/83826754/b1c3e3be-b86f-4192-b742-6b319b3525a0)
