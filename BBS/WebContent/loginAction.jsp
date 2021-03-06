<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="user.UserDAO" %>
<%@ page import="java.io.PrintWriter" %>
<% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="user" class="user.User" scope="page" />
<jsp:setProperty name="user" property="userID" />
<jsp:setProperty name="user" property="userPW" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 게시판 웹 사이트 만들기!</title>
</head>
<body>
	<%
		String userID = null;
		if(session.getAttribute("userID")!=null){
			userID = (String)session.getAttribute("userID");
		}
		if(userID!=null){
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('이미 로그인 되었습니다.')");
			script.println("location.href='main.jsp'");
			script.println("</script>");
		}
		UserDAO dao = new UserDAO();
		int result = dao.login(user.getUserID(), user.getUserPW());
		if(result==1){
			session.setAttribute("userID", user.getUserID());
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("location.href='main.jsp'");
			script.println("</script>");
		} else if(result==0){
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('비밀번호 불일치.')");
			script.println("history.back()");
			script.println("</script>");
		} else if(result==-1){
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('존재하지 않는 ID 입니다.')");
			script.println("history.back()");
			script.println("</script>");
		} else if(result==-2){
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('DB오류')");
			script.println("history.back()");
			script.println("</script>");
		}
	%>
</body>
</html>