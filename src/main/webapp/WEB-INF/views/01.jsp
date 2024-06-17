<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>데이터형</title>
</head>
<body>
	<h1>데이터형</h1>
	<h3>JSP 방식</h3>
	<%
	int iVal = (int)request.getAttribute("iVal");
	Object nullVal = request.getAttribute("nullVal"); //object는다운캐스팅 필요없음
	%>
	<p>iVal : <%= iVal %></p>
	<p>nullVal : <%= nullVal %></p>
	
	<!-- servlet에서 넘어온 값들을 표현할때 사용한다.
		 java보다 간결하다 -->
	<!-- 명시적인 getAttribute 작업 필요 없음 -->
	<h3>Expression Language 방식(EL)</h3>
	<ul>
		<li>fVal : ${fVal }</li>
		<li>bVal : ${bVal }</li>
		<li>sVal : ${sVal }</li>
		
		<li>nullVal : ${nullVal }</li>
		<!-- EL방식의 null은 공백으로 출력됨! -->
		
		
		
		<li>userVo : ${userVo }</li>
		<!-- 객체는 toString() 메서드를 호출한 결과 값이 출력된다. -->
		
		<li>userVo 객체 속성 접근: ${userVo.email }</li>
		<!-- 명명 규칙에 따라 getter 호출 -->
	</ul>
	
	
</body>
</html>