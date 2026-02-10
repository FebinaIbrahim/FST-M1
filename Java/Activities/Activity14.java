package Activities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Activity14 {
public static void main(String[] args) throws IOException
{
try {
File file = new File("filepath");
boolean fStatus = file.createNewFile();

System.out.println(FileUtils.readFileToString(file, "UTF8"));//read the file

File destDir = new File("path/to/destDir");//destination file

FileUtils.copyFileToDirectory(file, destDir);

File newFile=FileUtils.getFile(destDir, "newfile.txt");
String newFileData = FileUtils.readFileToString(newFile, "UTF8");
System.out.println("Data in new file: " + newFileData);}
catch(IOException errMessage)}
}


