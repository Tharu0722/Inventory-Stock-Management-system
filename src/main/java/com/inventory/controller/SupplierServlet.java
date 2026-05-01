package com.inventory.controller;

import com.inventory.dao.SupplierDAO;
import com.inventory.model.Supplier;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/supplier")
public class SupplierServlet extends HttpServlet {

    SupplierDAO dao = new SupplierDAO();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String action = req.getParameter("action");

        // CREATE
        if (action.equals("add")) {

            String name = req.getParameter("name");
            String email = req.getParameter("email");
            String phone = req.getParameter("phone");

            Supplier s = new Supplier();
            s.setName(name);
            s.setEmail(email);
            s.setPhone(phone);

            dao.addSupplier(s);

            resp.sendRedirect("supplier?action=list");
        }

        // UPDATE
        else if (action.equals("update")) {

            int id = Integer.parseInt(req.getParameter("id"));

            Supplier s = new Supplier();
            s.setId(id);
            s.setName(req.getParameter("name"));
            s.setEmail(req.getParameter("email"));
            s.setPhone(req.getParameter("phone"));

            dao.updateSupplier(s);

            resp.sendRedirect("supplier?action=list");
        }

        // DELETE
        else if (action.equals("delete")) {

            int id = Integer.parseInt(req.getParameter("id"));

            dao.deleteSupplier(id);

            resp.sendRedirect("supplier?action=list");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String action = req.getParameter("action");

        if (action == null || action.equals("list")) {

            List<Supplier> list = dao.getAllSuppliers();

            req.setAttribute("suppliers", list);

            req.getRequestDispatcher("supplier/viewSupplier.jsp")
                    .forward(req, resp);
        }
    }
}
