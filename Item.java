class Item {
	int id;
	String name;
	double price;

	//TODO add variable.
	char tax;
	//TODO constructor
	public Item(int id, String name, double price, char tax) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.tax = tax;
        }
	//TODO setters and getters
	public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public char getTax() {
            return tax;
        }

        public void setTax(char tax) {
            this.tax = tax;
        }


	double taxReturn () {
		//TODO
		double ddv;
        double ret = 0;

        if (tax == 'A') {
            ddv = price * 0.18;
            ret = ddv * 0.15;
        }

        else if (tax == 'B'){
            ddv = price * 0.05;
            ret = ddv * 0.15;
        }
        return ret;
    }
	}
}
