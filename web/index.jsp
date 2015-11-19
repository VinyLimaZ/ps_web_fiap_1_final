<%--
  Created by
  vinylimaz on
  Date: 19/11/15
  Time: 13:12
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%  %>
<html>
<head>
    <title>Cadastro</title>
    <%@include file="include.jsp"%>
</head>
<body>
<div class="container">
    <div class="row">
        <nav>
        </nav>
    </div>
    <div class="row">
        <form action="Servlet" method="post">
            <div class="col-md-4">
                Codigo do funcionario: <br>
                <input type="number" name="cod" maxlength="5" min="0">
            </div>
            <div class="col-md-4"><br>
                Nome: <input type="text" name="nome">
            </div>
            <div class="col-md-4"><br>
                Cargo: <input type="text" name="cargo">
            </div>
            <div class="row">
                <input class="button" type="submit" value="confirmar" name="confirmar">
            </div>
        </form>
    </div>

</div>
</body>
</html>
