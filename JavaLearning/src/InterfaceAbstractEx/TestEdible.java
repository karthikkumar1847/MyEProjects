package InterfaceAbstractEx;

public class TestEdible {					
	  public static void main(String[] args) {
		  
		  
	    Object[] objects = {new Tiger(), new Chicken(), new Apple()};
	    
	    for (int i = 0; i < objects.length; i++) {
	      if (objects[i] instanceof Edible)
	        System.out.println(((Edible)objects[i]).howToEat());

	      if (objects[i] instanceof Animal) {
	        System.out.println(((Animal)objects[i]).sound());
	      }
	      if(objects[i] instanceof Fruit){
	    	  
	    	  System.out.println(((Fruit)objects[i]).health());
	      }
	    }
	  }
	}

