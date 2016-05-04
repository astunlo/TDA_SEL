package file_y_archivo;

import java.io.File;

public class Carpeta2 {

	public static void main(String[] args) {
		File carpeta= new File("D://UNIVERSIDAD//Gastón//");
		System.out.println(carpeta.exists());
		System.out.println(carpeta.isDirectory());
		System.out.println(carpeta.getAbsolutePath());
		System.out.println(carpeta.isFile());
		System.out.println(carpeta.lastModified());
		System.out.println(carpeta.getName());
		
//		for (File file : carpeta.listFiles(new FilenameFilter("*"))) {
//			System.out.println(file.getName());
//			System.out.println(file.lastModified());
//			System.out.println(new Date(file.lastModified()));
//		}
	}

}
