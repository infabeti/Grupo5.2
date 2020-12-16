package TestModelo;

import static org.junit.Assert.*;

import org.junit.Test;
import Modelo.ArrayExtendible;
import junit.framework.Assert;

public class TestArrayExtendible {

	private ArrayExtendible<Integer> AE = new ArrayExtendible<Integer>();
	
	@Test
	public void testGetSize() {
		AE.Anadir(1);
		AE.Anadir(2);
		assertEquals(2, AE.getTamanio());
	}
	
	@Test
	public void testRecoger()
	{
		AE.Anadir(1);
		AE.Anadir(2);
		AE.Anadir(3);
		assertEquals(1, AE.Recoger(0).intValue());
		assertEquals(2, AE.Recoger(1).intValue());
		assertEquals(3, AE.Recoger(2).intValue());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void  testRecogerException()
	{
		AE.Anadir(1);
		AE.Anadir(2);
		AE.Anadir(3);
		AE.Recoger(5);
	}
	
	@Test
	public void testEliminar()
	{
		AE.Anadir(1);
		AE.Anadir(2);
		AE.Anadir(3);
		AE.Eliminar(1);
		assertEquals(1, AE.Recoger(0).intValue());
		assertEquals(3, AE.Recoger(1).intValue());
	}
	
	@Test
	public void tesGetArray()
	{
		Integer[]  L = new Integer[3];
		for(int i=0;i<3;i++)
		{
			AE.Anadir(i+1);
			L[i]=i+1;
		}
		assertArrayEquals(L, AE.ConseguirArray());
	}

}
