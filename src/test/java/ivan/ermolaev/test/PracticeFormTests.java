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

        registrationPage
                .openPage()
                .setFirstName(fakeData.firstName)
                .setLastName(fakeData.lastName)
                .setEmail(fakeData.email)
                .randomChoiceGender()
                .setPhone(fakeData.phone)
                .setBirthDate("19","November","1998")
                .setSubjects("Hindi")
                .randomHobbyCheckbox()
                .uploadPicture("Gordon.jpg")
                .setCurrentAddress(fakeData.fullAddress)
                .setState("Rajasthan")
                .setCity("Jaiselmer")
                .sendFormButton()
                .validationForm(fakeData.firstName, fakeData.lastName, fakeData.email,

                );


        $(".table").shouldHave(text("Gordon Freeman"),
                text("freeman_g@black.mesa"),
                text("Male"),
                text("9998887766"),
                text("19 November,1998"),
                text("Physics"),
                text("Sports, Reading, Music"),
                text("Gordon.jpg"),
                text("10400 Northeast Fourth Street Floor 14 Bellevue, WA 98004 USA"),
                text("Rajasthan Jaiselmer"));
//
//// Close form
//        $("#closeLargeModal").click();
//        $("#example-modal-sizes-title-lg").shouldNotBe(visible);
    }
}