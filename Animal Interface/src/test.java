import java.util.ArrayList;
/**
 * 
 * @author aagarwal19
 *
 */
public class test 
{

	public static void main(String[] args) 
	{
		Animal animal = new Animal('f');
		//this is not really needed because we do not care about instantiating the Animal class; we really only care about Dog and Bird
		Dog dog = new Dog('f');
		Bird bird = new Bird('m');
		
		Animal notSure = new Bird ('f');
		//does work because a bird is an animal
		//Bird debSays = new Animal('m');
		//does not work because an animal is not a bird
		
		
		ArrayList<Animal>myAnimals=new ArrayList<Animal>();
		myAnimals.add(dog);
		myAnimals.add(bird);
		myAnimals.add(notSure);
		myAnimals.add(animal);
	
		
		for(Animal anim: myAnimals)
		{
			System.out.println(anim.speak());
		}
	}

}
