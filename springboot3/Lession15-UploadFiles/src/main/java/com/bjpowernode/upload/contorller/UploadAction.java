package com.bjpowernode.upload.contorller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.Part;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UploadAction {

    @PostMapping("/flies")
    public String upload(HttpServletRequest request) {
        try{
           for (Part part: request.getParts()) {
               String filename = extractFileName(part);
               part.write(filename);
           }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 將文件寫入服務器的目錄
        return "redirect:/index.html";
    }

    private String extractFileName(Part part) {
        String contentDisp = part.getHeader("content-disposition");
        String [] items = contentDisp.split(";");
        for (String s: items) {
            if(s.trim().startsWith("filename")) {
                return s.substring(s.indexOf("=") + 2, s.length()-1);
            }
        }
        return "";
    }

}
