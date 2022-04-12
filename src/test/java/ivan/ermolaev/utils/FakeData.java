package ivan.ermolaev.utils;

import com.github.javafaker.Faker;
import java.util.Random;
import java.util.Locale;
import java.lang.Math;


public class FakeData {

    Faker faker = new Faker();
    static String randomGender(){
        // Передаелать на словарь, в значения записать стокой числа и прокидывать их в локатор, вынести в пейджи
        String[] genders = new String[] {"Male", "Female", "Other"};
        int randomNumber = (int) (Math.random() * genders.length);
        return genders[randomNumber];
    }
    static String randomCheckboxes(){
        String[] checkboxs = new String[] {"Sports", "Reading", "Music"};
        int randomNumber = (int) (Math.random() * checkboxs.length);
        return checkboxs[randomNumber];
    }
    static String randomValueOfArray(String[] arr){
        int randomNumber = (int) (Math.random() * arr.length);
        return arr[randomNumber];
    }

    String[] ssa = new String[] {"Sports", "Reading", "Music"};
//    default data
//    static String firstName = "Gordon";
//    static String lastName = "Freeman";
//    static String Email = "freeman_g@black.mesa";
//    static String phone = "9998887766";
//    static String fullAddress = "10400 Northeast Fourth Street Floor 14 Bellevue, WA 98004 USA";
//    static String gender = "Male"; // Male, Female, Other

//    faker data
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String Email = faker.internet().emailAddress();
    String phone = faker.phoneNumber().subscriberNumber(10);
    String fullAddress = faker.address().fullAddress();
    String gender = randomGender();
    String hobbyCheckboxes = randomCheckboxes();
//    String state = randomValueOfArray(["Sports", "Reading", "Music"]);




}


