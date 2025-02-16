# Operating System: Questions & Answers

## Q1: What is the main purpose of an operating system?
**A:** An **Operating System (OS)** is system software that acts as an intermediary between the hardware and the user. Its main purposes are:

1. **Process Management** – Handles process creation, scheduling, and termination.
2. **Memory Management** – Manages RAM allocation and deallocation.
3. **File System Management** – Organizes, stores, retrieves, and manages data.
4. **Device Management** – Controls hardware devices through drivers.
5. **Security & Access Control** – Protects data and resources from unauthorized access.
6. **User Interface** – Provides a user-friendly interface like CLI (Command Line Interface) or GUI (Graphical User Interface).

---

## Q2: What are the different types of operating systems?
**A:** Operating systems are categorized based on their functionality and usage:

1. **Batch Operating System**  
   - Processes jobs in batches without user interaction.  
   - *Example:* Early IBM mainframes.  

2. **Time-Sharing (Multitasking) OS**  
   - Allows multiple users/programs to share CPU time.  
   - *Example:* Windows, UNIX.  

3. **Real-Time Operating System (RTOS)**  
   - Provides immediate response for critical applications.  
   - *Example:* VxWorks, QNX (used in robotics, medical systems).  

4. **Distributed OS**  
   - Manages multiple computers as a single system.  
   - *Example:* Google’s Cloud OS, Amoeba.  

5. **Network Operating System (NOS)**  
   - Manages network resources and communication.  
   - *Example:* Windows Server, Linux Server.  

6. **Mobile Operating System**  
   - Designed for smartphones and tablets.  
   - *Example:* Android, iOS.  

---

## Q3: What is scheduling in an operating system?
**A:** **Scheduling** is the process of deciding which process gets CPU time and in what order. It is managed by the **CPU Scheduler** to ensure efficient execution of multiple processes.

### **Types of Scheduling**

1. **Long-Term Scheduling**  
   - Decides which processes enter the ready queue for execution.  
   - *Example:* Job scheduling in batch OS.  

2. **Short-Term Scheduling (CPU Scheduling)**  
   - Selects which process runs next from the ready queue.  
   - *Example:* Round Robin, FCFS (First-Come, First-Served).  

3. **Medium-Term Scheduling**  
   - Swaps processes in and out of RAM to manage memory.  
   - *Example:* Suspended process management.  


# Socket, Kernel, and Monolithic Kernel

## 1. What is a Socket?
A **socket** is an endpoint for communication between two machines over a network. It allows processes to communicate using **IP addresses and ports**.

- Used in **client-server models** for sending and receiving data.
- Example: Web browsers and servers use **TCP/IP sockets** to transfer data.

---

## 2. What is a Kernel?
A **kernel** is the core component of an operating system that manages system resources and hardware-software interaction.

- Handles **process management, memory management, device management, and system calls**.
- Example: **Linux Kernel, Windows NT Kernel**.

---

## 3. What is a Monolithic Kernel?
A **monolithic kernel** is a type of kernel where all OS components (memory management, process scheduling, file system, etc.) run in **kernel mode** as a single program.

- **Fast but less modular** compared to microkernels.
- Example: **Linux, Unix, MS-DOS**.


