package hackathlon.honeywell.bookingHoneywellHackathon.application.service.promo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hackathlon.honeywell.bookingHoneywellHackathon.domain.model.promo.Promo;
import hackathlon.honeywell.bookingHoneywellHackathon.domain.model.promo.PromoRepository;

@Service
public class PromoServiceImpl implements PromoService {

	private PromoRepository promoRepository;

	@Autowired
	public PromoServiceImpl(PromoRepository promoRepository) {
		this.promoRepository = promoRepository;
	}

	@Override
	public void addPromo() {

	}

	@Override
	public List<Promo> serachPromoByPromoCode(String promoCode) {

		return promoRepository.findByPromoCode(promoCode);

	}

}
