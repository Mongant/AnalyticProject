<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.mongant.analytics.dao.EmployeeSalaryEntity" %>
<%@ page import="com.mongant.analytics.dao.SqlResult" %>

<form action="filter" method="post">
<div class="container-fluid">
    <div class="row">
        <div class="col-md-3">
                <select multiple size="3" class="custom-select" id="position" name="position">
                    <%
                        for (EmployeeSalaryEntity employeeSalaryEntity : new SqlResult().getPositionSet()) {
                    %>
                    <option value="<%=employeeSalaryEntity.getPosition()%>"><%=employeeSalaryEntity.getPosition()%>
                    </option>
                    <%}%>
                </select>
        </div>
        <div class="col-md-3">
                <input type="radio" name="gender" id="gender_m" value="m">M
                <input type="radio" name="gender" value="f" id="gender_f">Ж
        </div>
        <div class="col-md-3">
            <input type="submit" class="btn btn-primary" value="Применить">
        </div>
    </div>
</div>
</form>
