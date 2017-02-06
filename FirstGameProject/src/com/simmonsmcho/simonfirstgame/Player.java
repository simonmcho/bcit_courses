package com.simmonsmcho.simonfirstgame;

import java.util.UUID;

public class Player {
	private String playerGameName;
	private UUID   playerId;
	private int    level;
	private String rank;
	
	public Player(String playerGameName, String rank) {
		this.playerGameName = playerGameName;
		this.playerId       = UUID.randomUUID();
		this.level          = 1;
		this.rank           = rank;
	}

	public String getPlayerGameName() {
		return playerGameName;
	}

	public UUID getPlayerId() {
		return playerId;
	}

	public int getLevel() {
		return level;
	}

	public String getRank() {
		return rank;
	}
	
}
