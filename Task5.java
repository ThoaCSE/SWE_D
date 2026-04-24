public class Task5 {
    public static class Developer {
        private String name;
        private int age;
        private String dateOfBirth;
        private String language;
        private String country;

        public Developer(String name, int age, String dateOfBirth, String language, String country) {
            setName(name);
            setAge(age);
            setDateOfBirth(dateOfBirth);
            setLanguage(language);
            setCountry(country);
        }

        public void setName(String name) {
            if (name == null || name.trim().isEmpty()) {
                throw new IllegalArgumentException("Name cannot be empty.");
            }
            this.name = name;
        }

        public void setAge(int age) {
            if (age < 18 || age > 60) {
                throw new IllegalArgumentException("Age must be between 18 and 60.");
            }
            this.age = age;
        }

        public void setDateOfBirth(String dateOfBirth) {
            if (dateOfBirth == null || dateOfBirth.trim().isEmpty()) {
                throw new IllegalArgumentException("Please enter date of birth.");
            }
            this.dateOfBirth = dateOfBirth;
        }

        public void setLanguage(String language) {
            if (language == null || language.trim().isEmpty()) {
                throw new IllegalArgumentException("Language cannot be empty.");
            }
            this.language = language;
        }

        public void setCountry(String country) {
            if (country == null || country.trim().isEmpty()) {
                throw new IllegalArgumentException("Country cannot be empty.");
            }
            this.country = country;
        }

        public void code() {
            System.out.println(name + " are coding.");
        }

        public void debug() {
            System.out.println(name + " are debugging.");
        }

        public void sleep() {
            System.out.println(name + " are sleeping.");
        }

        public void eat() {
            System.out.println(name + " are eating.");
        }

        public void drink() {
            System.out.println(name + " are drinking.");
        }
    }

    public static void main(String[] args) {
        try {
            Developer dev = new Developer("Huynh Kim Thoa Nguyen", 21, "11/04/2005", "Vietnamese, English", "Vietnam");
            dev.code();
            dev.drink();
            dev.sleep();
            dev.debug();
            dev.eat();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}