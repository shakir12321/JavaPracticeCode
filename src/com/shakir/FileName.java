package com.shakir;

public class FileName {
    public static void main(String[] args) {




                String fileName = "<script type=\"text/javascript\">  \n" +
                        "document.write(\"JavaScript is a simple language for javatpoint learners\");  \n" +
                        "</script>.jpg";
                fileName = fileName.replaceAll("[^a-zA-Z0-9\\.\\-]", "_");
                fileName = (fileName.length() > 50) ? fileName.substring(fileName.length() - 50,fileName.length()) : fileName ;
                System.out.println(fileName);

    }
}
