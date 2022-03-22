package kg.kuraido.tacocloud;

import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
public class Ingredient {

    private String kind;
    private String name;
    private Type type;

    public Ingredient(String kind, String name, Type type){
        this.kind = kind;
        this.name = name;
        this.type = type;
    }
    public static enum Type{
        ACUP, BCUP, CCUP, DCUP, ECUP, FCUP, GCUP
    }
}
