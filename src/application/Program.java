package application;

import BoardGame.Board;
import BoardGame.Position;
import chess.ChessMatch;

import javax.swing.*;
import javax.tools.StandardLocation;

public class Program {
    public static void main(String[] args){
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}
