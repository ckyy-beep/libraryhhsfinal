package com.libraryhhs.item;

public class DVD extends LibraryItem {

    private String director;
    private String duration;
    private String rating;

    public DVD(String title, String year, String director, String duration, String rating) {
        super(title, "(Director)", year,"DVD");
        this.director = director;
        this.duration = duration;
        this.rating = rating;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDirector() {
        return director;
    }

    public String getDuration() {
        return duration;
    }

    public String getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return  "Title       : " + title    + "\n" +
                "Director    : " + director + "\n" +
                "Duration    : " + duration + "\n" +
                "Rating      : " + rating   + "\n" +
                "Year        : " + year     + "\n" +
                "Item Type   : " + itemType + "\n\n";
    }
}
