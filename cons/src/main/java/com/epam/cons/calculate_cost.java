package com.epam.cons;

public class calculate_cost {
	void calculate(String materialType, int area) {
		{
	material_cost mt=new material_cost();
	int k=mt.material(materialType);
	int p= k*area;
	System.out.println("Total cost for House Construction : Rs"+p);
	}
	
}
}
