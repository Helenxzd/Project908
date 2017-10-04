package indi.eshttccty.project908.index ;

import java.io.IOException ;
import java.io.PrintWriter ;

import javax.servlet.* ;
import javax.servlet.http.* ;

public class Index extends HttpServlet 
{
    private static final long serialVersionUID = 1L ;
    @Override
    public void doGet ( HttpServletRequest request , HttpServletResponse response ) throws ServletException , IOException
    {
        PrintWriter writer = response.getWriter ( ) ;
        writer.write ( "This is the main page of Project908." ) ;
        writer.flush ( ) ;
        writer.close ( ) ;
        return ;
    }
}
