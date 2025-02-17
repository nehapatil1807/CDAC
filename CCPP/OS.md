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



# Difference Between Process, Program, and Thread

## 1. Process vs. Program vs. Thread

### **What is a Program?**
A **program** is a set of instructions written in a programming language that performs a specific task when executed.
- **Stored on disk (passive entity).**
- Example: A `.exe` file of a text editor.

### **What is a Process?**
A **process** is an active instance of a program that is being executed by the CPU.
- **Has its own memory, resources, and execution context.**
- Example: When you open a text editor, an instance of it runs as a process.

### **What is a Thread?**
A **thread** is the smallest unit of execution within a process.
- **Shares memory with other threads of the same process.**
- Example: A web browser with multiple tabs runs multiple threads within the same process.

---

## 2. Different Types of Processes

### **1. Foreground Process**
- Requires user interaction.
- Example: Text editors, browsers.

### **2. Background Process**
- Runs without user interaction.
- Example: Antivirus software, system updates.

### **3. System Process**
- Core OS processes that manage system functionality.
- Example: Task Manager, Scheduler.

### **4. User Process**
- Created by user applications.
- Example: Media player, web applications.

### **5. Single-threaded Process**
- Contains only one thread of execution.
- Example: Simple command-line applications.

### **6. Multi-threaded Process**
- Contains multiple threads sharing the same resources.
- Example: Web browsers, games.



# Virtual Memory, Thrashing, and Threads

## 1. Virtual Memory
**Virtual memory** is a memory management technique that extends the physical RAM using disk space. It allows processes to execute even if they exceed the actual RAM capacity by swapping data between RAM and disk storage.
- **Increases available memory** beyond physical RAM.
- **Uses paging and segmentation** for efficient memory allocation.
- **Example:** Running large applications on a system with limited RAM.

---

## 2. Thrashing
**Thrashing** occurs when excessive paging or swapping between RAM and disk slows down system performance instead of improving it.
- Happens when a system **spends more time swapping** than executing processes.
- Caused by **insufficient RAM** or **high multiprogramming levels**.
- **Solution:** Increase RAM, optimize process scheduling, or reduce multiprogramming.

---

## 3. Threads
A **thread** is the smallest unit of execution within a process.
- **Shares memory** and resources with other threads of the same process.
- **Types of Threads:**
  - **User-level threads** – Managed by application-level libraries.
  - **Kernel-level threads** – Managed by the OS kernel.
- **Example:** A web browser with multiple tabs running as separate threads.



 # RAID (Redundant Array of Independent Disks) and Deadlock

## 1. What is RAID?
**RAID (Redundant Array of Independent Disks)** is a data storage virtualization technology that combines multiple physical hard drives into a single logical unit for performance improvement, redundancy, or both.
- Used for **data protection, fault tolerance, and improved performance**.
- Commonly used in **servers, data centers, and high-performance computing**.

---

## 2. Different Types of RAID

### **1. RAID 0 (Striping)**
- Data is split across multiple disks to improve performance.
- **No redundancy** – failure of one disk results in data loss.
- **Use Case:** High-speed applications (e.g., gaming, video editing).

### **2. RAID 1 (Mirroring)**
- Data is duplicated across two disks for fault tolerance.
- Provides **high redundancy** but reduces usable storage.
- **Use Case:** Critical data storage (e.g., financial records, databases).

### **3. RAID 5 (Striping with Parity)**
- Data and parity (error-checking information) are distributed across multiple disks.
- Can tolerate **one disk failure** without data loss.
- **Use Case:** Balanced performance and redundancy (e.g., file servers).

### **4. RAID 6 (Striping with Double Parity)**
- Similar to RAID 5 but with **two parity blocks**, allowing recovery from two disk failures.
- **Use Case:** High-availability systems (e.g., enterprise storage solutions).

### **5. RAID 10 (RAID 1+0 – Mirroring and Striping)**
- Combines **RAID 1 (mirroring) and RAID 0 (striping)**.
- Provides **high performance and redundancy** but requires more disks.
- **Use Case:** Mission-critical applications (e.g., high-speed databases, cloud storage).

---

## 3. What is a Deadlock?
A **deadlock** is a situation in which two or more processes are unable to proceed because each is waiting for resources that the other holds.
- Leads to **permanent blocking** of processes.
- Common in **multi-threaded and distributed systems**.

### **4. Conditions for Deadlock**
A deadlock occurs when the following four conditions hold simultaneously:

1. **Mutual Exclusion** – Only one process can use a resource at a time.
2. **Hold and Wait** – A process holding at least one resource is waiting for additional resources held by other processes.
3. **No Preemption** – A resource cannot be forcibly taken from a process; it must be released voluntarily.
4. **Circular Wait** – A circular chain of two or more processes exists where each process is waiting for a resource held by the next in the chain.

# Fragmentation and Its Types

## 1. What is Fragmentation?
**Fragmentation** is a condition in which storage space is used inefficiently, reducing performance and available memory. It occurs when free memory is broken into small, non-contiguous blocks, making it difficult to allocate large contiguous memory blocks to processes.

---

## 2. Types of Fragmentation

### **1. Internal Fragmentation**
- Occurs when allocated memory is **larger than required** by a process, leaving unused space inside the allocated block.
- **Cause:** Fixed-sized memory allocation.
- **Example:** Allocating 4 KB blocks to a process that only needs 3 KB.
- **Solution:** Use dynamic memory allocation or smaller memory blocks.

### **2. External Fragmentation**
- Occurs when free memory is **divided into small scattered blocks**, preventing allocation to large processes despite sufficient total free space.
- **Cause:** Continuous allocation and deallocation of memory.
- **Example:** A system with 100 MB of free memory split into 10 non-contiguous 10 MB blocks cannot allocate 50 MB to a process.
- **Solution:** Compaction, paging, or segmentation to reduce fragmentation.

# What is Spooling?

## 1. Definition of Spooling
**Spooling (Simultaneous Peripheral Operations On-Line)** is a process in which data is temporarily stored in a buffer (usually on a disk) before being sent to a slower device, such as a printer or input/output device.
- **Acts as a queue** for managing multiple tasks efficiently.
- **Improves system performance** by allowing a CPU to continue execution while peripheral devices process data asynchronously.

---

## 2. Example of Spooling
- **Printer Spooling:** When multiple print jobs are sent to a printer, they are first stored in a buffer (spool), allowing the CPU to continue executing other tasks while the printer processes jobs sequentially.
- **Email Spooling:** Emails are stored on a mail server before being forwarded to the recipient when they are available.

# Semaphore and Mutex

## 1. What is a Semaphore?
A **semaphore** is a synchronization mechanism used to manage access to shared resources in concurrent programming. It uses counters to control multiple process access, preventing race conditions.

- **Types of Semaphores:**
  - **Binary Semaphore** (only 0 or 1 value, similar to mutex)
  - **Counting Semaphore** (allows multiple resources to be accessed)

---

## 2. What is a Mutex?
A **mutex (Mutual Exclusion)** is a locking mechanism that allows only one thread to access a resource at a time. It prevents multiple threads from entering a critical section simultaneously.

---

## 3. Differences Between Semaphore and Mutex

| Feature         | Semaphore | Mutex |
|---------------|----------|-------|
| Ownership     | No ownership, any thread can release | Owned by the locking thread |
| Usage        | Multiple processes can access | Only one thread at a time |
| Types        | Binary & Counting Semaphore | Only one type |
| Performance  | Can handle multiple threads | Only one thread locks at a time |
| Example     | Managing resource pools | Thread synchronization in OS |

---

## 4. What is a Binary Semaphore?
A **Binary Semaphore** is a semaphore with only two values: **0 and 1**.
- Acts like a mutex but without ownership.
- Used for **mutual exclusion** and **synchronization**.
- **Example:** Controlling access to a single resource between two processes.

# Belady’s Anomaly

## 1. What is Belady’s Anomaly?
**Belady’s Anomaly** refers to a counterintuitive phenomenon in which increasing the number of page frames in a **FIFO (First-In-First-Out) page replacement algorithm** results in **more page faults instead of fewer**.

- Normally, increasing the number of frames should **reduce page faults**.
- However, in FIFO, adding frames can lead to **unexpected increases in page faults** due to the way older pages are replaced.

---

## 2. Example of Belady’s Anomaly
Consider a reference string: **1, 2, 3, 4, 1, 2, 5, 1, 2, 3, 4, 5**

- With **3 frames**, the number of page faults is **9**.
- With **4 frames**, the number of page faults increases to **10**, instead of decreasing.

---

## 3. Why Does It Occur?
- FIFO **does not consider** page usage frequency.
- Pages are replaced strictly based on their arrival order, leading to inefficient swaps.

---

## 4. How to Avoid Belady’s Anomaly?
- Use **better page replacement algorithms** like:
  - **LRU (Least Recently Used)**
  - **Optimal Page Replacement**

# Starvation and Aging in Operating Systems

## 1. What is Starvation?
**Starvation** is a situation in an operating system where a process **waits indefinitely** to get access to required resources because higher-priority processes keep executing and blocking its progress.

### **Causes of Starvation:**
- **Priority Scheduling:** Low-priority processes never get CPU time.
- **Resource Allocation:** Resources are always assigned to high-priority processes.
- **I/O or Memory Requests:** Requests from some processes are constantly ignored due to system policies.

### **Example of Starvation:**
In **priority scheduling**, a low-priority process may never get CPU time if higher-priority processes keep arriving.

---

## 2. What is Aging?
**Aging** is a technique used to **prevent starvation** by gradually increasing the priority of a process **the longer it waits** in the queue.

### **How Aging Works?**
- Each waiting process **gains priority** over time.
- Eventually, even low-priority processes get a chance to execute.
- Used in **scheduling algorithms** like **priority scheduling**.

### **Example of Aging:**
If a low-priority process waits for **10 seconds**, its priority increases gradually so that it eventually gets CPU time.

# Why Does Thrashing Occur?

## 1. What is Thrashing?
**Thrashing** is a condition in which a system spends more time **swapping pages in and out of memory** than executing actual processes, leading to a severe drop in performance.

---

## 2. Causes of Thrashing
### **1. High Degree of Multiprogramming**
- Too many processes are loaded in memory, causing excessive page faults.

### **2. Insufficient Memory Allocation**
- If processes do not get enough frames, they keep requesting pages, leading to frequent swapping.

### **3. Poor Page Replacement Algorithm**
- Inefficient algorithms may remove frequently used pages, causing repeated page faults.

### **4. High CPU Utilization Misinterpretation**
- The system may increase multiprogramming in response to high CPU usage, worsening thrashing.

### **5. Working Set Size Exceeds Physical Memory**
- If a process requires more memory than available, it keeps swapping pages instead of making progress.

---

## 3. How to Prevent Thrashing?
- **Use Working Set Model:** Allocate memory based on a process’s working set.
- **Reduce Degree of Multiprogramming:** Limit the number of active processes.
- **Use Better Page Replacement Algorithms:** Such as **LRU (Least Recently Used)**.
- **Increase RAM:** More memory reduces swapping needs.

# Paging and Its Necessity

## 1. What is Paging?
**Paging** is a memory management scheme that eliminates the need for contiguous memory allocation by dividing processes into fixed-size blocks called **pages**, which are mapped to frames in physical memory.

- **Logical Address:** Divided into pages.
- **Physical Address:** Divided into frames.
- The **page table** maintains mappings between pages and frames.

---

## 2. Why Do We Need Paging?
### **1. Eliminates External Fragmentation**
- Since memory is allocated in fixed-size frames, it avoids external fragmentation.

### **2. Efficient Memory Utilization**
- Processes do not require contiguous memory blocks, leading to better use of available memory.

### **3. Simplifies Memory Management**
- The OS can allocate memory dynamically without needing large continuous memory spaces.

### **4. Supports Virtual Memory**
- Paging enables virtual memory, allowing processes to execute even if they are partially loaded into RAM.

### **5. Faster Process Execution**
- Reduces delays caused by searching for large free memory blocks, enabling faster process loading.

# Demand Paging and Segmentation

## 1. What is Demand Paging?
**Demand paging** is a memory management scheme where **pages are loaded into memory only when required**, rather than preloading the entire process.

### **How Demand Paging Works?**
1. When a process requests a page that is not in memory, a **page fault** occurs.
2. The required page is fetched from the disk and loaded into a free frame.
3. The page table is updated with the new mapping.
4. The process resumes execution.

### **Advantages of Demand Paging:**
- Reduces memory usage by loading only necessary pages.
- Faster program execution since unused pages are not loaded.
- Enables **virtual memory**, allowing execution of large processes with limited RAM.

### **Disadvantages of Demand Paging:**
- Page faults cause delays, affecting performance.
- Excessive page faults may lead to **thrashing**.

---

## 2. What is Segmentation?
**Segmentation** is a memory management technique that divides a process into **variable-sized segments**, each representing a logical unit such as **code, data, and stack**.

### **How Segmentation Works?**
- A **segment table** maintains base and limit addresses for each segment.
- Logical addresses consist of **segment number** and **offset**.
- The OS translates logical addresses to physical addresses using the segment table.

### **Advantages of Segmentation:**
- Provides **better logical organization** of memory.
- Reduces internal fragmentation as segments are of variable size.
- Easier **protection and sharing** of memory among processes.

### **Disadvantages of Segmentation:**
- Causes **external fragmentation** since segments vary in size.
- More complex than paging due to variable-sized allocations.

Would you like a comparison table or an example implementation? 😊

# Real-Time Operating System (RTOS)

## 1. What is a Real-Time Operating System (RTOS)?
A Real-Time Operating System (RTOS) is an operating system designed to meet strict timing constraints and provide deterministic response times. It is used in systems where time-sensitive operations are critical, such as embedded systems, robotics, and industrial control systems.

## 2. Types of RTOS

### a) Hard Real-Time Operating System (Hard RTOS)
- **Definition**: In a Hard RTOS, tasks must complete their operations within a strict deadline. Missing a deadline could result in catastrophic failure.
- **Example**: Medical devices, air traffic control systems.

### b) Soft Real-Time Operating System (Soft RTOS)
- **Definition**: In a Soft RTOS, tasks must complete within a reasonable time frame, but deadlines are not as strict. Delays may cause performance degradation but are not critical.
- **Example**: Video streaming, multimedia applications.

### c) Firm Real-Time Operating System (Firm RTOS)
- **Definition**: Firm RTOS lies between hard and soft RTOS. While missing a deadline may not result in complete failure, it leads to performance degradation, and the system's overall efficiency is impacted.
- **Example**: Telecommunication systems, industrial automation.

## 3. Key Features of RTOS
- **Task Scheduling**: RTOS ensures that tasks are executed in a predictable order based on priority or timing constraints.
- **Deterministic Behavior**: The system always responds within a predictable time frame.
- **Concurrency**: RTOS supports multitasking with efficient management of resources.
- **Interrupt Handling**: RTOS handles hardware and software interrupts to respond quickly to real-time events.

## 4. Common Examples of RTOS
- FreeRTOS
- VxWorks
- RTEMS (Real-Time Executive for Multiprocessor Systems)
- QNX
- Embedded Linux (with real-time patches)

## 5. Use Cases of RTOS
- Automotive systems
- Medical devices
- Aerospace and defense
- Industrial automation
- Robotics


# Difference Between Main Memory and Secondary Memory

| **Feature**              | **Main Memory**                           | **Secondary Memory**                          |
|--------------------------|-------------------------------------------|-----------------------------------------------|
| **Definition**           | Primary storage used by the CPU for immediate data processing. | Permanent storage used for long-term data storage. |
| **Types**                | RAM (Random Access Memory), Cache Memory  | Hard Disk, SSD, Optical Discs (CD/DVD), USB Flash Drive |
| **Speed**                | Fast access, faster than secondary memory. | Slower access compared to main memory.       |
| **Volatility**           | Volatile – data is lost when the system is powered off. | Non-volatile – data is retained even when the system is powered off. |
| **Capacity**             | Limited, typically ranging from a few GBs to tens of GBs. | Larger storage capacity, ranging from GBs to TBs. |
| **Purpose**              | Used by the CPU for executing processes and tasks. | Used for storing data and programs permanently. |
| **Cost**                 | More expensive per unit of storage.       | Less expensive per unit of storage.          |
| **Access Method**        | Direct access (random access).            | Sequential or random access, depending on the type (e.g., HDD vs SSD). |
| **Examples**             | RAM, Cache Memory.                       | Hard Disk, Solid-State Drive, Optical Discs.  |



# Operating System Concepts

## 1. Dynamic Binding
- **Definition**: Dynamic binding (also known as late binding) is the process of associating a method call to its corresponding function or code at runtime, instead of at compile-time. This allows for more flexibility and supports features like polymorphism in object-oriented programming.
- **Example**: In Java, method calls are dynamically bound based on the actual object type at runtime.

## 2. FCFS Scheduling (First-Come, First-Served)
- **Definition**: FCFS is a non-preemptive scheduling algorithm where the process that arrives first is executed first. It operates in a simple manner and doesn't involve priority.
- **Characteristics**:
  - **Simple** and easy to implement.
  - Can lead to **convoy effect** (longer processes delay shorter ones).
  - Non-preemptive, i.e., once a process starts, it runs to completion.
- **Example**: If processes arrive in the order P1, P2, P3, the CPU executes them in that order.

## 3. SJF Scheduling (Shortest Job First)
- **Definition**: SJF is a non-preemptive scheduling algorithm where the process with the shortest burst time (CPU time) is selected next for execution. 
- **Characteristics**:
  - **Minimizes average waiting time**.
  - Can cause **starvation** for long processes if short ones keep arriving.
- **Example**: If process P1 has burst time 2ms, P2 has 5ms, and P3 has 1ms, P3 will be executed first.

## 4. SRTF Scheduling (Shortest Remaining Time First)
- **Definition**: SRTF is a preemptive version of SJF. It selects the process with the smallest remaining time to completion for execution next. If a new process arrives with a shorter burst time, the currently running process is preempted.
- **Characteristics**:
  - **Preemptive**, which can result in better response times for short processes.
  - Can still cause **starvation** for longer processes.
- **Example**: If a process P1 with remaining time of 5ms is running, and a new process P2 with 3ms arrives, P1 will be preempted in favor of P2.

## 5. LRTF Scheduling (Longest Remaining Time First)
- **Definition**: LRTF is the opposite of SRTF. It schedules the process with the longest remaining time for execution.
- **Characteristics**:
  - **Preemptive** in nature.
  - Tends to cause **starvation** for shorter processes and leads to inefficiencies.
- **Example**: If a process P1 has remaining time 10ms and P2 has 3ms, P1 will be executed first, even though P2 is ready.

## 6. Priority Scheduling
- **Definition**: Priority scheduling assigns a priority to each process, and the process with the highest priority (numerically or logically) is selected next for execution. It can be either preemptive or non-preemptive.
- **Characteristics**:
  - **Starvation** can occur for low-priority processes.
  - Priorities can be **static** (fixed) or **dynamic** (change over time).
- **Example**: If process P1 has priority 3 and P2 has priority 1, P1 will be executed before P2.

## 7. Round Robin Scheduling
- **Definition**: Round Robin (RR) is a preemptive scheduling algorithm where each process is assigned a fixed time slice (quantum). The CPU switches between processes after each time slice, ensuring fairness.
- **Characteristics**:
  - **Fair** in that each process gets an equal opportunity to execute.
  - **Context switching** overhead can be high if the time slice is too small.
- **Example**: If processes P1, P2, P3 are in the queue and the time quantum is 2ms, each process will get 2ms of CPU time in a cyclic order.



# Operating System and Memory Management Concepts

## 1. Producer-Consumer Problem
- **Definition**: The Producer-Consumer problem is a classical synchronization problem where the **Producer** produces data (items) and the **Consumer** consumes them. A shared buffer is used between them.
- **Challenges**:
  - **Synchronization**: The consumer must not consume an item before it's produced.
  - **Buffer Management**: Prevent buffer overflow and underflow.
- **Solution**:
  - Use **semaphores** or **mutex locks** to synchronize producer and consumer processes.
  - Implement **bounded buffer** to control shared memory access.

## 2. Banker's Algorithm
- **Definition**: The Banker's Algorithm is a **deadlock avoidance algorithm** that ensures a system does not enter a deadlocked state by checking resource allocation requests before granting them.
- **Working**:
  1. Each process must declare its **maximum resource needs**.
  2. The system checks if granting a request keeps the system in a **safe state**.
  3. If the request leads to an unsafe state, it is **denied**.
- **Use Case**: Used in operating systems to handle multiple processes requesting shared resources without causing deadlocks.

## 3. Cache Explanation
- **Definition**: A cache is a small, high-speed memory located close to the CPU, used to store frequently accessed data and instructions to speed up processing.
- **Types of Cache**:
  - **L1 Cache**: Smallest, fastest, and closest to the CPU.
  - **L2 Cache**: Slightly larger and slower than L1.
  - **L3 Cache**: Shared among CPU cores, larger but slower than L2.
- **Benefits**:
  - Reduces access time to frequently used data.
  - Improves system performance by minimizing memory fetch delays.

## 4. Difference Between Direct Mapping and Associative Mapping

| **Feature**           | **Direct Mapping**                              | **Associative Mapping**                          |
|----------------------|--------------------------------|--------------------------------|
| **Definition**       | A specific block of memory is mapped to a specific cache location. | Any block of memory can be placed in any cache location. |
| **Flexibility**      | Less flexible; one memory block can go to only one cache line. | More flexible; blocks can be placed anywhere. |
| **Implementation**   | Uses simple indexing. | Uses tag comparison to find blocks. |
| **Speed**           | Faster due to simple indexing. | Slower due to searching through all cache lines. |
| **Example**         | Direct-mapped cache in CPUs. | Fully associative cache in high-performance systems. |

## 5. Difference Between Multitasking and Multiprocessing

| **Feature**          | **Multitasking**                                | **Multiprocessing**                              |
|----------------------|--------------------------------|--------------------------------|
| **Definition**       | The ability to run multiple tasks (processes) on a single CPU. | The use of multiple CPUs to execute multiple processes simultaneously. |
| **Execution**       | Tasks share a single CPU by **time-sharing**. | Processes run in parallel on different CPUs. |
| **Speed**           | Slower, as CPU switches between tasks. | Faster, as multiple CPUs process tasks independently. |
| **Example**         | Running multiple applications (browser, music player) on a single-core CPU. | Running a server with multiple cores handling different requests. |






