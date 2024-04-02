import java.util.*;
 
public class Car {
 
	Map<String,Integer> carMap=new TreeMap<String,Integer>();
 
	// Include getter and setter
	public Map<String, Integer> getCarMap() {
		return carMap;
	}
 
	public void setCarMap(Map<String, Integer> carMap) {
		this.carMap = carMap;
	}
	public void addCar(String name,int num)
	{
		boolean flag=false;
		for(Map.Entry<String,Integer> mp : getCarMap().entrySet()){
			if(mp.getKey().equalsIgnoreCase(name)) {
				flag=true;
			}
		}
		if(flag==false) {
			carMap.put(name, num);
		}
		
	}
		
	
	public int carByName(String name)
	{
		int ans = 0;
		boolean flag = false;
       for(Map.Entry<String, Integer> mp : getCarMap().entrySet()) {
    	   if(mp.getKey().equalsIgnoreCase(name)) {
    		   ans=mp.getValue();
    		   flag=true;
    	   }
       }
       if(flag==true) {
    	   return ans;
       }
       else {
    	   return -1;
       }
	}
	public List<String> carByCount(int count)
	{
		// Code here
		
		List<String> li = new ArrayList<String>();
		boolean flag= false;
		for(Map.Entry<String, Integer> mp : getCarMap().entrySet()) {
			if(mp.getValue() >= count) {
				li.add(mp.getKey());
				flag=true;
				
			}
		}
		if(flag==false) {
			return null;
		}
		else {
			return li;
		}
		
		
	}

 
	public int totalCarsSold()
	{
		// Code here
		int sum =0;
		for(Map.Entry<String, Integer> mp : getCarMap().entrySet()) {
			sum += mp.getValue();
		}
		return sum;
}
	}