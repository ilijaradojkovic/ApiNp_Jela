package rs.ac.bg.fon.np.Models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class JeloRequest {
	@SerializedName(value = "results")
	private List<Jelo> jelo;
	private String baseUri;
	private int offset;
	private int number;
	private  int totalResults;
	public JeloRequest(List<Jelo> jelo, String baseUri, int offset, int number, int totalResults) {
		super();
		this.jelo = jelo;
		this.baseUri = baseUri;
		this.offset = offset;
		this.number = number;
		this.totalResults = totalResults;
	}
	@Override
	public String toString() {
		return "JeloRequest [jelo=" + jelo + ", baseUri=" + baseUri + ", offset=" + offset + ", number=" + number
				+ ", totalResults=" + totalResults + "]";
	}
	public List<Jelo> getJelo() {
		return jelo;
	}
	public void setJelo(List<Jelo> jelo) {
		this.jelo = jelo;
	}
	public String getBaseUri() {
		return baseUri;
	}
	public void setBaseUri(String baseUri) {
		this.baseUri = baseUri;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getTotalResults() {
		return totalResults;
	}
	public void setTotalResults(int totalResults) {
		this.totalResults = totalResults;
	}



}
