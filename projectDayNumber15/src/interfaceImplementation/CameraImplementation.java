package interfaceImplementation;

public class CameraImplementation implements Camera {
	@Override
	public void exposure() {
		System.out.println("Camera has different exposure settings");
	}

	@Override
	public void ISO() {
		System.out.println("Camera supports adjustable ISO values");
	}

	public static void main(String[] args) {
		// We can create a reference of an interface, but not an object
		Camera camera;
		camera = new CameraImplementation();
		camera.exposure();
		camera.ISO();

		System.out.println("Camera Name: " + Camera.name);
		System.out.println("Camera Lens: " + Camera.lens);
	}
}
