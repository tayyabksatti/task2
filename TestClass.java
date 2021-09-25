package firstProject;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestClass {
	
	@SuppressWarnings("null")
	@Test
	void test() {
		Customer a=new Customer("tayyab","111","222","Islamabad");
		Account object=new Account("saving",4500,a);
		object.makeDeposite(1000);
		assertEquals(5500,object.getBal());
	}	
	void test1() {
		Customer a=new Customer("tayyab","111","222","Islamabad");
		Account object=new Account("saving",4500,a);
		object.transferAmount(3000);
		assertEquals(1500,object.getBal());
	}
	void test2() {
		Customer a=new Customer("tayyab","111","222","Islamabad");
		Account object=new Account("saving",4500,a);
		object.Withdrawl(2200);
		assertEquals(2300,object.getBal());
	}
}
