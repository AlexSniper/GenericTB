package alex.leaernprogramming;

public class Song  {
    private String title;
    private double duration;
    private String artist;
    private String name;

    public Song(String title, double duration,String artist ,String name) {

        this.title = title;
        this.duration = duration;
        this.artist = artist;
        this.name = name;


    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.title + ": " + this.duration +"    min    "+"   Artist     " +this.artist + "     Albom    " + this.name;
    }
}

