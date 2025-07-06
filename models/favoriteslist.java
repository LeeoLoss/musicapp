package musicapp.models;

public class FavoritesList {
	
	public void include (Audio audio) {
		if(audio.getRating() >= 9) {
			System.out.println(audio.getTitle() + " it is considered a success and listened to by everyone!");
		} else {
			System.out.println(audio.getTitle() + " what is being liked right now.");
		}
	}

}
