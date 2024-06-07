package qr_project;
// zxing (zebra library) is a popular api that allows to process qr code

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class qr_generate {
    public static void main(String[] args) {
        try {
            File file =new File("C:\\Users\\lenovo\\IdeaProjects\\img\\try2.png");
            String body="VERSION 3,QR CODE";

            // stream() will provide data in the form of bytes .. so we will stored in bytearrayoutputstram()
            ByteArrayOutputStream out = QRCode.from(body).to(ImageType.PNG).stream();

            FileOutputStream fout=new FileOutputStream(file);
            fout.write(out.toByteArray());       // we convert the object of byte array stream to byte array
            fout.close();
            System.out.println("success");

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
