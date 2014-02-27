//UIUC CS125 SPRING 2014 MP. File: RainGame.java, CS125 Project: PairProgramming, Version: 2014-02-24T21:11:32-0600.531798000
/**
 * @author yangeng2, qliu27
 */
public class RainGame {

	public static void main(String[] args) {
		// To get points type your netids above (CORRECTLY-Please double check your partner correctly spells your netid correctly!!)
		// Your netid is the unique part of your @illinois email address
		// Do not put your name or your UIN. 
		// REMEMBER TO COMMIT this file...
	
		int x=0, y=0, dx=0, dy=0, score = 0, level = 0, second = 90;
		String text = "";
		// long startTime =System.currentTimeMillis();
		
		Zen.setFont("Helvetica-64");
		while (Zen.isRunning()) {

			if (text.length() == 0) {
				x = 0;
				y = Zen.getZenHeight() / 2;
				dx = 2;
				dy = 0;
				text = "" + (int) (Math.random() * 999);
				// long elapsed = System.currentTimeMillis() - startTime;
				// startTime = System.currentTimeMillis();
				// score += 3000 / elapsed;
			}
			Zen.setColor(125, 125, 255);
			Zen.fillRect(0, 0, Zen.getZenWidth(), Zen.getZenHeight());
			
			
		
			
			//
			if (score == 0 && level == 0){
				Zen.setColor(0,0,255);
				Zen.drawText("Skip? Enter Y or N", x, y);
			
			}
			
			
			
			else if (score <= -50 && level == 0){
				Zen.setColor(255, 0, 0);
				Zen.drawText("Dead", x , y);
				break;
			}
			else{
				Zen.setColor(0, 255, 0);
				Zen.drawText(text, x, y);
				
				Zen.setColor(0,250,240);
				Zen.drawText("Level: " + level,10,110);
			    Zen.drawText("Score: " + score,10,60);
			}
			//
			x += dx;
			y += dy;
			
			// Find out what keys the user has been pressing.
			String user = Zen.getEditText();
			// Reset the keyboard input to an empty string
			// So next iteration we will only get the most recently pressed keys.
			Zen.setEditText("");
			
			for(int i=0;i < user.length();i++) {
				char c = user.charAt(i);
				if (user.length() == 1 && c == 'Y'){
					level ++ ;
					second -=10;
				}
					
				else if(c == text.charAt(0)){
					text = text.substring(1,text.length());// all except first character
					score += 10;
					
				}
				else 
					score -=5;
				
			}
			if (score >= 100){
				level ++;
				score = 0;
				second -= 10;
				if (second < 5)
					second = 2;
				
			}
			if (score <= -50 && level >= 1){
				level--;
				score = 0;
				second += 10;
			}
			
			if (x > Zen.getZenWidth()){
				x = 0;
				score -=20;
			}
			Zen.sleep(second);// sleep for 90 milliseconds

		}
	}

}
