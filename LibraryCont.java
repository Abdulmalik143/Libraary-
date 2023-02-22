package com.mycompany.library;

import java.util.Scanner;
import java.util.ArrayList;

public class LibraryCont {

    ArrayList<Book> BookList = new ArrayList<Book>();
    ArrayList<student> stuList = new ArrayList<student>();

    int[] arr = new int[5];

    public void AddBooks() {

        Book b1 = new Book();
        System.out.println(" Enter the name of the book ");
        Scanner s1 = new Scanner(System.in);
        String name = s1.nextLine();
        b1.setBookName(name);

        System.out.println("Enter book id ");
        int id = s1.nextInt();
        b1.setBookID(id);

        System.out.println("Enter the auther ");
        String author = s1.next();
        b1.setAuthor(author);

        System.out.println("Enter number of copise ");
        int copies = s1.nextInt();
        b1.setNocopies(copies);

        BookList.add(b1);

    }

    public void addstudent() {

        student s1 = new student();

        System.out.println("Enter the name");
        Scanner sc1 = new Scanner(System.in);
        String name = sc1.nextLine();
        s1.setSname(name);

        System.out.println("Enter student id");
        int id = sc1.nextInt();
        s1.setsID(id);

        System.out.println("enter no of copies");
        int copies = sc1.nextInt();
        s1.setNoc(copies);

        stuList.add(s1);

    }

    public void issuedbooks() {

        System.out.println("Enter Book ID");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();

        for (Book b : BookList) {
            if (b.getBookID() == id) {
                if (b.getNocopies() == 0) {
                    System.out.println("Book not available");

                } else {
                    checkstud(b);

                }

            }
        }

    }

    public void checkstud(Book obj) {
        System.out.println("Enter student id");
        Scanner sc = new Scanner(System.in);
        int sid = sc.nextInt();      //sid = Student ID

        for (student stud : stuList) {
            if (stud.getsID() == sid) {
                if (stud.getNoc() < 5) {
                    System.out.println("Book issued");
                    stud.setNoc(stud.getNoc() + 1);
                    obj.setNocopies(obj.getNocopies() - 1);

                } else {
                    System.out.println("Only 5 books can be issued");
                }
            }
        }

    }

    public void returnbooks() {

        System.out.println("Enter book id");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();

        for (Book b : BookList) {

            if (b.getBookID() == id) {

                b.setNocopies(b.getNocopies() + 1);
                Callstud();

            }

        }

    }

    public void Callstud() {
        System.out.println("Enter student id");
        Scanner sc = new Scanner(System.in);
        int sid = sc.nextInt();

        for (student stud : stuList) {
            if (stud.getsID() == sid) {
                System.out.println("Book Returned");
                stud.setNoc(stud.getNoc() - 1);
            } else {
                System.out.println("invalid student");
            }
        }
    }

    public void searchbooks() {
        System.out.println("Enter the name of the book ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        for (Book b : BookList) {

            if (b.getBookName().equalsIgnoreCase(name)) // .equalsIgnoreCase= \ ASdf = asdf 
            {
                System.out.println("The details are: " + b.getBookName() + " " + b.getAuthor() + " " + b.getNocopies());
            } else {
                System.out.println("invalid Book ");
            }
        }
    }

}
