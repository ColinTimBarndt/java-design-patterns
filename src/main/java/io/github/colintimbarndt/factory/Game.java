package io.github.colintimbarndt.factory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game {
    private final List<Player> players;

    public Game() {
        this.players = new ArrayList<>();
    }

    public List<Player> getPlayers() {
        return Collections.unmodifiableList(players);
    }
}
