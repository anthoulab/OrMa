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

	void addwaiter(Waiter w){
		waiters.add(w);
	}

	boolean onEdit(p, action){
		if (!isAssigned()){
			send(p, action);
			showSuccess("Successful update");
			return true;
		}
		else{
			PrepAreaNotification(this).show();

			return false;
		}
	}

	void send(p, action){
		if (p){
			products.add(p);
		}
		else{
			products.remove(p);
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

	void assignOrder(){

	}

	void setReady(){
		Waiter.findBestForTable(table);
		Waiter.notify();
	}

	void onRejected(){
		PrepArea.findBestForOrder(products, table);
	}

	static List<Order> findBestCombination(List<Order> orders){
		PrepArea preparea;


		return List<Order>;
	}

	boolean hasKnownDevice(){

	}

	void addProduct(){

	}
}
