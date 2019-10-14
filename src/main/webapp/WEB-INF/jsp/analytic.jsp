<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.mongant.analytics.entity.DeveloperSalary" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<jsp:useBean id="parameter" class="com.mongant.analytics.entity.FilterParameters"></jsp:useBean>

<html>
<head>
    <title>Analytic</title>
    <link rel="stylesheet" href="../../bootstrap-4.3.1/css/bootstrap.css">
    <link rel="stylesheet" href="../../css/main.css">
    <script src="../../js/jquery-3.4.1.min.js"></script>
    <script src="../../bootstrap-4.3.1/js/bootstrap.min.js"></script>
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
    <% List<DeveloperSalary> employeeSalaryEntities = (ArrayList<DeveloperSalary>) request.getAttribute("resultList");
        List<String> inputParameters = new ArrayList<>();
        if(employeeSalaryEntities != null && !employeeSalaryEntities.isEmpty()) {
            for(DeveloperSalary position : employeeSalaryEntities) {
                inputParameters.add(position.getPosition());
            }
        } else {%>
    <h2 style="color: #a71d2a; font-style: oblique">Нет данных для отображения</h2>
        <%return;}
        for (DeveloperSalary developerSalary : employeeSalaryEntities) {%>
        <tbody>
            <tr>
                <td><%=developerSalary.getPosition()%></td>
                <td><%=developerSalary.getProgrammingLanguage()%></td>
                <td><%=developerSalary.getSpecialization()%>
                <td><%=developerSalary.getTotalWorkExperience()%>
                <td><%=developerSalary.getCurrentPlaceExperience()%>
                <td><%=developerSalary.getSalaryMonth()%>
                <td><%=developerSalary.getChangeSalaryIn_12_Month()%>
                <td><%=developerSalary.getCity()%>
                <td><%=developerSalary.getCompanySize()%>
                <td><%=developerSalary.getCompanyType()%>
                <td><%=developerSalary.getGender()%>
                <td><%=developerSalary.getAge()%>
                <td><%=developerSalary.getEducation()%>
                <td><%=developerSalary.isStudent()%>
                <td><%=developerSalary.getEnglishLevel()%>
                <td><%=developerSalary.getSubjectArea()%>
                <td><%=developerSalary.getDate()%>
            </tr>
    <%}%>
        </tbody>
    </table>
</body>
</html>
