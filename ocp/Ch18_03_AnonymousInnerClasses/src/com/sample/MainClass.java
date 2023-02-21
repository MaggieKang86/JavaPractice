package com.sample;

public class MainClass {

    public static void main(String[] args) {
        CTest ct = new CTest();
        ct.doTest();
        System.out.println("--------");

        // 使用匿名內部類別實作 doTest()
        ITest it1 = new ITest(){
            @Override
            public void doTest() {
                System.out.println("匿名內部類別 doTest()...");
            }
        };
        it1.doTest();
        System.out.println("--------");

        // 使用 Lambda 表達式實作 doTest()
        ITest it2 = () -> System.out.println("Lambda 表達式 doTest()...");
        it2.doTest();
        System.out.println("--------");

        // 類別實作介面
        ContainsAnalyzer containsAnalyzer = new ContainsAnalyzer();
        System.out.println("containsAnalyzer：" + containsAnalyzer.analyze("Java SE 8", "SE"));

        StratWithAnalyzer stratWithAnalyzer = new StratWithAnalyzer();
        System.out.println("stratWithAnalyzer：" + stratWithAnalyzer.analyze("Java SE 8", "Java"));
        System.out.println("--------");

        // 使用匿名內部類別實作
        StringAnalyzer sa1 = new StringAnalyzer(){
            @Override
            public boolean analyze(String targe, String search) {
                return targe.contains(search);
            }
        };
        System.out.println("sa1：" + sa1.analyze("Java SE 8", "SE"));

        StringAnalyzer sa2 = new StringAnalyzer(){
            @Override
            public boolean analyze(String targe, String search) {
                return targe.startsWith(search);
            }
        };
        System.out.println("sa2：" + sa2.analyze("Java SE 8", "Java"));
        System.out.println("--------");

        // 使用 Lambda 表達式實作
        StringAnalyzer sa3 = (String targe, String search) -> targe.contains(search);
        System.out.println("sa3：" + sa3.analyze("Java SE 8", "SE"));

        StringAnalyzer sa4 = (t, s) -> t.startsWith(s);
        System.out.println("sa4：" + sa4.analyze("Java SE 8", "Java"));
        System.out.println("--------");

    }

}

//--------------------------
// 使用泛型宣告
@FunctionalInterface
interface Analyzer<T>{
    boolean analyze(T t1, T t2);
}

//--------------------------
// 字串分析
@ FunctionalInterface
interface StringAnalyzer{
    boolean analyze(String targe, String search);
}

class ContainsAnalyzer implements StringAnalyzer{

    @Override
    public boolean analyze(String targe, String search) {
        return targe.contains(search);
    }
}

class StratWithAnalyzer implements StringAnalyzer{

    @Override
    public boolean analyze(String targe, String search) {
        return targe.startsWith(search);
    }
}



//------------------------
@ FunctionalInterface
interface ITest{
    // 只能有一個抽象方法
    void doTest();
    //void test();
}

//---------------------------

// 宣告類別實作介面
class CTest implements ITest{

    @Override
    public void doTest() {
        System.out.println("CTest doTest()...");
    }

}
