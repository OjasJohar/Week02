package com.Single_Inheritance.LibraryManagementWithBooksAndAuthors;

//creating subClass: Author
class Author extends Book{

    //attributes: name, bio
    protected String name;
    protected String bio;

    //parametrized constructor
    Author(String title,int publicationYear, String name, String bio){
        super(title,publicationYear);
        setName(name);
        setBio(bio);
    }

    //getter and setter
    public void setName(String name){
        this.name=name;
    }

    public void setBio(String bio){
        this.bio=bio;
    }

    public String getName(){
        return name;
    }

    public String getBio(){
        return bio;
    }

    @Override
    public void displayDetails(){
        System.out.println("\n--------Author Info--------");
        System.out.println("Author name      :"+ getName());
        System.out.println("Author Bio       :"+ getBio());
        System.out.println("Book Title       :"+ getTitle());
        System.out.println("Publication Year :"+ getPublicationYear());
    }
}


