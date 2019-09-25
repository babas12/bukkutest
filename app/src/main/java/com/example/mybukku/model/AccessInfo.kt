package com.example.mybukku.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class AccessInfo(

	@field:SerializedName("accessViewStatus")
	val accessViewStatus: String? = null,

	@field:SerializedName("country")
	val country: String? = null,

	@field:SerializedName("viewability")
	val viewability: String? = null,

	@field:SerializedName("pdf")
	val pdf: Pdf? = null,

	@field:SerializedName("webReaderLink")
	val webReaderLink: String? = null,

	@field:SerializedName("epub")
	val epub: Epub? = null,

	@field:SerializedName("publicDomain")
	val publicDomain: Boolean? = null,

	@field:SerializedName("quoteSharingAllowed")
	val quoteSharingAllowed: Boolean? = null,

	@field:SerializedName("embeddable")
	val embeddable: Boolean? = null,

	@field:SerializedName("textToSpeechPermission")
	val textToSpeechPermission: String? = null
) : Parcelable