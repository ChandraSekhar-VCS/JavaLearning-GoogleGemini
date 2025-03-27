package Java_IO.DataStreams;

import java.io.*;

public class WritingPrimitiveData {
    public static void main(String[] args) {
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("primitive_data.bin"))){

            dos.writeByte(1);
            dos.writeShort(2);
            dos.writeInt(3);
            dos.writeDouble(4.4);
            dos.writeLong(5);
            dos.writeFloat(5.555f);
            dos.writeBoolean(true);
            dos.writeChar('a');
            dos.writeUTF("hello");

            DataInputStream dis = new DataInputStream(new FileInputStream("primitive_data.bin"));

            System.out.println(dis.readByte());
            System.out.println(dis.readShort());
            System.out.println(dis.readInt());
            System.out.println(dis.readDouble());
            System.out.println(dis.readLong());
            System.out.println(dis.readFloat());
            System.out.println(dis.readBoolean());
            System.out.println(dis.readUTF());
        }
        catch (IOException e){
            System.out.println("Error in writing/reading the file");
        }

    }
}
