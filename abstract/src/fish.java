
public class fish {
	// cách 2 tạo class abstract và extends class cha , như vẫn phải override lại phương thức abstract in class cha
	@Override
	public void eat() {
		System.out.println("tôi là cá ");
	}
	@Override 
	public abstract void makeSound() {
		System.out.println("tôi đg bơi");
	}
// lưu ý :	Animal a = new Animal(); // không thể tạo đối tượng từ lớp Animal
	Dog d = new Dog();
	d.eat();
}
