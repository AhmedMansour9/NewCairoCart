package com.cairocart.old.Model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DataX(
    var IsProductFavoirte: Int,
    var ProductInCart: Int,
    var ProductInCartColor: String,
    var ProductInCartQty: Int,
    var ProductInCartTotal: Int,
    var best_seller: Boolean,
    var brand: String,
    var category: String?,
    var count_solid: Int,
    var created_by: String,
    var currency: String,
    var description: String?,
    var discount: Int,
    var expire_date_hot_deal: String?,
    var featured: Boolean,
    var hot_deal: Boolean,
    var hot_deal_price: Int,
    var id: Int,
    var image: String,
    var is_new: Boolean,
    var link_youtube: String?,
    var name: String?,
    var number_clicks: Int,
    var number_views: Int,
    var off_50: Boolean,
    var on_sale: Boolean,
    var porduct_sku_code: String?,
    var productImages: List<ProductImage>,
    var product_code: String?,
    var product_serial_number: String?,
    var reviews: List<Review>,
    var sale_price: Int,
    var short_description: String,
    var status: String,
    var stock: Int,
    var stock_limit_alert: Int,
    var subcategory: String,
    var total: Int,
    var total_number_review: Int,
    var total_rate: Int,
    var total_with_currency: String?,
    var trending: Boolean,
    var updated_by: String,
    var unit_value: String,
    var unit: String
): Parcelable