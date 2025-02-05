package ex_LEEJUNMOK05;

public class Ex06_4_SmartPhone extends Ex06_4_Phone{
	
//	필드
	private String osType;
	private String osVersion;
	private int memorySize;
	private boolean camera;
	private boolean bluetooth;

//	생성자
	public Ex06_4_SmartPhone() {
		super();
	}

	public Ex06_4_SmartPhone(String product, int price, String transType, String osType, String osVersion, int memorySize, boolean camera, boolean bluetooth) {
		super(product, price, transType);
		this.osType = osType;
		this.osVersion = osVersion;
		this.memorySize = memorySize;
		this.camera = camera;
		this.bluetooth = bluetooth;
	}

//	getter & setter
	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public int getMemorySize() {
		return memorySize;
	}

	public void setMemorySize(int memorySize) {
		this.memorySize = memorySize;
	}

	public boolean isCamera() {
		return camera;
	}

	public void setCamera(boolean camera) {
		this.camera = camera;
	}

	public boolean isBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}
	
//	메소드
	public void Print() {
		super.Print();
		System.out.printf("운영체제 타입 : %s \t 운영체제 버전 : %s \t 내부 메모리 크기 : %d \t 카메라 장착 여부 : %b \t 블루투스 지원 여부 : %b \t", osType, osVersion, memorySize, camera, bluetooth);
	}
	
	
	
	
	
	
}
