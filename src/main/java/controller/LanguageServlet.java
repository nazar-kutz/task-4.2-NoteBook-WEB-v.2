package controller;

import languages.CurrentLanguage;
import languages.EnglishLanguage;
import languages.UkrainianLanguage;
import model.entity.NoteBook;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/chose language")
public class LanguageServlet extends HttpServlet {
    NoteBook noteBook = new NoteBook();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LanguageServlet() {

    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        choseLanguge(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    public void choseLanguge(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String language = request.getParameter("lang");
        if(language.equalsIgnoreCase("en")){
            CurrentLanguage.language = new EnglishLanguage();
        }
        if(language.equalsIgnoreCase("ua")){
            CurrentLanguage.language = new UkrainianLanguage();
        }

        request.getRequestDispatcher("/input.jsp").forward(request, response);
    }
}
