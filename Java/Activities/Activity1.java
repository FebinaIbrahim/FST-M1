package activities;

public class Activity1 {
	public static void main(String[] args)
	{
		Car Maruti=new Car("Blue","Manual",2020);
		Maruti.displaycharacteristics();
	
		System.out.println("Is Car Moving:"+Maruti.isMoving);
		
	
		Maruti.accelerate();
		System.out.println("Is Car Moving:"+Maruti.isMoving);
		
		Maruti.brake();
        System.out.println("Is Car Moving:"+Maruti.isMoving);
		
		
	}
	
}
