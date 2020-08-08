package hackathlon.honeywell.bookingHoneywellHackathon.application.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import hackathlon.honeywell.bookingHoneywellHackathon.application.dto.EventData;
import hackathlon.honeywell.bookingHoneywellHackathon.application.exception.BookingException;
import hackathlon.honeywell.bookingHoneywellHackathon.application.service.booking.BookingService;

@RestController(("/bookEvent"))
public class BookingController {

	private BookingService bookingService;

	public BookingController(BookingService bookingService) {
		this.bookingService = bookingService;
	}

	@PutMapping
	public ResponseEntity bookEvent(EventData eventData) {
		try {
			bookingService.bookEvent(eventData);
			return ResponseEntity.status(HttpStatus.ACCEPTED).build();
		} catch (BookingException e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		} catch (IllegalArgumentException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}

}
