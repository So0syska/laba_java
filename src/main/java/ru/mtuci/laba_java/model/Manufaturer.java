package ru.mtuci.laba_java.model;

import javax.persistence.*;

@Entity
@Table(name = "Manufaturer")

public class Manufaturer extends BaseEntity {
    private String name;
    private String address;
    private String phone;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id", nullable = false)
    private Artikle artikle;

    public Manufaturer() {
    }

    public Manufaturer(Long id, String name, String address, String phone, Artikle artikle) {
        super(id);
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.artikle = artikle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Artikle getArtikle() {
        return artikle;
    }

    public void setArtikle(Artikle artikle) {
        this.artikle = artikle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Manufaturer that = (Manufaturer) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        return artikle != null ? artikle.equals(that.artikle) : that.artikle == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (artikle != null ? artikle.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Manufaturer{" +
                "name='" + name + '\'' +
                "id='" + getId() + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                '}';
    }
}