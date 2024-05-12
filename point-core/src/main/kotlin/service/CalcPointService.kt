package service

import com.demo.domain.PointEvent
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service
import com.demo.repository.PointEventRepository

@Service
class CalcPointService(private val pointEventRepository: PointEventRepository) {

    @Transactional
    fun createPointEvent() {
        val pointEvent = PointEvent().apply {
            userSeq = 10
        }
        pointEventRepository.save(pointEvent)
    }


}
