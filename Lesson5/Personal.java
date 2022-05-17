package hw5;

public class Personal {
    private String name;
    private String post;
    private String email;
    private String telephone;
    private int age;
    private int salary;

    public Personal(String name, String post, String email, String telephone, int age, int salary){
        this.name = name;
        this.post = post;
        this.email = email;
        this.telephone = telephone;
        this.age = age;
        this.salary = salary;
    }
    public int getAge(){
        return age;
    }

    public void informationAboutPersonal () {
        System.out.println("name:"+name+"\n"
                +"post:"+post+"\n"
                +"email:"+email+"\n"
                +"telephone:"+telephone+"\n"
                +"age:"+age+"\n"
                +"salary:"+salary+"\n");
    }

}
