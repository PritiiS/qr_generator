package qr_project;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import net.glxn.qrgen.image.ImageType;

// not generating images..

import javax.swing.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.Paths.*;

public class qr_method2 {
    public static void generate(String data,String path,String charset, int h, int w) throws WriterException, IOException {
       BitMatrix bitMatrix =new MultiFormatWriter().encode(data, BarcodeFormat.QR_CODE,h,w);
        File file=new File(path);
//        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        MatrixToImageWriter.writeToStream(bitMatrix, "png",OutputStream.nullOutputStream());
//        MatrixToImageWriter.writeToStream(bitMatrix, "png",path);
    }
    public static void main(String[] args) throws WriterException, IOException {
        String data="https://spreeti-portfolio.netlify.app/";
        String path="C:\\Users\\lenovo\\IdeaProjects\\img\\qrm2.png";
        String charset="UTF-8";
        generate(data,path,charset,300,300);
        String msg="successfully created qr-code";
        JOptionPane.showMessageDialog(null,msg.toUpperCase());

    }
}
