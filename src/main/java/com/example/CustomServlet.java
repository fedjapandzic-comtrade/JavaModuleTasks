package com.example;


import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;

public class CustomServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        ServletFileUpload sf = new ServletFileUpload(new DiskFileItemFactory());
        try {
            PrintWriter out = response.getWriter();
            List<FileItem> files = sf.parseRequest(request);
            for(FileItem fileItem : files){
                fileItem.write(new File("tempfile.txt"));
            }
            BufferedReader reader;
            reader = new BufferedReader(new FileReader("tempfile.txt"));
//            String word = reader.readLine();
            String word = request.getParameter("word");

            Solution solution = new Solution();
            System.out.println("Testing for word: " + word);
            String line = reader.readLine();

            out.println("<h2>The word " + word + " is repeated: </h2><br>");
            while (line != null) {
                String text = "<h2>In " + line + " " + solution.solution(word, line) + " times.</h2><br>";
                out.println(text);
                line = reader.readLine();
            }
            reader.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        //        response.setContentType("text/html");
//        Solution solution = new Solution();
//        String word = request.getParameter("word");
//        String text = request.getParameter("textForWord");
//        PrintWriter out =  response.getWriter();
//        out.println("The word " + word + "can be found in "+ text + " " + solution.solution(word,text) + " times");

    }

}
