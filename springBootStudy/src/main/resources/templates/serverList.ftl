<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>servers</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<h1>server list</h1>
    <table>
        <#list servers as server>
            <tr>
                <td>${server.name}</td>
                <td>${server.onlineLimit}</td>
                <td>${server.showId}</td>
                <td>${server.host}</td>
            </tr>
        </#list>
    </table>
</body>
</html>
