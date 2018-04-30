package edu.handong.csee.java.lab13.prob1; //package name

public class InstanceOf { //declare InstanceOf Class
	public static void distinguishFriend(Friend friend) { //declare distinguishFriend method
		if(friend instanceof ClassFriend) //if friend(parameter) inherits ClassFriend Class
			((ClassFriend)friend).printClassFriend(); //call typecasted friend Class's method
		else if(friend instanceof SchoolFriend) //if friend(parameter) inherits SchoolFriend Class
			((SchoolFriend)friend).printSchoolFriend(); //call typecasted friend Class's method
		else // rest case
			friend.printFriend(); //call friend's method
	}
	public static void main(String[] args) { //declare main method
		Friend friend1= new Friend(); //instantiate Friend Class to friend1(instance)
		SchoolFriend friend2= new SchoolFriend(); //instantiate SchoolFriend Class to friend2(instance)
		ClassFriend friend3= new ClassFriend(); //instantiate ClassFriend Class to friend3(instance)

		InstanceOf.distinguishFriend(friend1); //call InstanceOf's method(distinguishFriend(friend1))
		InstanceOf.distinguishFriend(friend2); //call InstanceOf's method(distinguishFriend(friend2))
		InstanceOf.distinguishFriend(friend3); //call InstanceOf's method(distinguishFriend(friend3))
	}
}
