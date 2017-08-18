<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style type="text/css">
body {
    background-image:
        url('http://cdn.crunchify.com/wp-content/uploads/2013/03/Crunchify.bg_.300.png');
}
</style>
 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Crunchify JSP Servlet Example</title>
</head>
<body>
    <div align="center" style="margin-top: 50px;">
 
        <form action="CrunchifyServlet" method="post">
            Please enter your Name:  <input type="text" name="name" size="20px"> <br>
            Please enter your Surname:  <input type="text" name="surname" size="20px"> <br><br>
            Please enter your Phone Number:  <input type="text" name="phone" size="20px"> <br><br>
            Please enter your Mobile Phone Number:  <input type="text" name="mobile" size="20px"> <br><br>
        <input type="submit" value="submit">
        </form>
        
    </div>
    <head>
        <title>SO question 4112686</title>
        <script src="http://code.jquery.com/jquery-latest.min.js"></script>
        <script>
            $(document).on("click", "#somebutton", function() {        // When HTML DOM "click" event is invoked on element with ID "somebutton", execute the following function...
                $.get("CrunchifyServlet", function(responseJson) {          // Execute Ajax GET request on URL of "someservlet" and execute the following function with Ajax response JSON...
                var $table = $("<table>").appendTo($("#somediv")); // Create HTML <table> element and append it to HTML DOM element with ID "somediv".
                $.each(responseJson, function(index, persona) {    // Iterate over the JSON array.
                $("<tr>").appendTo($table)                     // Create HTML <tr> element, set its text content with currently iterated item and append it to the <table>.
                    .append($("<td>").text(persona.nombre))        // Create HTML <td> element, set its text content with id of currently iterated product and append it to the <tr>.
                    .append($("<td>").text(persona.apellido))      // Create HTML <td> element, set its text content with name of currently iterated product and append it to the <tr>.
                    .append($("<td>").text(persona.telefono))
                    .append($("<td>").text(persona.celular));    // Create HTML <td> element, set its text content with price of currently iterated product and append it to the <tr>.
        });
    });
});
        </script>
    </head>
    <body>
        <button id="somebutton">press here</button>
        <div id="somediv"></div>
    </body>
</body>
</html>
