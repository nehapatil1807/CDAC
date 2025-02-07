# Advanced Java Interview Questions and Answers

## 1. What is HttpServletRequest Object?

### **Answer:**
The `HttpServletRequest` object represents the client's request in a **Java Servlet**. It contains data such as request parameters, headers, cookies, session info, and request methods (GET, POST, etc.).

### **Real-Time Example:**
🔹 Suppose you have a **login page** where a user enters their **username** and **password**.  
When the form is submitted, the **HttpServletRequest** object captures the input data:

```java
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    
    if ("admin".equals(username) && "password123".equals(password)) {
        response.getWriter().write("Login Successful!");
    } else {
        response.getWriter().write("Invalid Credentials");
    }
}
```

Here, `request.getParameter("username")` retrieves the username entered by the user in real-time.

---

## 2. Why Do We Need It?

### **Answer:**
The `HttpServletRequest` object is needed to **handle client requests** in a Java web application. It allows the servlet to:

1. **Retrieve Form Data** – Get user input from forms (e.g., login, registration).
2. **Read Request Headers** – Extract details like `User-Agent`, `Referer`, `Cookie`, etc.
3. **Handle Sessions** – Manage user sessions using `request.getSession()`.
4. **Determine Request Type** – Check whether the request is `GET` or `POST`.
5. **Retrieve Request Parameters** – Access query strings like `?id=123`.

### **Real-Time Example:**
🔹 **E-commerce Checkout Page**  
When a customer submits an order, the servlet uses `HttpServletRequest` to capture order details:

```java
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String productId = request.getParameter("productId");
    String quantity = request.getParameter("quantity");
    String paymentMode = request.getParameter("paymentMode");

    response.getWriter().write("Order placed for Product ID: " + productId + " with Quantity: " + quantity);
}
```

Without `HttpServletRequest`, the servlet **wouldn't be able to read client input**, making interactive web applications impossible.

---

## 3. How Many Types of Requests?

### **Answer:**
In **Advanced Java (Servlets & JSP)**, there are several types of HTTP requests. The most commonly used are:

1. **GET** – Retrieves data from the server.  
   - 🔹 **Example:** Fetching product details on an e-commerce site.
   - **Code Example:**
     ```java
     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
         response.getWriter().write("Fetching product details...");
     }
     ```

2. **POST** – Sends data to the server (e.g., form submission).  
   - 🔹 **Example:** User login or order placement.
   - **Code Example:**
     ```java
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
         String username = request.getParameter("username");
         response.getWriter().write("Welcome, " + username);
     }
     ```

3. **PUT** – Updates existing data on the server.  
   - 🔹 **Example:** Updating a user’s profile.
   - **Code Example:**
     ```java
     protected void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException {
         response.getWriter().write("User profile updated.");
     }
     ```

4. **DELETE** – Deletes data from the server.  
   - 🔹 **Example:** Removing an item from the cart.
   - **Code Example:**
     ```java
     protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException {
         response.getWriter().write("Item removed from cart.");
     }
     ```

5. **HEAD** – Similar to `GET` but only fetches headers, not the body.
   - 🔹 **Example:** Checking if a resource exists without downloading it.

6. **OPTIONS** – Lists allowed HTTP methods for a resource.
   - 🔹 **Example:** Checking which HTTP methods are supported.

7. **PATCH** – Partially updates existing data.  
   - 🔹 **Example:** Changing only the email field in a user profile.

📌 **Most commonly used: `GET` and `POST` in web applications!** 🚀

---

## 4. Difference Between GET and POST Request?

### **Answer:**

| Feature        | **GET** | **POST** |
|--------------|--------|--------|
| **Purpose** | Fetches data from the server | Sends data to the server |
| **Data Visibility** | Appends data in the URL (`?key=value`) | Sends data in the request body (hidden) |
| **Security** | Less secure (visible in URL, stored in browser history) | More secure (data not stored in history) |
| **Data Length** | Limited (URL length restrictions) | No limit on data size |
| **Caching** | Can be cached | Not cached |
| **Use Case** | Search queries, fetching details (e.g., product details) | Login, form submission, payment processing |

### **Real-Time Example**

🔹 **GET Example (Fetching Product Details)**
```java
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    String productId = request.getParameter("id");
    response.getWriter().write("Product Details for ID: " + productId);
}
```
📌 **URL Example:**  
`https://example.com/product?id=123`

🔹 **POST Example (User Login Form Submission)**
```java
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    response.getWriter().write("Welcome, " + username);
}
```
📌 **Data Sent in Body (Not visible in URL)**

✅ **Use `GET` for reading data & `POST` for sensitive or large data submissions!** 🚀

## Java Web Development Questions with Answers

### 5. When to use GET and when to use POST?

| Criteria | GET | POST |
|----------|-----|------|
| Use Case | When retrieving data (Read operation) | When submitting or modifying data (Create, Update, Delete) |
| Data Visibility | Sent in the URL (visible) | Sent in the request body (hidden) |
| Security | Less secure (data exposed in URL) | More secure (data not logged in URL) |
| Bookmarking & Caching | Can be bookmarked & cached | Cannot be bookmarked & usually not cached |
| Data Limit | Limited (URL length restriction) | No size limitation (suitable for large data) |
| Idempotency | Should be idempotent (same request, same response) | Not necessarily idempotent (multiple submissions create different results) |

**Examples:**
- **GET Example (Fetching product details)**: `https://example.com/products?category=shoes&brand=nike`
- **POST Example (User login)**: `POST https://bankingapp.com/api/login`

---

### 7. Why is there a need for a URL to a Servlet?

A URL is required to access a servlet because:
- **Client-Server Communication**: Clients send requests via URLs to map to specific servlets.
- **Routing Requests**: URLs determine which servlet handles a request.
- **Separation of Concerns**: URLs define functionalities (`/login`, `/register`).
- **Scalability**: Allows servlets to handle multiple request types dynamically.
- **RESTful Design**: Enables integration with frontend applications.

**Example:**
```java
@WebServlet("/orders/status")
public class OrderStatusServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String orderId = req.getParameter("orderId");
        resp.getWriter().println("Order Status for ID: " + orderId + " is Shipped");
    }
}
```
**URL Access**: `https://example.com/orders/status?orderId=12345`

---

### 8. How to give a URL to a Servlet?

There are two methods:

1. **Using `@WebServlet` Annotation** (Preferred)
```java
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getWriter().println("Hello, Servlet!");
    }
}
```
**URL Access**: `http://localhost:8080/yourapp/hello`

2. **Using `web.xml`** (Older Approach)
```xml
<servlet>
    <servlet-name>HelloServlet</servlet-name>
    <servlet-class>HelloServlet</servlet-class>
</servlet>
<servlet-mapping>
    <servlet-name>HelloServlet</servlet-name>
    <url-pattern>/hello</url-pattern>
</servlet-mapping>
```

---

### 9. Purpose of `web.xml`?

`web.xml` (Deployment Descriptor) is used for configuring web components.

**Key Uses:**
- **Servlet Configuration & URL Mapping**
- **Session Management** (`<session-config>`, `<session-timeout>30</session-timeout>`)
- **Welcome Page Configuration** (`<welcome-file>index.html</welcome-file>`)
- **Error Page Handling** (`<error-page> <error-code>404</error-code> <location>/error404.html</location> </error-page>`)
- **Security Configuration** (`<security-constraint>`)
- **Filter Configuration** (`<filter-mapping>`)

---

### 10. What is a Container?

A **Container** in Java provides an environment for executing servlets, JSPs, and enterprise applications.

**Types of Containers:**
- **Servlet Container (Web Container)**: Manages servlets and HTTP requests. _(Examples: Tomcat, Jetty)_
- **EJB Container**: Manages business logic components. _(Examples: WildFly, JBoss)_
- **Application Server (Full Java EE Container)**: Provides enterprise-level services. _(Examples: WebLogic, JBoss)_
- **Spring Container**: Manages Spring Beans and dependency injection.

**Example:**
```java
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getWriter().println("Hello from Servlet Container!");
    }
}
```
**Access URL**: `http://localhost:8080/yourapp/hello`

---

### 11. What is JSP?

**JSP (JavaServer Pages)** is a server-side technology that allows embedding Java in HTML.

**Features:**
- Mixes Java & HTML (`<%= new java.util.Date() %>`)
- Faster Development than Servlets
- Built-in Objects (`request`, `response`, `session`)
- Supports Custom Tags and Expression Language

**Example:**
```jsp
<h2>Welcome to JSP!</h2>
<p>Current Time: <%= new java.util.Date() %></p>
```

---

### 12. Why use JSP?

**Advantages of JSP:**
- Simplifies HTML + Java Integration
- Reduces Code Complexity (Compared to Servlets)
- Supports Reusability with JSP Tags & Expression Language
- Built-in Objects (`session`, `request`)
- Supports MVC Architecture

**Example:**
Servlet:
```java
request.setAttribute("message", "Hello from Servlet!");
request.getRequestDispatcher("hello.jsp").forward(request, response);
```
JSP:
```jsp
<h2>Message: ${requestScope.message}</h2>
```

---

 ## 13. Difference Between Statement and PreparedStatement in JDBC

### Feature Comparison
| Feature             | Statement                                      | PreparedStatement                          |
|---------------------|--------------------------------|--------------------------------|
| Definition         | Executes simple SQL queries.  | Precompiles SQL queries for better performance. |
| Query Compilation  | Compiled every time it runs.  | Compiled only once, then reused. |
| Performance       | Slower for repeated execution. | Faster for repeated execution. |
| Security         | Vulnerable to SQL Injection. | Prevents SQL Injection. |
| Parameter Handling | Uses string concatenation. | Uses placeholders (?) for dynamic values. |
| Best Used For | Single-use queries (e.g., table creation). | Repeated queries (e.g., inserting multiple records). |

### Real-Time Example

#### Using Statement (Vulnerable to SQL Injection 🚨)
```java
Statement stmt = conn.createStatement();
String user = "admin";  
String query = "SELECT * FROM users WHERE username = '" + user + "'";  
ResultSet rs = stmt.executeQuery(query);
```
🔴 If a hacker inputs `admin' OR '1'='1`, the query becomes:
```sql
SELECT * FROM users WHERE username = 'admin' OR '1'='1'
```
✅ Result: All users' data is exposed (SQL Injection 🚨).

#### Using PreparedStatement (Secure ✅)
```java
PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM users WHERE username = ?");
pstmt.setString(1, "admin");  
ResultSet rs = pstmt.executeQuery();
```
✅ Benefits:
- Prevents SQL Injection.
- Reuses the query for multiple executions, improving performance.

### When to Use?
- Use `Statement` for one-time queries (e.g., `CREATE TABLE`).
- Use `PreparedStatement` for repeated queries (e.g., `INSERT`, `UPDATE`, `SELECT` with parameters). 🚀

---

## 14. Ways to Track Sessions in Java Web Applications

### Session Tracking Methods
| Method               | Description                                      | When to Use?              |
|----------------------|-------------------------------------------------|---------------------------|
| **Cookies** 🍪      | Stores session data in the browser.             | Simple session tracking.  |
| **URL Rewriting** 🔗 | Appends session ID to the URL.                   | When cookies are disabled. |
| **Hidden Form Fields** 📩 | Stores session data in form inputs. | For form-based navigation. |
| **HttpSession API** 🛠️  | Uses HttpSession to store data on the server. | Best for secure session management. |

### 1️⃣ Using Cookies (Stored on Client)
#### Example: Setting a Cookie in Java Servlet
```java
Cookie cookie = new Cookie("username", "JohnDoe");
cookie.setMaxAge(60 * 60);  // 1 hour
response.addCookie(cookie);
```
#### Reading Cookie in JSP
```jsp
<%
   Cookie[] cookies = request.getCookies();
   for (Cookie c : cookies) {
      if ("username".equals(c.getName())) {
          out.println("User: " + c.getValue());
      }
   }
%>
```
✅ Pros: Works across requests automatically.
❌ Cons: Can be disabled by the user.

### 2️⃣ Using URL Rewriting (Appending Session ID in URL)
#### Example:
```jsp
<a href="profile.jsp?sessionId=<%= session.getId() %>">Go to Profile</a>
```
✅ Pros: Works when cookies are blocked.
❌ Cons: Exposes session ID in URL (security risk).

### 3️⃣ Using Hidden Form Fields (Stored in Form Inputs)
#### Example in HTML Form:
```html
<form action="dashboard.jsp" method="post">
    <input type="hidden" name="userId" value="12345">
    <input type="submit" value="Submit">
</form>
```
✅ Pros: Works well for form-based interactions.
❌ Cons: Limited to form submissions.

### 4️⃣ Using HttpSession (Best Approach)
#### Storing Session Data
```java
HttpSession session = request.getSession();
session.setAttribute("username", "JohnDoe");
```
#### Retrieving Session Data
```jsp
<p>Welcome, <%= session.getAttribute("username") %>!</p>
```
✅ Pros: Secure, automatic session management.
❌ Cons: Uses server memory (not ideal for large-scale apps).

### 🔹 Real-Time Example: E-Commerce Website
- **User logs in:** HttpSession stores user ID.
- **User adds items to cart:** Session data is tracked.
- **User checks out:** Data remains available.

### Conclusion
- **Use HttpSession** for most cases.
- **Use Cookies** for simple tracking.
- **Use URL Rewriting** if cookies are disabled.
- **Use Hidden Form Fields** for form-based tracking. 🚀

---

## 15. Name Session Tracking Methods

The four session tracking methods in Java are:
1️⃣ **Cookies** 🍪
2️⃣ **URL Rewriting** 🔗
3️⃣ **Hidden Form Fields** 📩
4️⃣ **HttpSession API** 🛠️

These methods help maintain user session data across multiple requests in web applications. 🚀




