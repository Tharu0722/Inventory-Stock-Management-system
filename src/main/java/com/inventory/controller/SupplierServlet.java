package com.inventory.controller;

import com.inventory.DAO.SupplierDAO;
import com.inventory.model.Supplier;
import com.inventory.util.DBConnection;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class SupplierServlet extends HttpServlet {

    SupplierDAO dao = new SupplierDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        System.out.println(DBConnection.getConnection());

        String action = req.getParameter("action");

        if (action == null) action = "list";

        switch (action) {

            case "list":
                List<Supplier> list = dao.getAllSuppliers();
                req.setAttribute("suppliers", list);
                req.getRequestDispatcher("supplier.jsp").forward(req, resp);
                break;

            case "delete":
                int id = Integer.parseInt(req.getParameter("id"));
                dao.deleteSupplier(id);
                resp.sendRedirect("supplier?action=list");
                break;

            default:
                resp.sendRedirect("supplier?action=list");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        Supplier s = new Supplier();

        s.setName(req.getParameter("name"));
        s.setPhone(req.getParameter("phone"));
        s.setEmail(req.getParameter("email"));
        s.setAddress(req.getParameter("address"));

        dao.addSupplier(s);

        resp.sendRedirect("supplier?action=list");
    }
}