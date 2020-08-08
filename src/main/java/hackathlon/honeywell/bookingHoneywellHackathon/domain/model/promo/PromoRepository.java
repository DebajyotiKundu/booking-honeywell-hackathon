package hackathlon.honeywell.bookingHoneywellHackathon.domain.model.promo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PromoRepository extends JpaRepository<Promo, Long> {
	List<Promo> findByPromoCode(String promoCode);

	List<Promo> findByEventId(Long eventId);
}
