package ChapterFour;

public class Television{


	private boolean isOn;
	private boolean mute;
	private String productName;
	private int volume;
	private int channel;


	public Television(String tvName){

	productName = tvName;

}

	public boolean isOn(){
		return isOn;
}

	public void setOn(boolean on){
		isOn = on;

}

	public boolean getMute(){
		return mute;
}

	public void mute(boolean on){
		mute = on;
}

	public String getproductName(){
	return productName;
}

	public void setProductName(String tvName){
	productName = tvName;
}

	public int getVolume(){e3d
	return volume;
}


	public void increaseVolume(){
	if(volume < 50){ volume = volume +1;}
        if(volume > 50){System.out.print("maximum limit"); System.out.println("Oga drop remote"); }

	
	
}

	public void decreaseVolume(){
	if(volume > 1)
		volume = volume -1;
	if(volume < 1)
	System.out.print("minimum limit");
	
}

	public void setChannel(int channelNumber){
	this.channel = channel;
}

	public int getChannel(){
	return channel;

}
	public void nextChannel(){
	if(volume < 20)
		channel = channel +1;
	if(channel < 1)
	System.out.print("minimum limit");
	
}

	public void previousChannel(){
	if(channel > 1)
		channel = channel +1;
	if(channel < 1)
	System.out.print("minimum limit");
	
}



}