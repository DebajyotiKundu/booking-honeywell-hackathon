package hackathlon.honeywell.bookingHoneywellHackathon.application.exception;

public class BookingException extends RuntimeException {
	private String message;

	public BookingException(String message) {
		super();
		this.message = message;
	}
}
