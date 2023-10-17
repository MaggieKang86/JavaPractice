package com.bjpowernode.upload.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
public class UploadFileController {

    // 上傳文件
    @PostMapping("/uploadFile")
    public String uploadFile(@RequestParam("upfile") MultipartFile multipartFile){
        System.out.println("開始處理上傳文件");
        Map<String, Object> info = new HashMap<>();

        try{
            // 判斷上傳了文件
            if (!multipartFile.isEmpty()) {
                info.put("上傳文件的參數名稱", multipartFile.getName());  // upfile
                info.put("內容類型", multipartFile.getContentType());

                var ext = "unknown";
                var filename = multipartFile.getOriginalFilename();  // 原始文件名稱，例如 a.gif
                if (filename.indexOf(".") > 0) {
                    ext = filename.substring(filename.indexOf(".") + 1);
                }
                // 生成服務器使用的文件名稱
                var newFileName = UUID.randomUUID().toString() + "." + ext;
                var path = "/Users/maggie/JavaPractice/springboot3/Lession15-UploadFiles//" + newFileName; // 存儲服務器的文件
                // 把文件保存到 path 目錄
                multipartFile.transferTo(new File(path));

                info.put("文件名稱", newFileName);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        System.out.println("info = " + info);

        // 重新定向到 index 頁面
        return "redirect:/index.html";
    }

}
