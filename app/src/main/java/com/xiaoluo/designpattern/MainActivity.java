package com.xiaoluo.designpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.xiaoluo.designpattern.adapter.ObjectVoltAdapter;
import com.xiaoluo.designpattern.adapter.VoltAdapter;
import com.xiaoluo.designpattern.adapter.VoltResource220;
import com.xiaoluo.designpattern.bridge.BigSize;
import com.xiaoluo.designpattern.bridge.Clothes;
import com.xiaoluo.designpattern.bridge.Dress;
import com.xiaoluo.designpattern.bridge.Pants;
import com.xiaoluo.designpattern.bridge.SmallSize;
import com.xiaoluo.designpattern.builder.Student;
import com.xiaoluo.designpattern.chain.ShopA;
import com.xiaoluo.designpattern.chain.ShopB;
import com.xiaoluo.designpattern.chain.ShopC;
import com.xiaoluo.designpattern.clone.Teacher;
import com.xiaoluo.designpattern.command.CellPhone;
import com.xiaoluo.designpattern.command.ControlButton;
import com.xiaoluo.designpattern.command.OffCommand;
import com.xiaoluo.designpattern.command.StartCommand;
import com.xiaoluo.designpattern.composite.Dir;
import com.xiaoluo.designpattern.composite.File;
import com.xiaoluo.designpattern.composite.Folder;
import com.xiaoluo.designpattern.decorator.Boy;
import com.xiaoluo.designpattern.decorator.HatDecorator;
import com.xiaoluo.designpattern.decorator.Person;
import com.xiaoluo.designpattern.decorator.TshirtDecorator;
import com.xiaoluo.designpattern.facade.Computer;
import com.xiaoluo.designpattern.factory_method.CarA;
import com.xiaoluo.designpattern.factory_method.CarB;
import com.xiaoluo.designpattern.factory_method.CarFactoryA;
import com.xiaoluo.designpattern.factory_method.CarFactoryB;
import com.xiaoluo.designpattern.flyweight.PhoneFactory;
import com.xiaoluo.designpattern.flyweight.PhoneInfo;
import com.xiaoluo.designpattern.interpreter.StarExpression;
import com.xiaoluo.designpattern.iterator.IScoreIterator;
import com.xiaoluo.designpattern.iterator.ListAggregate;
import com.xiaoluo.designpattern.mediator.HouseMediator;
import com.xiaoluo.designpattern.mediator.Landlord;
import com.xiaoluo.designpattern.mediator.XiaoWang;
import com.xiaoluo.designpattern.memento.MementoManager;
import com.xiaoluo.designpattern.memento.Player;
import com.xiaoluo.designpattern.observer.ComicApp;
import com.xiaoluo.designpattern.observer.People;
import com.xiaoluo.designpattern.proxy.Friend;
import com.xiaoluo.designpattern.proxy.HungryPerson;
import com.xiaoluo.designpattern.proxy.IOrderMeal;
import com.xiaoluo.designpattern.singleTon.SingleTon;
import com.xiaoluo.designpattern.state.MoneyControl;
import com.xiaoluo.designpattern.strategy.CalculateStrategy;
import com.xiaoluo.designpattern.strategy.PlaneCalculate;
import com.xiaoluo.designpattern.template.BuyBread;
import com.xiaoluo.designpattern.visitor.BookList;
import com.xiaoluo.designpattern.visitor.IVisitor;
import com.xiaoluo.designpattern.visitor.XiaoHong;
import com.xiaoluo.designpattern.visitor.XiaoMin;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1、单例模式
        System.out.println("----------1、单例模式:singleTon文件夹----------");
        SingleTon.getInstance();

        // 2、建造者模式
        System.out.println("----------2、建造者模式:build文件夹----------");
        Student student = new Student.Builder(1)
                .setName("小华")
                .setAge(15)
                .setAddress("China")
                .build();
        System.out.println(student.toString());

        // 3、原型模式
        System.out.println("----------3、原型模式:clone文件夹----------");
        List<String> students = new ArrayList<>();
        students.add("小A");
        students.add("小B");
        List<String> classes = new ArrayList<>();
        classes.add("Chinese");
        classes.add("Math");
        Teacher teacher = new Teacher(33, "王老师", students, classes);
        Teacher cloneTeacher = (Teacher) teacher.clone();
        System.out.println(teacher.toString());
        System.out.println(cloneTeacher.toString());

        // 4、工厂方法
        System.out.println("----------4、工厂方法模式:factory_method文件夹----------");
        CarA carA = new CarFactoryA().createCar();
        CarB carB = new CarFactoryB().createCar();
//        CarA car = new CarFactoryA().createCar(CaA.class); // 反射获取类
        carA.drive();
        carB.drive();

        // 5、抽象工厂模式
        System.out.println("----------5、抽象工厂模式:abstract_factory文件夹----------");


        // 6、适配器模式
        System.out.println("----------6、适配器模式:adpter文件夹----------");
        // 6.1.类适配器模式
        VoltAdapter adapter = new VoltAdapter();
        adapter.getVolt5();
        // 6.2.对象适配器模式
        ObjectVoltAdapter adapter1 = new ObjectVoltAdapter(new VoltResource220());
        adapter1.getVolt5();

        // 7、装饰模式
        System.out.println("----------7、装饰模式:decorator文件夹----------");
        Person boy = new Boy();
        boy.wear("pants");
        HatDecorator hat = new HatDecorator(boy);
        TshirtDecorator tshirt = new TshirtDecorator(boy);
        hat.wear("Hat");
        tshirt.wear("T-shirt");

        // 8、代理模式
        System.out.println("----------8、代理模式:proxy文件夹----------");
        IOrderMeal orderMeal = new Friend(new HungryPerson());
        orderMeal.chooseFood();
        orderMeal.pay();

        //9、 外观模式
        System.out.println("----------9、外观模式:facade文件夹----------");
        Computer computer = new Computer();
        computer.start();

        // 10、桥接模式
        System.out.println("----------10、桥接模式:bridge文件夹----------");
        Clothes clothes = new Dress(new BigSize());
        clothes.wear();
        clothes = new Pants(new SmallSize());
        clothes.wear();

        // 11、组合模式
        System.out.println("----------11、组合模式:composite文件夹----------");
        Dir myFolder = new Folder("图片");
        myFolder.addDir(new File("a.jpg"));
        myFolder.addDir(new File("b.jpg"));
        myFolder.addDir(new Folder("里层文件夹"));
        myFolder.print();
        System.out.println("");

        // 12、享元模式
        System.out.println("----------12、享元模式:flyweight文件夹----------");
        PhoneInfo phone1 = PhoneFactory.getPhoneInfo("小米");
        phone1.showInfo();
        PhoneInfo phone2 = PhoneFactory.getPhoneInfo("华为");
        phone2.showInfo();

        // 13、策略模式
        System.out.println("----------13、策略模式:strategy文件夹----------");
        CalculateStrategy strategy = new CalculateStrategy();
        strategy.setCalculate(new PlaneCalculate());
        strategy.cost();

        // 14、模板方法模式
        System.out.println("----------14、模板方法模式:template文件夹----------");
        BuyBread buyBread = new BuyBread();
        buyBread.buySomeBread();

        // 15、观察者模式
        System.out.println("----------15、观察者模式:observer文件夹----------");
        ComicApp comicApp = new ComicApp();
        People people1 = new People("小明");
        People people2 = new People("小黄");
        comicApp.addObserver(people1);
        comicApp.addObserver(people2);
        comicApp.hasNew("海贼王");

        // 16、迭代器模式
        System.out.println("----------16、迭代器模式:iterator文件夹----------");
        ListAggregate list = new ListAggregate();
        IScoreIterator iterator = list.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 17、责任链模式
        System.out.println("----------17、责任链模式:chain文件夹----------");
        ShopA shopA = new ShopA();
        ShopB shopB = new ShopB();
        ShopC shopC = new ShopC();
        shopA.nextShop = shopB;
        shopB.nextShop = shopC;
        shopA.queryBook();

        // 18、命令模式
        System.out.println("----------18、命令模式:command文件夹----------");
        CellPhone cellPhone = new CellPhone();
        StartCommand startCommand = new StartCommand(cellPhone);
        OffCommand offCommand = new OffCommand(cellPhone);
        ControlButton control = new ControlButton(startCommand, offCommand);
        control.start();
        control.off();

        // 19、备忘录模式
        System.out.println("----------19、备忘录模式:memento文件夹----------");
        MementoManager mementoManager = new MementoManager();
        Player player = new Player();
        player.play();
        mementoManager.setMemento(player.savaMemento());
        player.play();
        player.play();
        player.restore(mementoManager.getMemento());

        // 20、状态模式
        System.out.println("----------20、状态模式:state文件夹----------");
        MoneyControl moneyControl = new MoneyControl();
        moneyControl.getMoney();
        moneyControl.buy();
        moneyControl.clearMoney();
        moneyControl.buy();
        moneyControl.eat();

        // 21、访问者模式
        System.out.println("----------21、访问者模式:visitor文件夹----------");
        BookList bookList = new BookList();
        IVisitor xiaomin = new XiaoMin();
        IVisitor xiaohong = new XiaoHong();
        bookList.showBook(xiaomin);
        bookList.showBook(xiaohong);

        // 22、中介者模式
        System.out.println("----------22、中介者模式:mediator文件夹----------");
        HouseMediator mediator = new HouseMediator();
        XiaoWang xiaowang = new XiaoWang(mediator);
        Landlord landload = new Landlord(mediator);
        mediator.setLandlord(landload);
        mediator.setXiaoWang(xiaowang);
        xiaowang.query();

        // 23、解释器模式
        System.out.println("----------23、解释器模式:interpreter文件夹----------");
        StarExpression star = new StarExpression();
        star.interpret("21*");
    }
}


