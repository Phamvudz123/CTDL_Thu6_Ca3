package Lab3_Task2;
import java.util.Arrays;
public class OrderTest {
	
		public static void main(String[] args) {
			Product p1 = new Product("123", "Banh trang", 10.0, "Bit");
			Product p2 = new Product("124", "Trai cay", 8.0, "Dong thung");
			Product p3 = new Product("125", "Rau cu", 5.0, "Dong thung");
			Product p4 = new Product("126", "Nuoc", 6.6, "Dong thung");
			OrderItem item1 = new OrderItem(p1, 3);
			OrderItem item2 = new OrderItem(p2, 4);
			OrderItem item3 = new OrderItem(p3, 5);

			OrderItem[] items = { item1, item2, item3 };
			Order order = new Order(items);
			System.out.print("Tong gia:");
			System.out.println(order.cost());
			System.out.println(order.contains(p1));
			System.out.println(order.contains(p4));
		}

	}


