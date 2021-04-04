class student{  
int rollno; //instance variable.
String name;  
float fee;  
student(int rollno,String name,float fee){  
this.rollno=rollno;  
this.name=name;  
this.fee=fee;  
System.out.println(this.rollno+" "+this.name+" "+this.fee);

}  


void display(){System.out.println(rollno+" "+name+" "+fee);
}
}  
