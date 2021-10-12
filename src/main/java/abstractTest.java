/**
 * Project name(项目名称)：作业 抽象类
 * Package(包名): PACKAGE_NAME
 * Class(类名): abstractTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/12
 * Time(创建时间)： 19:43
 * Version(版本): 1.0
 * Description(描述)： 无
 */


public class abstractTest
{
    public static void main(String[] args)
    {
        /********* begin *********/
        // 分别实例化Student类与Worker类的对象，并调用各自构造方法初始化类属性。
        Student s = new Student("张三", 20, "学生");
        Worker w = new Worker("李四", 30, "工人");
        // 分别调用各自类中被复写的talk()方法 打印信息。
        s.talk();
        w.talk();
        /********* end *********/

    }
}

// 声明一个名为Person的抽象类，在Person中声明了三个属性name age occupation和一个抽象方法——talk()。
abstract class Person
{
    /********* begin *********/
    protected String name;
    protected int age;
    protected String occupation;

    public abstract void talk();
    /********* end *********/
}

// Student类继承自Person类，添加带三个参数的构造方法，复写talk()方法 返回姓名、年龄和职业信息
class Student extends Person
{
    public Student(String name, int age, String occupation)
    {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    @Override
    public void talk()
    {
        StringBuffer s = new StringBuffer();
        s.append("学生——>姓名：").append(this.name).append("，年龄：").append(this.age)
                .append("，职业：").append(this.occupation).append("！");
        System.out.println(s);
    }
    /********* begin *********/

    /********* end *********/
}

// Worker类继承自Person类，添加带三个参数的构造方法，复写talk()方法 返回姓名、年龄和职业信息
class Worker extends Person
{
    public Worker(String name, int age, String occupation)
    {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    @Override
    public void talk()
    {
        StringBuffer s = new StringBuffer();
        s.append("工人——>姓名：").append(this.name).append("，年龄：").append(this.age)
                .append("，职业：").append(this.occupation).append("！");
        System.out.println(s);
    }
    /********* begin *********/

    /********* end *********/

}