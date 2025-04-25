package com.mahone.book.controller;


import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@Tag(name = "file")
public class FileUploadController {

    @PostMapping("/upload")
    public String up(String nickname, MultipartFile phone, HttpServletRequest request) throws IOException {
        System.out.println(nickname);
        //获取文件的原始名称
        System.out.println(phone.getOriginalFilename());
        //获取文件类型
        System.out.println(phone.getContentType());
        String path = request.getServletContext().getRealPath("/upload/");
        System.out.println(path);
        saveFile(phone,path);
        return "上传成功！";
    }
    /**
     * 保存文件
     * @param phone
     * @param path
     * @throws IOException
     */
    public void saveFile(MultipartFile phone, String path) throws IOException {
        File dir = new File(path);
        if(!dir.exists()){
            dir.mkdirs();
        }
        File file = new File(path + phone.getOriginalFilename());
        phone.transferTo(file);
    }
}
