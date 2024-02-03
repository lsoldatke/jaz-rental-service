package org.example.jazrentalservice.model;

public class Movie {
    private Long id;
    private String title;
    private Category category;
    private boolean isAvailable;

    public Movie() {
    }

    public Movie(Long id, String title, Category category, boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.isAvailable = isAvailable;
    }

    public Long getId() {
        return id;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category=" + category +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
