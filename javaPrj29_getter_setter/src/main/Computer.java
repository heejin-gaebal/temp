package main;

public class Computer {
	
	private String cpu;
	private int ram;
	private int storage;
	private int gpu;
	private int power;
	private String mainBoard;
	private boolean isMultiThread;
	
	public Computer(String cpu, int ram, int sto, 
			int gpu, int power, String Mb, boolean Mt) {
		this.cpu = cpu;
		this.ram = ram;
		this.storage = sto;
		this.gpu = gpu;
		this.power = power;
		this.mainBoard = Mb;
		this.isMultiThread = Mt;
	}
	
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public void setSto(int storage) {
		this.storage = storage;
	}
	public void setGpu(int gpu) {
		this.gpu = gpu;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public void setMb(String mainBoard) {
		this.mainBoard = mainBoard;
	}
	public void setmT(boolean isMultiThread) {
		this.isMultiThread = isMultiThread;
	}

	public String getCpu() {
		return cpu;
	}
	public int getRam() {
		return ram;
	}
	public int getSto() {
		return storage;
	}
	public int getGpu() {
		return gpu;
	}
	public int getPower() {
		return power;
	}
	public String getMb() {
		return mainBoard;
	}
	public boolean getMt() {
		return isMultiThread;
	}
	
	public String toString() {
		return cpu + "," + ram + "," + storage + "," + gpu + "," + power + "," 
	+ mainBoard + "," + isMultiThread;
	}
}
