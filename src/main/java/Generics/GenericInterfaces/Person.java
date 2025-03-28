package Generics.GenericInterfaces;

public class Person implements Comparable<Person>{
    private Integer age;
    public Person(Integer age){
        this.age = age;
    }
    public Integer getAge() {
        return age;
    }
    @Override
    public int compareTo(Person other) {
        if(this.age > other.age){
            return 1;
        }
        else if(this.age < other.age){
            return -1;
        }
        else{
            return 0;
        }
    }
}
