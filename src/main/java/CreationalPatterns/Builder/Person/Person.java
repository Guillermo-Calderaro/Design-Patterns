package CreationalPatterns.Builder.Person;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Person {
    private String firstName;
    private String lastName;
    private Date birthdate;
    private String email;
    private String streetAddress;
    private String city;
    private String state;
    private Enum<Gender> gender;

    public enum Gender {MALE, FEMALE, OTHER}

    private Person() {}

    public static PersonBuilder builder(){
        return new PersonBuilder();
    }

    public static final class PersonBuilder{
        private String firstName;
        private String lastName;
        private Date birthdate;
        private String email;
        private String streetAddress;
        private String city;
        private String state;
        private Enum<Gender> gender;

        private PersonBuilder(){};

        public PersonBuilder withFirstAndLastName(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
            return  this;
        }

        public PersonBuilder withBirthdate(Date birthdate){
            this.birthdate = birthdate;
            return this;
        }

        public PersonBuilder withEmail(String email){
            this.email = email;
            return this;
        }

        public PersonBuilder withStreetAddress (String streetAddress){
            this.streetAddress = streetAddress;
            return this;
        }

        public PersonBuilder withCity(String city){
            this.city = city;
            return this;
        }

        public PersonBuilder withState(String state){
            this.state = state;
            return this;
        }

        public PersonBuilder withGender(Gender gender){
            this.gender = gender;
            return this;
        }

        public Person build(){
            Person person = new Person();
            person.firstName = this.firstName;
            person.lastName = this.lastName;
            person.birthdate = this.birthdate;
            person.email = this.email;
            person.streetAddress = this.streetAddress;
            person.city = this.city;
            person.state = this.state;
            person.gender = this.gender;
            return person;
        }
    }

    @Override
    public String toString(){
        return this.firstName + this.lastName;
    }
}