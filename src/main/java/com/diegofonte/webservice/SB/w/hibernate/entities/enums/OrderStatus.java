package com.diegofonte.webservice.SB.w.hibernate.entities.enums;

public enum OrderStatus {
	
	WAITING_PAYMENT(1),     //atribuição automática se nao colocado nada ordenada. 0,1,2,3. se alguem add um vai quebrar a sequencia.
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code; //cod da atribuição
	
	private OrderStatus(int code) {       // construtor. 
		this.code = code;
	}
	
	public int getCode() {    //métd público.
		return code;
	}
	
	public static OrderStatus valueOf(int code) {
		for (OrderStatus value: OrderStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		
		throw new IllegalArgumentException("CODE INVALID");
	}

}
