<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	int i2 = 0;
%>
<%
	request.setCharacterEncoding("utf-8");

	String name = request.getParameter("name");
	String height = request.getParameter("height");
	String weight = request.getParameter("weight");
	String BMI = request.getParameter("bmi");
	
	Double d1 = Double.parseDouble(height);
	Double d2 = Double.parseDouble(weight);
	i2 = Integer.parseInt(BMI);
	

%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>req_quiz_result</title>
	</head>
	<body>
	<%
		i2 = 0;
		if(d2 / (d1/100 * d1/100) >= 25) {
			out.println("과체중");
		} else if (d2 / (d1/100 * d1/100) <= 18){
			out.println("저체중");
		} else {
			out.println("정상");
		}
	%>
		이름 : <%=name %><br>
		키 : <%=d1 %><br>
		BMI : <%=i2 %><br>
	</body>
</html>