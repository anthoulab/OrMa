class Order{

	private long id;
	private double balance;
	private Date create_time;
	private Date delivery_time;
	private Date pay_time;
	private Table table;
	private ArrayList<Product> products = new ArrayList();
	private ArrayList<boolean> product_paid = new ArrayList();
	private ArrayList<Waiter> waiters = new ArrayList();
	private PrepArea assigned_prepArea;
	public static ArrayList<Order> allorders = new ArrayList();

	Order(long id, double balance, Date create, Date delivery, Date pay, Table table, PrepArea prepArea){
		this.id = id;
		this.balance = balance;
		this.create_time = create;
		this.delivery_time = delivery;
		this.pay_time = pay;
		this.table = table;
		this.assigned_prepArea = prepArea;
	}

	void onEdit(List<Product> p, List<int> action){
		PrepAreaNotification n = new PrepAreaNotification(this.assigned_prepArea, this);
		i = 0;
		if (!isAssigned() || n.show()){
			for (Product x : p){
				if (action.get(i) = 0){   //add a product
					this.products.add(x);
				}else{   //remove a product
					this.products.remove(x);
				}
				i = i + 1;
			}
			send();
			showSuccess("Successful update");
		}else{
			showFailure("Update failed");
		}
	}

	void send(){
		
	}

	boolean isAssigned(){
		if (this.assigned_prepArea == null){
			return false;
		}
		else{
			return true;
		}
	}

	void assignOrder(PrepArea prepArea, Order o){
		assigned_prepArea = prepArea;
		prepArea.assigned_orders.add(o);
	}

	void setReady(){
		Waiter w = Waiter.findBestForTable(this.table);
		OrderReadyNotification n = new OrderReadyNotification(this, this.assigned_prepArea, w);
		notify(n);
	}
	
	void setPaid(List<Product> p){
		
	}

	void onRejected(){
		send();
	}

	static List<Order> findBestCombination(List<Order> orders){
		PrepArea preparea;

		return List<Order>;
	}

	boolean hasKnownDevice(){

	}

	void addProduct(Product p){
		products.add(p);
	}
		
	double getBalance(){
		return balance;
	}
}
