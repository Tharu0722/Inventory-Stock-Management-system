<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.*, com.inventory.model.Supplier" %>

<html>
<head>
    <title>Supplier Management</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="container mt-4">

<h2 class="text-center mb-4">Supplier Management</h2>

<!-- ADD FORM -->
<div class="card p-3 mb-4">

    <form method="post" action="supplier">

        <div class="row">

            <div class="col-md-3">
                <input type="text" name="name" class="form-control" placeholder="Name" required>
            </div>

            <div class="col-md-3">
                <input type="text" name="phone" class="form-control" placeholder="Phone" required>
            </div>

            <div class="col-md-3">
                <input type="email" name="email" class="form-control" placeholder="Email" required>
            </div>

            <div class="col-md-3">
                <input type="text" name="address" class="form-control" placeholder="Address" required>
            </div>

        </div>

        <div class="mt-3 text-end">
            <button type="submit" class="btn btn-success">Add Supplier</button>
        </div>

    </form>

</div>

<!-- TABLE -->
<table class="table table-bordered table-hover">

    <thead class="table-dark">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Phone</th>
        <th>Email</th>
        <th>Address</th>
        <th>Action</th>
    </tr>
    </thead>

    <tbody>

    <%
        List<Supplier> list = (List<Supplier>) request.getAttribute("suppliers");

        if (list != null && !list.isEmpty()) {

            for (Supplier s : list) {
    %>

    <tr>
        <td><%= s.getId() %></td>
        <td><%= s.getName() %></td>
        <td><%= s.getPhone() %></td>
        <td><%= s.getEmail() %></td>
        <td><%= s.getAddress() %></td>
        <td>
            <a href="supplier?action=delete&id=<%= s.getId() %>"
               class="btn btn-danger btn-sm"
               onclick="return confirm('Delete this supplier?')">
                Delete
            </a>
        </td>
    </tr>

    <%
            }
        } else {
    %>

    <tr>
        <td colspan="6" class="text-center">No suppliers found</td>
    </tr>

    <%
        }
    %>

    </tbody>

</table>

</body>
</html>