package ru.mtuci.laba_java.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "Artikle")

public class Artikle extends BaseEntity {
    private long id;
    private String name;
    private String composition;
    private String category;
    private String price;
    private String collection;
    private String id_manufactured;
    private String photo;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "Artikle")
    private Set<Manufaturer> manufaturer;

    public Artikle() {
    }

    public Artikle(Long id, String name, String composition, String category, String price, String collection, String id_manufactured, String photo) {
        super(id);
        this.name = name;
        this.composition = composition;
        this.category = category;
        this.price = price;
        this.collection = id_manufactured;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Artikle artikle = (Artikle) o;

        if (id != artikle.id) return false;
        if (name != null ? !name.equals(artikle.name) : artikle.name != null) return false;
        if (composition != null ? !composition.equals(artikle.composition) : artikle.composition != null) return false;
        if (category != null ? !category.equals(artikle.category) : artikle.category != null) return false;
        if (price != null ? !price.equals(artikle.price) : artikle.price != null) return false;
        if (collection != null ? !collection.equals(artikle.collection) : artikle.collection != null) return false;
        if (id_manufactured != null ? !id_manufactured.equals(artikle.id_manufactured) : artikle.id_manufactured != null)
            return false;
        return photo != null ? photo.equals(artikle.photo) : artikle.photo == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (composition != null ? composition.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (collection != null ? collection.hashCode() : 0);
        result = 31 * result + (id_manufactured != null ? id_manufactured.hashCode() : 0);
        result = 31 * result + (photo != null ? photo.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Artikle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", id='" + getId() + '\'' +
                ", composition='" + composition + '\'' +
                ", category='" + category + '\'' +
                ", price='" + price + '\'' +
                ", collection='" + collection + '\'' +
                ", id_manufactured='" + id_manufactured + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }
}





