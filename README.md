@[TOC](设计模式（Design Pattern）)

#### 创建型模式（Creational Patterns）
&emsp;&emsp;**创建型模式**提供了一种在创建对象的同时隐藏创建逻辑的方式，而不是使用`new`直接实例化对象，这使得程序在判断针对某个给定实例需要创建哪些对象时更加灵活。

##### 单例模式（Singleton Pattern）
参考文章[https://www.runoob.com/design-pattern/singleton-pattern.html](https://www.runoob.com/design-pattern/singleton-pattern.html)。
**介绍：**主要目的是为了实现整个项目全局内保证一个类有且仅有一个实例，按照实现的方式可以分为*懒汉式*和*饿汉式*。
**优点：**
1. 在内存里只有一个实例，减少了内存的开销，尤其是频繁的创建和销毁实例（比如管理学院首页页面缓存）。
2. 避免对资源的多重占用（比如写文件操作）。     

**缺点：**没有接口，不能继承，与单一职责原则冲突，一个类应该只关心内部逻辑，而不关心外面怎么样来实例化。
**举例：**
<u>饿汉式</u>：
```java
public class Hungry {
    private static Hungry instance = new Hungry();

    private Hungry() {

    }

    public static Hungry getInstance() {
        return instance;
    }
}
```
<u>懒汉式</u>：
```java
public class Lazy {

    private static Lazy instance = null;

    private Lazy() {

    }

    public static Lazy getInstance() {
        return new Lazy();
    }

    /**
     * {@link #getInstance()}方法在多线程的情况下是线程不安全的，
     * 所以可以使用<b>双重校验锁机制</b>来保证线程安全。
     *
     * @return
     */
    public static Lazy getNewInstance() {
        if (instance == null) {
            synchronized (Lazy.class) {
                // 可能会存在两个getNewInstance同时加锁的情况，所以加锁成功后需要再判断一次
                if (instance == null) {
                    return new Lazy();
                }
            }
        }
        return instance;
    }
}
```
**实例：**
- `sun.misc.Launcher`类使用的就是饿汉式加载，这个类是容器加载类加载器时用到的。（下面只摘抄一部分主要代码）
```java
public class Launcher {
    // ··· 省略代码 ···
    private static Launcher launcher = new Launcher();
	// ··· 省略代码 ···
    public static Launcher getLauncher() {
        return launcher;
    }

    public Launcher() {
        // ··· 省略代码 ···
    }
}
```

##### 工厂模式（Factory Pattern）
可以参考文章[https://www.runoob.com/design-pattern/factory-pattern.html](https://www.runoob.com/design-pattern/factory-pattern.html)。
##### 抽象工厂模式（Abstract Factory Pattern）
可以参考文章[https://www.runoob.com/design-pattern/abstract-factory-pattern.html](https://www.runoob.com/design-pattern/abstract-factory-pattern.html)。
**介绍：**抽象工厂也是工厂，只不过这个工厂生产的是下一级的工厂。
**举例：**
- 在`Spring`框架下，可以利用反射和`Java 8`中的一个新的小特性在接口类里实现。
```java
public interface FactoryInterface {

    String getType();

    static FactoryInterface getInstance(String type) {
        Map<String, FactoryInterface> map = ContextUtil.getContext().getBeansOfType(FactoryInterface.class, false, false);
        for (Map.Entry<String, FactoryInterface> entry : map.entrySet()) {
            if (Objects.equals(type, entry.getValue().getType())) {
                return entry.getValue();
            }
        }
        return null;
    }

    class ContextUtil implements ApplicationContextAware {

        private static ApplicationContext context;

        public static ApplicationContext getContext() {
            return context;
        }

        @Override
        public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
            ContextUtil.context = applicationContext;
        }
    }
}
```
**实例：**
- `Spring`中就大量使用了工厂模式。
##### 建造者模式（Builder Pattern）

参考文章[https://www.runoob.com/w3cnote/builder-pattern.html](https://www.runoob.com/w3cnote/builder-pattern.html)。

**介绍：**一个类的构造非常复杂，同时还有可能调用不同的方法就会产生不同的后果，这时候就需要用到**建造者模式**来对一个类的创建进行封装。

**实例：**

- `MyBatis`中因为需要对`xml`以及`sql`等进行解析，所以使用了比较多的建造者模式类。

##### 原型模式（Prototype Pattern）
参考文章[https://www.journaldev.com/1440/prototype-design-pattern-in-java](https://www.journaldev.com/1440/prototype-design-pattern-in-java)。
#### 结构型模式（Structural Patterns）
&emsp;&emsp;这些设计模式关注的是类和对象的组合。继承的概念被用来组合接口和定义组合对象获得新功能的方式。
##### 适配器模式（Adapter Pattern）
参考文章[https://www.journaldev.com/1487/adapter-design-pattern-java](https://www.journaldev.com/1487/adapter-design-pattern-java)。
##### 组合模式（Composite Pattern）

参考文章[https://www.runoob.com/design-pattern/composite-pattern.html](https://www.runoob.com/design-pattern/composite-pattern.html)。

##### 代理模式（Proxy Pattern）

参考文章[https://www.runoob.com/design-pattern/proxy-pattern.html](https://www.runoob.com/design-pattern/proxy-pattern.html)。

##### 享元模式（Flyweight Pattern）

参考文章[https://www.runoob.com/design-pattern/flyweight-pattern.html](https://www.runoob.com/design-pattern/flyweight-pattern.html)。
##### 外观模式（Facade Pattern）
参考文章[https://www.runoob.com/design-pattern/facade-pattern.html](https://www.runoob.com/design-pattern/facade-pattern.html)。
##### 桥接模式（Bridge Pattern）
参考文章[https://www.runoob.com/design-pattern/bridge-pattern.html](https://www.runoob.com/design-pattern/bridge-pattern.html)。
参考代码[https://www.journaldev.com/1491/bridge-design-pattern-java](https://www.journaldev.com/1491/bridge-design-pattern-java)。
##### 装饰器模式（Decorator Pattern）
参考文章[https://www.runoob.com/design-pattern/decorator-pattern.html](https://www.runoob.com/design-pattern/decorator-pattern.html)。
#### 行为型模式（Behavioral Patterns）
&emsp;&emsp;这些设计模式特别关注对象之间的通信。
##### 模板模式（Template Pattern）
参考文章[https://www.runoob.com/design-pattern/template-pattern.html](https://www.runoob.com/design-pattern/template-pattern.html)。
##### 中介者模式（Mediator Pattern）
参考文章[https://www.runoob.com/design-pattern/mediator-pattern.html](https://www.runoob.com/design-pattern/mediator-pattern.html)。
参考代码[https://www.journaldev.com/1730/mediator-design-pattern-java](https://www.journaldev.com/1730/mediator-design-pattern-java)。
##### 责任链模式（Chain Of Responsibility Pattern）
参考文章[https://www.runoob.com/design-pattern/chain-of-responsibility-pattern.html](https://www.runoob.com/design-pattern/chain-of-responsibility-pattern.html)。
参考代码[https://www.journaldev.com/1617/chain-of-responsibility-design-pattern-in-java](https://www.journaldev.com/1617/chain-of-responsibility-design-pattern-in-java)。
##### 观察者模式（Observer Pattern）
参考文章[https://www.runoob.com/design-pattern/observer-pattern.html](https://www.runoob.com/design-pattern/observer-pattern.html)。
##### 策略模式（Strategy Pattern）
参考文章[https://www.runoob.com/design-pattern/strategy-pattern.html](https://www.runoob.com/design-pattern/strategy-pattern.html)。
##### 命令模式（Command Pattern）
参考文章[https://www.runoob.com/design-pattern/command-pattern.html](https://www.runoob.com/design-pattern/command-pattern.html)。
##### 状态模式（State Pattern）
参考文章[https://www.runoob.com/design-pattern/state-pattern.html](https://www.runoob.com/design-pattern/state-pattern.html)。
##### 访问者模式（Visitor Pattern）
参考文章[https://www.runoob.com/design-pattern/visitor-pattern.html](https://www.runoob.com/design-pattern/visitor-pattern.html)。
参考代码[https://www.journaldev.com/1769/visitor-design-pattern-java](https://www.journaldev.com/1769/visitor-design-pattern-java)。
##### 解释器模式（Interpreter Pattern）
参考文章[https://www.runoob.com/design-pattern/interpreter-pattern.html](https://www.runoob.com/design-pattern/interpreter-pattern.html)。
##### 迭代器模式（Iterator Pattern）
参考文章[https://www.runoob.com/design-pattern/iterator-pattern.html](https://www.runoob.com/design-pattern/iterator-pattern.html)。
参考代码[https://www.journaldev.com/1716/iterator-design-pattern-java](https://www.journaldev.com/1716/iterator-design-pattern-java)。
##### 备忘录模式（Memento Pattern） 
参考文章[https://www.runoob.com/design-pattern/memento-pattern.html](https://www.runoob.com/design-pattern/memento-pattern.html)。



