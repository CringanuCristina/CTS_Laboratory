package ro.ase.csie.cts.g1093.dp.flyweight;

public class TestFlyweight {

	public static void main(String[] args) {
		ScreenData solider1 = new ScreenData(100,100,0,"Green");
		ScreenData solider2 = new ScreenData(100,50,0,"Blue");
		
		ScreenData building1 = new ScreenData(10,10,5,"Gray");
		ScreenData building2 = new ScreenData(10,10,5,"Dark Gray");
		
		Model3DInterface soliderModel  = ModelsFactory.getModel(ModelType.SOLIDER);
		soliderModel.display(solider1);
		soliderModel.display(solider2);
		
		ModelsFactory.getModel(ModelType.BUILDING).display(building1);
		ModelsFactory.getModel(ModelType.BUILDING).display(building2);

	}

}
