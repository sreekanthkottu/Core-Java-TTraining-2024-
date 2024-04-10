import java.io.IOException;
import java.io.RandomAccessFile;
public class RandomAccessFileDemo
{
public static void main(String[] args) throws Exception
{
int i;
char c;
try {
// data.txt file contain "Hello!, How are you?" data in it
RandomAccessFile f1 = new RandomAccessFile("D:\\data.txt", "r");
i = f1.read();
c = (char) i;
System.out.println("The First byte is :" +c);
System.out.println("The Number of remaining bytes are :" +f1.length());
// seek method to seek 4 bytes
f1.seek(4);
i = f1.read();
// converts byte to character
c = (char) i;
System.out.println("The Next byte after 4 byte seek is :" +c);
System.out.println("The FilePointer offset is : " +f1.getFilePointer());
f1.close();
} catch (IOException e) {
e.printStackTrace();
}
}
}