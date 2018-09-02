<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>add-customer</title>
</head>
<body>
	<!-- <form action="showCustomer" method="post">
		Name: <input type="text" name="customerName"/>
		Age: <input type="number" name="age"/>
		<input type="submit" value="Add Name"/>
	</form> -->

	<form:form action="showCustomer" modelAttribute="customer">
	
		Name: <form:input path="name" />
		<br>
		Address: <form:input path="address" />
		<br>
		Credit amount: <form:input path="creditAmount" />
		<br>
		Telephone: <form:input path="telephone" />
		<br>
		Country: 
		<form:select path="country">
			<form:options items="${customer.countries }" />
		</form:select>
		<br>
		Male<form:radiobutton path="gender" value="male" />
		Female<form:radiobutton path="gender" value ="female"/>
		
		<br>
		Operating systems:
		Linux<form:checkbox path="operatingSystems" value="linux"/>
		Windows<form:checkbox path="operatingSystems" value="windows"/>

		<br>
		<input type="submit" value="Add customer" />

	</form:form>

</body>
</html>