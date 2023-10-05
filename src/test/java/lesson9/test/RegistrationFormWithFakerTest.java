package lesson9.test;

import driver.BaseTest;
import lesson9.pages.RegistrationFormPage;
import org.junit.jupiter.api.Test;
import testData.Utils;

/**
 * @author mateenkov
 */

public class RegistrationFormWithFakerTest extends BaseTest {
    RegistrationFormPage registrationFormPage = new RegistrationFormPage();
    Utils u = new Utils();

    @Test
    void registrationFormTest() {
        registrationFormPage.openPage("Student Registration Form")
                .removeBanner()
                .setFirstName(u.getName())
                .setLastName(u.getLastName())
                .setGender(u.getGender())
                .setEmailUser(u.getEmail())
                .setNumberPhone(u.getPhone())
                .setDateBirth(u.getDay(), u.getMonth(), u.getYear())
                .setSubject(u.getSubjects())
                .setHobbies(u.getHobbies())
                .uploadPicture(u.getFiles())
                .setAddress(u.getAddress())
                .setState("NCR") // Тут не разобрался
                .setCity("Delhi") // И тут
                .pressSubmit();

        registrationFormPage.checkTitleTableAndTableResult("Thanks for submitting the form")
                .checkResults("Student Name", u.getName() + " " + u.getLastName())
                .checkResults("Student Email", u.getEmail())
                .checkResults("Gender", u.getGender())
                .checkResults("Mobile", u.getPhone())
                .checkResults("Date of Birth", u.getDay() + " " + u.getMonth() + "," + u.getYear())
                .checkResults("Subjects", u.getSubjects())
                .checkResults("Hobbies", u.getHobbies())
                .checkResults("Picture", u.getFiles())
                .checkResults("Address", u.getAddress())
                .checkResults("State and City", "NCR" + " " + "Delhi");
    }
}
