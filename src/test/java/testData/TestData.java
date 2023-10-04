package testData;

/**
 * @author mateenkov
 */

public class TestData {
    Utils u = new Utils();
    public String NAME = u.getName();
    public String LAST_NAME = u.getLastName();
    public String GENDER = u.getGender();
    public String EMAIL = u.getEmail();
    public String PHONE = u.getPhone();
    public String DAY = u.getDay();
    public String MONTH = u.getMonth();
    public String YEAR = u.getYear();
    public String SUBJECT = u.getSubjects();
    public String HOBBIES = u.getHobbies();
    public String FILE = u.getFiles();
    public String ADDRESS = u.getAddress();
    public String STATE = u.getState();
    public String CITY = u.getCity(u.getState());
}
