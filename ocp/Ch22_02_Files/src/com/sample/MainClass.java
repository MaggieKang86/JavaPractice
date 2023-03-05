package com.sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.stream.Stream;

public class MainClass {

    public static void main(String[] args) {

        // Path: 建立檔案或目錄的物件
        Path source = Paths.get("c:/com/sample/java/hello.txt");
        Path targe = Paths.get("c:", "com", "example","python", "hi.txt");
        System.out.println("source: " + source);
        System.out.println("targe: " + targe);

        // Files: 操作檔案或目錄
        try {

            // 建立資料夾
            Files.createDirectories(source.getParent());
            Files.createDirectories(targe.getParent());

            // 建立檔案前先檢查檔案是否已存在 (檔案不可重複建立)
            if(Files.exists(source)) {
                System.out.println(source.getFileName() + " 檔案已存在");
            } else {
                // 建立檔案
                Files.createFile(source);
                System.out.println(source.getFileName() + " 檔案建立完成");
            }

            // 資料寫入檔案前，判斷檔案是否可寫
            if(Files.isWritable(source)) {
                System.out.println(source.getFileName() + " 檔案可寫");
                // 建立集合
                ArrayList<String> list = new ArrayList<>();
                list.add("Java SE 8");
                list.add("拎老師卡好");
                list.add(LocalDateTime.now().toString());
                System.out.println("-----------------------");

                // 資料寫入至 hello.tx 檔案
                Files.write(source, list, StandardOpenOption.APPEND);
            } else {
                System.out.println(source.getFileName() + " 檔案不可寫");
            }

            // 檔案複製                    若檔案存在就複寫
            // Files.copy(source, targe, StandardCopyOption.REPLACE_EXISTING);

            // 檔案搬移
            // Files.move(source, targe, StandardCopyOption.REPLACE_EXISTING);

            // 檔案刪除
            // Files.delete(targe);

            // 測試
            Path testPath = Paths.get("c:\\com\\test\\temp.txt");
            // 資料夾不存在時執行複製
            // Files.copy(source, testPath, StandardCopyOption.REPLACE_EXISTING);  // NoSuchFileException
            // 刪除內有檔案的資料夾
            // Files.delete(source.getParent());  // FileSystemException or DirectoryNotEmptyException

            // ----------------------
            // 複製 / 下載網路圖片
            String url = "https://XXXXXX";
            URI uri = URI.create(url);
            Path ocaPath = Paths.get("javaoca.png");
            try(InputStream in = uri.toURL().openStream()) {
                Files.copy(in, ocaPath, StandardCopyOption.REPLACE_EXISTING);
            }
            System.out.println("-------------------");

            // 走訪資料夾目錄檔案 (單層）
            try(Stream<Path> files = Files.list(Paths.get("."))) {
                files.forEach(System.out::println);
            }

            // 走訪資料夾目錄檔案 (每一層）
            try(Stream<Path> files = Files.walk(Paths.get("."))) {
                files.forEach(System.out::println);
            }
            System.out.println("-------------------");

            // 讀取資料
            try(FileReader fr = new FileReader(source.toFile());
                BufferedReader br = new BufferedReader(fr)) {
                br.lines().forEach(System.out::println);
            }
            System.out.println("================");
            try(Stream<String> lines = Files.lines(source)) {
                lines.forEach(System.out::println);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }



    }

}
