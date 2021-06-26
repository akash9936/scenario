package Scenario;

public class StringManupulation {

	public static void main(String[] args) {
		String str ="My name is Akash Singh";
		String str1 ="My name is akash Singh";
		//1. to get the length of String
		System.out.println("Lenth of String is "+str.length());

		//2. to get the Char at certain Number
		int i=5;
		System.out.println("Char at "+i+" index is "+str.charAt(i));

		//3. Get the index of certain char from String
		char c= 'a';
		System.out.println("Char "+c+" at the position of " +str.indexOf(c));

		//4. Get the index of certain char from certain number of index (below example will check position of a in str after index value i=5)
		System.out.println("Char "+c+" at the position of "+str.indexOf(c, i));
		//5. below query will check 1st position of c='a' from srl no 3 and check 2nd position of c
		System.out.println("Char "+c+" at the position of "+str.indexOf(c, str.indexOf(c)+1));

		//6.index  of String value, if indexof value is not available in string than it will not through any error, it will return value as -1
		System.out.println("String value is at position of "+str.indexOf("is"));

		//7. String compare, it is case sensitive means upper latter and lower latter compare as 'a' is small in str 1 below query will return false
		System.out.println("Compare "+str+" and "+str1+ " and bollean return is "+str.equals(str1));

		//8. String compare and ignore case sensitive, below will return true
		System.out.println("Compare "+str+" and "+str1+ " and bollean return is "+str.equalsIgnoreCase(str1));

		//9. get the sub String
		System.out.println("get char between 2 to 9 is "+str.substring(2, 9));

		//10. trim: it will trim only starting or ending space of String
		String str2 ="                  Akash ";
		System.out.println("Trim value of str2 is "+str2.trim());

		//11. Replacing in String: Below query will replace A to B
		String str3="My self Akash Singh";
		System.out.println(" Replace value is "+str3.replace("A", "B"));
		//12. Below code will replace all the space
		System.out.println(" Remove all space and value is "+str3.replace(" ", ""));

		//13. Split: it will split string based on enter value, however we have to store in array as it will return multiple value based on Split
		String str4="My_Name_is_Akash_singh";
		//below code will split the above String based on _ and store in Array called str5.
		String str5[]=str4.split("_");
		for(int a=0;a<str5.length;a++) {
			System.out.println("str5 split value on index "+a+" is "+str5[a]);		
		}

		//Concat: Adding value to string 
		System.out.println("After concat Z to str4 value is " +str4.concat("Z"));


		//Adding String
		String str6="Akash";
		String str7="Singh";
		int e=100;
		int f=200;
		//below code will return AkashSingh as adding two string value
		System.out.println("Added value of String str6 and str7 is "+(str6+str7));
		//below code will return 300 as adding two int value
		System.out.println("Added value of int e and f is "+(e+f));
		//below code will add from left to right, so it will return as AkashSingh100200
		System.out.println("Added value of Str6, str7, e and f is "+(str6+str7+e+f));
		//if we add e and f first it will become 300 and add to other String
		System.out.println("Added int first than integer and value is "+(e+f+str6+str7));
		// Return value with bracket
		System.out.println("Added value with using bracket and vakue is "+(str6+str7+(e+f)));













	}
}
