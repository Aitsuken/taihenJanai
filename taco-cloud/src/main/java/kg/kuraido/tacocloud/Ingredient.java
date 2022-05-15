package kg.kuraido.tacocloud;

import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
public class Ingredient {

    private String id;
    private String name;
    private Type type;

    public Ingredient(String kind, String name, Type type){
        this.id = id;
        this.name = name;
        this.type = type;
    }
    public static enum Type{
        CUP, firstSize, secondSize, thirdSize, Type
    }
}
