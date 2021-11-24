
public abstract class Animal 
{
private char gender;

public Animal (char gen)
{
	gender = gen;
}
public String speak()
{
	return "speak";
}
//this speak method really does not serve a purpose because you will override it anyway

	public abstract String speak();
	//abstract method; notice that there is a SEMICOLON; this says if you are going to extend me, you need a speak method; now a speak method exists in any animal; cannot instantiate the Animal class though, so we will use abstract in the method header to create an abstract class and make it impossible to instantiate
}
