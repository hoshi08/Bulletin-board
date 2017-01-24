<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登録</title>
</head>
<body>
	<div class="main-contents">

		<c:if test="${ not empty errorMessages }">
			<div class="errorMessages">
				<ul>
					<c:forEach items="${errorMessages}" var="message">
						<li><c:out value="${message}" />
					</c:forEach>
				</ul>
			</div>
			<c:remove var="errorMessages" scope="session" />
		</c:if>

		<form action="signup" method="post">



			<label for="loginid">ログインID</label> <input name="loginid"
				id="loginid" /> <br />
				<label for="password">パスワード</label>
			<input name="password" type="password" id="password" /><br />
				 <label for="name"> 名前 </label> <input
				name="name" id="name" /> <br />   <label
				for="Branch">支店名</label> <input name="Branch" id="Branch" /><br /> <label
				for="Position">部署/役職</label>
			<input name="Position"  id="Position"></input>
			<br /> <input type="submit" value="登録" /><br /> <a href=" ./">戻る</a>
		</form>
		<div class="copyrght">Copyright(c)Kouji Hoshi</div>
	</div>
</body>
</html>
