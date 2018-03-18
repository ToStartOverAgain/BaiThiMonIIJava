/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentModel;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import studentEntity.StudentEntity;

/**
 *
 * @author Admin
 */
public class Save {
    public static void saveFile(HashSet<StudentEntity> listStudent){
        try {
            FileWriter fw = new FileWriter("student.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for (StudentEntity studentEntity : listStudent) {
                bw.write(studentEntity.getStudentId() + " |\t " );
                bw.write(studentEntity.getStudentName() + " |\t " );
                bw.write(studentEntity.getAddress() + " |\t " );
                bw.write(studentEntity.getPhone() + " |\t " );
                bw.flush();
                bw.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(Save.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
