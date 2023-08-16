<html>
  <head>
    <title>Register User</title>
  </head>
  <body>
    <jsp:useBean id="stud" scope="session" class="Student.class">
      <jsp:setProperty name="stud" property="*" />
    </jsp:useBean>
    <p>
      your First Name is: <jsp:getProperty name="stud" property="firstName" />.
    </p>
    <p>
      Your Last Name is : <jsp:getProperty name="stud" property="surname" />.
    </p>
    <p>Your USN is : <jsp:getProperty name="stud" property="usn" />.</p>
    <p>
      Your COURSE Name is : <jsp:getProperty name="stud" property="course" />.
    </p>
    <p>Your SEM is : <jsp:getProperty name="stud" property="sem" />.</p>
    <p>Your AGE is : <jsp:getProperty name="stud" property="age" />.</p>
    <p>Your Address is : <jsp:getProperty name="stud" property="address" />.</p>
  </body>
</html>
