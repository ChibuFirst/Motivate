package com.chibufirst.motivate.data

import com.chibufirst.motivate.R
import com.chibufirst.motivate.model.Motivation

class DataSource {
    fun loadMotivations() : List<Motivation> {
        return listOf(
            Motivation(R.string.motivate1, R.drawable.motivation_image1),
            Motivation(R.string.motivate2, R.drawable.motivation_image2),
            Motivation(R.string.motivate3, R.drawable.motivation_image3),
            Motivation(R.string.motivate4, R.drawable.motivation_image4),
            Motivation(R.string.motivate5, R.drawable.motivation_image5),
            Motivation(R.string.motivate6, R.drawable.motivation_image6),
            Motivation(R.string.motivate7, R.drawable.motivation_image7),
            Motivation(R.string.motivate8, R.drawable.motivation_image8),
            Motivation(R.string.motivate9, R.drawable.motivation_image9),
            Motivation(R.string.motivate10, R.drawable.motivation_image10)
        )
    }
}