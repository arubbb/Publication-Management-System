package Practical_12;
import java.util.Collections;
import java.util.LinkedList;

public class Paper {

    //Private variables to store the Paper details.
    private String id;
    private String title;
    private LinkedList<String> authors;     //Uses Java LinkedList for authors.
    private LinkedList<Review> reviews;     //Uses Java LinkedList for reviews.


    //Constructor to initialize the Paper details, ID , title, authors.
    public Paper(String id, String title, LinkedList<String> authors) {
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.reviews = new LinkedList<>();  //Initialises the reviews LinkedList
    }


    //Getters and Setters for each variable.
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public LinkedList<String> getAuthors() {
        return authors;
    }
    public void setAuthors(LinkedList<String> authors) {
        this.authors = authors;
    }

    public LinkedList<Review> getReviews() {
        return reviews;
    }
    public void setReviews(LinkedList<Review> reviews) {
        this.reviews = reviews;
    }
    public LinkedList<Review> getReviewer() {
        return reviews;
    }


    //Method to submit the Review and to sort in reverse order.
    public void submitReview(Review review) {
        reviews.add(review);
        Collections.sort(reviews, Collections.reverseOrder());
    }


    //Method to update the reviews and replaces existing reviews with updated.
    public void updateReview(Review review) {
        for (Review storedReview : reviews) {
            if (storedReview.getId().equals(review.getId())) {
                reviews.remove(storedReview);
                reviews.add(review);
                Collections.sort(reviews, Collections.reverseOrder());
                break;
            }
        }
    }


    //Method to retract the reviews based upon the ID.
    public void retractReview(String ReviewId) {
        for (Review storedReview : reviews) {
            if (storedReview.getId().equals(ReviewId)) {
                reviews.remove(storedReview);
                break;
            }
        }
    }


    //Override toString Method to provide string representation.
    @Override
    public String toString() {
        String r = "Paper ID: " + id + ", Title: " + title + ", Authors: " + authors +  "\nReviews: " + reviews;
        return r;
    }
}