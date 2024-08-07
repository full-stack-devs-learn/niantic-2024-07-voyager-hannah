package com.niantic.part_1_sakila_dtos;

public class Film
{
    private int FilmId;
    private String Title;
    private String Description;
    private int ReleaseYear;
    private int LanguageId;
    private int RentalDuration;
    private double RentalRate;
    private int Length;
    private double ReplacementCost;
    private String Rating;
    private String SpecialFeatures;


    public Film() {

    }
    public Film(int FilmId, String Title, String Description, int ReleaseYear,
    int LanguageId, int RentalDuration, double RentalRate, int Length, double ReplacementCost, String Rating,
    String SpecialFeatures){

        this.FilmId = FilmId;
        this.Title = Title;
        this.Description = Description;
        this.ReleaseYear = ReleaseYear;
        this.LanguageId = LanguageId;
        this.RentalDuration = RentalDuration;
        this.RentalRate = RentalRate;
        this.Length = Length;
        this.ReplacementCost = ReplacementCost;
        this.Rating = Rating;
        this.SpecialFeatures = SpecialFeatures;
    }

    public int getFilmId() {return FilmId;}
    public void setFilmId(int filmId) {FilmId = filmId;}

    public String getTitle() {return Title;}
    public void setTitle(String title) {Title = title;}

    public String getDescription() {return Description;}
    public void setDescription(String description) {Description = description;}

    public int getReleaseYear() {return ReleaseYear;}
    public void setReleaseYear(int releaseYear) {ReleaseYear = releaseYear;}

    public int getLanguageId() {return LanguageId;}
    public void setLanguageId(int LanguageId) {LanguageId = LanguageId;}

    public int getRentalDuration() {return RentalDuration;}
    public void setRentalDuration(int RentalDuration) {RentalDuration = RentalDuration;}

    public double getRentalRate() {return RentalRate;}
    public void setRentalRate(double RentalRate) {RentalRate = RentalRate;}

    public int getLength() {return Length;}
    public void setLength(int Length) {Length = Length;}

    public double getReplacementCost() {return ReplacementCost;}
    public void setReplacementCost(double replacementCost) {ReplacementCost = replacementCost;}

    public String getRating() {return Rating;}
    public void setRating(String Rating) {Rating = Rating;}

    public String getSpecialFeatures() {return SpecialFeatures;}
    public void setSpecialFeatures(String SpecialFeatures) {SpecialFeatures = SpecialFeatures;}

}
