package ivan.ermolaev.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {

    SelenideElement
        firstNameInput =  $("#firstName"),
        lastNameInput =  $("#lastName"),
        firstUserEmailInput =  $("#userEmail"),
        firstGenderInput =  $("label[for='gender-radio-1']"),
        userNumberInput =  $("#userNumber"),
        subjectsInput =  $("#subjectsInput"),
    // Picture
        uploadPictureInput = $("input[id='uploadPicture']");

    // State and city
//    $("#currentAddress").setValue("10400 Northeast Fourth Street Floor 14 Bellevue, WA 98004 USA");
//    $("#react-select-3-input").setValue("Rajasthan").pressEnter();
//    $("#react-select-4-input").setValue("Jaiselmer").pressEnter();

}
