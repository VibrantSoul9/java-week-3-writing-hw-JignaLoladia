/**
 * Person
 * Write a class with the name Person.The Class need three fields (instance veriables) with the names
 * firstName, lastName of type String and age of type int.
 * Write the following methods (instance methods)
 * Method named getFirstName without any parameters, it needs to return the value of the firstName field
 * Method named getLastName without any parameters, it needs to return the value of lasName field.
 * Method named getAge without any parameters, it needs to return the value of the age field.
 * Method named setFirstName with one parameter of type String, it needs to set the Value of the firstName field
 * Method named setLastName with one parameter of type String, it needs to set the value of the lastName field.
 * Method named setAge with one parameter of typ int, it needs to set the value of the age field.
 * If the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
 * Method named isTeen without any parameters, it need to return true if the value of the age field is greater than 12
 * and less than 20, otherwise return false.
 * Method named getFullName without any parameters, it needs to return the full name of the person
 * In case both firstName and lastName fields are empty, Strings return any empty String.
 * In case firstName is empty String, return firstName.
 * In case lastName is empty String, return lastName.
 * to check if a String is empty use the method isEmpty from the String class.
 * for example,
 * firstName.isEmpty() returns true if the String is empty or in other words, when the String doesnt any characters.
 * TEST EXAMPLE
 * <P>
 * TEST CODE : (Write below code in to main method then check output)
 * Person person = new Person();
 * person.setFirstName(&auot;&quot;); // fristName is set to empty string
 * person.setLastName(&quot;&quot;): // lastName is set to empty string
 * person.setAge(10);
 * System.out.println(&quot;fullName = &quot; + person.getFullName());
 * System.out.println(&quot;teen = &quot; + person.isTeen());
 * person.setFirstName(&quot;John&quot;);// firstName is set to John
 * person.setAge(18);
 * System.out.println(&quot;fullName= &quot; + person.getFullName());
 * System.out.println(&quot;teen= &quot; + person.isTeen());
 * person.setLAstName(&quot;Smith&quot;); // lastName is set to Smith
 * System.out.println(&quot;fullName = &quot; + person.getFullName());
 *  <p>
 *OUTPUT
 * fullName =
 * teen = false
 * fullName = John
 * teen = True
 * fullName = John Smith
 * Note : all methods should be defined as public not public static
 * note : in total, you have to write 8 methods
 */
public class Programme_14_Person {
    // Instance variables
    String firstName, lastName;
    int age;
    public static void main(String[] args) {
        Programme_14_Person person = new Programme_14_Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName =" + person.getFullName());
    }
    // get firstname method
    public String getFirstName() {
        return firstName;
    }
    // get lastname method
    public String getLastName() {
        return lastName;
    }
    // get age method
    public int getAge() {
        return age;
    }
    // set firstname method
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    // set lastname method
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    // Set age Method
    public void setAge(int age) {
        if (age > 0 && age <= 100) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }
    // Check is it teen or not method
    public boolean isTeen() {
        if (getAge() > 12 && getAge() < 20) {
            return true;
        } else {
            return false;
        }
    }
    // Get Full name Method
    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return " ";
        } else if (firstName.isEmpty()) {
            return getLastName();
        } else if (lastName.isEmpty()) {
            return getFirstName();
        } else {
            return getFirstName() + " " + getLastName();
        }
    }
}
