// Write a java application with a non-static method that will accept a character (a-z or
// A-Z) and print if that character is vowel or consonant, if we supply other than (a-z or
// A-Z) then that method should print the error message.
// Call the above method from the main method of the same class 3 times:
// first time by supplying a vowel
// second time by supplying a consonant
// third time by supplying an invalid character


package TheoryPractice;

public class CharacterChecker {

	void fun1(char ch) {
		ch = Character.toLowerCase(ch);
		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.println(ch+ " is a vowel");
			}else {
				System.out.println(ch + " is a consonant");
			}
		}else {
			System.out.println("Invalid Input");
		}
	}

	public static void main(String[] args) {
		CharacterChecker d1 = new CharacterChecker();
		d1.fun1('a');
		d1.fun1('b');
		d1.fun1('1');
	}

}
// Output:
// a is a vowel
// b is a consonant
// Invalid Input


// The checkCharacter method accepts a character as a parameter (ch) and checks whether it's a vowel or consonant.
// It first converts the character to lowercase to make the check case-insensitive.
// If the character is within the range 'a' to 'z' or 'A' to 'Z', it checks whether it's a vowel (a, e, i, o, u) or a consonant and prints the result.
// If the character is outside the valid range, it prints an error message indicating invalid input.
// In the main method, the checkCharacter method is called three times with different characters to demonstrate the functionality.

