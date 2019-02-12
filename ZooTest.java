public class ZooTest {
	public void emptyConstructorTest() throws AssertException {
		Zoo zoo = new Zoo(0);
		//Assert.assertEquals(null, zoo.getAnimals());
		Assert.assertEquals(0, zoo.getCapacity());
		Assert.assertEquals(0.0, zoo.getTotalHeight());
		Assert.assertEquals(0, zoo.getAverageWeight());
		//Assert.assertEquals(0, zoo.getAverageWeight());

	}
}