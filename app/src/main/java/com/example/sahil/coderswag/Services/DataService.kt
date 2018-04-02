package com.example.sahil.coderswag.Services

import com.example.sahil.coderswag.Model.Category
import com.example.sahil.coderswag.Model.Product

object DataService {
    val categories= listOf(Category("HAT","hatimage"),
            Category("HOODIE","hoodieimage"),
            Category("SHIRTS","shirtimage"),
            Category("DIGITAL","digitalgoodsimage"))
    val hats= listOf(Product("Devslopes Graphic Beanie","$18","hat01"),
            Product("Devslopes Kinda Black","$20","hat02"),
            Product("Devslopes Just White","$22","hat03"),
            Product("Devslopes No Brainer","$16","hat04"))
    val hoodies= listOf(Product("Devslopes Hoodie All Black","$30","hoodie01"),
            Product("Devslopes Hoodie Ocean White","$28","hoodie02"),
            Product("Devslopes Hoodie Okay Blue","$25","hoodie03"),
            Product("Devslopes Hoodie Space Grey","$35","hoodie04"))
    val shirts= listOf(
            Product("Devslopes Shirt Black","$18","shirt01"),
            Product("Devslopes Shirt Red","$22","shirt02"),
            Product("Devslopes Shirt Blue","$28","shirt03"),
            Product("Devslopes Hustle","$25","shirt04"),
            Product("Kickflip Studios","$18","shirt05")
            )
}