    /**
     * A class that maintains information on a book.
     * This might form part of a larger application such
     * as a library system, for instance.
     *
     * @author (Bryan Dijkhuizen.)
     * @version (20.11.2018)
     */
    class Book
    {
        // The fields.
        private String author;
        private String title;
        private int pages;
        private String refNumber;
        private int borrowed;
        private boolean courseText;
        
        /**
         * Set the author and title fields when this object
         * is constructed.
         */
        public Book(String bookAuthor, String bookTitle, int pagesCnt, boolean bookCourseText)
        {
            author = bookAuthor;
            title = bookTitle;
            pages = pagesCnt;
            refNumber = "";
            courseText = bookCourseText;
        }
        
        public boolean isCourseText(){
            return courseText;
        }
    
        public String getAuthor(){
            return author;
        }
        
        public String getTitle(){
            return title;
        }
        
        public int getPages(){
            return pages;
        }
        
        public void borrow(){
         borrowed +=1;   
        }
        
        public int getBorrowed(){
         return borrowed;   
        }
        
        public void printDetails(){
            System.out.println("Titel: " + title);
            System.out.println("Auteur: " + author);
            System.out.println("Pages: " + pages);
            System.out.println("Borrowed: " + borrowed + " Times");
            if(refNumber.length() > 0){
                System.out.println("Refnumber = " + refNumber);
            }
            else{
                System.out.println("Refnumber = ZZZ");
            }

    }
    
    public String getRefNumber(){
        return refNumber;
    }
    
    public void setRefNumber(String ref){
        if(ref.length() >= 3){
           refNumber = ref; 
        }else {
            System.out.println("Te weinig tekens");
        
    }
    
    
}
    
 
}
