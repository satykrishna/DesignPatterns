
### Design Patterns


------------------------------------------------------------

The following design patterns are part of this project


*   Factory Patterns 
*   Abstract Factory Pattern
*	Singleton Pattern
* 	Builder Pattern
*	Prototype Pattern
*	Adapter Pattern
*	Bridge Pattern
*	Filter Pattern
*	Composite Pattern
*	Decoration Pattern
*	Facade Pattern
*	FlyWeight Pattern
*	Proxy Pattern
*	Chain of Responsibility Pattern
*   Interpreter Pattern
*	Iterator Pattern
*	Mediator Pattern
*	Memento Pattern
*	Observatory pattern
*	State pattern
*	NullObject pattern
*	Strategy Pattern
*	Visitor Pattern

###### Mediator Pattern

This pattern provides a mediator class which normally handles all the communications between different classes and supports easy maintenance of the code by loose coupling. Mediator pattern falls under behavioral pattern category.


###### Memento Pattern

This pattern has 3 actors

   1. Memento
   2. Originator
   3. CareTaker
   
   Memento contains state of the object to be restored
   
   Originator creates and stores states in Memento objects
   
   Caretaker is responsible to restore object state from memento
   
   
###### Observatory Pattern

Observatory Pattern uses three characters. 

   1. Subject
   2. Observer
   3. Client
   
   Subject is an object having methods to attach and detach Observers to a client object
   

###### State Pattern

In state pattern a class behavior changes based on its state. This type of design pattern comes under behavior pattern.

###### Null Object Pattern

In Null Pattern, instead of returning a default null value for a non existing object, we return a default Object

###### Strategy Pattern

In strategy pattern a class behavior or its algorithm can be changed at run time. 
This type of design pattern comes under behavior pattern

###### Template Pattern

In this pattern, an abstract class exposes defined ways or templates to execute its methods. Its subclasses can override the method implementation as per need but the invocation is to be in the same way as defined by an abstract class. This pattern comes under pattern category.


###### Visitor Pattern

In Visitor pattern, we use a visitor class which changes the executing algorithm of an element class. By this way, execution algorithm of element can vary as and when visitor varies. This pattern comes under behavior pattern category. As per the pattern, element object has to accept the visitor object so that visitor object handles the operation on the element object. 

###### MVC Pattern

MVC Pattern stands for Model-View-Controller Pattern. This pattern is used to separate application's concerns.

    Model - Model represents an object or JAVA POJO carrying data. It can also have logic to update controller if its data changes.

    View - View represents the visualization of the data that model contains.

    Controller - Controller acts on both model and view. It controls the data flow into model object and updates the view whenever data changes. It keeps view and model separate.
    
    
  

 