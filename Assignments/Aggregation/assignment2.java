class Author {
    //Implement your code here 
    private String name;
    private String emailId;
    private char gender;
    
    public Author() {
        
    }
    
    public Author(String name, String emailId, char gender) {
        this.name = name;
        this.emailId = emailId;
        this.gender = gender;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name= name;
    }
    
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
}


class Book {
    //Implement your code here 
    private String name;
    private Author author;
    private double price;
    private int quantity;
    
    public Book() {
        
    }
    
    public Book(String name, Author author, double price, int quantity) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public void displayAuthorDetails() {
        System.out.println("Displaying author details");
        System.out.println("Author name: " + this.getAuthor().getName());
        System.out.println("Author email: " + this.getAuthor().getEmailId());
        System.out.println("Author gender: " + this.getAuthor().getGender());
    }
}


class Tester {
    public static void main(String[] args) {
        //Implement your code here
        Author author1 = new Author();
        author1.setName("Joshua Bloch");
        author1.setEmailId("joshua@email.com");
        author1.setGender('M');
        
        Book book1 = new Book();
        book1.setName("Effective Java");
        book1.setAuthor(author1);
        book1.setPrice(45.0);
        book1.setQuantity(15);
        
        // System.out.println(book1.displayAuthorDetails());
        return book1.displayAuthorDetails();
    }
}