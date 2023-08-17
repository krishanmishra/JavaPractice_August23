package stringproblems;

public class TestB  extends Test1 {
//	   @Override
	   //The method testMethod(Integer) of type TestB must override or implement a supertype method
	    void testMethod(Integer a) {
	        System.out.println("b");
	    }
	    
	    public static void main(String[] args) {
	    	TestB aa=new TestB();
	    	aa.testMethod(10);
	    }
	}


