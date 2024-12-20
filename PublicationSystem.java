package Practical_12;
import java.util.Arrays;
import java.util.LinkedList;

public class PublicationSystem {

    //Creates multiple Paper objects with specific details such as ID, Title, etc.
    public static void main(String[] args) {
        Paper[] paperList = new Paper[3];
        paperList[0] = new Paper("P1", "Computer Science", new LinkedList<String>(Arrays.asList("Dr.Robert Smith", "Dr.Adamsky Grace")));
        paperList[1] = new Paper("P2", "Astrology", new LinkedList<String>(Arrays.asList("Dr.Culpeper Brent", "Dr.Nicholas Days")));
        paperList[2] = new Paper("P3", "Mechanics", new LinkedList<String>(Arrays.asList("Dr.Ibrahim Saeed", "Dr.Tania Wild")));

        //Submit reviews and print the details.
        submitReviews(paperList);
        printPapers(paperList);
        //Update the reviews and print the details.
        updateReviews(paperList);
        printPapers(paperList);
        //Retract the reviews and print the details.
        retractReviews(paperList);
        printPapers(paperList);
        //Assign best paper award.
        assignBestPaperAward(paperList);


    }


    //Print details of each paper.
    private static void printPapers(Paper[] paperList){
        for (Paper paper : paperList){
            System.out.println(paper);
        }

    }

    //Submit reviews for each paper, Paper1, Paper2, Paper3.
    private static void submitReviews(Paper[] papers) {
            // Submit
            System.out.println("Submit R1, R2, R3, R4 Review for Paper P1 ");
            papers[0].submitReview(new Review("R1", "Tom", 6, 5, "Good"));
            papers[0].submitReview(new Review("R2", "Layla", 8, 4, "Good"));
            papers[0].submitReview(new Review("R3", "Andy", 3, 2, "Bad"));
            papers[0].submitReview(new Review("R4", "Scott", 10, 5, "Great"));
            System.out.println("Submit R1, R2 , R3, R4 Reviews for Paper P2 ");
            papers[1].submitReview(new Review("R1", "Bob", 4, 3, "Good"));
            papers[1].submitReview(new Review("R2", "Mary", 7, 2, "Bad"));
            papers[1].submitReview(new Review("R3", "Joan", 2, 1, "Bad"));
            papers[1].submitReview(new Review("R4", "Gert", 9, 5, "Good"));

            System.out.println("Submit R1, R2, R3, R4 for Paper P3 ");
            papers[2].submitReview(new Review("R1", "Liam", 10, 5, "Good"));
            papers[2].submitReview(new Review("R2", "Mavis", 6, 3, "Bad"));
            papers[2].submitReview(new Review("R3", "Abdi", 3, 1, "Bad"));
            papers[2].submitReview(new Review("R4", "Lola", 5, 4, "Good"));


            }


    //Update the reviews for papers 1, 2, 3.
    private static void updateReviews(Paper[] papers) {
        // Update a review in Paper
        System.out.println("Update R1 Reviews for Paper P1: ");
        papers[0].updateReview(new Review("R1", "Mark", 10, 5, "Great"));
        System.out.println("Update R3 Reviews for Paper P2: ");
        papers[1].updateReview(new Review("R3", "John", 3, 1, "Okay"));
        System.out.println("Update R4 Reviews for Paper P3: ");
        papers[2].updateReview(new Review("R4", "Ellie", 1, 1, "Bad"));

    }


    //Retract the reviews for papers 1, 2, 3.
    private static void retractReviews(Paper[] papers) {
        // Update a review in Paper P1
        System.out.println("Remove R3 Reviews for Paper P1 ");
        papers[0].retractReview("R3");
        // Update a review in Paper P2
        System.out.println("Remove R1 Reviews for Paper P2 ");
        papers[1].retractReview("R1");
        // Update a review in Paper P2
        System.out.println("Remove R2 Reviews for Paper P3 ");
        papers[2].retractReview("R2");

    }



    //Method to assign the best paper award.
    private static void assignBestPaperAward(Paper[] papers) {
        double bestScore = calculateWeightedAverageScore(papers[0]);

        Paper bestPaper = papers[1];

        for (Paper paper : papers) {
            double score = calculateWeightedAverageScore(paper);
            if (score > bestScore) {
                bestScore = score;
                bestPaper = paper;
            }
        }

        System.out.println("Best Paper Award: " + bestPaper.getId() + ", Best Score: " + bestScore);
    }

    //Method for calculating the weighted average score based upon reviews.
    private static double calculateWeightedAverageScore(Paper paper) {
        double weightedSum = 0;
        double weight = 0;
        for (Review review : paper.getReviews()) {
            weightedSum += review.getScore() * review.getConfidence();
            weight += review.getConfidence();
        }
        return weightedSum / weight;


    }
}