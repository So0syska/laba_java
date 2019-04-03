package ru.mtuci.laba_java.repository;

import ru.mtuci.laba_java.model.Artikle;

public class ArtikleRepository extends AbstractRepository<Artikle> {
    public ArtikleRepository() {
        super(Artikle.class);
    }
}
