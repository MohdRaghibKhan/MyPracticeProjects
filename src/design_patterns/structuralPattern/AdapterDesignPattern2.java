package design_patterns.structuralPattern;


class AdvancedMediaPlayer {
	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file: " + fileName);
	}

	public void playVlc(String fileName) {
		System.out.println("Playing vlc file: " + fileName);
	}
}
interface MediaPlayer {
	void play(String audioType, String fileName);
}
class MediaAdapter implements MediaPlayer {
	private AdvancedMediaPlayer advancedMediaPlayer = new AdvancedMediaPlayer();

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMediaPlayer.playVlc(fileName);
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMediaPlayer.playMp4(fileName);
		} else {
			System.out.println("Invalid media type: " + audioType);
		}
	}
}

class AudioPlayer implements MediaPlayer {
	private MediaAdapter mediaAdapter;

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 file: " + fileName);
		} else if (audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc")) {
			mediaAdapter = new MediaAdapter();
			mediaAdapter.play(audioType, fileName);
		} else {
			System.out.println("Invalid format: " + audioType);
		}
	}
}

public class AdapterDesignPattern2 {
	public static void main(String[] args) {
		AudioPlayer player = new AudioPlayer();

		player.play("mp3", "song1.mp3");
		player.play("mp4", "movie.mp4");
		player.play("vlc", "clip.vlc");
		player.play("avi", "video.avi");
	}
}
