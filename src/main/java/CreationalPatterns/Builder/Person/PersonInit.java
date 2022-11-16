package CreationalPatterns.Builder.Person;

import lombok.Builder;
import lombok.extern.java.Log;

@Log
@Builder
public class PersonInit {

    public static void main(String[] args) {
        Person person = Person.
                            builder().
                            withFirstAndLastName("Guillermo", "Calderaro").
                            withEmail("guillermocalderaro@gmail.com").
                            build();
        log.info(person.toString());

        Person anotherPerson = Person.
                                builder().
                                withFirstAndLastName("Juan Pablo", "Vera").
                                withCity("Santiago de Chile").
                                withEmail("juanpablovera@globant.com").
                                build();

    }

}
