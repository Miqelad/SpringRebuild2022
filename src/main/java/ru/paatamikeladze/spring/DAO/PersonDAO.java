package ru.paatamikeladze.spring.DAO;
//Как БД списки людей
import org.springframework.stereotype.Component;
import ru.paatamikeladze.spring.models.Person;

import java.util.ArrayList;
import java.util.List;
@Component
public class PersonDAO {
    private List<Person> people;
    //инициилизатор
    {
        people=new ArrayList<>();
        people.add(new Person(1,"Tom"));
        people.add(new Person(2,"Som"));
        people.add(new Person(3,"Pom"));
    }
    //возвращаем список людей
    public List<Person> index(){
        return people;
    }
    //возвращаем одного
    public Person show(int id){
        return people.stream().filter(person->person.getId() ==id).findAny().orElse(null);
    }
}
