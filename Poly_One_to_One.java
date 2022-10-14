package Single_to_Single;

//dependent object

public class Account {
	
	private int acid;
	private String branch;
	public Account(int acid,String branch){
		this.acid=acid;
		this.branch=branch;
	}
	public int getAcid() {
		return acid;
	}
	public String getBranch() {
		return branch;
	}
	

}

//target object

package Single_to_Single;

public class Student {
private int stid;
private String sname;
private Account a;
public Student(int stid,String sname,Account a) {
	this.stid=stid;
	this.sname=sname;
	this.a=a;
}
public void display() {
	System.out.println(stid);
	System.out.println(sname);
	System.out.println(a.getAcid());
	System.out.println(a.getBranch());
}

}


//checking it
 Today_work;

import Single_to_Single.*;

public class Testing2 {

	public static void main(String[] args) {
		Account a = new Account(1234,"gajwel");
		
		Student s = new Student(201,"vamshi",a);
		
		s.display();

	}

}
//result

201
vamshi
1234
gajwel


