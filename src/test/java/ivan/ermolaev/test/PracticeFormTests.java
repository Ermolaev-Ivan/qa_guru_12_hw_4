package ivan.ermolaev.test;

import com.codeborne.selenide.Configuration;
import ivan.ermolaev.pages.RegistrationPage;
import ivan.ermolaev.utils.FakeData;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;

import static com.codeborne.selenide.Selenide.*;

public class PracticeFormTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void formTest() {
        open("https://demoqa.com/automation-practice-form");
        RegistrationPage registrationPage = new RegistrationPage();
        FakeData fakeData = new FakeData();

        String firstName = fakeData.firstName,
                lastName = fakeData.lastName,
                email = fakeData.email,
                gender = "random",
                phone = fakeData.phone,
                day = "19",
                mount = "November",
                year = "1998",
                subjects = "Hindi",
                currentAdress = fakeData.fullAddress,
                state = "Rajasthan",
                city = "Jaiselmer",
                picture = "Gordon.jpg",
                hobby = "random";




        registrationPage
                .openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .choiceGender(gender)
                .setPhone(phone)
                .setBirthDate(day, mount, year)
                .setSubjects(subjects)
                .choiceHobbyCheckbox(hobby)
                .uploadPicture(picture)
                .setCurrentAddress(currentAdress)
                .setState(state)
                .setCity(city)
                .sendFormButton()
                .validationForm(firstName, lastName, email, gender, phone, day, mount, year,
                        subjects, hobby, picture, currentAdress, state, city)
                .closeModal();

    }
}