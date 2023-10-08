package Lab3_Task2;

public class OrderItem {
	
		private Product p;
		private int quantity;
		public OrderItem(Product p, int quantity) {
			super();
			this.p = p;
			this.quantity = quantity;
		}
		
		public Product getP() {
			return p;
		}

		public int getQuantity() {
			return quantity;
		}

		public double getItemCost() {
			return p.getPrice()*quantity;
		}
		@Override
		public String toString() {
			return "OrderItem:" + p + ", quantity:" + quantity + "\n";
		}
		public Product getProduct() {
			// TODO Auto-generated method stub
			return null;
		}

	}


