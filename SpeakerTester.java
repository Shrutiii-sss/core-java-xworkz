class SpeakerTester{

public static  void main (String test[]){
       System.out.println("Main started");
	   //click on button
	   Speaker.name = "";
	   boolean connected= speaker.onOrOff();
	   system.out.println("speaker is connected"+connected);
	   Speaker.onOrOff();
	   speaker2.increaseVolume();
	   speaker2.increaseVolume();
	   speaker2.increaseVolume();
	   speaker2.increaseVolume();
	   speaker2.increaseVolume();
	   boolean connected1 = speaker.onOrOff();
	   system.out.println("Is speaker connected"+ connected1);
	   speaker2.increaseVolume();
	   System.out.println("Main ended");
	   Speaker.decreaseVolume();
	   Speaker.decreaseVolume();
	   system.out.println("Main eneded");
	   
}
}

}