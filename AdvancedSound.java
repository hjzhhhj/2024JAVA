package JavaStudy;

interface Sound {
	public void SoundUp(int level);
	public void SoundDown(int level);
}

interface AdvancedSound extends Sound{
	public void SoundOff();
}