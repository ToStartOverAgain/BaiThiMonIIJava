/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentModel;

import java.util.HashSet;
import java.util.Scanner;
import studentEntity.StudentEntity;

/**
 *
 * @author Admin
 */
public class AddStudent {

    static Scanner scan = new Scanner(System.in);
    static HashSet<StudentEntity> listStudent = new HashSet<>();

    public static HashSet<StudentEntity> addStudent() {
        StudentEntity studentEntity = new StudentEntity();

        System.out.println("vui long nhap ID: ");
        String studentId = scan.nextLine();
        studentEntity.setStudentId(studentId);
        System.out.println("vui long nhap Name");
        String studentName = scan.nextLine();
        studentEntity.setStudentName(studentName);
        System.out.println("vui long nhap Addrerss");
        String Address = scan.nextLine();
        studentEntity.setAddress(Address);
        System.out.println("vui long nhap Phone");
        String Phone = scan.nextLine();
        studentEntity.setPhone(Phone);
        listStudent.add(studentEntity);
     
        return listStudent;
    }
}
