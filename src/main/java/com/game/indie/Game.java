package com.game.indie;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "game")
public class Game{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OrderColumn(name = "title")
    private String title;
    @OrderColumn(name = "platforms")
    private String platforms;
    @OrderColumn(name = "date")
    private String date;
    @OrderColumn(name = "type")
    private String type; //adventure,indie itp
    @OrderColumn(name = "theme")
    private String theme;


}
