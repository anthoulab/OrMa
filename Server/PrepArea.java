class PrepArea{

	protected LatLng lat_lng;
	protected Map<Product, int> product_stock;
	protected int floor;
	protected ArrayList<Order> orders = new ArrayList();
	protected ArrayList<Product> product_list = new ArrayList();
	protected PrepAreaEmployee employee;

	PrepArea(LatLng lat_lng, Map<Product, int> stock, int floor){
		this.lat_lng = lat_lng;
		this.product_stock = stock;
		this.floor = floor;
		}

	static PrepArea findBestForOrder(products, table){
		PrepArea preparea;


		return preparea;
	}

	getEmployee(){

	}
}