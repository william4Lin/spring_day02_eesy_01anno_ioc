 用于创建对象的
 *      他们的作用就相当于在xml配置文件中编写一个<bean>标签实现的功能一样
 *      @Component：把当前类对象存入spring容器中，
 *      其属性：value：用于指定bean的id。当我们不写这个属性时，其默认值就是当前的类名，且首字母小写
 *      @Controller：一般用在表现层
 *      @Service：一般用在业务层
 *      @Repository：一般用在持久层
 *      以上三个注解，他们的作用和属性与component是一模一样的
 *      他们三个是spring框架为我们提供明确的三层使用的注解，是我们的三层对象更加清晰
 *
 * 用于注入数据的
 *      他们的作用就相当于在xml配置文件中bean标签下的<property>标签实现的功能一样
 *      @Autowired:自动按照类型注入，只要容器中有唯一的一个bean对象，类型和要注入的变量类型匹配，就可以注入成功
 *      如果这个ioc容器中没有任何bean的类型和要注入的变量类型匹配，则报错
 *      如果ioc容器中有多个类型匹配时，要结合下面两个注解Qualifier和Resource使用
 *      出现位置：可以是变量上，也可以是方法上
 *      细节：
 *          在使用注解注入时，set方法就不是必须的了
 *      @Qualifier：在按照类型注入的基础之上，再按照名称注入。他给类成员注入时不能单独使用，但是给方法参数注入时可以单独使用
 *          属性：value：用于指定注入bean的id
 *      @Resource：直接按照bean的id注入。他可以独立使用
 *          属性：name：用于指定bean的id
 *
 *       以上三个注解都只能注入其他bean类型的数据，而基本类型和String类型无法使用上述注解实现
 *       另外集合类型的注入只能通过xml实现。
 *
 *       @Value：用于注入基本类型和String类型的数据
 *          属性：value：用于指定数据的值，可以使用Spring中的SpEL
 *                      SpEl的写法：${表达式}
 *
 *
 * 用于改变作用范围的
 *      他们的作用和在bean标签中使用scope属性实现的功能一样
 *      @Scope：用于指定bean的作用范围
 *      属性：value：指定范围的值。常用取值：singleton（默认值）和prototype
 * 和生命周期相关的
 *      他们的作用和在bean标签中使用init-method和destroy-method的作用是一样的
 * @PreDestroy：用于指定销毁方法
 * @PostConstruct：用于指定初始化方法
