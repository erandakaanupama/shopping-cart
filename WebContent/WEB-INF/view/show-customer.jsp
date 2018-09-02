<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>show-customer</title>
</head>
<body>
	Customer name: ${customer.name}
	<br>
	Customer address: ${customer.address}
	<br>
	Customer Country: ${customer.country }
	<br>
	Customer gender: ${customer.gender }
	<br>
	Os: 
	<ul>
		<c:forEach var="tmp" items="${customer.operatingSystems }">
			<li>${tmp }</li> 
		</c:forEach>
	</ul>
	<hr>
	<a href="addCustomer">Add Customer</a>
</body>
</html>