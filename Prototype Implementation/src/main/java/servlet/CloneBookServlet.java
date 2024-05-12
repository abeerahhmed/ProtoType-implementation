package servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.awt.print.Book;
import java.io.*;
import java.util.*;

@WebServlet("/CloneBookServlet")
public class CloneBookServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        List<Book> books = (List<Book>) getServletContext().getAttribute("books");
        
        if (books != null) {
            for (Book book : books) {
                if (book.getId().equals(id)) {
                    try {
                        Book clonedBook = (Book) book.clone();
                        clonedBook.setId(UUID.randomUUID().toString()); // Assign a new unique ID to the clone
                        books.add(clonedBook);
                        break;
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        getServletContext().setAttribute("books", books);
        response.sendRedirect("listBooks.jsp");
    }
}
