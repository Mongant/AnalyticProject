<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.mongant.analytics.entity.DeveloperSalary" %>
<%@ page import="com.mongant.analytics.dao.SqlResult" %>

<form action="filter" method="post">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-3">
                <select multiple size="3" class="custom-select" id="position" name="position">
                    <%
                        for (DeveloperSalary developerSalary : new SqlResult().getPositionSet()) {
                    %>
                    <option value="<%=developerSalary.getPosition()%>"><%=developerSalary.getPosition()%>
                    </option>
                    <%}%>
                </select>
        </div>
        <div class="col-md-3">
                <input type="radio" name="gender" id="gender_m" value="m">Мужской
                <input type="radio" name="gender" id="gender_f" value="f" >Женский
        </div>
        <div class="col-md-3">
            <input id="filter_button" type="submit" class="btn btn-primary" value="Применить">
        </div>
    </div>
</div>
</form>
