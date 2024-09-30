<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gerenciamento de Departamentos</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 20px;
        }
        h2 {
            color: #333;
        }
        .container {
            max-width: 800px;
            margin: auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-bottom: 20px;
        }
        table, th, td {
            border: 1px solid #ddd;
        }
        th, td {
            padding: 10px;
            text-align: left;
        }
        th {
            background-color: #007bff;
            color: white;
        }
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
        form {
            display: flex;
            justify-content: space-between;
            align-items: center;
        }
        input[type="text"] {
            width: 80%;
            padding: 10px;
            margin-right: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        button {
            padding: 10px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

<div class="container">
    <h2>Lista de Departamentos</h2>

    <!-- Tabela que exibe a lista de departamentos -->
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Description</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="departamento" items="${departamentos}">
                <tr>
                    <td>${departamento.idDepto}</td>
                    <td>${departamento.descDepto}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <!-- Formulário para adicionar novo departamento -->
    <h3>Adicionar Novo Departamento</h3>
    <form action="departamento" method="post">
        <input type="text" name="descDepto" placeholder="Departamento" required>
        <button type="submit">Adicionar</button>
    </form>
</div>

</body>
</html>
