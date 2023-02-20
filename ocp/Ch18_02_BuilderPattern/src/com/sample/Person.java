package com.sample;

public class Person {

    // Person 欄位
    private String name;
    private int age;
    private String email;
    private String phone;
    private String city;

    // 建立接收資料的 Builder static 內部類別
    public static class Builder{

        // Builder 欄位: 指定預設值
        private String name = "";
        private int age = 0;
        private String email = "";
        private String phone = "";
        private String city = "高雄";

        // 接受資料的方法
        public Person.Builder name(String val) {
            this.name = val;
            return this;
        }

        public Person.Builder age(int val) {
            this.age = val;
            return this;
        }

        public Person.Builder email(String val) {
            this.email = val;
            return this;
        }

        public Person.Builder phone(String val) {
            this.phone = val;
            return this;
        }

        public Person.Builder city(String val) {
            this.city = val;
            return this;
        }

        // 資料接受後建立 Person 物件
        public Person build() {
            return new Person(this);
        }

    }

    // private Person 建構子
    private Person(Person.Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.phone = builder.phone;
        this.city = builder.city;
    }

    // Person 方法
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "[" + name + "," + age + "," + email + "," + phone + "," + city + "]";
    }
}
