

public class EquipmentTest{
	    public void emptyConstructorTest() throws AssertException
	    {   
	        Equipment equipment = new Equipment("Batarang/5,5.0,5.0,A boomerang for bats");
	 	       Assert.assertEquals("Batarang", equipment.getName());
	 	       Assert.assertEquals(5, equipment.getCount());
	 	       Assert.assertEquals(5.0, equipment.getTotalWeight(), 0.1);
	 	       Assert.assertEquals(5.0, equipment.getTotalPrice(), 0.1);
	 	       Assert.assertEquals("A boomerang for bats", equipment.getDescription());	 	       
	        
	    }
}