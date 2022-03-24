package kuraido.springhibernate.controllers;

import kuraido.springhibernate.player.PlayerRepository;
import kuraido.springhibernate.player.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    private PlayerService pService;

    @Autowired
    public void setpService(PlayerService pService){
        this.pService = pService;
    }
    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("players", pService.getPlayers());
        return "home";
    }

}
