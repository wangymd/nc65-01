package demo.vm;

import java.util.ArrayList;
import java.util.List;

public class HeapOOM {

	static class OOMObject{
		
	}
	
	public static void main(String[] args) {
		List<OOMObject> list = new ArrayList<OOMObject>(0);
		while (true){
			list.add(new OOMObject());
			
		}
	}
}
