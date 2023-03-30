package com.libraryhhs.item;

public class CD extends LibraryItem {

    private String artist;
    private int numTracks;

    public CD(String title, String year, String singer, int numTracks) {
        super(title, "(singer)", year, "CD");
        this.artist = singer;
        this.numTracks = numTracks;
    }

    public void setArtist(String artist) {this.artist = artist;}
    public void setNumTracks(int numTracks) {this.numTracks = numTracks;}
    public String getArtist() {return artist;}
    public int getNumTracks() {return numTracks;}

    @Override
    public String toString() {
        return  "Title         : "  + title     + "\n" +
                "Artist        : "  + artist    + "\n" +
                "# of tracks   : "  + numTracks + "\n" +
                "Year          : "  + year      + "\n" +
                "Item Type     : "  + itemType  + "\n\n";
    }
}
