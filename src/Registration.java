import exceptions.Exceptions;

public class Registration {
    private String Firstname;
    private String SecondName;
    private int age;
    private String mail;
    private String password;

    public Registration() {
    }

    public Registration(String firstname, String secondName, int age, String mail, String password) {
        Firstname = firstname;
        SecondName = secondName;
        this.age = age;
        this.mail = mail;
        this.password = password;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        if (!firstname.matches("1-9")) {
            throw new Exceptions("Атынызды тамга менен жазыныз.");
        } else {
            System.out.println("Кийинки кадамга отунуз.");
        }
    }

    public String getSecondName() {
        return SecondName;
    }

    public void setSecondName(String secondName) {
        if (!secondName.matches("1-9")) {
            throw new Exceptions("Тамга менен жазыныз.");
        } else {
            System.out.println("Кийинки кадамга отунуз.");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new Exceptions("Жашынызды туура жазыныз.");
        } else {
            System.out.println("Кийинки кадамга отунуз.");
        }
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        if (!mail.contains("@")) {
            throw new Exceptions("@ жок почта кабыл алынбайт.");
        } else {
            System.out.println("Кийинки кадамга отунуз.");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() < 7) {
            throw new Exceptions("Пароль 7 ден коп болуш керек.");
        }else {
            System.out.println("Кийинки кадамга отунуз.");
        }
    }

    @Override
    public String toString() {
        return "Registration{" +
                "Firstname='" + Firstname + '\'' +
                ", SecondName='" + SecondName + '\'' +
                ", age=" + age +
                ", mail='" + mail + '\'' +
                ", password=" + password +
                '}';
    }
}
