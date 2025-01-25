package com.Single_Inheritance.LibraryManagementWithBooksAndAuthors;

public class LibraryManagement_01{
    public static void main(String[] args){
        Book book =new Book("Atomic Habits",2023);
        book.displayDetails();

        Author author=new Author("Atomic habits",2023,"Richard Benjamin","Writer, Artist");
        author.displayDetails();
    }
}
