package Lab3_Task2;
import java.util.Arrays;
import java.util.Comparator;
public class Order {
	
		private OrderItem[] items;

		public Order(OrderItem[] items) {
			this.items = items;
		}

		public double cost() {
			double totalCost = 0.0;
			for (OrderItem item : items) {
				totalCost += item.getItemCost();
			}
			return totalCost;
		}

		public boolean contains(Product p) {
			Arrays.sort(items, new Comparator<OrderItem>() {

				@Override
				public int compare(OrderItem o1, OrderItem o2) {

					return o1.getP().getId().compareTo(o2.getP().getId());

				}
			});
			int left = 0;
			int right = items.length - 1;
			while (left <= right) {
				int mid = (left + right) / 2;
				int re = items[mid].getP().getId().compareTo(p.getId());
			
				if (re == 0) {
					return true;
				} else if (re < 0) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			}
			return false;
		}

		public Product[] filter(String type) {
			return null;
		}

	}


