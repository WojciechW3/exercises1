package tbs;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class AssetsFolder {
	private final Path path;
	
	public AssetsFolder(String path) {
		this.path = Paths.get(path).toAbsolutePath();
	}
	
	private FileInputStream open(String relpath) throws IOException {
		return new FileInputStream(this.path.resolve(relpath).toFile());
	}
	
	public Image loadImage(String relpath) {
		try (InputStream imageIStream = open(relpath)) {
			return ImageIO.read(imageIStream);
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}		
	}
	
	public void playSound(String relpath) {
		try (InputStream audioIStream = open(relpath)){
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioIStream);
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
