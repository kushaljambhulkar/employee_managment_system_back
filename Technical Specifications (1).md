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
