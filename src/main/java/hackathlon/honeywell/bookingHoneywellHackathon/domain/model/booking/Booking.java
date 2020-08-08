package hackathlon.honeywell.bookingHoneywellHackathon.domain.model.booking;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Booking")
public class Booking {
	@Id
	@Column(name = "BOOKING_ID", nullable = false)
	@SequenceGenerator(name = "BOOKING_ID_SEQ", sequenceName = "BOOKING_ID_SEQ", allocationSize = 100, initialValue = 1000)
	@GeneratedValue(generator = "BOOKING_ID_SEQ")
	private Long bookingId;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "AMOUNT")
	private Double amount;

	public Booking(Builder builder) {
		this.description = builder.description;
		this.amount = builder.amount;
	}

	public static class Builder {

		private String description;

		private Double amount;

		public Builder description(String description) {
			this.description = description;
			return this;
		}

		public Builder amount(Double amount) {
			this.amount = amount;
			return this;
		}

		public Booking build() {
			return new Booking(this);
		}
	}

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

}
