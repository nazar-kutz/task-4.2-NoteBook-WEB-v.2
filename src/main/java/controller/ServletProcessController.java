package controller;

        import model.entity.NoteBook;
        import model.entity.record.Record;
        import model.entity.record.data.Address;

        import javax.servlet.ServletException;
        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;

@WebServlet("/user process")
public class ServletProcessController extends HttpServlet {
    NoteBook noteBook = new NoteBook();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletProcessController() {

    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doProcess(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    public void doProcess(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Address address = Address.getNewBuilder()
                .buildCity(request.getParameter("city"))
                .buildStreet(request.getParameter("street"))
                .buildCityIndex(request.getParameter("city index"))
                .buildHouseNumber(Integer.valueOf(request.getParameter("house number")))
                .buildApartmentNumber(Integer.valueOf(request.getParameter("flat number")))
                .build();

        Record record = Record.getNewBuilder()
                .buidId(1)
                .buildFirstName(request.getParameter("first name"))
                .buildLastName(request.getParameter("last name"))
                .buildPatronymic(request.getParameter("patronymic"))
                .buildShortName()
                .buildNickname(request.getParameter("nickname"))
                .buildEmail(request.getParameter("e-mail"))
                .buildSkype(request.getParameter("skype"))
                .buildComment(request.getParameter("comment"))
                .buildHomePhone(request.getParameter("home phone"))
                .buildMobilePhone(request.getParameter("mobile phone"))
                .buildSpareMobilePhone(request.getParameter("spare phone"))
                .buildGroups(request.getParameter("group"))
                .buildAddress(address)
                .buildFullAddress(address)
                .build();

        noteBook.addToRecords(record);
        request.setAttribute("record", record);
        request.getRequestDispatcher("/record_info.jsp").forward(request, response);
    }
}
