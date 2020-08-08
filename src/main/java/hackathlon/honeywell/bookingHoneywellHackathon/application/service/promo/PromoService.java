package hackathlon.honeywell.bookingHoneywellHackathon.application.service.promo;

import java.util.List;

import hackathlon.honeywell.bookingHoneywellHackathon.domain.model.promo.Promo;

public interface PromoService {
	void addPromo();

	List<Promo> serachPromoByPromoCode(String promoCode);
}
