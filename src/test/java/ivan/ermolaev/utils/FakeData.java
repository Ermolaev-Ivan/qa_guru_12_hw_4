package ivan.ermolaev.utils;

import com.github.javafaker.Faker;
import java.util.Random;
import java.util.Locale;
import java.lang.Math;


public class FakeData {

    Faker faker = new Faker();
    static String randomGender(){
        String[] genders = new String[] {"Male", "Female", "Other"};
        int randomNumber = (int) (Math.random() * genders.length);
        return genders[randomNumber];
    }
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



}


