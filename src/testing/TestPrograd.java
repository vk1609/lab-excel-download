package testing;

import org.junit.Test;

import model.Prograd;

import static org.junit.Assert.*;

public class TestPrograd {
	Prograd pro = new Prograd ("Ravi","065","4","Likely","No comments");
	
	@Test
	public void testSetMethods() {
		Prograd pro = new Prograd ("Ravi","065","4","Likely","No comments");
		String name = "Ravi";
		String id = "065";
		String rate = "4";
		String recommand = "Likely";
		String comment = "No comments";
		pro.setName("Ravi");
		pro.setId("065");
		pro.setRate("4");
		pro.setRecommand("Likely");
		pro.setComment("No comments");
		assertEquals(name,pro.getName());
		assertEquals(id,pro.getId());
		assertEquals(rate,pro.getRate());
		assertEquals(recommand,pro.getRecommand());
		assertEquals(comment,pro.getComment());
		
		try {
			pro.setName(null);
			pro.setId(null);
			pro.setRate(null);
			pro.setRecommand(null);
			pro.setComment(null);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
