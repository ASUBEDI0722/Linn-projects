<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
<h1>Customer Details</h1>

<h3>FirstName : ${customer.firstName}</h3>
<h3>LastName : ${customer.lastName }</h3>
<h3>PhoneNumber : ${customer.phoneNumber}</h3>
<h3>Email : ${customer.email}</h3>
<h3>AddressLine1 : ${customer.address.addressLine1}</h3>
<h3>AddressLine2 : ${customer.address.addressLine2}</h3>
<h3>City : ${customer.address.city}</h3>
<h3>State : ${customer.address.state}</h3>
<h3>ZipCode : ${customer.address.zipCode}</h3></form>



</body>
</html>