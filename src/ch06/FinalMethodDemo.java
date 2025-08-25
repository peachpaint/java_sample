package ch06;

public class FinalMethodDemo {

	public static void main(String[] args) {
//		WorldChess we = new worldChess();
	}

}

class Chess {
	enum ChessPlayer {
		BLACK, WHITE
	}

	ChessPlayer getFirstPalyer() {
		return ChessPlayer.WHITE;
	}
}

class WorldChess extends Chess {

}
