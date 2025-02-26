# Advanced Java Interview Questions & Answers

## 1. Explain Servlet & JSP life cycle?

### Servlet Life Cycle:
A servlet follows a specific life cycle defined by the Servlet API:

1. **Loading & Instantiation** - The servlet container loads the servlet class and instantiates it.
2. **Initialization (init method)** - The `init()` method is called once to initialize the servlet.
3. **Service Execution (service method)** - The `service()` method is called for each request and delegates requests to `doGet()` or `doPost()` methods.
4. **Destruction (destroy method)** - The `destroy()` method is called before the servlet is removed from memory.

_Real-time Example_: Consider a banking application where a login servlet handles user authentication. The `init()` method sets up database connections, the `service()` method verifies credentials, and the `destroy()` method closes the database connections.

### JSP Life Cycle:
1. **Translation** - The JSP is converted into a servlet.
2. **Compilation** - The generated servlet is compiled into bytecode.
3. **Loading & Instantiation** - The servlet class is loaded and instantiated.
4. **Initialization (`jspInit()`)** - The JSP initializes required resources.
5. **Request Processing (`_jspService()`)** - The page processes user requests dynamically.
6. **Destruction (`jspDestroy()`)** - Resources are released before removal.

_Real-time Example_: A JSP page displaying the latest news on a portal fetches data from a database using `_jspService()`. When the page is closed, `jspDestroy()` cleans up any open connections.

---

## 2. What is the difference between Redirect and RequestDispatcher scenario?

| Feature         | SendRedirect | RequestDispatcher |
|---------------|-------------|----------------|
| Client Interaction | Yes, involves client-side redirect | No, forward happens on the server-side |
| Performance | Slower (extra request-response cycle) | Faster (internal forwarding) |
| URL Change | Yes | No |
| Scope | New request created | Uses the same request |

_Real-time Example_: 
- **SendRedirect**: If a user logs in and the authentication is successful, redirecting them to the dashboard (`response.sendRedirect("dashboard.jsp")`).
- **RequestDispatcher**: Forwarding a request from a login form (`request.getRequestDispatcher("home.jsp").forward(request, response);`).

---

## 3. What is session tracking? How to do it in Java?

Session tracking is a technique to maintain user state across multiple requests.

### Methods:
1. **Cookies** - Stores session ID on the client-side.
2. **Hidden Fields** - Stores session data in HTML fields.
3. **URL Rewriting** - Appends session ID in URL.
4. **HttpSession** - Java’s built-in session management.

_Real-time Example_: An e-commerce website maintains a user's shopping cart using `HttpSession`. When a user adds an item to the cart, it remains available even after navigating to another page.

---

## 4. What is Hibernate? Explain Hibernate architecture.

Hibernate is an ORM (Object-Relational Mapping) framework for interacting with databases using Java objects.

### Architecture Components:
1. **Configuration** - Defines database settings in `hibernate.cfg.xml`.
2. **SessionFactory** - Manages sessions.
3. **Session** - Provides database interaction.
4. **Transaction** - Ensures ACID properties.
5. **Query** - Performs database queries.

_Real-time Example_: A hospital management system using Hibernate to map `Patient` and `Doctor` entities to database tables, enabling CRUD operations without writing complex SQL.

---

## 5. Explain Hibernate Entity Life Cycle?

1. **Transient** - Object is not associated with Hibernate session.
2. **Persistent** - Object is associated with session and saved in the database.
3. **Detached** - Object is disconnected from session.
4. **Removed** - Object is marked for deletion.

_Real-time Example_: A new `Order` object is created (`Transient`), saved (`Persistent`), detached after closing session (`Detached`), and deleted (`Removed`) when canceled.

---

## 6. What is the difference between get() and load() of Hibernate?

| Method  | get()  | load()  |
|---------|--------|--------|
| Returns | Fully initialized object | Proxy object |
| If Not Found | Returns null | Throws `ObjectNotFoundException` |

_Real-time Example_: `session.get(User.class, 1)` fetches a user immediately, whereas `session.load(User.class, 1)` fetches lazily and throws an exception if the record is missing.

---

## 7. How can we call a stored procedure in Hibernate?

Using `@NamedStoredProcedureQuery` or `Session.createStoredProcedureQuery()`.

_Real-time Example_: Calling `calculate_salary` stored procedure for payroll management.

```java
StoredProcedureQuery query = session.createStoredProcedureQuery("calculate_salary");
query.execute();
```

---

## 8. What is 10C and Dependency Injection?

10C represents cloud-native principles like **containerization, CI/CD, microservices, etc.**

Dependency Injection (DI) is a design pattern that injects dependencies instead of creating them manually.

_Real-time Example_: Injecting a `PaymentService` into `OrderService` in a shopping application using Spring’s `@Autowired`.

---

## 9. What is auto-wiring? Types of auto-wiring? Prototype bean in singleton?

Auto-wiring allows Spring to inject dependencies automatically.

### Types:
1. **byType** - Matches bean by type.
2. **byName** - Matches bean by name.
3. **constructor** - Uses constructor for injection.
4. **autodetect** - Detects automatically.

_Real-time Issue_: A prototype bean injected into a singleton bean may cause inconsistency, as the singleton does not recognize the new prototype instances.

---

## 10. Explain Spring Bean Life Cycle & Scopes?

### Bean Life Cycle:
1. **Instantiation**
2. **Initialization (`@PostConstruct`)**
3. **Destruction (`@PreDestroy`)**

### Bean Scopes:
1. **Singleton** - One instance per Spring container.
2. **Prototype** - New instance for each request.
3. **Request** - Per HTTP request.
4. **Session** - Per HTTP session.
5. **Application** - Shared across application.

_Real-time Example_: `@Scope("prototype")` ensures different beans for multiple requests.

---

## 11. What is @Transactional? Why use it on the service layer?

`@Transactional` manages transactions and rollbacks on failure.

_Real-time Example_: Transferring money between accounts ensures both debit and credit happen together.

---

## 12. Explain Spring MVC life cycle?

Spring MVC follows a structured request handling process:

1. **Request Processing** - The client sends a request to the server.
2. **DispatcherServlet** - It receives the request and acts as the front controller.
3. **Handler Mapping** - Determines the appropriate controller to handle the request.
4. **Controller Execution** - The selected controller processes the request and returns a ModelAndView.
5. **View Resolver** - Resolves the view (e.g., JSP, Thymeleaf) based on the returned ModelAndView.
6. **View Rendering** - The final HTML response is rendered and sent back to the client.

_Real-time Example_: When a user logs into a banking application, the login request is processed by `DispatcherServlet`, mapped to a `LoginController`, authenticated, and forwarded to a `dashboard.jsp` view for rendering.

---

