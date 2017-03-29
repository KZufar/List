package ru.ivmiit.object;

/**
 * 27.02.2017
 * Human
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return this.name + " " + this.age;
    }


    public boolean equals(Object object){
        if (object == null || !object.getClass().getName().equals(this.getClass().getName())){
            return false;
        }
        Human that = (Human)object;

        return this.age == that.age && this.name.equals(that.name);
    }


    public int hashCode(){
        return this.age + this.name.hashCode();
    }
}
