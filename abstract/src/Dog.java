
public class Dog extends Animal {
	// cách 1 override , buộc class con phải override lại
	// không thể tạo object từ class animal a = new animal();
	// class abstract và phương thức abstract
	@Override
	public void eat() {
		System.out.println("tôi là dog ");
	}
	@Override
	public void makeSound() {
		System.out.println("tôi gáy gâu gâu");
	}
	public static void main(String[] args) {
	}
}
