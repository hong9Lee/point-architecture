package com.demo.domain

import jakarta.persistence.*
import org.springframework.data.annotation.CreatedDate
import java.time.LocalDateTime

@Entity
class PointEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long?= null

    var userSeq: Long?= null

    var serviceName: String = "INIT"

    var status: String = "INIT"

    var point: Number = 0

    @CreatedDate
    @Column(nullable = false, updatable = false)
    var createdAt: LocalDateTime = LocalDateTime.now()

    @Column(nullable = false, updatable = true)
    var expireAt: LocalDateTime = LocalDateTime.now().plusYears(1)

}
