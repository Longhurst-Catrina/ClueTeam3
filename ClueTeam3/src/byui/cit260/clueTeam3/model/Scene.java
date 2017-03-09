/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author whitnieschwarz
 */
public class Scene implements Serializable{
    
    // class instance variables
    private String description;
    private double travelTime;
    private String mapSymbol;
    private boolean blocked;

    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }
    private String blockedLocation;
    private String displaySymbol;
    private double amountAvailable;
    private String resourceType;
    
    private Room[] room;

    private static Scene[] createScenes() {
        
        Scene[] scenes = new Scene[ResourceTypeScene.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription("Welcome to the game..");
        startingScene.setMapSymbol("ST");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[ResourceTypeScene.start.ordinal()] = startingScene;
        
        Scene finishScene = new Scene();
        finishScene.setDescription("Congrats..");
        finishScene.setMapSymbol("FN");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
        scenes[ResourceTypeScene.finish.ordinal()] = finishScene;
        
        Scene clueScene = new Scene();
        clueScene.setDescription("Look, it's a clue..");
        clueScene.setMapSymbol("CL");
        clueScene.setBlocked(false);
        clueScene.setTravelTime(300);
        scenes[ResourceTypeScene.clue.ordinal()] = clueScene;
        
        Scene weaponScene = new Scene();
        weaponScene.setDescription("A weapon, that's suspicious..");
        weaponScene.setMapSymbol("WP");
        weaponScene.setBlocked(false);
        weaponScene.setTravelTime(300);
        scenes[ResourceTypeScene.weapon.ordinal()] = weaponScene;
        
        Scene characterScene = new Scene();
        characterScene.setDescription("Look its - let's go talk to them..");
        characterScene.setMapSymbol("CT");
        characterScene.setBlocked(false);
        characterScene.setTravelTime(300);
        scenes[ResourceTypeScene.character.ordinal()] = characterScene;
        
        Scene roomScene = new Scene();
        roomScene.setDescription("Let's explore the room..");
        roomScene.setMapSymbol("RM");
        roomScene.setBlocked(false);
        roomScene.setTravelTime(300);
        scenes[ResourceTypeScene.character.ordinal()] = roomScene;
        
        Scene hallScene = new Scene();
        hallScene.setDescription("You are in the hall..");
        hallScene.setMapSymbol("HL");
        hallScene.setBlocked(false);
        hallScene.setTravelTime(300);
        scenes[ResourceTypeScene.hall.ordinal()] = hallScene;
        
        return scenes;
    }

    public Room[] getRoom() {
        return room;
    }

    public void setRoom(Room[] room) {
        this.room = room;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public String getBlockedLocation() {
        return blockedLocation;
    }

    public void setBlockedLocation(String blockedLocation) {
        this.blockedLocation = blockedLocation;
    }

    public String getDisplaySymbol() {
        return displaySymbol;
    }

    public void setDisplaySymbol(String displaySymbol) {
        this.displaySymbol = displaySymbol;
    }

    public double getAmountAvailable() {
        return amountAvailable;
    }

    public void setAmountAvailable(double amountAvailable) {
        this.amountAvailable = amountAvailable;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.description);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.travelTime) ^ (Double.doubleToLongBits(this.travelTime) >>> 32));
        hash = 83 * hash + Objects.hashCode(this.blockedLocation);
        hash = 83 * hash + Objects.hashCode(this.displaySymbol);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.amountAvailable) ^ (Double.doubleToLongBits(this.amountAvailable) >>> 32));
        hash = 83 * hash + Objects.hashCode(this.resourceType);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Scene other = (Scene) obj;
        if (Double.doubleToLongBits(this.travelTime) != Double.doubleToLongBits(other.travelTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.amountAvailable) != Double.doubleToLongBits(other.amountAvailable)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.blockedLocation, other.blockedLocation)) {
            return false;
        }
        if (!Objects.equals(this.displaySymbol, other.displaySymbol)) {
            return false;
        }
        return Objects.equals(this.resourceType, other.resourceType);
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", travelTime=" + travelTime + ", blockedLocation=" + blockedLocation + ", displaySymbol=" + displaySymbol + ", amountAvailable=" + amountAvailable + ", resourceType=" + resourceType + '}';
    }

    public void setBlockLocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setlockedLocation(String blocked) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
