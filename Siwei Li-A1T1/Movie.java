/**
 * Movie simulates a movie database and can be used to manage data. 
 * Print out the information for the movie.
 * @author Siwei Li
 * @version March 11, 2022
 */
public class Movie
{
    // The name of the movie
    private String name;
    // The year of the film's release
    private int releaseYear ;
    // The ID of the movie
    private int movieId;
    // The rating of the movie
    private double rating;
    // The genre of the film
    private String genre;
    // Judgment on the availability of the film
    private boolean isAvaiableToWatch;
    private String isPopular; //define a variable called "isPopular"
    private String isAvailable; //define a variable called "isAvailable"
    /**
     * The constructor of the Movie class.
     * initialises all the fields by taking relevant values using six parameters.
     */
    public Movie(String getTheName, int getTheReleaseYear , int getTheMovieId, double getTheRating, String getTheGenre, boolean getTheIsAvaiableToWatch)
    {
        // The name field holds the value
        name = getTheName;
        // The releaseYear field holds the value
        releaseYear  = getTheReleaseYear;
        // The movieId field holds the value
        movieId = getTheMovieId;
        // The rating field holds the value
        rating = getTheRating;
        // The genre field holds the value
        genre = getTheGenre;
        // The isAvaiableToWatch field holds the value
        isAvaiableToWatch = getTheIsAvaiableToWatch;
    }
    /**
     * Returns the movie name
     */
    public String getName()
    {
        return name;
    }
    /**
     * Returns the year of the film's release
     */
    public int getReleaseYear()
    {
        return releaseYear;
    }
    /**
     * Returns the ID of the movie
     */
    public int getMovieId()
    {
        return movieId;
    }
    /**
     * Returns the rating of the movie
     */
    public double getRating()
    {
        return rating;
    }
    /**
     * Returns the genre of the film
     */
    public String getGenre()
    {
        return genre;
    }
    /**
     * Returns the judgment on the availability of the film
     */
    public boolean getIsAvaiableToWatch()
    {
        return isAvaiableToWatch;
    }
    /**
     * Set the movie name
     */
    public void setName(String theName)
    {
        name = theName;
    } 
    /**
     * Set the movie release year
     */
    public void setReleaseYear(int theReleaseYear)
    {
        releaseYear = theReleaseYear;
    } 
    /**
     * Set the movie id
     */
    public void setMovieId(int theMovieId)
    {
        movieId = theMovieId;
    } 
    /**
     * Set the movie rating
     */
    public void setRating(double theRating)
    {
        rating = theRating;
    } 
    /**
     * Set the movie genre
     */
    public void setGenre(String theGenre)
    {
        genre = theGenre;
    } 
    /**
     * Set the movie viewability
     */
    public void setIsAvaiableToWatch(boolean avaiableToWatch)
    {
        isAvaiableToWatch = avaiableToWatch;
    }
    /**
     * This method prints out all the details of the movie object.
     * Print a message to explain if the movie is popular.
     * If the rating is higher than 6.5 then the movie is considered popular, otherwise considered not popular. 
     * Indicates whether the movie is currently available for viewing on the OTT platform.
     */
    public void printDetails()
    {
        // Determine whether the value is greater than 6.5
        if(rating > 6.5)
        {
            // The isPopular field holds the value "popular"
            isPopular = "popular";
        }
        else
        {
            // The isPopular field holds the value "not popular"
            isPopular = "not popular";
        }
        // Determine whether the value is true
        if(isAvaiableToWatch = true)
        {
            // The isAvailable field holds the value ""
            isAvailable = "";
        }
        else
        {
            // The isAvailable field holds the value "not"
            isAvailable = "not";
        }
        // Print out the information for the movie.
        System.out.println("The movie, " + name + ", with id " + movieId + " was released on " + releaseYear +". The movie is considered " 
        + isPopular + " with an IMDB rating of " + rating + ". The movie is currently " + isAvailable + "available on Netflix." );
    }
}
