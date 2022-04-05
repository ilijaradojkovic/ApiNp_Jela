package rs.ac.bg.fon.np.Main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import rs.ac.bg.fon.np.Models.Jelo;

public class Main2 {
public static void main(String[] args) {
	Jelo burger=new Jelo(1, "King Burger", 20,"img1");
	Jelo burger2=new Jelo(2,"Queen Burger",20,"img4");
	Jelo giros=new Jelo(3,"Giros",10,"img2");
	List<Jelo> jela=Arrays.asList(burger,burger2,giros);
	try(BufferedWriter bw=new BufferedWriter(new FileWriter(new File("niz_objekata.json")))){
		Gson g=new GsonBuilder().setPrettyPrinting().create();
		g.toJson(jela,bw);
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("gotovo");
}
}
