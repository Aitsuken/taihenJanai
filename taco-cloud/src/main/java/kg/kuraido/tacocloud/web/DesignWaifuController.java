package kg.kuraido.tacocloud.web;

import kg.kuraido.tacocloud.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.validation.Errors;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import kg.kuraido.tacocloud.Ingredient.Type;
import kg.kuraido.tacocloud.Ingredient;
import kg.kuraido.tacocloud.Waifu;


@Slf4j

@Controller
@RequestMapping("/design")
public class DesignWaifuController {

    @GetMapping
    public String showDesignForm(Model model) {
        List<Ingredient> waifus = Arrays.asList(
                new Ingredient("CUP1", "A CUP", Type.CUP),
                new Ingredient("CUP2", "Hanako", Type.CUP),
                new Ingredient("SaizuWan1", "90", Type.firstSize),
                new Ingredient("SaizuWan2", "80", Type.firstSize),
                new Ingredient("SaizuTsu1", "60", Type.secondSize),
                new Ingredient("SaizuTsu2", "55", Type.secondSize),
                new Ingredient("SaizuSuri1", "90", Type.thirdSize),
                new Ingredient("SaizuSuri2", "75", Type.thirdSize),
                new Ingredient("Taipu1", "Tsundere", Type.Type),
                new Ingredient("Taipu2", "Yandere", Type.Type)
        );

        Type[] types = Type.values();
        for (Type type : types) {
            model.addAttribute(type.toString().toLowerCase(),
                    filterByType(waifus, type));
        }

        model.addAttribute("design", new Waifu());
        return "design";
    }

    private List<Ingredient> filterByType(
            List<Ingredient> ingredients, Type type) {
        return ingredients
                .stream()
                .filter(x -> x.getType().equals(type))
                .collect(Collectors.toList());
    }



}
