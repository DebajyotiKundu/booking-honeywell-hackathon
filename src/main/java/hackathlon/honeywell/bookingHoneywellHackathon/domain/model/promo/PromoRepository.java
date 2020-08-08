package hackathlon.honeywell.bookingHoneywellHackathon.domain.model.promo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "promos")
public interface PromoRepository extends JpaRepository<Promo, Long> {
	List<Promo> findByPromoCode(@Param("promoCode") String promoCode);

	List<Promo> findByEventId(@Param("eventId") Long eventId);
}
