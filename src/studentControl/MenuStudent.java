/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentControl;

import java.util.HashSet;
import java.util.Scanner;
import studentEntity.StudentEntity;
import studentModel.AddStudent;
import static studentPrint.PrintStudent.printListStudent;

/**
 *
 * @author Admin
 */
public class MenuStudent {

    static Scanner scan = new Scanner(System.in);
    static HashSet<StudentEntity> listStudent = new HashSet<>();

    public static void menu() {
        while (true) {
            System.out.println("-------------------------------------------------- Menu -----------------------------------------------");
            System.out.println("1. Add student records ");
            System.out.println("2. Dis[lay student records ");
            System.out.println("3. save ");
            System.out.println("4. Exit ");
            System.out.println("-------------------------------------------------------------------------------------------------------");
            int choise = scan.nextInt();
            scan.nextLine();
            switch (choise) {
                case 1:
                    listStudent = AddStudent.addStudent();
                    break;
                case 2:
                    printListStudent(listStudent);
                    break;
                case 3:
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }

    }
}
