# Source Control (VSS, TFS, Azure DevOps)

### IBM Tools: Clear Case

## Source Code Management
Your role could be Owner or Contributor:
- Creating repositories
- Managing repositories
- Adding contributors
- Controlling repositories
- Pulling content
- Pushing content
- Versioning (branching)

### Git
**Client App**: A tool used by contributors to sync with GitHub.

Tools:
- `gitbash`
- `git`

Commands:
- **Create a repository**: `git init`
- **Check status**: `git status`
- **Log**: `git log`
- **Check staging area**: `git status`
- **Add new files, accept changes into staging area**: `git add .`
- **Commit changes into staging area**: `git commit -m "message"`
- **Push local staging area content to remote repo**: `git push`
- **Clone remote repo to local machine**: `git clone`
- **Pull latest changes of remote repo to local repo**: `git pull`
- **Set your username**: `git config --global user.name "FIRST_NAME LAST_NAME"`
- **Set your email address**: `git config --global user.email "MY_NAME@example.com"`
- **Set your password**: `git config --global user.password "public access token"`

### Versioning

### GitHub
**Web App**: Centralized, personalized, collaborative code repository.

---

## Software Engineering

### Software
- **Consumers**: Software bridges the gap between consumers and hardware.
- **IT Team**
- **Software Process**:
  - Vehicle
  - Software
  - Services (product, process, continuous improvement in existing product)

**Definition**: A disciplined approach for production and an art of science.

### IT Services
- **Software Services on top of Hardware Services**
- **Service**: Platform, Infrastructure
- **Shopping Service**: Web Portal, DataCenter

### Software Product
**Example**: Vijay Sales Online Store

### Software Solution
**Example**: Vijay Sales ECommerce Solution

#### Components:
- **Documents**
  - SRS
- **Diagrams**
- **Source Code** (GitHub repository)
  - Project MVC (Front End + Back End)
  - Project REST API
  - Project Class Libraries (namespaces, .NET types, methods, and members)
  - Logic + Data Structure
- **Resources**
- **Test Cases**
- **Test Data** (sample data)
- **Automation Script for Environment**
- **Log Files**

---

### Consumers and ECommerce Solution

**ECommerce Solution as EStore**
- **Owner**: Vijay Sales, Dmart (Actual Business)
- **Users**: Consumers, Vendors, Suppliers, Staff

---

## Software Development Process

### KYC: Know Your Customer
**Example**: Vijay Sales, DMart, Reliance Fresh

1. **Requirement Gathering**:
   - **SRS** (Domain Experts, Customers, Business Analysts, System Analyst, Quality Assurance Team, IT Team)
     - Business Requirement Specification: End users, power users, vendors, suppliers, external services to be integrated, functionalities, features, services
     - Functional Requirements
     - Non-Functional Requirements

2. **System Design**:
   - High-Level Design (HLD)
   - Low-Level Design (LLD)
     - UML Diagrams
     - DFD, ER Diagrams

3. **Implementation**:
   - Namespace, classes, interface, delegate, event, structure
   - Console App, Window App, Web App, Web API
   - Database: Tables, stored procedures, join queries using DDL, DML, DCL, SQL

4. **Testing**:
   - Test Plan
   - Test Cases
   - Setup Testing Environment
   - Testing Experts Team
   - Test Automation
   - Testing Tools, Testing Frameworks, Test Practices

5. **Deployment**:
   - Staging Environment
   - Production Environment
   - IT Pro Team
   - IT Tools Automation, Health Monitoring Tools

6. **Maintenance**:
   - Configuration
   - Fine-Tuning Guidelines for keeping the application running

---

## Software Development Models

### Waterfall Model
Sequential Approach:
- Requirement Gathering (SRS)
- System Design
- Implementation
- Testing
- Deployment
- Tech Support (Maintenance)

### Agile Model
- Flexible, iterative approach where software development occurs in cycles (sprints), and stakeholders provide feedback regularly.
- Focus on process, perspective, team, tools, communication, collaboration.

### V-Model
- Like Waterfall but emphasizes verification (analysis and design) and validation (testing).

### Spiral Model
- Incremental, iterative with risk analysis, focusing on gradual improvements.

### DevOps Model
- CI/CD Pipeline

---

## Requirement Engineering

### SRS Document for Online Shopping

#### Document Title
**System Requirement Specification for Online Shopping Portal for Vijay Sales**

#### Team
- Direct Customer (interested in purchasing products online)
- Indirect Customer (suppliers, vendors, staff, Board of Directors)
- Solution Architect
- Business Analyst
- QA Team (Quality Assurance)

#### Objective (Purpose)
The Online Shopping System for products Web Solution is intended to provide solutions for vendors, customers, and internal users (staff) through a Single Gateway using the internet. It enables vendors to set up online shops, and customers to browse virtual shops and purchase products online without visiting the shop physically.

#### Scope
This system allows shoppers to:
- Maintain their products for adding and removing from the catalog based on availability.
- Existing customers can review order history and cancel placed orders within 24 hours.
- Show business operations statistics trends through customized, personalized dashboards for stakeholders.

#### Definitions
- **OSS**: Online Shopping System
- **QA**: Quality Assurance
- **Portal**: Personalized online web application

---

## Functional Requirements

### Features Provided by Online Shopping System

1. Anonymous users can view different products available for sale.
2. Users can select products to view from available categories.
3. Registered shoppers can promote their products for sale by adding products to the catalog maintained by the system.
4. Staff can approve or reject requests for adding or removing products from the product catalog by shoppers.
5. Staff can track and maintain stock of products available for sale and raise requests for product updates from the inventory.
6. Shoppers can request to add new products to the catalog.
7. Sales Team can approve or reject requests raised by shoppers for adding or removing products.
8. Shoppers can update product details already added to the catalog.
9. Alerts for low or out-of-stock products in the catalog will be sent to shoppers and the sales team.
10. Product listings are based on categories, sales, quantity, likes, and recommendations.

#### Shopping Cart and Order Processing
- Consumers can add or remove products from the shopping cart.
- The system maintains a shopping cart for each consumer with selected items.
- Consumers can view all items in the cart.
- Shopping cart displays product details, quantity, price, and total.
- Registered customers can place, cancel (within 24 hours), and track orders.
- Sales Team can manage and track orders.
- Customers are notified about order placement, delivery status, and updates.

#### Payment
- Consumers can pay through internet banking, UPI, or online payment options.
- Payment processing is handled securely via a payment gateway.
- Notifications are sent after successful transactions.

#### Shipment
- Delivery personnel receive delivery details to complete orders.
- Delivery vendors manage shipments and track deliveries.

#### Feedback
- Customers can submit feedback about products received and update personal information.
- Customers are notified about order status via SMS and email.

---

## Non-Functional Requirements

### Security
- Role-based security and authorization.
- SSL for secure transactions.
- Automatic logout for inactivity.
- Encrypted communication between servers.
- Proper firewall configurations to protect from malicious attacks.

### Reliability
- Regular backups and quick recovery.
- Load balancing during peak hours.

### Availability
- **Uptime**: 24/7 availability with 99.999% uptime.

### Maintainability
- Commercial database software for data persistence.
- Separate environments for production, testing, and development.

### Portability
- Portable device application with HTML, CSS, and JavaScript.

### Accessibility
- Role-based permissions for stakeholders.

### Durability
- Retains shopping cart data for 15 minutes in case of connection loss.
- Implements incremental backup strategies.

### Efficiency
- Manages transactions efficiently during peak hours.

### Modularity
- System modules: CRM, Inventory, Shopping Cart, Order Processing, Payment Processing, Delivery, Membership, and Roles Management.

### Scalability
- Consistent user experience regardless of load.

### Safety
- Protected from phishing and malicious attacks.
- Backups ensure data safety with an incremental backup strategy.
