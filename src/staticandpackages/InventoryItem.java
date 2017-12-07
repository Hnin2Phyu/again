package staticandpackages;

public class InventoryItem {

    public static final String SERIAL_PREFIX = "SN";
    public static int count = 0;
    public static Car c = new Car();


    private String serialNum;

    public InventoryItem () { 
        count++;
        serialNum = SERIAL_PREFIX + count;
    }

    public String getSerialNumber () {
        return serialNum;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(InventoryItem.count);
		System.out.println(InventoryItem.c);
		
		InventoryItem i1 = new InventoryItem();
		System.out.println(InventoryItem.count);
		InventoryItem i2 = new InventoryItem();
		System.out.println(InventoryItem.count);
		InventoryItem i3 = new InventoryItem();
		System.out.println(InventoryItem.count);
		//System.out.println(InventoryItem.c);
		
		
		System.out.println(i1.getSerialNumber());
		System.out.println(i2.getSerialNumber());
		System.out.println(i3.getSerialNumber());
		
		System.out.println("1"+1);
		System.out.println(1+1);
	}
	
	

}
