package application;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SaveScore {
	public static void savefile(int x) throws IOException{
		int same=0,p;
		ArrayList<Integer> pts = new ArrayList<>();
		
		File score = new File("highscores.txt");
		
		try {
			Scanner readscore = new Scanner(score);
			while(readscore.hasNextLine()) {
				String data = readscore.nextLine();
				pts.add(Integer.parseInt(data));
			}
			readscore.close();
		} catch(FileNotFoundException e) {
			
		}
		
		int min = pts.get(0);
		
		for (int j = 0; j < pts.size(); j++) {
			if (pts.get(j)<min) {
				min = pts.get(j);
			}
		}
		
		String line = Integer.toString(min);
		
		//delete lowest score and add new score if new score > lowest score
		if(x>min) {
			File temp = new File("temp.txt");
			FileWriter fw2 = new FileWriter(temp,true);
			BufferedWriter bw2 = new BufferedWriter(fw2);
			PrintWriter pw2 = new PrintWriter(bw2);
			
			Scanner scanln = new Scanner(score);
			while(scanln.hasNextLine()) {
				String ln = scanln.nextLine();
				if (!ln.equals(line)) {
					pw2.printf("%s\n",ln);
				}else if(ln.equals(line)) {
					same++;
				}
			}
			scanln.close();
			
			for (p=same;p>1;p--) {
				pw2.printf("%s\n",line);
			}
			
			pw2.printf("%d\n",x);
			pw2.close();
			bw2.close();
			fw2.close();
			
			score.delete();
			File newname = new File("highscores.txt");
			temp.renameTo(newname);
		}
	}
}
