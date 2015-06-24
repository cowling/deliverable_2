import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Test;

public class HouseTest {
  
  //This tests houseCreation() method, same as getDescription()
	@Test
	public void testHouseCreation() {
		Room mockedRoom = mock(Room.class);

		Room[] rooms = new Room[1];
		rooms[0] = mockedRoom;
		stub(mockedRoom.getDescription()).toReturn("foo");
		
		House h = new House(rooms);
		String returned = h.getCurrentRoomInfo();
		assertEquals(returned, "foo");
		
	}
	//This tests getDescription() method in the getCurrentRoomInfo()
	@Test
	public void testGetCurrentRoomInfo() {
		Room r = mock(Room.class); 
		when(r.getDescription()).thenReturn("TEST"); //STUBIING
		Room[] rooms = new Room[1];
		rooms[0] = r;
		House h = new House(rooms);
		String result = h.getCurrentRoomInfo();
		assertEquals(result, "TEST");

	}
	
	//This tests if the room does not exist, the function would show magical land information.
	@Test 
	public void testGetCurrentRoomInfo2(){
		Room r0 = mock(Room.class);
		
		Room[] rooms = new Room[1];
		rooms[0] = r0;
		House h = new House(rooms);
		h.moveSouth();
		String result = h.getCurrentRoomInfo();
		assertEquals(result, "You are in a magical land!  But you are returned to the beginning!");

	}
	
	
	//This tests the generateRooms() method. It is tested in the construction of House
	@Test 
	public void testGenerateRooms(){
		House h = new House(1);
		Room[] r = h.generateRooms(1);
		Boolean result = r[0].hasItem();

		assertEquals(result, true);
		
		
	}


}
