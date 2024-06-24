package com.game.indie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<Game> getAllGames(){
        return gameRepository.findAll();
    }
    public Game getGameById(Long id){
        return gameRepository.findById(id).orElse(null);
    }
    public Game saveGame(Game game){
        return gameRepository.save(game);
    }
    public void deleteGame(long id){
        gameRepository.deleteById(id);
    }

}
