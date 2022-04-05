package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;

import Models.JeloRequest;

public class Main {

	public static void main(String[] args) {
		
	
		try {
			URL url=new URL("https://spoonacular-recipe-food-nutrition-v1.p.rapidapi.com/recipes/search?query=pizza&number=1&offset=0&type=main%20course&rapidapi-key=f399f134d5mshac60582ce8ec350p185769jsnc4294929c64c");
			HttpURLConnection  con=(HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			BufferedReader bf=new BufferedReader(new InputStreamReader(con.getInputStream()));
			Gson g=new Gson();
		JeloRequest jr=	g.fromJson(bf,JeloRequest.class);
		System.out.println(jr.toString());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
