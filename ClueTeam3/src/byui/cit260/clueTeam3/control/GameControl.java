/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.control;

import byui.cit260.clueTeam3.model.Clue;
import byui.cit260.clueTeam3.model.DetectiveNotebook;
import byui.cit260.clueTeam3.model.Game;
import byui.cit260.clueTeam3.model.Player;
import clueteam3.ClueTeam3;
import byui.cit260.clueTeam3.model.MansionMap;
import byui.cit260.clueTeam3.model.Scene;
import byui.cit260.clueTeam3.view.GameMenuView;

/**
 *
 * @author whitnieschwarz
 */
public class GameControl {
    
    public static void createNewGame(Player player) {
    
        Game game = new Game();
        ClueTeam3.setCurrentGame(game);
        
        game.setPlayer(player);
        
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
        
        DetectiveNotebook[] detectiveNotebook = GameControl.createDetectiveNotebook();
        game.setDetectiveNotebook(detectiveNotebook);
        
        MansionMap mansionMap = MapControl.createMansionMap();
        game.setMansionMap(mansionMap);
        
        MapControl.moveCharactersToStartingLocation(mansionMap);
    }

    public static Player createPlayer(String name) {
         
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        ClueTeam3.setPlayer(player); //save the player
        
        return player;
    }


    private static DetectiveNotebook[] createDetectiveNotebook() {
        
        DetectiveNotebook[] notebook = new DetectiveNotebook[6];
        
        DetectiveNotebook clueOne = new DetectiveNotebook();
        clueOne.setDescription("Clue One description");
        clueOne.setCoordinates("0");
        notebook[Clue.clueOne.ordinal()] = clueOne;
        
        DetectiveNotebook clueTwo = new DetectiveNotebook();
        clueTwo.setDescription("Clue Two description");
        clueTwo.setCoordinates("0");
        notebook[Clue.clueTwo.ordinal()] = clueTwo;
        
        DetectiveNotebook clueThree = new DetectiveNotebook();
        clueThree.setDescription("Clue Three description");
        clueThree.setCoordinates("0");
        notebook[Clue.clueThree.ordinal()] = clueThree;
        
        DetectiveNotebook clueFour = new DetectiveNotebook();
        clueFour.setDescription("Clue Four description");
        clueFour.setCoordinates("0");
        notebook[Clue.clueFour.ordinal()] = clueFour;
        
        DetectiveNotebook clueFive = new DetectiveNotebook();
        clueFive.setDescription("Clue Five description");
        clueFive.setCoordinates("0");
        notebook[Clue.clueFive.ordinal()] = clueFive;
        
        DetectiveNotebook clueSix = new DetectiveNotebook();
        clueSix.setDescription("Clue Six description");
        clueSix.setCoordinates("0");
        notebook[Clue.clueSix.ordinal()] = clueSix;
        
        return null;
    }
    

}    