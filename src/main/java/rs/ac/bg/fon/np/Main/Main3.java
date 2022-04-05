package rs.ac.bg.fon.np.Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import rs.ac.bg.fon.np.Models.Jelo;

public class Main3 {
public static void main(String[] args) {
	
	try(BufferedReader br=new BufferedReader(new FileReader(new File("niz_objekata.json")))){
		List<Jelo> jela=new LinkedList();
		Gson g=new Gson();
		Type token=new TypeToken<List<Jelo>>() {}.getType();
	jela=	g.fromJson(br, token);
	for(Jelo j:jela) {
		System.out.println(jela.toString());
	}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
