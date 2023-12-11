package apps.ucu.edu.ua.task2;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Client {
    private int id;
    private String name;
    private int age;
    private Gender sex;
    private String email;
    private  static int count = 0;

    public Client(String name, Gender sex, int age, String email){
        id = count++;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.email = email;
    }
}
