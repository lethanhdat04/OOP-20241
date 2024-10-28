package lab02;
	public class Main {
	    public static void main(String[] args) {
	        // Khởi tạo đối tượng DigitalVideoDisc
	        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Superman", "Science", "Marvel", 60, 3.14f);
	        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Batman", "Math", 5.67f);

	        // Khởi tạo giỏ hàng và thêm đĩa vào giỏ
	        Cart cart = new Cart();
	        cart.addDigitalVideoDisc(dvd1);
	        cart.addDigitalVideoDisc(dvd2);

	        // Hiển thị tổng chi phí của các đĩa trong giỏ
	        System.out.println("Total cost is: " + cart.totalCost());

	        // Xóa một đĩa và hiển thị lại tổng chi phí
	        cart.removeDigitalVideoDisc(dvd1);
	        System.out.println("Total cost after removal is: " + cart.totalCost());
	    }
	}

