package Practical_12;

//Implements Comparable<Review> to allow for comparisons based on the review scores.
class Review implements Comparable<Review> {

    //Private variables to store the Review details.
    private String id;
    private String reviewer;
    private int score;
    private int confidence;
    private String summary;

    //Constructor to initialize the Review details, ID, score, confidence etc.
    public Review(String id, String reviewer, int score, int confidence, String summary) {
        this.id = id;
        this.reviewer = reviewer;
        this.score = score;
        this.confidence = confidence;
        this.summary = summary;


    }

    //Getters and Setters for each variable.
    public String getReviewer() {
        return reviewer;
    }
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getConfidence() {
        return confidence;
    }

    public void setConfidence(int confidence) {
        this.confidence = confidence;
    }
    public String getId() {
        return id;
    }


    //Override compareTo method to compare reviews based on their scores.
    @Override
    public int compareTo(Review other) {
        return Integer.compare(this.score, other.score);
    }

    // Override toString method to provide a string representation.
    @Override
    public String toString() {
        String r = "Review ID: " + id + ", Reviewer: " + reviewer + ", Score: " + score + ", Confidence: " + confidence + ", Summary: " + summary+"\n";
        return r;
    }
}