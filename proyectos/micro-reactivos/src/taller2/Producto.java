package taller2;

import java.math.BigDecimal;

public class Producto {
	
	public String name;
    public BigDecimal price;
    public Impuesto impuesto;
    
    Producto(String name, BigDecimal price, Impuesto impuesto) {
        this.name = name;
        this.price = price;
        this.impuesto = impuesto;
    }

	@Override
	public String toString() {
		return "Producto [name=" + name + ", price=" + price + ", impuesto=" + impuesto + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Impuesto getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(Impuesto impuesto) {
		this.impuesto = impuesto;
	}
    
    

}
