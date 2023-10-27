package com.bjpowernode.pk3;

import org.junit.Test;

public class TextBlockTest {

    @Test
    public void test01() {
        String s1 = """
                hello world
                select * from daul join aa
                on aa.id = xx.id
                where aa.id = 1
                order by id desc
                """;

        // String s2 = """lisi""";
        String s3 = """
                zhangsan""";
    }

    @Test
    public void test02() {

        String s1 = """
                lisi
                """;

        String s2 = """
                lisi
                """;

        boolean equals = s1.equals(s2);
        System.out.println("equals = " + equals);

        boolean f = s1 == s2;
        System.out.println("f = " + f);

        String msg = """
                hello world
                """;
        String str = msg.substring(0, 5);
        System.out.println("str = " + str);

    }

    @Test
    public void test03() {
        String msg = """
                    <html>
                    <body>動力節點，Java黃埔軍校</body>
                    </html>
                """;

        System.out.println(msg);
    }

    @Test
    public void test04() {
        String colors = """
                red
                green 
                blue
                """;

        // 輸出時加空格
        colors = colors.indent(5);
        System.out.println(colors);
    }

    @Test
    public void test05() {
        String info = """
                Name:%s
                Phone:%s
                Age:%d
                """.formatted("小明", "999-999-999", 20);

        System.out.println(info);
    }

    @Test
    public void test06() {
        String msg = """
                今天天氣很好 \
                但是心情不好 \
                因為不曉得到底現在 \"這個情況\" 會維持多久 \
                """;
        System.out.println(msg);
    }

    @Test
    public void test07() {

        var s1 = "hello";
        var i = 10;
    }

}
