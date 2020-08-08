package hackathlon.honeywell.bookingHoneywellHackathon.application.service.booking;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import hackathlon.honeywell.bookingHoneywellHackathon.application.dto.EventData;
import hackathlon.honeywell.bookingHoneywellHackathon.application.service.promo.PromoService;
import hackathlon.honeywell.bookingHoneywellHackathon.domain.model.booking.Booking;
import hackathlon.honeywell.bookingHoneywellHackathon.domain.model.booking.BookingRepository;
import hackathlon.honeywell.bookingHoneywellHackathon.domain.model.promo.Promo;

@Service
public class BookingServiceImpl implements BookingService {

	private BookingRepository bookingRepository;
	private PromoService promoService;

	@Autowired
	public BookingServiceImpl(PromoService promoService, BookingRepository bookingRepository) {
		this.promoService = promoService;
		this.bookingRepository = bookingRepository;
	}

	@Override
	public void bookEvent(EventData eventData) {
		if (eventData == null || eventData.getTotalBook() == 0 || eventData.getUnitPrice() == 0.0) {
			throw new IllegalArgumentException("No/bad event data found.");
		}

		double finalPrice = eventData.getTotalBook() * eventData.getUnitPrice();
		if (!StringUtils.isEmpty(eventData.getPromoCode())) {
			List<Promo> promoList = promoService.serachPromoByPromoCode(eventData.getPromoCode());
			if (!CollectionUtils.isEmpty(promoList)) {
				Optional<Promo> promoOp = promoList.stream().findFirst();
				if (promoOp.isPresent()) {
					Promo promo = promoOp.get();
					if (promo.getMinAmount() <= finalPrice) {
						finalPrice = finalPrice * (((Promo) promo).getDiscount() / 100.0);
					}
				}
			}
		}

		Booking booking = new Booking.Builder().amount(finalPrice).description(eventData.getEventName() + "-"
				+ eventData.getPromoCode() + "-" + eventData.getTotalBook() + "-" + eventData.getUnitPrice()).build();

		bookingRepository.save(booking);

	}

}
