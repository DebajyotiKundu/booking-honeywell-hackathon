package hackathlon.honeywell.bookingHoneywellHackathon.application.dto;

public class EventData {
	private String eventName;
	private Double unitPrice;
	private Integer totalBook;
	private String promoCode;

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Integer getTotalBook() {
		return totalBook;
	}

	public void setTotalBook(Integer totalBook) {
		this.totalBook = totalBook;
	}

	public String getPromoCode() {
		return promoCode;
	}

	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}

}
