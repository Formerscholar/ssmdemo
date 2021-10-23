# 搭建开始——新建项目

### 1. file -> new -> project

![新建项目](https://chad-blog.oss-cn-shanghai.aliyuncs.com/oneblog/20211023164847670.png)

### 2. 新建maven项目，如图勾选 create from archetype，并选择 maven-archetype-webapp，next

![新建maven配置](https://chad-blog.oss-cn-shanghai.aliyuncs.com/oneblog/20211023164848106.png)
### 3. 输入坐标及项目名，next

![输入坐标项目名](https://chad-blog.oss-cn-shanghai.aliyuncs.com/oneblog/20211023164850864.png)

### 4. 选择maven配置，选择你自己的maven，next

![设置本地maven](https://chad-blog.oss-cn-shanghai.aliyuncs.com/oneblog/20211023164850998.png)

### 5. 确定项目名，finish

![确定项目名](https://chad-blog.oss-cn-shanghai.aliyuncs.com/oneblog/20211023164851623.png)

# 完善项目结构

### 1. 新建java目录 src/main/java

![新建java目录](https://chad-blog.oss-cn-shanghai.aliyuncs.com/oneblog/20211023164851994.png)
![新建java目录](https://chad-blog.oss-cn-shanghai.aliyuncs.com/oneblog/20211023164852358.png)

### 2. 新建资源目录 resources

![新建资源目录](https://chad-blog.oss-cn-shanghai.aliyuncs.com/oneblog/20211023164852492.png)

# 初步配置启动tomcat服务

### 1. 导入项目包 test2:war exploded　　file -> Project Structure -> Models

![配置tomcat](https://chad-blog.oss-cn-shanghai.aliyuncs.com/oneblog/20211023164853270.png)

### 选择你的项目，点击右下角 open

![选择项目](https://chad-blog.oss-cn-shanghai.aliyuncs.com/oneblog/20211023164853419.png)

### 选择maven，一路next下去，最后点击神圣的finish按钮，OK。（可能无此步骤，没有则忽略）

![选择maven](https://chad-blog.oss-cn-shanghai.aliyuncs.com/oneblog/20211023164853521.png)

### 2. 还是刚才的界面，选择 Artifacts 此时第一次是会默认有两个包，如果没有则进行此步操作　file -> Project Structure -> Artifacts

![Artifacts](https://chad-blog.oss-cn-shanghai.aliyuncs.com/oneblog/20211023164853692.png)

### 选择，点击右下 OK按钮

![OK](https://chad-blog.oss-cn-shanghai.aliyuncs.com/oneblog/20211023164854301.png)

### 最终想要得到的结果如下图：

![最终结果](https://chad-blog.oss-cn-shanghai.aliyuncs.com/oneblog/20211023164854396.png)

### 3. 进行了上述每一步操作后，很关键的要保存，点击apply 或者ok，apply按钮是不可点击状态才能关闭此面板哦，不然刚才所有操作都白费了

![保存](https://chad-blog.oss-cn-shanghai.aliyuncs.com/oneblog/20211023164855004.png)

### 4. 添加tomcat，进行相关配置 点击面板右上角

![添加tomcat](https://chad-blog.oss-cn-shanghai.aliyuncs.com/oneblog/20211023164855097.png)

### 添加配置tomcat

![配置tomcat](https://chad-blog.oss-cn-shanghai.aliyuncs.com/oneblog/20211023164855220.png)

### 添加刚才生成的包

![添加包](https://chad-blog.oss-cn-shanghai.aliyuncs.com/oneblog/20211023164858212.png)

### 最后点击，apply，ok，好了完事了，准备运行吧

![最后点击](https://chad-blog.oss-cn-shanghai.aliyuncs.com/oneblog/20211023164858839.png)

### 5. 运行tomcat 右上角面板选择debug模式运行（也可以普通模式）

![运行tomcat](https://chad-blog.oss-cn-shanghai.aliyuncs.com/oneblog/20211023164859793.png)

### 运行成功，页面显示默认生成的index.jsp的内容　　http://localhost:8085/

![运行成功](https://chad-blog.oss-cn-shanghai.aliyuncs.com/oneblog/20211023164859881.png)

# 配置spring容器等相关配置文件

### 1. 在poom.xml（位置：项目的根目录下）中引入必要的poom依赖（其中包括了spring、springmvc、jdbc、mysql、druid连接池、mybatis、lombok插件、juni他、其他工具包 ）

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.test</groupId>
    <artifactId>test</artifactId>
    <version>1.0-SNAPSHOT</version>
    <packaging>war</packaging>

    <properties>
        <org.springframework.version>4.3.7.RELEASE</org.springframework.version>
        <mybatis.version>3.5.0</mybatis.version>
    </properties>

    <dependencies>
        <!-- Spring最新的包 -->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>${org.springframework.version}</version>
        </dependency>
        <!--Spriing jdbc-->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-jdbc</artifactId>
            <version>${org.springframework.version}</version>
        </dependency>
        <dependency>
            <groupId>org.aspectj</groupId>
            <artifactId>aspectjweaver</artifactId>
            <version>1.7.4</version>
        </dependency>

        <!-- mysql连接 -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>5.1.26</version>
        </dependency>
        <!--数据库连接池druid-->
        <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>druid</artifactId>
            <version>1.0.11</version>
        </dependency>
        <!-- mybatis依赖 -->
        <dependency>
            <groupId>org.mybatis</groupId>
            <artifactId>mybatis</artifactId>
            <version>3.4.2</version>
        </dependency>
        <dependency>
            <groupId>org.mybatis</groupId>
            <artifactId>mybatis-spring</artifactId>
            <version>1.3.1</version>
        </dependency>
        <!-- 事务的配置标签 -->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-tx</artifactId>
            <version>4.3.7.RELEASE</version>
        </dependency>

        <!-- json -->
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
            <version>2.5.0</version>
        </dependency>

        <!-- lombok插件通过@data注解 实现省略写getset方法 -->
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.18.0</version>
        </dependency>

        <!-- json 包 fastjson -->
        <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>fastjson</artifactId>
            <version>1.1.39</version>
        </dependency>

        <!--单元测试-->
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
        </dependency>

        <!-- log日志  -->
        <dependency>
            <groupId>log4j</groupId>
            <artifactId>log4j</artifactId>
            <version>1.2.14</version>
        </dependency>
        <dependency>
            <groupId>commons-logging</groupId>
            <artifactId>commons-logging</artifactId>
            <version>1.2</version>
        </dependency>
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-api</artifactId>
            <version>1.6.1</version>
        </dependency>
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-log4j12</artifactId>
            <version>1.6.1</version>
        </dependency>

        <!--文件上传下载 commons-->
        <!--<dependency>
            <groupId>commons-fileupload</groupId>
            <artifactId>commons-fileupload</artifactId>
            <version>1.2.1</version>
        </dependency>
        <dependency>
            <groupId>commons-io</groupId>
            <artifactId>commons-io</artifactId>
            <version>2.2</version>
        </dependency>-->

    </dependencies>

    <build>
        <resources>
            <resource>
                <directory>src/main/java</directory>
                <excludes>
                    <exclude>**/*.java</exclude>
                </excludes>
            </resource>
            <resource>
                <directory>src/main/resources</directory>
                <filtering>true</filtering>
            </resource>
            <resource>
                <directory>src/main/java</directory>
                <includes>
                    <include>**/*.xml</include>
                </includes>
            </resource>
        </resources>
        <plugins>
            <!--编译代码插件-->
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <configuration>
                    <!-- 设置JDK版本 -->
                    <source>1.8</source>
                    <target>1.8</target>
                    <encoding>UTF-8</encoding>
                    <fork>false</fork>
                </configuration>
            </plugin>
        </plugins>
    </build>


</project>
```

### 如果想要自己添加jar包，可以在WEB-INF中新建lib文件夹，然后放入你的jar包（poom依赖下载的jar包编译过后其实也就是在编译包下的lib文件夹中）

### 2. 配置web.xml文件（位置：webapp下的WEB-INF中）　　tomcat启动时，会加载此文件，从而扫描加载其他的配置文件

![配置web.xml文件](https://chad-blog.oss-cn-shanghai.aliyuncs.com/oneblog/20211023164859979.png)
```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns="http://java.sun.com/xml/ns/javaee"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://java.sun.com/xml/ns/javaee
          http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd"
         version="3.0">

    <!-- 编码过滤器 -->
    <filter>
        <filter-name>encodingFilter</filter-name>
        <filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
        <async-supported>true</async-supported>
        <init-param>
            <param-name>encoding</param-name>
            <param-value>UTF-8</param-value>
        </init-param>
    </filter>
    <filter-mapping>
        <filter-name>encodingFilter</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>

    <!-- Spring监听器 监听加载相关配置文件-->
    <listener>
        <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
    </listener>
    <!--防止Spring内存溢出监听器-->
    <listener>
        <listener-class>org.springframework.web.util.IntrospectorCleanupListener</listener-class>
    </listener>

    <!--spring的其他配置文件(包括mybatis配置文件) -->
    <context-param>
        <param-name>contextConfigLocation</param-name>
        <param-value>
            classpath*:spring-applicationContext.xml
        </param-value>
    </context-param>

    <!--log4j日志-->
    <context-param>
        <param-name>log4jConfigLocation</param-name>
        <param-value>
            classpath:log4j.xml
        </param-value>
    </context-param>

    <!--Spring MVC servlet-->
    <servlet>
        <servlet-name>springmvc</servlet-name>
        <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
        <init-param>
            <param-name>contextConfigLocation</param-name>
            <param-value>classpath*:spring-mvc.xml</param-value>
        </init-param>
        <load-on-startup>1</load-on-startup>
    </servlet>
    <servlet-mapping>
        <servlet-name>springmvc</servlet-name>
        <url-pattern>/</url-pattern>
    </servlet-mapping>

    <!-- 访问根路径时的默认访问页面，从上到下匹配 -->
    <welcome-file-list>
        <welcome-file>/index.jsp</welcome-file>
        <welcome-file>/index.html</welcome-file>
        <welcome-file>/reg.html</welcome-file>
    </welcome-file-list>
</web-app>
```
### 其中包括了编码过滤、监听器、springmvc配置、spring容器中其他配置包括mybatis等、log4j配置、项目访问默认欢迎页，如需添加自定义过滤器，也许在此配置

### 3. 新建其他配置文件（位置：resoures下） applicationContext.xml、springmvc.xml、mybatis.xml、jdbc.properties、日志配置（log4j.properties和log4j.xml二选一，我用的log4j.xml）

![新建其他配置文件](https://chad-blog.oss-cn-shanghai.aliyuncs.com/oneblog/20211023164900079.png)

### spring-mvc.xml
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xmlns:mvc="http://www.springframework.org/schema/mvc"
       xmlns:aop="http://www.springframework.org/schema/aop"
       xmlns:task="http://www.springframework.org/schema/task"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd
       http://www.springframework.org/schema/context
       http://www.springframework.org/schema/context/spring-context.xsd
       http://www.springframework.org/schema/mvc
       http://www.springframework.org/schema/mvc/spring-mvc.xsd
       http://www.springframework.org/schema/aop
       http://www.springframework.org/schema/aop/spring-aop.xsd
       http://www.springframework.org/schema/task
       http://www.springframework.org/schema/task/spring-task-3.0.xsd">

    <!--开启springMVC注解模式-->
    <mvc:annotation-driven />

    <aop:aspectj-autoproxy proxy-target-class="true"/>

    <!-- 自动扫描，完成bean创建和自动依赖注入-->
    <context:component-scan base-package="com.test" />

    <!--避免IE执行AJAX时，返回JSON出现下载文件 -->
    <bean id="mappingJacksonHttpMessageConverter"
          class="org.springframework.http.converter.json.MappingJackson2HttpMessageConverter">
        <property name="supportedMediaTypes">
            <list>
                <value>text/html;charset=UTF-8</value>
            </list>
        </property>
    </bean>

    <!-- 启动SpringMVC的注解功能，完成请求和注解POJO的映射 -->
    <bean class="org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter">
        <property name="messageConverters">
            <list>
                <bean class="org.springframework.http.converter.ByteArrayHttpMessageConverter"/>
                <ref bean="mappingJacksonHttpMessageConverter" />  <!-- JSON转换器 -->
            </list>
        </property>
    </bean>

    <!-- 对模型视图名称的解析,即在模型视图名称添加前后缀 -->
    <bean id="viewResolver" class="org.springframework.web.servlet.view.InternalResourceViewResolver">
        <!-- 查找视图页面的前缀和后缀 -->
        <property name="prefix" value="/" />
        <property name="suffix" value=".html" />
    </bean>

    <!--<!–对上传文件的支持，springMVC其实是用common-upload来实现 –>
    <bean id="multipartResolver" class="org.springframework.web.multipart.commons.CommonsMultipartResolver">
        <!–设置上传文件的最大值,这里是字节–>
        <property name="maxUploadSize" value="102400000"></property> <!– 100M –>
        <property name="defaultEncoding" value="utf-8"></property>
    </bean>-->

    <!-- 总错误处理-->
    <bean id="exceptionResolver" class="org.springframework.web.servlet.handler.SimpleMappingExceptionResolver">
        <!--<property name="defaultErrorView">
            <value>/base/error</value>
        </property>-->
        <property name="defaultStatusCode">
            <value>500</value>
        </property>
        <property name="warnLogCategory">
            <value>org.springframework.web.servlet.handler.SimpleMappingExceptionResolver</value>
        </property>
    </bean>

    <!--静态资源配置-->
    <mvc:default-servlet-handler/>

    <!--定时器配置-->
    <task:executor id="executor" pool-size="5" />
    <task:scheduler id="scheduler" pool-size="10" />
    <task:annotation-driven executor="executor" scheduler="scheduler" />

</beans>
```

### spring-applicationContext    　　后来的其他配置文件也可以在这个里边引入比如：shiro、redis集群、cache-redis缓存、自定义组件等等（优点：不用再去动web.xml的配置）
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
   http://www.springframework.org/schema/beans/spring-beans-4.0.xsd">
    <!--mybatis配置-->
    <import resource="classpath*:spring-mybatis.xml"/>
</beans>
```

### spring-mybatis.xml
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xmlns:tx="http://www.springframework.org/schema/tx"
       xmlns:aop="http://www.springframework.org/schema/aop"
       xsi:schemaLocation="
        http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-4.0.xsd
        http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context-4.0.xsd
        http://www.springframework.org/schema/tx http://www.springframework.org/schema/tx/spring-tx-4.0.xsd
        http://www.springframework.org/schema/aop http://www.springframework.org/schema/aop/spring-aop-4.0.xsd">

    <!-- 自动扫描，Bean注入 -->
    <context:component-scan base-package="com.test"/>

    <!-- 读取配置文件信息 -->
    <context:property-placeholder ignore-unresolvable="true" location="classpath:jdbc.properties"/>

    <bean name="dataSource" class="com.alibaba.druid.pool.DruidDataSource" init-method="init" destroy-method="close">
        <!-- 数据库基本配置 -->
        <property name="driverClassName" value="${jdbc.driver}" />
        <property name="url" value="${jdbc.url}" />
        <property name="username" value="${jdbc.username}" />
        <property name="password" value="${jdbc.password}" />

        <!-- 初始化连接数量 -->
        <property name="initialSize" value="${jdbc.initialSize}"/>
        <!-- 最大并发连接数量 -->
        <property name="maxActive" value="${jdbc.maxActive}"/>
        <!-- 最小空闲连接数 -->
        <property name="minIdle" value="${jdbc.minIdle}"/>
        <!-- 配置获取连接等待超时的时间 -->
        <property name="maxWait" value="${jdbc.maxWait}" />
        <!-- 超过时间限制是否回收 -->
        <property name="removeAbandoned" value="${jdbc.removeAbandoned}" />
        <!-- 超过时间限制多长 -->
        <property name="removeAbandonedTimeout" value="${jdbc.removeAbandonedTimeout}" />
        <!-- 配置间隔多久才进行一次检测，检测需要关闭的空闲连接，单位是毫秒 -->
        <property name="timeBetweenEvictionRunsMillis" value="${jdbc.timeBetweenEvictionRunsMillis}" />
        <!-- 配置一个连接在池中最小生存的时间，单位是毫秒 -->
        <property name="minEvictableIdleTimeMillis" value="${jdbc.minEvictableIdleTimeMillis}" />
        <!-- 用来检测连接是否有效的sql，要求是一个查询语句-->
        <property name="validationQuery" value="${jdbc.validationQuery}" />
        <!-- 申请连接的时候检测 -->
        <property name="testWhileIdle" value="${jdbc.testWhileIdle}" />
        <!-- 申请连接时执行validationQuery检测连接是否有效，配置为true会降低性能 -->
        <property name="testOnBorrow" value="${jdbc.testOnBorrow}" />
        <!-- 归还连接时执行validationQuery检测连接是否有效，配置为true会降低性能  -->
        <property name="testOnReturn" value="${jdbc.testOnReturn}" />
        <property name="logAbandoned" value="true" />
        <!-- 配置监控统计拦截的filters，wall用于防止sql注入，stat用于统计分析 -->
        <property name="filters" value="stat" />
    </bean>

    <!-- MyBatis SqlSessionFactoryBean 配置 -->
    <bean id="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
        <property name="dataSource" ref="dataSource"/>
        <!-- 自动扫描Mapping.xml文件 -->
        <property name="mapperLocations" value="classpath:com/test/mapper/xml/*.xml"/>
        <!-- 配置MyBaties全局配置文件:mybatis-config.xml -->
        <property name="configLocation" value="classpath:mybatis-config.xml"/>
        <!-- 扫描model包 xml中parameterType就可以使用类名，不用全路径 -->
        <property name="typeAliasesPackage" value="com.test.model"/>
    </bean>

    <!-- 加载 mapper.xml对应的接口 配置文件 -->
    <bean id="mapperScannerConfigurer" class="org.mybatis.spring.mapper.MapperScannerConfigurer">
        <!-- 给出需要扫描mapper接口包 -->
        <property name="basePackage" value="com.test.mapper"/>
        <!-- 注入sqlSessionFactory -->
        <property name="sqlSessionFactoryBeanName" value="sqlSessionFactory" />
    </bean>

    <!-- (事务管理)transaction manager, use JtaTransactionManager for global tx -->
    <bean id="transactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
        <property name="dataSource" ref="dataSource" />
    </bean>
    <tx:annotation-driven transaction-manager="transactionManager"/>

</beans>
```

### mybatis-config.xml
```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE configuration PUBLIC "-//mybatis.org//DTD SQL Map Config 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-config.dtd">
<!--
 |   plugins在配置文件中的位置必须符合要求，否则会报错，顺序如下:
 |   properties?, settings?,
 |   typeAliases?, typeHandlers?,
 |   objectFactory?,objectWrapperFactory?,
 |   plugins?,
 |   environments?, databaseIdProvider?, mappers?
 |-->
<configuration>
    <!--
     | 全局配置设置
     |
     | 可配置选项                   默认值,     描述
     |
     | aggressiveLazyLoading       true,     当设置为‘true’的时候，懒加载的对象可能被任何懒属性全部加载。否则，每个属性都按需加载。
     | multipleResultSetsEnabled   true,     允许和不允许单条语句返回多个数据集（取决于驱动需求）
     | useColumnLabel              true,     使用列标签代替列名称。不同的驱动器有不同的作法。参考一下驱动器文档，或者用这两个不同的选项进行测试一下。
     | useGeneratedKeys            false,    允许JDBC 生成主键。需要驱动器支持。如果设为了true，这个设置将强制使用被生成的主键，有一些驱动器不兼容不过仍然可以执行。
     | autoMappingBehavior         PARTIAL,  指定MyBatis 是否并且如何来自动映射数据表字段与对象的属性。PARTIAL将只自动映射简单的，没有嵌套的结果。FULL 将自动映射所有复杂的结果。
     | defaultExecutorType         SIMPLE,   配置和设定执行器，SIMPLE 执行器执行其它语句。REUSE 执行器可能重复使用prepared statements 语句，BATCH执行器可以重复执行语句和批量更新。
     | defaultStatementTimeout     null,     设置一个时限，以决定让驱动器等待数据库回应的多长时间为超时
     | -->
    <settings>
        <!-- 这个配置使全局的映射器启用或禁用缓存 -->
        <setting name="cacheEnabled" value="true"/>
        <!-- 全局启用或禁用延迟加载。当禁用时，所有关联对象都会即时加载 -->
        <setting name="lazyLoadingEnabled" value="true"/>
        <setting name="multipleResultSetsEnabled" value="true"/>
        <setting name="useColumnLabel" value="true"/>
        <setting name="defaultExecutorType" value="REUSE"/>
        <setting name="defaultStatementTimeout" value="25000"/>
        <!-- 让控制台打印sql语句，注释掉则没有 -->
        <setting name="logImpl" value="STDOUT_LOGGING" />
        <setting name="callSettersOnNulls" value="true" />
    </settings>
</configuration>
```
###jdbc.properties
```properties
#mysql
jdbc.driver=com.mysql.jdbc.Driver

jdbc.url=jdbc:mysql://192.168.0.156:3306/test?useUnicode=true&characterEncoding=utf-8
jdbc.username=root
jdbc.password=root

jdbc.initialSize=3
jdbc.maxActive=1000
jdbc.minIdle=0
jdbc.maxWait=6000
jdbc.removeAbandoned=true
jdbc.removeAbandonedTimeout=1800
jdbc.timeBetweenEvictionRunsMillis=60000
jdbc.minEvictableIdleTimeMillis=25200000
jdbc.validationQuery=select getdate()
jdbc.testWhileIdle=false
jdbc.testOnBorrow=false
jdbc.testOnReturn=false
```

### log4j.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<!DOCTYPE log4j:configuration SYSTEM "log4j.dtd">
<log4j:configuration xmlns:log4j='http://jakarta.apache.org/log4j/'>

    <!--ConsoleAppender：输出到控制台-->
    <appender name="STDOUT" class="org.apache.log4j.ConsoleAppender">
        <!--<param name="encoding" value="UTF-8"/>-->
        <layout class="org.apache.log4j.PatternLayout">
            <param name="ConversionPattern" value="%d [%t] %p - %m%n"/>
        </layout>
        <filter class="org.apache.log4j.varia.LevelRangeFilter">
            <!-- 设置日志输出的最小级别 -->
            <param name="levelMin" value="DEBUG" />
            <!-- 设置日志输出的最大级别 -->
            <param name="levelMax" value="FATAL" />
            <!-- 设置日志输出的xxx，默认是false -->
            <param name="AcceptOnMatch" value="true" />
        </filter>
    </appender>

    <!--输出到日志文件-->
    <appender name="PROJECT" class="org.apache.log4j.DailyRollingFileAppender">
        <!-- 设置日志信息输出文件全路径名 -->
        <param name="file" value="${catalina.home}/logs/ceshi/info.log"/>
        <!--日志文件编码-->
        <param name="encoding" value="UTF-8"/>
        <!--此日志文件级别-->
        <param name="threshold" value="info"/>
        <!-- 设置是否在重新启动服务时，在原有日志的基础添加新日志 -->
        <param name="Append" value="true" />
        <!-- 设置保存备份回滚日志的最大个数 -->
        <param name="MaxBackupIndex" value="10" />
        <!-- 设置当日志文件达到此阈值的时候自动回滚，单位可以是KB，MB，GB，默认单位是KB -->
        <param name="MaxFileSize" value="50MB" />
        <!-- 设置日志输出的样式 -->
        <layout class="org.apache.log4j.PatternLayout">
            <param name="ConversionPattern" value="%d [%X{requestURIWithQueryString}] %-5p %c{2} - %m%n"/>
        </layout>
    </appender>

    <appender name="PROJECT-ERROR" class="org.apache.log4j.DailyRollingFileAppender">
        <param name="file" value="${catalina.home}/logs/ceshi/error.log"/>
        <param name="append" value="true"/>
        <param name="encoding" value="UTF-8"/>
        <param name="threshold" value="error"/>
        <param name="MaxBackupIndex" value="10" />
        <param name="MaxFileSize" value="50MB" />
        <layout class="org.apache.log4j.PatternLayout">
            <param name="ConversionPattern" value="%d [%X{requestURIWithQueryString}] %-5p %c{2} - %m%n"/>
        </layout>
    </appender>

    <!--开发测试使用debug级别-->
    <appender name="PROJECT-DEBUG" class="org.apache.log4j.DailyRollingFileAppender">
        <param name="file" value="${catalina.home}/logs/ceshi/debug.log"/>
        <param name="append" value="false"/>
        <param name="encoding" value="UTF-8"/>
        <param name="threshold" value="debug"/>
        <param name="MaxBackupIndex" value="10" />
        <param name="MaxFileSize" value="50MB" />
        <layout class="org.apache.log4j.PatternLayout">
            <param name="ConversionPattern" value="%d [%X{requestURIWithQueryString}] %-5p %c{2} - %m%n"/>
        </layout>
    </appender>

    <!--总的日志级别-->
    <root>
        <level value="DEBUG"/>
        <appender-ref ref="PROJECT"/>
        <appender-ref ref="PROJECT-DEBUG"/>
        <appender-ref ref="PROJECT-ERROR"/>
        <appender-ref ref="STDOUT"/>
    </root>
</log4j:configuration>
```
### 好了，经过以上一套噼里啪啦的操作，配置基本算是好了，接下来让我们写代码检验一下我们的配置到底对不对呢，激动人心的时刻就要来了

# 编写代码测试
### 1. java文件夹下，新建package包com.test，另外再新建包括controller、mapper、model、service的四个包

![新建包](https://chad-blog.oss-cn-shanghai.aliyuncs.com/oneblog/20211023164900437.png)
### 新建完结构如图所示

![新建完结构](https://chad-blog.oss-cn-shanghai.aliyuncs.com/oneblog/20211023164901315.png)

### 2. 在每个包下分别新建代码文件：TestController.java、TpmTestLogService.java、TpmTestLogServiceImpl.java、TpmTestLogMapper.java、TpmTestLogMapper.xml、TpmTestLog

![新建代码文件](https://chad-blog.oss-cn-shanghai.aliyuncs.com/oneblog/20211023164901435.png)

### 实体类：TpmTestLog.java
```java
package com.test.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @TpmTestLog
 * @(TPM_TEST_LOG)
 * @version : Ver 1.0
 */
@Data
public class TpmTestLog implements Serializable {


    /**
     * @备注: 主键
     * @字段:LOG_UUID bigint
     */
    private Long logUuid;


    /**
     * @备注:
     * @字段:TESTMAIN_UUID CHAR(32)
     */
    private String testmainUuid;


    /**
     * @备注:
     * @字段:OPERATION VARCHAR(20)
     */
    private String operation;


    /**
     * @备注:
     * @字段:SYSCREATEDATE VARCHAR(25)
     */
    private String syscreatedate;




}
```

###数据库交互层dao接口：TpmTestLogMapper.java
```java
package com.test.mapper;

import com.test.model.TpmTestLog;

/**
 * @TpmTestLogMapper
 * @Mapper
 * @version : Ver 1.0
 */
public interface TpmTestLogMapper {

    Long insert(TpmTestLog tpmTestLog);

}
```
### 对应的xml：TpmTestLogMapper.xml
```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="com.test.mapper.TpmTestLogMapper">

    <resultMap type="com.test.model.TpmTestLog" id="mTpmTestLog" autoMapping="true">
    </resultMap>

    <sql id="mTpmTestLogSql">
        LOG_UUID AS logUuid,
        TESTMAIN_UUID AS testmainUuid,
        OPERATION AS operation,
        SYSCREATEDATE AS syscreatedate
    </sql>

    <insert id="insert" parameterType="TpmTestLog" useGeneratedKeys="true" keyProperty="logUuid">
      INSERT INTO TPM_TEST_LOG (LOG_UUID,
                                          TESTMAIN_UUID,
                                          OPERATION,
                                          SYSCREATEDATE)
              VALUES   (#{logUuid},
                          #{testmainUuid},
                          #{operation},
                          #{syscreatedate})
    </insert>
</mapper>
```

###业务层接口类sercice：TpmTestLogService.java
```java
package com.test.service;

import com.test.model.TpmTestLog;

/**
 * @TpmTestLogService
 * @Service
 * @version : Ver 1.0
 */
public interface TpmTestLogService{

    Long ceshi(TpmTestLog tpmTestLog);
}
```
### 　业务层的实现类impl：TpmTestLogServiceImpl.java
```java
package com.test.service.impl;

import com.test.mapper.TpmTestLogMapper;
import com.test.model.TpmTestLog;
import com.test.service.TpmTestLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @TpmTestLogServiceImpl
 * @ServiceImpl
 * @version : Ver 1.0
 */
@Service
@Transactional
public class TpmTestLogServiceImpl implements TpmTestLogService {

    @Autowired
    private TpmTestLogMapper tpmTestLogMapper;

    @Override
    public Long ceshi(TpmTestLog tpmTestLog) {
        return tpmTestLogMapper.insert(tpmTestLog);
    }
}
```

### 接口逻辑层controller：TestController.java
```java
package com.test.controller;

import com.alibaba.fastjson.JSONObject;
import com.test.model.TpmTestLog;
import com.test.service.TpmTestLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired
    private TpmTestLogService tpmTestLogService;

    @GetMapping("/test")
    public JSONObject test(){

        JSONObject jsonObject = new JSONObject();

        TpmTestLog tpmTestLog = new TpmTestLog();
        tpmTestLog.setSyscreatedate("asfasgags");
        tpmTestLog.setTestmainUuid("fdasgassfsarew");
        tpmTestLog.setOperation("新增");
        tpmTestLogService.ceshi(tpmTestLog);

        jsonObject.put("title", "测试成功" + tpmTestLog.getLogUuid());
        return jsonObject;
    }

}
```


### 3. 数据库交互，测试表以及数据库连接文件jdbc中的配置（文中5.3已有配置文件）  Table：TPM_TEST_LOG
```sql
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `TPM_TEST_LOG`
-- ----------------------------
DROP TABLE IF EXISTS `TPM_TEST_LOG`;
CREATE TABLE `TPM_TEST_LOG` (
  `LOG_UUID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `TESTMAIN_UUID` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `OPERATION` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `SYSCREATEDATE` varchar(25) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`LOG_UUID`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

SET FOREIGN_KEY_CHECKS = 1;
```

###4. 测试接口  因为是写的测试是get请求，所以可以直接在浏览器中测试，地址栏输入接口地址（4.4中你配置的地址），回车访问，如下图

![测试接口](https://chad-blog.oss-cn-shanghai.aliyuncs.com/oneblog/20211023164902017.png)

#前端页面和接口交互测试
###1. 编写前端页面测试代码（不要说你是后台，不会写前端代码，不会也没关系，直接copy吧，有问题找google）

![编写前端页面测试代码](https://chad-blog.oss-cn-shanghai.aliyuncs.com/oneblog/20211023164902108.png)

###前边生成的index.jsp我们稍加改动
```html
<html>
<body>
<h2>Hello World!</h2>

<script src="./js/jquery.min.js"></script>
<script>
    $(function(){
        $(document).ready(function(){
            $.getJSON("/api/test",function(res){
                console.log(res)
                $("h2").text(res.title)
            });
        })
    })
</script>
</body>
</html>
```

### 由于页面中引用了万能的jquery语法，所以在webapp下新建js文件夹，并放入jquery文件，[点击下载](https://blog-static.cnblogs.com/files/mufengforward/jquery.min.js)

### 2. 接下来见证奇迹，打开页面地址：http://localhost:8085/index.jsp

![见证奇迹](https://chad-blog.oss-cn-shanghai.aliyuncs.com/oneblog/20211023164902458.png)

### 后台经过与数据库交互后，把插入数据库后生成的主键4返回给前端，前端显示在页面中





### 到这里这个简单的ssm框架就算搭建完成了！

### 参考连接 [申镇华-博客园](https://www.cnblogs.com/shenzhenhuaya/p/sdfsdwe.html)



