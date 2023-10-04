package lesson9.test;

import driver.BaseTest;
import lesson9.pages.RegistrationFormPage;
import org.junit.jupiter.api.Test;
import testData.TestData;

/**
 * @author mateenkov
 */

public class RegistrationFormWithFakerTest extends BaseTest {
    RegistrationFormPage registrationFormPage = new RegistrationFormPage();
    TestData td = new TestData();

    @Test
    void registrationFormTest() {
        registrationFormPage.openPage("Student Registration Form")
                .removeBanner()
                .setFirstName(td.NAME)
                .setLastName(td.LAST_NAME)
                .setGender(td.GENDER)
                .setEmailUser(td.EMAIL)
                .setNumberPhone(td.PHONE)
                .setDateBirth(td.DAY, td.MONTH, td.YEAR)
                .setSubject(td.SUBJECT)
                .setHobbies(td.HOBBIES)
                .uploadPicture(td.FILE)
                .setAddress(td.ADDRESS)
                .setState(td.STATE)
                .setCity(td.CITY)
                .pressSubmit();

        registrationFormPage.checkTitleTableAndTableResult("Thanks for submitting the form")
                .checkResults("Student Name", td.NAME + " " + td.LAST_NAME)
                .checkResults("Student Email", td.EMAIL)
                .checkResults("Gender", td.GENDER)
                .checkResults("Mobile", td.PHONE)
                .checkResults("Date of Birth", td.DAY + " " + td.MONTH + "," + td.YEAR)
                .checkResults("Subjects", td.SUBJECT)
                .checkResults("Hobbies", td.HOBBIES)
                .checkResults("Picture", td.FILE)
                .checkResults("Address", td.ADDRESS)
                .checkResults("State and City", td.STATE + " " + td.CITY);
    }
}
