import static org.junit.Assert.*;

import org.junit.Test;
import static org.mockito.Mockito.*;


public class GameTest {
  
  
  	// This tests if moveSouth is called when entering N
  @Test
	public void testMoveNorth() {
		Player p = mock(Player.class);
		House h = mock(House.class);
		Game g = new Game(p,h);
		int result = g.doSomething("N");
		verify(h,times(1)).moveNorth();
		assertEquals(result,0);
	}
	
	
	// This tests if moveSouth is called when entering s
	@Test
	public void testMoveSouth(){
		Player p = mock(Player.class);
		House h = mock(House.class);
		Game g = new Game(p,h);
		
		int result = g.doSomething("s");
		verify(h,times(1)).moveSouth();
		assertEquals(result,0);
		
	}
	// This tests if moveSouth is called when entering S
		@Test
		public void testMoveSouth2(){
			Player p = mock(Player.class);
			House h = mock(House.class);
			Game g = new Game(p,h);
			
			int result = g.doSomething("S");
			verify(h,times(1)).moveSouth();
			assertEquals(result,0);
			
		}
	//This tests if the look function is called when entering l
	@Test
	public void testLook(){
		Player p =mock(Player.class);
		House h = mock(House.class);
		Game g = new Game(p,h);
		int result = g.doSomething("l");
		verify(h,times(1)).look(p,null);
		assertEquals(result,0);
		
	}
	
	//This tests if the look function is called when entering L
		@Test
		public void testLook2(){
			Player p =mock(Player.class);
			House h = mock(House.class);
			Game g = new Game(p,h);
			int result = g.doSomething("L");
			verify(h,times(1)).look(p,null);
			assertEquals(result,0);
			
		}
	
	// This tests if there is missing ingredients, the player would lose or not
	@Test
	public void testDrink(){
		Player p = mock(Player.class);
		House h = mock(House.class);
		Game g = new Game(p,h);
		int result = g.doSomething("d");
		verify(p,times(1)).drink();
		assertEquals(result,-1);
	}
	
	//This tests if all ingredients are got, the player would win or not.
	@Test 
	public void testDrink2(){
		Player p = mock(Player.class);
		House h = mock(House.class);
		Game g = new Game(p,h);
		stub(p.drink()).toReturn(true);
		int result = g.doSomething("d");

		verify(p,times(1)).drink();
		assertEquals(result,1);
	}
	
	//This tests if showInventory()is called when entering I
		@Test 
		public void testShowInventory(){
			Player p = mock(Player.class);
			House h = mock(House.class);
			Game g = new Game(p,h);
			
			int result = g.doSomething("I");

			verify(p,times(1)).showInventory();
			assertEquals(result,0);
		}
		
		//This tests showInventory() is called when entering i
				@Test 
				public void testShowInventory2(){
					Player p = mock(Player.class);
					House h = mock(House.class);
					Game g = new Game(p,h);
					
					int result = g.doSomething("i");

					verify(p,times(1)).showInventory();
					assertEquals(result,0);
				}
		
		//This tests error message
				@Test 
				public void testErrorMessage(){
					Player p = mock(Player.class);
					House h = mock(House.class);
					Game g = new Game(p,h);
					
					int result = g.doSomething("f");

					assertEquals(result,0);
				}



}
