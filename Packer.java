import java.util.*;
import java.io.*;

class MarvellousPacker
{
    private String PackName;
    private String DirName;

    public MarvellousPacker(String A, String B)
    {
        this.PackName = A;
        this.DirName = B;
    }

    public void PackingActivity()
    {
            try
            {
                System.out.println("--------------------------------------------------------");
                System.out.println("------------- Marvellous Packer UnPacker ---------------");
                System.out.println("--------------------------------------------------------");
                System.out.println("---------------- Packing Activity ----------------------");
                System.out.println("--------------------------------------------------------");

                int i = 0 , j = 0 , iRet = 0, iCountFile = 0;


                    File fobj = new File(DirName);

                    //check the existance of directory
                    if((fobj.exists()) && (fobj.isDirectory()))
                    {
                            System.out.println(DirName + "is Successfully Opened");

                            File Packedobj = new File(PackName);

                            //Create a packed file
                            boolean bRet = Packedobj.createNewFile();

                            if(bRet == false)
                            {
                                System.out.println("Unable to create file");
                                return;
                            }

                            System.out.println("Packed file Gets Successfully Created With name : "+PackName);

                            //Retrive All files From The Directory 
                            File Arr[] = fobj.listFiles();

                            //Packed file Object
                            FileOutputStream foobj = new FileOutputStream(Packedobj);

                            //Buffer for read and write Activity
                            byte Buffer[] = new byte[1024];

                            String Header = null;

                            //Directory Traversal 
                            for(i = 0; i < Arr.length; i++)
                            {
                                Header = Arr[i].getName() + " " + Arr[i].length();
                                
                                
                                //Loop to form 100 bytes header
                                for(j = Header.length(); j < 100; j++)
                                {
                                    Header = Header + " ";
                                }

                                //Write Header into packed File
                                foobj.write(Header.getBytes()); //string bytearra mdhe convert

                                //open file from directory for reading
                                FileInputStream fiobj = new FileInputStream(Arr[i]);
                            
                                //Write Contxt file into packed file
                                while((iRet = fiobj.read(Buffer)) != -1)
                                {
                                    foobj.write(Buffer,0,iRet);
                                    System.out.println("File Name Scanned : "+Arr[i].getName());
                                    System.out.println("File Size read is : "+iRet);
                                }
                                fiobj.close();
                                iCountFile++;
                                
                            }
                            System.out.println("Packing Activity Dones");

                            System.out.println("--------------------------------------------------------");
                            System.out.println("------------------- Stastical Report -------------------");
                            System.out.println("--------------------------------------------------------");

                            //To Be add
                            System.out.println("Total files Packed : "+iCountFile);

                            System.out.println("--------------------------------------------------------");
                            System.out.println("--------------------------------------------------------");
                            System.out.println("--------- Thank You For Using Our Application -----------");
                            System.out.println("--------------------------------------------------------");
                    }
                    else
                    {
                        System.out.println("There is no such Directory");
                    }


                    } //End of Try
                    catch(Exception eobj)
                    {

                    }
                } //End of Packing Activity
            
} //End or MarvellousPacker Class

class program467
{
public static void main(String A[]) 
{
    try
    {

       Scanner sobj = new Scanner(System.in);

       System.out.println("Enter the name of Directory That you Want to Pack");
       String DirName = sobj.nextLine();
       
       System.out.println("Enter the name of File u want to create for packing");
       String PackName = sobj.nextLine();
        
       MarvellousPacker mobj = new MarvellousPacker(PackName, DirName);

       mobj.PackingActivity();

    }
    catch(Exception eobj)
    {

    }
}//End of Main
    
}//End of Program467
