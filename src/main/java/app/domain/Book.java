package app.domain;


import javax.persistence.Entity;
import javax.persistence.DiscriminatorValue;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * This class is to create different book objects.
 */
@Entity
@DiscriminatorValue(value = "Book")
public class Book extends Reference {

    @NotEmpty(message = "Field can not be empty!")
    private String publisher;

    /**
     * Optional variables:
     */
    private Integer vol;
    private String series;
    private String address;
    private String edition;
    private Integer month;

    public int getVol() {
        return vol;
    }

    public void setVol(int vol) {
        this.vol = vol;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    
    
    
    public String getPublisher() {
        return this.publisher;
    }

    public String getAddress() {
        return this.address;
    }



   
    @Override
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method returns all the information of the book referenced. The
     * if-sentence allows the address field to be empty.
     *
     * @return The reference information of a book as a String.
     */
    @Override
    public String toString() {
        String tulostus = super.getAuthors() + ". " + super.getTitle() + ". " + this.publisher + ", " + super.getYear() + ".";
        if (!this.address.isEmpty()) {
            tulostus = tulostus + " " + this.address + ".";
        }
        return tulostus;
    }

    /**
     * This method returns all the information of the book referenced as a
     * BibTex String.
     *
     * @return The BibTex-reference information of a book as a String.
     */
    @Override
    public String toBibTex() {
        return "Not supported yet";
    }

}
