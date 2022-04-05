package rs.ac.bg.fon.np.Models;

public class Jelo {
	
	private int id;
	private String title;
	private int readyInMinutes;
	private String image;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jelo other = (Jelo) obj;
		if (id != other.id)
			return false;
		return true;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getReadyInMinutes() {
		return readyInMinutes;
	}
	public void setReadyInMinutes(int readyInMinutes) {
		this.readyInMinutes = readyInMinutes;
	}
	@Override
	public String toString() {
		return "Jelo [id=" + id + ", title=" + title + ", readyInMinutes=" + readyInMinutes + ", image=" + image + "]";
	}
	public Jelo(int id, String title, int readyInMinutes, String image) {
		super();
		this.id = id;
		this.title = title;
		this.readyInMinutes = readyInMinutes;
		this.image = image;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

}
