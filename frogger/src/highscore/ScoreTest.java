package highscore;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

class ScoreTest {

	@Test
	void testAsc() throws IOException {
		SaveScore test = new SaveScore();
		test.savefile(0);
		test.savefile(0);
		test.savefile(0);
		test.savefile(0);
		test.savefile(0);
		test.savefile(0);
		test.savefile(0);
		test.savefile(0);
		test.savefile(0);
		
		File testfile = new File("src/highscore/highscores.txt");
		
		try {
			Scanner readscore = new Scanner(testfile);
			while(readscore.hasNextLine()) {
				String data = readscore.nextLine();
				int dataint = Integer.parseInt(data);
				assertSame(dataint, 0);
			}
			readscore.close();
		} catch(FileNotFoundException e) {
			
		}
	}

}
