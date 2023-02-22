/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.library;
 

/**
 *
 * author Abdulmalik Abdullatif Alhindi
 * ID : 443010360
 *
 */
public class Book {

    String BookName, author;
    int BookID, nocopies;      // nocopies = عدد النسخ المتوفر للكتاب 

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String BookName) {
        this.BookName = BookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getBookID() {
        return BookID;
    }

    public void setBookID(int BookID) {
        this.BookID = BookID;
    }

    
    
    public int getNocopies() {
        return nocopies;
    }

    public void setNocopies(int nocopies) {
        this.nocopies = nocopies;
    }

    
}
