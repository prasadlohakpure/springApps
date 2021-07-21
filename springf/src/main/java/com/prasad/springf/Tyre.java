package com.prasad.springf;

import org.springframework.stereotype.Component;

@Component
public class Tyre {

	private String brandName;

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	@Override
	public String toString() {

		return "Tyre brand is " + this.brandName;
	}

}
