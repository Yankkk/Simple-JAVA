//UIUC CS125 SPRING 2014 MP. File: Person.java, CS125 Project: Challenge6-RecursionSee, Version: 2014-04-04T10:07:33-0500.044234000
/**
 * @author yangeng2
 * 
 */
public class Person {
	private final String name;
	private final int age;
	private final char gender;
	private final Person child1; // left child
	private final Person child2; // right child

	public Person(String name, int age, char gender, Person c1, Person c2) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.child1 = c1;
		this.child2 = c2;
	}

	public String toString() {
		return name + "*" + age + "*" + gender;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	public boolean equals(Person p) {
		return (this.name.equals(p.name)) && (this.age == p.age)
				&& (this.gender == p.gender);
	}

	public void print() {
		System.out.println(this);
		if (child1 != null)
			child1.print();
		if (child2 != null)
			child2.print();

	}

	public int count() // total person count including this object
	{
		int count = 0;
		if (child1 != null)
			count += child1.count();

		if (child2 != null)
			count += child2.count();

		return 1 + count;

	}

	public int countGrandChildren() {
		return countGrandChildren(0);
	}

	public int countGrandChildren(int depth) // but not greatGrandChildren
	{
		int count = 0;

		if (depth < 2) {

			if (child1 != null) {
				if (depth == 1)
					count++;

				count += child1.countGrandChildren(depth + 1);

			}
			if (child2 != null) {
				if (depth == 1)
					count++;

				count += child2.countGrandChildren(depth + 1);

			}
		}
		return count;

	}

	public int countMaxGenerations() {
		return countMaxGenerations(1);
	}

	public int countMaxGenerations(int n) {
		if (child1 == null)
			return n;
		if (child2 == null)
			return n;
		else {
			int left = child1.countMaxGenerations(n + 1);
			int right = child2.countMaxGenerations(n + 1);
			if (left > right)
				return left;
			return right;
		}
	}

	public int countGender(char gen) {
		int count = 0;
		if (gen == gender)
			count++;
		if (child1 != null)
			count += child1.countGender(gen);
		if (child2 != null)
			count += child2.countGender(gen);
		return count;
	}

	public Person search(String name, int maxGeneration) {
		Person p = null;
		if(p == null && this.name.equals(name))
			return this;
		
		if((child1 == null && child2 == null) || maxGeneration == 0)
		{
			if(this.name.equals(name))
			return this;
			else
			return null;		
		}
		if((child1 != null || child2 != null) && maxGeneration !=0)
		{
			 if(child2 == null)
			{
				 p = child1.search(name, maxGeneration-1);
				if(p !=null && p.name.equals(name))
				return p;
			}
			 else if(child1 == null)
				{
				 p = child2.search(name, maxGeneration-1);
				if(p !=null && p.name.equals(name))
					return p;
				}
			
			else
			{
				p = child2.search(name, maxGeneration-1);
				if(p !=null && p.name.equals(name))
				return p;
				
				p = child1.search(name, maxGeneration-1);
				if(p !=null && p.name.equals(name))
				return p;
			
			}
		
		}
	return p;
	}
} // end of class
