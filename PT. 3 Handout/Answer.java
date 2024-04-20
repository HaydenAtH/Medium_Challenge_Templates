import java.util.*;

public class Answer {
    // *For each part build on top of your prior solution

    // *PART ONE
    // *Every simulation tick will provide a list of current active tiles, balance the resources on the tiles so that:
    // *All non-colony tiles must have 1 or 0 resources on them
    // *All colony tiles must have a similar amount of resources (within 2 of each other) and must have more than 2 resources each

    // *YOU MAY VIEW AS REFERENCE ColonyBackend.java and Tile.java to understand what functions are available to you and how your solution is checked

    // *PART TWO
    // *Tiles now have positions (x and y) 
    // *Distance is now a concern, when using the (Tile Object).moveResourcesToOtherTile(otherTile, amount), -
    // *- the amount you are transferring will be divided by 2 if the distance between the two tiles is greater than 4
    // *View Tile.java for further reference

    // *You have also been provided the distFrom(Tile t, Tile tB) function which will provide the distance between Tile 1 (t) and Tile 2 (tB)

    // *PART THREE
    // *Colony tiles now have custom resource requirements (use .getResourceRequirement()), some are bigger and require more resources than others, make sure all colonies have the appropriate amount of resources
    // *Colonies may now have UNBALANCED resources (not all colonies must be within 2 resources of each other)


    public static Tile[] simulationTick(Tile[] tiles){
        
    }

    //* PRE-BUILT FUNCTION, THIS WILL HELP YOU CALCULATE THE DISTANCE BETWEEN TWO TILES
    private static double distFrom(Tile t, Tile tB){
        return Math.sqrt(Math.max(t.getXPosition(), tB.getXPosition()) - Math.min(t.getXPosition(), tB.getXPosition()) +  Math.max(t.getYPosition(), tB.getYPosition()) - Math.min(t.getYPosition(), tB.getYPosition()));
    }
}
