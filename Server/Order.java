class Order{

	private long id;
	private double balance;
	private Date create_time;
	private Date delivery_time;
	private Date pay_time;
	private Table table;
	private ArrayList<Product> products = new ArrayList();
	private ArrayList<Waiter> waiters = new ArrayList();
	private PrepArea assigned_prepArea;
	public static ArrayList<Order> allorders = new ArrayList();

	Order(long id, double balance, date create, date delivery, date pay, Table table, PrepArea prepArea){
		this.id = id;
		this.balance = balance;
		this.create_time = create;
		this.delivery_time = delivery;
		this.pay_time = pay;
		this.table = table;
		this.assigned_prepArea = prepArea;
	}

	void onEdit(p, action){
		if (!isAssigned()){
			send(p, action);
			showSuccess("Successful update");
		}
		else{
			if (PrepAreaNotification.show()){
				send();
				showSuccess("Successful update");
			}
			else{
				showFailure("Update failed");
			}
		}
	}

	void send(Product p, int action){
		if (action == 0){
			products.add(p);
		}
		else if (action == 1){
			products.remove(p);
		}
		else{
			PrepArea.findBestForOrder(this).showNewOrder();
		}
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
		PrepArea.orders.add(o);
	}

	void setReady(){
		Waiter.findBestForTable(table).notify();
	}
	
	void setPaid(Table t){
		this.balance = 0;
		t.balance = 0;
		t.status = "free";

	void onRejected(){
		send();
	}

	static List<Order> findBestCombination(List<Order> orders){
		PrepArea preparea;


		return List<Order>;
	}

	boolean hasKnownDevice(){

	}

	void addProduct(){
		products.add(p);
	}
}
