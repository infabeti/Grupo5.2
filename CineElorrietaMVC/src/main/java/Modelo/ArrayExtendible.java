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
			if(i!=num)
			{
				tTemp[j]=t[i];
				j++;
			}
		}
		t=tTemp;
		tamanio--;
		
	}
	
	public T Recoger(int num) 
	{
		
			return t[num];
			}
	
	public T[] ConseguirArray()
	{
		return t;
	}

	public int getTamanio() {
		return tamanio;
	}
}
