import org.junit.jupiter.api.Test;
class PersonTest {

    Person p1 = new Person("000001", "Bilbo", "Baggins", "Esq.", 1060);
    Person p2 = new Person("000002", "Frodo", "Baggins", "Esq.", 1120);
    Person p3 = new Person("000003", "Samwise", "Gamgee", "Esq.", 1125);
    Person p4 = new Person("000004", "Peregrin", "Took", "Esq.", 1126);
    Person p5 = new Person("000005", "Meridoc", "Brandybuck", "Esq.", 1126);

    // Constructors Testings




    // Setters Testing
    @Test
    void setID() {
        p1.setID("000008");
    }

    @Test
    void setFirstName() {
        p2.setFirstName("Ryan");
    }

    @Test
    void setLastName() {
        p3.setLastName("Gosling");
    }

    @Test
    void setTitle() {
        p4.setTitle("Mr.");
    }

    @Test
    void fullName() {
        fullName();
    }

    @Test
    void formalName() {
    }

    @Test
    void getAge() {
    }

    @Test
    void getAgeSpecifiedYear() {
    }
}