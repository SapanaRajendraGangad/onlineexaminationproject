package collection;

import java.util.LinkedList;

class Emp{
	int id,sal;
	String name;
	Emp(int id,String name,int sal)
	{
	this. id=id;
	this.name=name;
	this.sal=sal;
	}
	Emp()
	{
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char[] get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
public class employeee1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList li=new LinkedList();
li.add(new Emp(1,"sdf",456));
li.add(new Emp(2,"ghj",890));
li.add(new Emp(3,"cvb",456));
li.add(new Emp(4,"xzs",217));
li.add(new Emp(5,"swer",456));
	
for(int i=0;i<li.size();i++)
{
	Emp e1=(Emp)li.get(i);
	for(int j=(i+1);j<li.size();j++)
	{
		Emp e2=(Emp)li.get(j);
		if(e1.getSal()==e2.getSal())
		{
			System.out.println(e1.get(i));
		}
	}
}
	}
}
