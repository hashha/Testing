import java.io.*;
public class directory_read {
	public static void main(String args[])
	{
		File f = new File("C:\\Users\\Murali\\Desktop\\RA\\Dump20121129\\Dump20121129");
		
		String[] list = f.list();
		for(String s:list)
		System.out.println("\\.. C:\\Users\\Murali\\Desktop\\RA\\Dump20121129\\Dump20121129\\"+s);
	}

}
