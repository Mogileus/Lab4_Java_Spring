package database;


import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.criteria.Root;

public class Eager {

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "root")
    private Root root;
}