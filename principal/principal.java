package musicapp.principal;

import musicapp.models.FavoritesList;
import musicapp.models.Music;
import musicapp.models.Podcast;

public class Principal {

	public static void main(String[] args) {
		Music myMusic = new Music();
		myMusic.setTitle("Shape of You");
		myMusic.setSinger("Ed Sheeran");
		
		for (int i = 0; i < 1000; i++) {
			myMusic.play();
		}
		
		for (int i = 0; i < 50; i++) {
			myMusic.like();
		}
		
		Podcast myPodcast = new Podcast();
		myPodcast.setTitle("Tech Talk Today");
		myPodcast.setHost("Leonardo Loss");
		
		for (int i = 0; i < 5000; i++) {
			myPodcast.play();
		}
		
		for (int i = 0; i < 1000; i++) {
			myPodcast.like();
		}
		
		FavoritesList favorites = new FavoritesList();
		favorites.include(myPodcast);
		favorites.include(myMusic);		
	}

}
