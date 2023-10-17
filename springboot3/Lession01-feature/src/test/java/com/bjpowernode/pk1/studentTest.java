package com.bjpowernode.pk1;

import org.junit.Test;

import java.lang.reflect.RecordComponent;

import static org.junit.Assert.*;

public class studentTest {

    @Test
    public void test01() {

        // 創建 Record 對象
        Student lisi = new Student(1001, "lisi", "lsis@qq.com", 20);
        System.out.println("lisi =" + lisi.toString());

        // public 方法器，獲取屬性質，只讀，沒有 set, get方法
        Integer id = lisi.id();
        String name = lisi.name();

        System.out.println("id =" + id);
        System.out.println("name =" + name + "\n");

        // 分隔線
        System.out.println("============================\n");

        Student zhangsan = new Student(1002, "zhangsan", "zs@qq.com", 26);
        System.out.println("zhangsan =" + zhangsan);
        System.out.println("lisi.equals(zhangsan) = " + lisi.equals(zhangsan));
        System.out.println("zhangsan.name() =" + zhangsan.name());
        System.out.println("zhangsan.age() = " + zhangsan.age());

    }

    @Test
    public void test02() {

        Student student = new Student(1001, "lisi", "lisi@@qq.com", 20);
        // 使用對象，調用實例方法
        String str = student.concat();
        System.out.println("str = " + str);

    }

    @Test
    public void test03() {

        // 使用類，調用靜態方法
        String email = Student.emailToUpperCase("lisi@qq.com");
        System.out.println("email =" + email);

    }

    @Test
    public void test04() {

        Student student = new Student(2001, "lisi");
        System.out.println("student = " + student);

    }

    @Test
    public void test05() {

        ProductRecord productRecord = new ProductRecord(1001, "手機", 200);
        productRecord.print();

    }

    @Test
    public void test06() {

        // 定義 local record
        record SaleRecord(String  saleId, String productName, Double money){};

        //創建對象
        SaleRecord saleRecord = new SaleRecord("S001", "顯示器", 3000.01);

        // 輸出
        System.out.println("saleRecord = " + saleRecord);
    }

    @Test
    public void test07() {

        Address address = new Address("台北", "龍安路61號", "123456");
        PhoneNumber phoneNumber = new PhoneNumber("866", "911-111-111");
        Customer customer = new Customer("C001", "小明", phoneNumber, address);

        System.out.println("customer = " + customer);

        String number = customer.phoneNumber().number();
        System.out.println("number = " + number);

        String address1 = customer.address().address();
        System.out.println("address1 = " + address1);

    }

    @Test
    public void test08() {
        Person person = new Person("波波", 10);
        SomeService service = new SomeService();
        boolean flag = service.isEligible(person);
        System.out.println("flag = " + flag);
    }

    @Test
    // 測試若值為空，是否會自己判斷並返回 false 值
    public void test09() {
        SomeService service = new SomeService();
        boolean flag = service.isEligible(null);
        System.out.println("flag = " + flag);
    }

    @Test
    public void test10() {

        Address address = new Address("台北", "龍安路61號", "123456");
        PhoneNumber phoneNumber = new PhoneNumber("866", "911-111-111");
        Customer customer = new Customer("C001", "小明", phoneNumber, address);

        // 判斷 record 是否為 Java Record 類型
        boolean record = customer.getClass().isRecord();
        System.out.println("record = " + record);

        // 表示此紀錄類的所有記錄組件
        RecordComponent[] recordComponents = customer.getClass().getRecordComponents();
        for(RecordComponent recordComponent : recordComponents) {
            System.out.println("recordComponent = " + recordComponent);
        }
    }
}