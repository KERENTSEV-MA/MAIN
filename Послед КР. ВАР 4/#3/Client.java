import java.util.*;

public class Client {
        private UUID id;
        private String name;
        private int age;
        private String gender;
        private List<Phone> phones;

        public Client(String name, int age, String gender, List<Phone> phones) {
                this.id = UUID.randomUUID();
                this.name = name;
                this.age = age;
                this.gender = gender;
                this.phones = phones;
        }

        public UUID getId() {
                return id;
        }

        public String getName() {
                return name;
        }

        public int getAge() {
                return age;
        }

        public String getGender() {
                return gender;
        }

        public List<Phone> getPhones() {
                return phones;
        }


}