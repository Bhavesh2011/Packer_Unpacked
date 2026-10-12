import java.util.*;
import java.io.*;

class MarvellousUnpacker
{
    private String PackName;

    public MarvellousUnpacker(String A)
    {
        this.PackName = A;
    }

    public void UnPackingActivity()
    {
        try
        {
            String Header = null;
            File fobjnew = null;
            int FileSize = 0, iRet = 0, iCountFile = 0;

            File fobj = new File(PackName);

            //if packed file is not Present 
            if(! fobj.exists())
            {
                System.out.println("Unable to Accessed File");
                return;
            }

            System.out.println("Packed file gets successfully opened");
            FileInputStream fiobj = new FileInputStream(fobj);

            //Buffer to read Header
            byte HeaderBuffer[] = new byte[100];

            //Scanned the packed file to extract files from it
            while((iRet = fiobj.read(HeaderBuffer,0,100)) != -1)
            {
                    //Convert Array to String
                    Header = new String(HeaderBuffer);

                    Header = Header.trim();

                    //Tokenised the Header means tukde pdle into 2 parts
                    String Tokens[] = Header.split(" ");

                    fobjnew = new File(Tokens[0]);

                    //Create new file to extract
                    fobjnew.createNewFile();


                    FileSize = Integer.parseInt(Tokens[1]);

                    //create new Buffer to stored files data
                    byte Buffer[] = new byte[FileSize];

                    FileOutputStream foobj = new FileOutputStream(fobjnew);

                    //read the data from packed file
                    fiobj.read(Buffer,0,FileSize);

                    //write the data into extracted file
                    foobj.write(Buffer,0,FileSize);

                    System.out.println("File Unpacked with the Name : "+Tokens[0] + "Having Size : "+Tokens[1]);
                    iCountFile++;

                    foobj.close();

        }//End of While
        System.out.println("Total Number of Files Are unpacked : "+iCountFile);
        fiobj.close();
        
        }
        catch(Exception eobj)
        {

        }
    }
}

class program476
{
public static void main(String A[]) 
{
    try
    {


       Scanner sobj = new Scanner(System.in);
       System.out.println("Enter the name of File Which Contains Packed Data : ");
       String PackName = sobj.nextLine();

       MarvellousUnpacker mobj = new MarvellousUnpacker(PackName);
      
       mobj.UnPackingActivity();
          
    }
    catch(Exception eobj)
    {

    }
}
    
}