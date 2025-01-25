package com.Single_Inheritance.LibraryManagementWithBooksAndAuthors;

//creating superClass: Book
class Book{

    //attributes: title, publicationYear
    protected String title;
    protected int publicationYear;

    //parameterized constructor
    Book(String title,int publicationYear){
        setTitle(title);
        setPublicationYear(publicationYear);
    }

    //getter and setter
    public void setTitle(String title){
        this.title=title;
    }

    public void setPublicationYear(int publicationYear){
        if(publicationYear>2025){
            this.publicationYear=2025;
        }
        else if(publicationYear<1980){
            this.publicationYear=1980;
        }
        else{
            this.publicationYear=publicationYear;
        }
    }

    public String getTitle(){
        return title;
    }

    public int getPublicationYear(){
        return publicationYear;
    }

    //method to display Book details
    public void displayDetails(){
        System.out.println("\n--------Book Info--------");
        System.out.println("Book Title       :"+ getTitle());
        System.out.println("Publication Year :"+ getPublicationYear());
    }
}

