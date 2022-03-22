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
                new Ingredient("Yandere", "Tomoe", Type.ACUP),
                new Ingredient("Tsundere", "Hanako", Type.DCUP),
                new Ingredient("Deredere", "Yuri", Type.DCUP)
        );

        Type[] types = Ingredient.Type.values();
        for (Type type : types) {
            model.addAttribute(type.toString().toLowerCase(),
                    filterByType(ingredients, type));
        }

        model.addAttribute("design", new Waifu());
        return "design";
    }


}
