# Design Pattern

学习设计模式，共23种设计模式，学习过程中使用Java语言实现

### 设计原则：
 - 单一职责原则
 - 接口隔离原则
 - 依赖倒转原则
 - 里氏替换原则
 - 开闭原则 ocp
 - 迪米特法则
 - 合成服用原则
 
### 设计模式目的：
 - 重用性（相同功能的代码，不用多次编写）
 - 可读性（编程的规范性，便于代码的阅读和理解）
 - 拓展性（方便新功能的增加）
 - 可靠性（新增功能对旧功能不造城影响）
 - 高内聚、低耦合
 
 ### 设计模式分为三种类型：
  - 创建型模式：
    - 单例模式
    - 抽象工厂模式
    - 原型模式
    - 建造者模式
    - 工厂模式
  - 结构型模式：
    - 适配器模式
    - 桥接模式
    - 装饰模式
    - 组合模式
    - 外观模式
    - 分享模式
    - 代理模式
  - 行为型模式：
    - 模版方法模式
    - 命令模式
    - 访问者模式
    - 迭代器模式
    - 观察者模式
    - 中介者模式
    - 备忘录模式
    - 解释器模式
    - 状态模式
    - 策略模式
    - 职责链模式
    
### 1、单例模式有八种方式
    单例模式保证了系统内存中该类只存在一个对象，节省了系统资源，对于一些需要频繁创建销毁的对象，使用单例模式可以提高系统性能
    当想实例化一个单例类的时候，必须要记住使用相应的获取对象的方法，而不是使用new
    单例模式使用的场景：需要频繁的进行创建和销毁的对象，创建对象时耗时过多或耗费资源过多（即： 重量级对象），但又经常用到的对象、工具类
    对象、频繁访问数据库或文件的对象（数据源，session工厂等）
    
    
    1） 饿汉式（静态常量）
        a. 构造器私有化（防止 new）
        b. 类的内部创建对象
        c. 向外暴露一个静态的公共方法
        d. 代码实现
        
        优点： 类装载的时候就完成实例化，避免线程同步问题
        缺点： 在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终未使用过这个实例，则会造成内存的浪费
        这种方式基于classloder机制避免了多线程的同步问题，不过，instance在类装载时就实例化，在单例模式中大多数都是调用getInstance
        方法，但是导致类装载的原因有很多种，因此不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候初始化instance就没有达到
        Lazy Loading的效果
        
        这可能造成内存浪费
        
    2） 饿汉式（静态代码块）
        只是把实例化放到静态代码块中，优缺点与方式一一致
        
    3） 懒汉式（线程不安全）
        起到了Lazy Loading的效果，但是智能在单线程下使用
        如果在多线程下，一个线程进入了if判断语句快，还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。所以多线
        程环境下，不可使用这种方式。
    
    4） 懒汉式（线程安全，同步方法）
        解决了线程安全的问题
        效率低，每个线程在想获得类实例的时候，执行getInstance方法都要进行同步。
        而其实这个方法只执行一次实例化代码就够了，后面的想获取这个实例，直接return，方法进行同步效率太低
        
        不推荐使用这种方法
    
    5） 懒汉式（线程安全，同步代码块）
        这种方式，本意时对第四种实现方式的改进，因为前面同步方法效率太低，改为同步产生实例化的代码块
        但是这种同步并不能起到线程同步的作用。跟第三种实现方式遇到的情形一致，假如一个线程进入了if，还未来得及往下执行，另一个线程也通
        过了判断语
        句，这时也会产生多个实例
        
        不能使用这种方式
    
    6） 双重检查
        double-check概念时多线程开发中常使用到的，如代码中所示，我们进行了两次if价差，这样就可以保证线程安全实例化代码只用执行一次，
        后面再次访问时，判断if直接return实例化对象，也避免的反复进行方法同步
        线程安全；延迟加载；效率较高
        
        推荐使用
        
    7） 静态内部类
        这种方式采用了类装载的机制来保证初始化实例时只有一个线程。
        静态内部类方法在Singleton类被加载时并不会立即实例化，而是在需要实例化时，调用getInstance方法，才会装载SingletonInstance
        类，从而完成Singleton的实例化。
        类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们保证了线程的安全性，在类进行初始化时，别的线程时无法进入的。
        
        避免了线程不安全，利用静态内部类特点实现延迟加载，效率高
        
        推荐使用
    
    8） 枚举
        通过枚举实现单例模式，不仅能避免多线程同步问题，而且能防止反序列化重新创建新的对象。
        这种方式时Effective Java坐着Josh Bloch提倡的方式
        
        推荐使用
        
### 2、工厂模式
    基本介绍：
        1) 简单工厂模式是属于创建型模式，是工厂模式的一种。简单工厂模式是由一个工厂对象决定创建出哪一种产品类的实例。简单工厂模式是
        工厂模式家族中最简单实用的模式
        2）简单工厂模式：定义了一个创建对象的类，由这个类来封装实例化对象的行为
        3）在软件开发中，当我们会用到大量的创建某种、某类或者某批对象时，就会使用到工厂模式
    

    
    