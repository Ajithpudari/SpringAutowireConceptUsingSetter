# SpringAutowireConceptUsingSetter
The @Autowired annotation provides more fine-grained control over where and how autowiring should be accomplished. we can use @Autowired annotation to auto wire spring bean on setter method, instance variable, and constructor. If you use @Autowired annotation, spring container auto-wires the bean by matching data type.

To use auto-wire feature through annotations, we must include annotation-config tag with in our xml based configuration file: <context:annotation-config />

```
<bean id="paymentGateway" class="bean.PaymentGateway"/>
<bean id="orderBean" class="bean.Order" >
    <property name="item" value=" java Book" />
    <property name="price" value="RS 225" />
</bean>```


 #### Here we are done setter based Autowiring :
 ```
 @Autowired
    public void setOrder(Order order) {
        this.order = order;
    }```
    
    
  #### Required Tools and Softwares:
-Java_8V - Programing Language
-IDE(IntelliJIDEA)
-spring
