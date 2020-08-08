package hackathlon.honeywell.bookingHoneywellHackathon.domain.model.promo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Promo")
public class Promo {
	@Id
	@Column(name = "PROMO_ID", nullable = false)
	@SequenceGenerator(name = "BOOKING_ID_SEQ", sequenceName = "BOOKING_ID_SEQ", allocationSize = 100, initialValue = 1000)
	@GeneratedValue(generator = "BOOKING_ID_SEQ")
	private Long promoId;

	@Column(name = "EVENT_ID")
	private Long eventId;

	@Column(name = "PROMO_CODE", nullable = false)
	private Long promoCode;

	@Column(name = "DISCOUNT", nullable = false)
	private Integer discount;

	@Column(name = "MIN_AMOUNT")
	private double minAmount;

	public Long getPromoId() {
		return promoId;
	}

	public void setPromoId(Long promoId) {
		this.promoId = promoId;
	}

	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

	public Long getPromoCode() {
		return promoCode;
	}

	public void setPromoCode(Long promoCode) {
		this.promoCode = promoCode;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	public double getMinAmount() {
		return minAmount;
	}

	public void setMinAmount(double minAmount) {
		this.minAmount = minAmount;
	}

}
