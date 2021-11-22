package com.example.devops.database.devops.product

import androidx.room.Embedded
import androidx.room.Relation
import com.example.devops.database.devops.bet.Bet

data class ProductWithBets(
    @Embedded val product: Product,
    @Relation(
        parentColumn = "productId",
        entityColumn = "userBidderId"
    )
    val bets: List<Bet>
)
