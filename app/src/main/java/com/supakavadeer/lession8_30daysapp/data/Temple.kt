package com.supakavadeer.lession8_30daysapp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.supakavadeer.lession8_30daysapp.R

data class Temple(
    val day: Int,
    @StringRes val locationName: Int,
    val place: String,
    @StringRes val note: Int,
    @DrawableRes val image: Int
)

val temples = listOf(
    Temple(
        day = 1,
        locationName = R.string.wat_mangkon_name,
        place = "MRT Wat Mangkon",
        note = R.string.wat_mangkon_note,
        image = R.drawable.day1
    ),
    Temple(
        day = 2,
        locationName = R.string.wat_hua_lamphong_name,
        place = "MRT Sam Yan",
        note = R.string.wat_hua_lamphong_note,
        image = R.drawable.day2
    ),
    Temple(
        day = 3,
        locationName = R.string.wat_saket_name,
        place = "MRT Sam Yot",
        note = R.string.wat_saket_note,
        image = R.drawable.day3
    ),
    Temple(
        day = 4,
        locationName = R.string.wat_bowonniwet_name,
        place = "MRT Sam Yot",
        note = R.string.wat_bowonniwet_note,
        image = R.drawable.day4
    ),
    Temple(
        day = 5,
        locationName = R.string.wat_arun_name,
        place = "MRT Sanam Chai",
        note = R.string.wat_arun_note,
        image = R.drawable.day5
    ),
    Temple(
        day = 6,
        locationName = R.string.wat_pho_name,
        place = "MRT Sanam Chai",
        note = R.string.wat_pho_note,
        image = R.drawable.day6
    ),
    Temple(
        day = 7,
        locationName = R.string.wat_phra_kaew_name,
        place = "MRT Sanam Chai",
        note = R.string.wat_phra_kaew_note,
        image = R.drawable.day7
    ),
    Temple(
        day = 8,
        locationName = R.string.wat_prayurawongsawat_name,
        place = "MRT Itsaraphap",
        note = R.string.wat_prayurawongsawat_note,
        image = R.drawable.day8
    ),
    Temple(
        day = 9,
        locationName = R.string.wat_kalayanamitr_name,
        place = "MRT Itsaraphap",
        note = R.string.wat_kalayanamitr_note,
        image = R.drawable.day9
    ),
    Temple(
        day = 10,
        locationName = R.string.wat_loha_prasat_name,
        place = "MRT Sam Yot",
        note = R.string.wat_loha_prasat_note,
        image = R.drawable.day10
    ),
    Temple(
        day = 11,
        locationName = R.string.wat_pathum_wanaram_name,
        place = "BTS Siam",
        note = R.string.wat_pathum_wanaram_note,
        image = R.drawable.day11
    ),
    Temple(
        day = 12,
        locationName = R.string.wat_traimit_name,
        place = "MRT Hua Lamphong",
        note = R.string.wat_traimit_note,
        image = R.drawable.day12
    ),
    Temple(
        day = 13,
        locationName = R.string.wat_benjamabophit_name,
        place = "BTS Phaya Thai",
        note = R.string.wat_benjamabophit_note,
        image = R.drawable.day13
    ),
    Temple(
        day = 14,
        locationName = R.string.wat_suthat_name,
        place = "MRT Sam Yot",
        note = R.string.wat_suthat_note,
        image = R.drawable.day14
    ),
    Temple(
        day = 15,
        locationName = R.string.wat_chana_songkhram_name,
        place = "MRT Sam Yot",
        note = R.string.wat_chana_songkhram_note,
        image = R.drawable.day15
    ),
    Temple(
        day = 16,
        locationName = R.string.wat_mahathat_name,
        place = "MRT Sanam Chai",
        note = R.string.wat_mahathat_note,
        image = R.drawable.day16
    ),
    Temple(
        day = 17,
        locationName = R.string.wat_yannawa_name,
        place = "BTS Saphan Taksin",
        note = R.string.wat_yannawa_note,
        image = R.drawable.day17
    ),
    Temple(
        day = 18,
        locationName = R.string.wat_ratchabophit_name,
        place = "MRT Sam Yot",
        note = R.string.wat_ratchabophit_note,
        image = R.drawable.day18
    ),
    Temple(
        day = 19,
        locationName = R.string.wat_intharawihan_name,
        place = "MRT Bang Pho",
        note = R.string.wat_intharawihan_note,
        image = R.drawable.day19
    ),
    Temple(
        day = 20,
        locationName = R.string.wat_prayoon_name,
        place = "MRT Itsaraphap",
        note = R.string.wat_prayoon_note,
        image = R.drawable.day20
    ),
    Temple(
        day = 21,
        locationName = R.string.wat_phra_sri_mahathat_name,
        place = "BTS Wat Phra Sri Mahathat",
        note = R.string.wat_phra_sri_mahathat_note,
        image = R.drawable.day21
    ),
    Temple(
        day = 22,
        locationName = R.string.wat_suwannaram_name,
        place = "MRT Bang Yi Khan",
        note = R.string.wat_suwannaram_note,
        image = R.drawable.day22
    ),
    Temple(
        day = 23,
        locationName = R.string.wat_rakhang_name,
        place = "MRT Itsaraphap",
        note = R.string.wat_rakhang_note,
        image = R.drawable.day23
    ),
    Temple(
        day = 24,
        locationName = R.string.wat_paknam_name,
        place = "BTS Wutthakat",
        note = R.string.wat_paknam_note,
        image = R.drawable.day24
    ),
    Temple(
        day = 25,
        locationName = R.string.wat_khun_chan_name,
        place = "MRT Itsaraphap",
        note = R.string.wat_khun_chan_note,
        image = R.drawable.day25
    ),
    Temple(
        day = 26,
        locationName = R.string.wat_nang_nong_name,
        place = "MRT Bang Khun Non",
        note = R.string.wat_nang_nong_note,
        image = R.drawable.day26
    ),
    Temple(
        day = 27,
        locationName = R.string.wat_hong_rattanaram_name,
        place = "MRT Itsaraphap",
        note = R.string.wat_hong_rattanaram_note,
        image = R.drawable.day27
    ),
    Temple(
        day = 28,
        locationName = R.string.wat_nak_prok_name,
        place = "MRT Bang Khun Non",
        note = R.string.wat_nak_prok_note,
        image = R.drawable.day28
    ),
    Temple(
        day = 29,
        locationName = R.string.wat_raja_orot_name,
        place = "MRT Charan 13",
        note = R.string.wat_raja_orot_note,
        image = R.drawable.day29
    ),
    Temple(
        day = 30,
        locationName = R.string.wat_chimplee_name,
        place = "MRT Tha Phra",
        note = R.string.wat_chimplee_note,
        image = R.drawable.day30
    ),
    Temple(
        day = 31,
        locationName = R.string.wat_bang_phli_yai_klang_name,
        place = "MRT Srinagarindra",
        note = R.string.wat_bang_phli_yai_klang_note,
        image = R.drawable.day31
    )
)
