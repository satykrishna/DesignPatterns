
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
*	MVC pattern
*	Business Delegate Pattern
*	Composite Entity Pattern
*	Data Access Object Pattern
*  	The Front Controller Design Pattern
*	Interceptor Filtering Pattern
*	Transfer Object Pattern
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
    
###### Business Pattern

Business Delegate Pattern is used to decouple presentation tier and business tier. It is basically use to reduce communication or remote lookup functionality to business tier code in presentation tier code. In business tier we have following entities.


    Client - Presentation tier code may be JSP, servlet or UI java code.

    Business Delegate - A single entry point class for client entities to provide access to Business Service methods.

    LookUp Service - Lookup service object is responsible to get relative business implementation and provide business object access to business delegate object.

    Business Service - Business Service interface. Concrete classes implement this business service to provide actual business implementation logic.

###### Composite Pattern

Composite Entity pattern is used in EJB persistence mechanism. A Composite entity is an EJB entity bean which represents a graph of objects. When a composite entity is updated, internally dependent objects beans get updated automatically as being managed by EJB entity bean. Following are the participants in Composite Entity Bean.



    Composite Entity - It is primary entity bean. It can be coarse grained or can contain a coarse grained object to be used for persistence purpose.

    Coarse-Grained Object - This object contains dependent objects. It has its own life cycle and also manages life cycle of dependent objects.

    Dependent Object - Dependent object is an object which depends on coarse grained object for its persistence lifecycle.

    Strategies - Strategies represents how to implement a Composite Entity.

###### DataAccess Object Pattern

Data Access Object Pattern or DAO pattern is used to separate low level data accessing API or operations from high level business services. Following are the participants in Data Access Object Pattern.

    Data Access Object Interface - This interface defines the standard operations to be performed on a model object(s).

    Data Access Object concrete class - This class implements above interface. This class is responsible to get data from a data source which can be database / xml or any other storage mechanism.

    Model Object or Value Object - This object is simple POJO containing get/set methods to store data retrieved using DAO class.
    
###### The Front Controller Design Pattern

The front controller is used to provide a centralized request handling mechanism so that all the requests will be handled by a single handler. This handler can do the authentication or authorization or logging or tracking of request and then pass the requests to the corresponding handlers.

`following are the entities of this design pattern`

Following are the entities of this type of design pattern.

    Front Controller - Single handler for all kinds of requests coming to the application (either web based/ desktop based).

    Dispatcher - Front Controller may use a dispatcher object which can dispatch the request to corresponding specific handler.

    View - Views are the object for which the requests are made.

###### Intercepter Filter Pattern
The intercepting filter design pattern is used when we want to do some pre-processing / post-processing with request or response of the application. Filters are defined and applied on the request before passing the request to actual target application. Filters can do the authentication/ authorization/ logging or tracking of request and then pass the requests to corresponding handlers. Following are the entities of this type of design pattern.

    Filter - Filter which will performs certain task prior or after execution of request by request handler.

    Filter Chain - Filter Chain carries multiple filters and help to execute them in defined order on target.

    Target - Target object is the request handler

    Filter Manager - Filter Manager manages the filters and Filter Chain.

    Client - Client is the object who sends request to the Target object.

###### Service Locator Pattern

The service locator design pattern is used when we want to locate various services using JNDI lookup. Considering high cost of looking up JNDI for a service, Service Locator pattern makes use of caching technique. For the first time a service is required, Service Locator looks up in JNDI and caches the service object. Further lookup or same service via Service Locator is done in its cache which improves the performance of application to great extent. Following are the entities of this type of design pattern.

`Service - Actual Service which will process the request. Reference of such service is to be looked upon in JNDI server.`

`Context / Initial Context - JNDI Context carries the reference to service used for lookup purpose.`

`Service Locator - Service Locator is a single point of contact to get services by JNDI lookup caching the services.`

`Cache - Cache to store references of services to reuse them`

`Client - Client is the object that invokes the services via ServiceLocator.`

###### Transfer Object Pattern
The Transfer Object pattern is used when we want to pass data with multiple attributes in one shot from client to server. Transfer object is also known as Value Object. Transfer Object is a simple POJO class having getter/setter methods and is serializable so that it can be transferred over the network. It does not have any behavior. Server Side business class normally fetches data from the database and fills the POJO and send it to the client or pass it by value. For client, transfer object is read-only. Client can create its own transfer object and pass it to server to update values in database in one shot. Following are the entities of this type of design pattern.

    Business Object - Business Service fills the Transfer Object with data.

    Transfer Object - Simple POJO having methods to set/get attributes only.

    Client - Client either requests or sends the Transfer Object to Business Object.


