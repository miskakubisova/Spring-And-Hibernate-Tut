<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>
		<title>
			Student Registration Form
		</title>
	</head>
	
	<body>
		<form:form action="processForm" modelAttribute="student">
			First Name: <form:input path="firstName"/>
			<br><br>
			Last Name: <form:input path="lastName"/>
			<br><br>
			Country: 
				<form:select path="country">
					<form:options items="${student.countryOptions}"/>
				</form:select>
			<br><br>
			Favorite Language: 
				Java <form:radiobutton path="language" value="Java"/>
				PHP <form:radiobutton path="language" value="PHP"/>
				C# <form:radiobutton path="language" value="C#"/>
				Ruby <form:radiobutton path="language" value="Ruby"/>
			<br><br>
			Operating Systems: 
				MacOS <form:checkbox path="operatingSystems" value="MacOS"/>
				CentOS <form:checkbox path="operatingSystems" value="CentOS"/>
				Linux <form:checkbox path="operatingSystems" value="Linux"/>
				MS Windows <form:checkbox path="operatingSystems" value="MS Windows"/>
			<br><br>
			<input type="submit" value="Submit"/>
		</form:form>
	</body>
</html>