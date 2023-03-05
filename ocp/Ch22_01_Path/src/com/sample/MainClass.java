package com.sample;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Paths;
import java.nio.file.Path;

public class MainClass {

    public static void main(String[] args) {

        System.out.println("");

        // FileSystem 是建立Path or 其他存取檔案系統的物件
        // Path -> 定義一個檔案 or 資料夾 or 目錄的路徑
        FileSystem fileSystem = FileSystems.getDefault();
        System.out.println("fileSystem：" + fileSystem);
        Path p1 = fileSystem.getPath("c:\\temp\\java\\test.txt");
        System.out.println("p1 --> " + p1 );
        Path p2 = fileSystem.getPath("c:/temp/java/test.txt");
        System.out.println("p2 --> " + p2 );
        Path p3 = fileSystem.getPath("c:", "temp", "java", "test.txt");
        System.out.println("p3 --> " + p3 );
        Path p4 = fileSystem.getPath("/temp/java/test.txt");
        System.out.println("p4 --> " + p4 );
        System.out.println("------------------------------------------------");
        Path path1 = Paths.get("c:", "temp", "company", "pcschool", "student.txt");
        System.out.println("path1 --> "+path1); //c:\temp\company\pcschool\student.txt
        System.out.println("path1.getFileName() --> "+path1.getFileName()); //student.txt
        System.out.println("path1.getParent() --> "+path1.getParent()); //c:\temp\company\pcschool
        // 是否為絕對路徑
        System.out.println("path1.isAbsolute() --> "+path1.isAbsolute()); //true
        // 絕對路徑表示法
        System.out.println("path1.toAbsolutePath() --> "+path1.toAbsolutePath()); //c:\temp\company\pcschool\student.txt
        System.out.println("path1.getRoot() --> "+path1.getRoot()); //c:\
        System.out.println("path1.getName(2) --> "+path1.getName(2)); //pcschool
        System.out.println("path1.subpath(0, 2) --> "+path1.subpath(0, 2)); //temp\company
        System.out.println("path1.toUri() --> "+path1.toUri()); //file:///c:/temp/company/pcschool/student.txt
        System.out.println("");

        //------------------------------------------------------------------------------------------
        System.out.println("去除冗餘資訊 normalize()-------------------------");
        Path path2 = Paths.get("c:/temp/company/../../pcschool/student.txt");
        System.out.println("path2 --> "+path2);
        Path newPath2 = path2.normalize();
        System.out.println("newPath2 --> "+newPath2); //c:\pcschool\student.txt

        Path path3 = Paths.get("c:/temp/company/./../pcschool/student.txt");
        System.out.println("path3 --> "+path3);
        Path newPath3 = path3.normalize();
        System.out.println("newPath3 --> "+newPath3); //c:\temp\pcschool\student.txt
        System.out.println("");

        System.out.println("路徑合併 resolve()-------------------------");
        Path path4 = Paths.get("c:/temp/company/pcschool");
        Path path5;
        path5 = Paths.get("student.txt");  //c:\temp\company\pcschool\student.txt
        path5 = Paths.get("/student.txt"); //c:\student.txt
        path5 = Paths.get("../../student.txt"); //c:\temp\company\pcschool\..\..\student.txt
        path5 = Paths.get("java/student.txt");  //c:\temp\company\pcschool\java\student.txt
        path5 = Paths.get("/java/student.txt");  //c:\java\student.txt

        Path newPath5 = path4.resolve(path5);
        System.out.println("newPath5 --> "+newPath5);
        System.out.println("");

        System.out.println("路徑切換-------------------------");
        Path path6 = Paths.get("c:/temp/company/pcschool/java");
        Path path7 = Paths.get("c:/gjun/android");
        Path temp = path6.relativize(path7);
        System.out.println("temp --> "+temp); //..\..\..\..\gjun\android

    }

}