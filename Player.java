import java.util.Stack;

/**
 * Esta clase representa al jugador del juego. Realiza las acciones
 * relacionadas con el (examinar, comer, etc).
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player
{
    // La habitaci�n en la que se encuentra en ese momento el jugador
    private Room currentRoom;
    // Pila de habitaciones que ha visitado
    private Stack<Room> previusRooms;

    /**
     * Constructor del jugador
     */
    public Player()
    {
       currentRoom = null;
       previusRooms = new Stack<Room>();
    }

    /**
     * Coloca al jugador en una habitaci�n
     * @param room La habitaci�n en la que se encuentra el jugador.
     */
    public void setRoom(Room room)
    {
        if(currentRoom != null)
        {
            previusRooms.push(currentRoom);
        }
        this.currentRoom = room;
    }
    
    /**
     * El jugador vuelve a la habitaci�n anterior
     */
    public void goBack()
    {
        if(!previusRooms.empty())
        {
            currentRoom = previusRooms.pop();
            printLocationInfo();
            System.out.println();
        }
        else
        {
            System.out.println("No existen localizaciones a las que volver");
        }
    }
    
    /**
     * El jugador examina la localizaci�n en la que se encuentra
     */
    public void look()
    {
        printLocationInfo();
    }
    
    /**
     * El jugador come
     */
    public void eat()
    {
        System.out.println("Acabas de comer y ya no estas hambriento");
    }
    
    /**
     * Imprime la informaci�n de la localizaci�n en la que se encuentra el jugador
     */
    private void printLocationInfo()
    {
        System.out.println(currentRoom.getLongDescription());
    }
}