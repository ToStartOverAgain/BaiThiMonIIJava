/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentPrint;

import java.util.HashSet;
import studentEntity.StudentEntity;

/**
 *
 * @author Admin
 */
public class PrintStudent {

    public static void printListStudent(HashSet<StudentEntity> listStudent) {
        System.out.println("Student ID |\t Student Name |\t Address | \t Phone");
        for (StudentEntity studentEntity : listStudent) {
            System.out.println(studentEntity.getStudentId() + "\t |"
                    + studentEntity.getStudentName() + "|"
                    + studentEntity.getAddress() + "\t"
                    + studentEntity.getPhone());
        }
    }
}
