
<h1 style="text-align: center">Functional Specification: Employee Management System Application</h1>


<hr>
<p>
<strong>1. Project Overview:</strong>
</p>
<ul>

<li><strong>Project Name:</strong> Employee Management System Application</li>

<li><strong>Project Goal:</strong> To provide a simple web-based application for managing employee information, allowing users to Create, Read, Update, and Delete employee records.</li>

<li><strong>Version</strong>: 1.0<br><strong>Date</strong>: 19/12/2024</li>

<li><strong>Developer</strong>: Kushal Jambhulkar</li>
</ul>
<p>
<strong>2. Scope:</strong>
</p>
<ul>

<li>Displaying a list of employees with their basic details.</li>

<li>Adding new employee records with fields for First Name, Last Name, Email, and Department.</li>

<li>Updating existing employee records with the same fields.</li>

<li>Deleting employee records.</li>

<li>A separate page for adding new employees.</li>
</ul>
<p>
<strong>3. User Stories:</strong>
</p>
<ul>

<li>As a user, I want to see a list of all employees on the home page.</li>

<li>As a user, I want to be able to add a new employee to the system by filling out a form.</li>

<li>As a user, I want to be able to edit the details of an existing employee.</li>

<li>As a user, I want to be able to remove an employee from the system.</li>
</ul>
<p>
<strong>4. Functional Requirements:</strong>
</p>
<p>
<strong>Home Page (See Employees):</strong>
</p>
<ul>

<li><strong>Show List:</strong> See a table of all employees.</li>

<li><strong>Add Button:</strong> "Add Employee" to make new ones. Click it, goes to the add page.</li>

<li><strong>Edit Button:</strong> In the Action for each employee, there's an "Update" button. Click it, goes to the update form but it's already filled with their info so you can change it.</li>

<li><strong>Remove Button:</strong> Also in Action, a "Delete" button. Click it. Employee gone from the list.</li>
</ul>
<p>
<strong>Simple Diagram: Home Page</strong>
</p>
<p>
<strong>4.2. Add Employee Page:</strong>
</p>
<p>
<strong>Add Employee Page (Make New Ones):</strong>
</p>
<ul>

<li><strong>Form Time:</strong> See blanks to fill: First Name, Last Name, Email, Department. You type in these boxes.</li>

<li><strong>Done Button:</strong> Button says "Submit". Click it, the info you typed gets saved. Done!</li>

<li><strong>Clear Button:</strong> Button says "Clear Form". Click it, all the boxes go empty again.</li>
</ul>

<strong>4.3. Update Employee:</strong>
</p>
<ul>

<li>"Update" selection, the Add Employee form pre-populates with the employee's data.</li>

<li>Submitting the modified form updates the employee record and refreshes the list.</li>
</ul>

<strong>4.4. Delete Employee:</strong>
</p>
<ul>

<li>Remove an employee record from the database.


<h1 style="text-align: center">Technical Specifications </h1>


<p>
<strong>Introduction:</strong>
</p>
<p>
A web application to manage employees in an organization. Users can create, view, update, and delete employee records via a user-friendly interface the system integrates with third-party APIs to sBackend notifications (Email/SMS) when employee records are modified.
</p>
<hr>
<h3><strong>1. System Overview</strong></h3>


<p>
The system consists of three primary components:
</p>
<ul>

<li><strong>FrontBackend:</strong> A web-based interface where users interact with employee records.</li>

<li><strong>Backend (Local API):</strong> Manages business logic, processes requests, and interacts with the database.</li>

<li><strong>Database:</strong> Stores employee records.</li>
</ul>
<h3><strong>2. System Architecture</strong></h3>


<p>
The Employee Management System follows a <strong>three-tier architecture</strong>:
</p>
<ol>

<li><strong>FrontBackend:</strong></li> 
<ul>
 
<li>Developed using <strong>React.js</strong> (JavaScript, HTML/CSS for simplicity).</li>
 
<li>Communicates with the Backend via REST API requests.</li>
 
<li>Axios</li>
 
<li>React Router</li>
 
<li>npm</li> 
</ul>

<li><strong>Backend:</strong></li> 
<ul>
 
<li>Built with <strong>Spring Boot (Java)</strong>.</li>
 
<li>Exposes REST Backendpoints to interact with employee data.</li>
 
<li>Implements <strong>business logic</strong> and enforces user permissions.</li>
 
<li>Java 17 </li>
 
<li>Spring Data JPA</li>
 
<li>Lombok</li>
 
<li>Maven</li> 
</ul></li> 
</ol>
<ol>

<li><strong>Database Specification:</strong></li> 
<ul>
 
<li>Uses <strong>PostgreSQL</strong> for storing <strong>employee</strong> records as the relational database management system.</li>
 
<li>Schema includes the following tables:</li>  
<ul>
  
<li><code>employee_id</code>

<table>
  <tr>
   <td>
<code>Column</code></li>  
</ul></li>  
</ul></li>  
</ol>
   </td>
   <td><code>Data Type</code>
   </td>
   <td><code>Constraints</code>
   </td>
   <td><code>Description</code>
   </td>
  </tr>
  <tr>
   <td><code>employee_id</code>
   </td>
   <td><code>BIGINT</code>
   </td>
   <td><code>PRIMARY KEY, AUTO_INCREMENT</code>
   </td>
   <td><code>Uniquely identifies each employee record.</code>
   </td>
  </tr>
  <tr>
   <td><code>first_name</code>
   </td>
   <td><code>TEXT</code>
   </td>
   <td>
   </td>
   <td><code>Stores the first name of the employee.</code>
   </td>
  </tr>
  <tr>
   <td><code>last_name</code>
   </td>
   <td><code>TEXT</code>
   </td>
   <td>
   </td>
   <td><code>Stores the last name of the employee.</code>
   </td>
  </tr>
  <tr>
   <td><code>email</code>
   </td>
   <td><code>TEXT</code>
   </td>
   <td><code>NOT NULL, UNIQUE</code>
   </td>
   <td><code>Stores the email address of the employee (must be unique).</code>
   </td>
  </tr>
  <tr>
   <td><code>department_id</code>
   </td>
   <td><code>BIGINT</code>
   </td>
   <td><code>FOREIGN KEY referencing departments(id)</code>
   </td>
   <td><code>Foreign key linking to the employee's department.</code>
   </td>
  </tr>
</table>

  
<ul>
  
<li><code>Department Table</code></li>  
</ul>

<table>
  <tr>
   <td><code>Column</code>
   </td>
   <td><code>Data Type</code>
   </td>
   <td><code>Constraints</code>
   </td>
   <td><code>Description</code>
   </td>
  </tr>
  <tr>
   <td><code>id</code>
   </td>
   <td><code>BIGINT</code>
   </td>
   <td><code>PRIMARY KEY, AUTO_INCREMENT</code>
   </td>
   <td><code>Uniquely identifies each department record.</code>
   </td>
  </tr>
  <tr>
   <td><code>name</code>
   </td>
   <td><code>TEXT</code>
   </td>
   <td>
   </td>
   <td><code>Stores the name of the department.</code>
   </td>
  </tr>
</table>


<h3>

</h3>

</p>
<h3><strong>4. API Backendpoints</strong></h3>


<p>
<strong>Endpoint:</strong> <code>POST /api/employees</code>
</p>
<p>
<strong>Description:</strong> Creates a new employee record.
</p>
<p>

    <br>
</p>
<p>
<strong>Request Payload (JSON):</strong>
</p>
<p>
<strong>Response Payload:</strong>
</p>
<p>
<strong>Success (Example):<br><br></strong> JSON
</p>
<p>
<strong>Error (Example):<br><br></strong> JSON
</p>
<p>

    <strong>Endpoint:</strong> <code>GET /api/employees/{id}</code> (Replace <code>{id}</code> with the employee's ID)
</p>
<p>

    <strong>Description:</strong> Retrieves details for a specific employee.<br>
</p>
<p>

    <strong>Request Payload:</strong> None<br>
</p>
<p>

    <strong>Response Payload:</strong>
</p>
<p>

    <strong>Success (Example - for <code>GET /api/employees/10</code>):<br></strong>

<p>

    <strong>Error (Example):<br></strong>
</p>
<p>

    <strong>Endpoint:</strong> <code>GET /api/employees/all<br></code>
</p>
<p>

    <strong>Description:</strong> Retrieves a list of all employees.<br>
</p>
<p>

    <strong>Request Payload:</strong> None<br>
</p>
<p>

    <strong>Response Payload:</strong>
</p>
<ul>

<li><strong>Endpoint:</strong> <code>PUT /api/employees/{id}</code> (Replace <code>{id}</code> with the employee's ID)<br></li>

<li><strong>Description:</strong> Updates the details of a specific employee.<br></li>

<li><strong>Request Payload (JSON):<br><br></strong> </li>
</ul>
<ul>

<li><strong>Response Payload:</strong> 
<p>

        <strong>Success (Example):</strong>
</p></li>
</ul>
<p>
<strong>Error (Example):</strong>
</p>
<p>
<strong>Endpoint:</strong> <code>DELETE /api/employees/{id}</code> (Replace <code>{id}</code> with the employee's ID)
</p>
<p>
<strong>Description:</strong> Deletes a specific employee.
</p>
<p>
<strong>Request Payload:</strong> None
</p>
<p>
<strong>Response Payload:</strong> (This will depend on your backend)
</p>
<p>

    <strong>Success (Example):<br></strong>An empty response with a success status code (e.g., 204 No Content).
</p>
<p>

    <strong>Error (Example):<br></strong>
</p>
