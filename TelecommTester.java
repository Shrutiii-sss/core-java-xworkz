class TeleCommTester{

  public static void main(String sim[]){
	  
	  TeleComm.addSim("BSNL");
	  TeleComm.addSim("Airtel");
	  TeleComm.addSim("Jio");
	  TeleComm.addSim("Vodaphone");
	  TeleComm.addSim("Idea");
	  TeleComm.getAllSimNetworks();
  }

}