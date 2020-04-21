package com.company;

import Annotation.SaveTo;
import Annotation.Saver;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@SaveTo(path = "C:\\Users\\Den\\IdeaProjects\\homework2task2\\Text.txt")
public class WorkWithFile {
    String text;

    @Saver
    public void save() throws IOException{
        String path = AnnotationParameter.getAnnotation(WorkWithFile.class);
        try (
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
                bufferedWriter.write(this.text);
            System.out.println("Finished");
            } catch (IOException e) {
                e.printStackTrace();
        }
    }
}
