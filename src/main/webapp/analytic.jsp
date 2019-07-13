<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.mongant.analytics.dao.EmployeeSalaryEntity" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.mongant.analytics.dao.SqlResult" %>

<html>
<head>
    <title>Analytic</title>
    <link rel="stylesheet" href="bootstrap-4.3.1/css/bootstrap.css">
    <link rel="stylesheet" href="css/main.css">
    <script src="jquery-3.4.1.min.js"></script>
    <script src="bootstrap-4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<jsp:include page="filter.jsp"/>
<table class="table">
    <thead>
    <tr>
        <th scope="col">Позиция</th>
        <th scope="col">Язык программирования</th>
        <th scope="col">Специализация</th>
        <th scope="col">Общий опыт</th>
        <th scope="col">Опыт на текущем месте</th>
        <th scope="col">Зарплата в месяц</th>
        <th scope="col">Изменение ЗП за 12 мес.</th>
        <th scope="col">Город</th>
        <th scope="col">Размер компании</th>
        <th scope="col">Тип компании</th>
        <th scope="col">Пол</th>
        <th scope="col">Возраст</th>
        <th scope="col">Образование</th>
        <th scope="col">Еще студент</th>
        <th scope="col">Уровень английского</th>
        <th scope="col">Предметная область</th>
        <th scope="col">Дата</th>
    </tr>
    </thead>
    <% List<EmployeeSalaryEntity> employeeSalaryEntities;
        if(request.getAttribute("resultList") == null) {
            employeeSalaryEntities = new SqlResult().getResult(new ArrayList<>());
        } else {
            employeeSalaryEntities = (ArrayList<EmployeeSalaryEntity>) request.getAttribute("resultList");
        }
        for (EmployeeSalaryEntity employeeSalaryEntity: employeeSalaryEntities) {%>
        <tbody>
            <tr>
                <td><%=employeeSalaryEntity.getPosition()%></td>
                <td><%=employeeSalaryEntity.getProgrammingLanguage()%></td>
                <td><%=employeeSalaryEntity.getSpecialization()%>
                <td><%=employeeSalaryEntity.getTotalWorkExperience()%>
                <td><%=employeeSalaryEntity.getCurrentPlaceExperience()%>
                <td><%=employeeSalaryEntity.getSalaryMonth()%>
                <td><%=employeeSalaryEntity.getChangeSalaryIn_12_Month()%>
                <td><%=employeeSalaryEntity.getCity()%>
                <td><%=employeeSalaryEntity.getCompanySize()%>
                <td><%=employeeSalaryEntity.getCompanyType()%>
                <td><%=employeeSalaryEntity.getGender()%>
                <td><%=employeeSalaryEntity.getAge()%>
                <td><%=employeeSalaryEntity.getEducation()%>
                <td><%=employeeSalaryEntity.isStudent()%>
                <td><%=employeeSalaryEntity.getEnglishLevel()%>
                <td><%=employeeSalaryEntity.getSubjectArea()%>
                <td><%=employeeSalaryEntity.getDate()%>
            </tr>
    <%}%>
        </tbody>
    </table>
</body>
</html>
