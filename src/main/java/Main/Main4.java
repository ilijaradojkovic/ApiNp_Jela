package Main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Main4 {
	public static void main(String[] args) {
		List<JsonObject> jela=new LinkedList();
		jela.add(getJsonObjectJelo(1,"burger", 20,"img1"));
		jela.add(getJsonObjectJelo(2,"pica", 10,"img2"));
		jela.add(getJsonObjectJelo(3,"giros",6,"img3"));
 		try(BufferedWriter bw=new BufferedWriter(new FileWriter(new File("rucni_upis.json")))){
			Gson g=new GsonBuilder().setPrettyPrinting().create();
			g.toJson(jela,bw);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	private static JsonObject getJsonObjectJelo(int id,String title,int readyInMinutes,String img) {
		JsonObject jelo1=new JsonObject();
		jelo1.addProperty("id",id);
		jelo1.addProperty("title", title);
		jelo1.addProperty("readyInMinutes", readyInMinutes);
		jelo1.addProperty("image", img);
		return jelo1;
	}
}
