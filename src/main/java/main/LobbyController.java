package main;

import main.model.Player;
import main.model.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class LobbyController {
    @Autowired
    private PlayerRepository playerRepository;

    @GetMapping("/")
    public String index(){
        return "<a href=\"/login\">go login</a>";
    }

    @GetMapping("/login")
    public String login(String username, String password){
        for (Player player : playerRepository.findAll()){
            if (player.getUsername().equals(username) &&
                    player.getPassword().equals(password)){
                return "Welcome";
            }
        }
        return "incorrect pair username/password";
    }

    @PostMapping("/registration")
    public void registration(String username, String password){
        Player player = new Player();
        player.setUsername(username);
        player.setPassword(password);
        playerRepository.save(player);
    }

    
}
