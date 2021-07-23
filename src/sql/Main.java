package sql;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("insert.sql", true);
        BufferedWriter bw = new BufferedWriter(fw);

        for (int i = 17; i < 20_018 ; i++) {
            bw.write(String.format("INSERT INTO aluno values(%d, 'Aretha', 20, 1, 1);\n", i));
        }

        bw.close();
    }
}
