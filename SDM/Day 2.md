
# Revision

## Source Control (VSS) (TFS) (Azure DevOps)
**IBM Tools:** Clear Case

### Source Code Management:
- **Roles:** Owner or Contributor
- Creating, managing repositories, adding contributors, controlling repositories
- Pulling content, pushing content, versioning (branching)

### Git: 
**Client App** - Tool used by contributors to sync with GitHub  
- **Commands:**
    - Create repo: `git init`
    - Check status: `git status`
    - Log: `git log`
    - Add new files, accept changes into staging area: `git add .`
    - Commit changes: `git commit -m "message"`
    - Push local staging area content to remote repo: `git push`
    - Clone remote repo to local machine: `git clone`
    - Pull latest changes of remote repo to local repo: `git pull`
    - Set username: `git config --global user.name "FIRST_NAME LAST_NAME"`
    - Set email: `git config --global user.email "MY_NAME@example.com"`
    - Set password: `git config --global user.password "public access token"`

### GitHub:
- **Web App:** Centralized, Personalized, Collaborative Code Repository

---

## Software Engineering:

### Software:
- **Consumers → Software → Hardware**
- IT Team
- **Software Process:**
    - **Types:** Product, Process, Continuous Improvement in Existing Product
    - Discipline approach for production
    - **Definition:** An Art of Science  

### IT Services:
- **Software Services on Top of Hardware Services**
    - Service: Platform: Infrastructure
    - Example: Shopping Service: Web Portal: Data Center

### Software Product:
- Example: Vijay Sales Online Store
- **Software Solution:** Vijay Sales E-Commerce Solution

### Components:
- **Documents:**
    - SRS
- **Diagrams**
- **Source Code:**
    - Project MVC: Frontend + Backend
    - REST API
    - Class Libraries: Namespaces, Methods, Members
    - Logic + Data Structure
- **Resources, Test Cases, Test Data, Automation Scripts, Log Files**

### Online Shopping Solution as E-Store:
- Owned by businesses like Vijay Sales, DMart.
- Used by Consumers, Vendors, Suppliers, and Staff.

---

## Software Development Process:

### KYC (Know Your Customer)
**Requirement Gathering:**  
- **SRS Document:** Business Analysts, System Analysts, QA Team, IT Team.
- **Functional Requirements**
- **Non-Functional Requirements**

**System Design:**  
- HLD (High-Level Design)  
- LLD (Low-Level Design, UML, ER Diagrams).

**Implementation:**  
- Classes, Interfaces, Events, Console/Web/Database Applications.

**Testing:**  
- Test Plan, Automation, Frameworks, Practices.

**Deployment:**  
- Staging & Production Environments.

**Maintenance:**  
- Configuration, Fine-Tuning Guidelines.

---

## Software Development Models:

1. **Waterfall Model:** Sequential Approach.
2. **Agile Model:** Iterative Sprints, Stakeholder Feedback.
3. **V-Model:** Emphasis on Verification and Validation.
4. **Spiral Model:** Incremental with Risk Analysis.
5. **DevOps Model:** CI/CD Pipeline.

---

## Requirement Engineering:

### SRS Document for Online Shopping Portal
**Title:** System Requirement Specification for Vijay Sales Online Shopping Portal.  
**Objective:** Provide solutions for vendors, customers, and staff via a single gateway.  
**Scope:** Product catalog management, order processing, dashboards, and statistics.

### Definitions:
- OSS: Online Shopping System
- QA: Quality Assurance

### Functional Requirements:
- Product catalog browsing for anonymous users.
- Registered shoppers manage products.
- Staff approve/reject catalog requests.
- Sales team monitor shipments.
- Customers place/cancel orders, track delivery, and submit feedback.

### Non-Functional Requirements:
- **Security:** Role-based authorization, SSL, encrypted communication.  
- **Reliability:** Regular backups, load balancing.  
- **Availability:** 24/7 uptime.  
- **Maintainability:** Separate environments for production/testing.  
- **Portability:** Accessible via portable devices.  
- **Accessibility:** Role-based permissions.  
- **Durability:** Wishlist and cart persistence.  
- **Efficiency:** Handle peak loads during festivals.  
- **Modularity:** Loosely coupled modules.  
- **Scalability:** Consistent experience under load.  
- **Safety:** Firewall, antivirus, data backups.

---
