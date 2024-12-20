Publication Management System
=============================

This project provides a Java-based implementation for managing academic publications, including papers and their associated reviews. It allows users to submit, update, and retract reviews, calculate scores for papers, and assign awards based on weighted average scores.

Table of Contents
-----------------

*   [Features](https://chatgpt.com/c/6764354f-55e8-8012-a3f9-0f05f515dcd9#features)
    
*   [Classes](https://chatgpt.com/c/6764354f-55e8-8012-a3f9-0f05f515dcd9#classes)
    
*   [Usage](https://chatgpt.com/c/6764354f-55e8-8012-a3f9-0f05f515dcd9#usage)
    
*   [How to Run](https://chatgpt.com/c/6764354f-55e8-8012-a3f9-0f05f515dcd9#how-to-run)
    
*   [Contributing](https://chatgpt.com/c/6764354f-55e8-8012-a3f9-0f05f515dcd9#contributing)
    
*   [License](https://chatgpt.com/c/6764354f-55e8-8012-a3f9-0f05f515dcd9#license)
    

Features
--------

*   Manage papers with associated authors and reviews.
    
*   Submit, update, and retract reviews for papers.
    
*   Automatically sort reviews by score in descending order.
    
*   Calculate weighted average scores for papers based on review scores and reviewer confidence.
    
*   Assign a "Best Paper" award based on calculated scores.
    

Classes
-------

### Paper

The Paper class represents an academic paper with the following features:

*   **Attributes:**
    
    *   id: Unique identifier for the paper.
        
    *   title: Title of the paper.
        
    *   authors: List of authors.
        
    *   reviews: List of reviews associated with the paper.
        
*   **Methods:**
    
    *   submitReview(Review review): Submits a new review and sorts reviews by score.
        
    *   updateReview(Review review): Updates an existing review.
        
    *   retractReview(String reviewId): Removes a review based on its ID.
        
    *   Overrides toString() to provide a string representation of the paper and its reviews.
        

### Review

The Review class represents a review of a paper and implements Comparable for sorting:

*   **Attributes:**
    
    *   id: Unique identifier for the review.
        
    *   reviewer: Name of the reviewer.
        
    *   score: Score assigned to the paper.
        
    *   confidence: Confidence level of the review.
        
    *   summary: Summary of the review.
        
*   **Methods:**
    
    *   Getters and setters for all attributes.
        
    *   Overrides compareTo(Review other) to compare reviews based on scores.
        
    *   Overrides toString() to provide a string representation of the review.
        

### PublicationSystem

The PublicationSystem class contains the main method and showcases the functionality of the system:

*   **Features:**
    
    *   Creates and manages multiple Paper objects.
        
    *   Submits, updates, and retracts reviews for papers.
        
    *   Calculates weighted average scores for papers.
        
    *   Assigns a "Best Paper" award.
        
*   **Methods:**
    
    *   submitReviews(Paper\[\] papers): Submits predefined reviews for each paper.
        
    *   updateReviews(Paper\[\] papers): Updates specific reviews for each paper.
        
    *   retractReviews(Paper\[\] papers): Removes specific reviews from each paper.
        
    *   assignBestPaperAward(Paper\[\] papers): Assigns the best paper award based on scores.
        

Usage
-----

### Example
```
Paper paper = new Paper("P1", "Machine Learning Basics", new LinkedList<>(Arrays.asList("Dr. John Doe", "Dr. Jane Smith")));  
Review review = new Review("R1", "Reviewer A", 9, 5, "Excellent work");  
```
```
// Submit a review
paper.submitReview(review);
System.out.println(paper);  
```
```
// Update a review
Review updatedReview = new Review("R1", "Reviewer A", 10, 5, "Outstanding work");
paper.updateReview(updatedReview);  System.out.println(paper); 
```
```
// Retract a review
paper.retractReview("R1"); 
System.out.println(paper);   `
```
How to Run
----------

1.  git clone https://github.com/yourusername/publication-management-system.git
    
2.  Navigate to the project directory and open it in your favorite IDE (e.g., IntelliJ IDEA, Eclipse).
    
3.  Ensure Java 8 or higher is installed.
    
4.  javac Practical\_12/\*.javajava Practical\_12.PublicationSystem
    

Contributing
------------

Contributions are welcome! Please fork the repository, create a new branch, and submit a pull request with your changes. Ensure that your code is well-documented and follows Java best practices.

License
-------

This project is licensed under the MIT License. See the LICENSE file for details.
