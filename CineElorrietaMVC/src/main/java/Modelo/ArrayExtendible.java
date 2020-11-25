package Modelo;

public class ArrayExtendible<T> {
	private T t[];
	private int tamanio;
	
	public ArrayExtendible()
	{
		//creamos el array del tipo que nos pasan
		t = ((T[]) new Object[1]);
		//tamaño es 0
		tamanio = 0;
	}
	
	public void Anadir(T inT)
	{
		T[] tTemp = ((T[]) new Object[tamanio+1]);
		for(int i=0;i<tamanio;i++)
		{
			tTemp[i]=t[i];
		}
		tTemp[tamanio]= inT;
		t = tTemp;
		tamanio++;
	}
	
	public void Eliminar(int num)
	{
		T[] tTemp = ((T[]) new Object[tamanio-1]);
		for(int i=0,j=0;i<tamanio;i++)
		{
			if(j!=num)
			{
				tTemp[j]=tTemp[i];
				j++;
			}
		}
		
	}
	
	public T Recoger(int num) throws Exception
	{
		if(num>0 && num<tamanio)
			return t[num];
		else
			throw(new Exception("Error accediendo a un elemento en la posicion "+num+" en el Array extendible"));
	}
	
	public T[] ConseguirArray()
	{
		return t;
	}
}
