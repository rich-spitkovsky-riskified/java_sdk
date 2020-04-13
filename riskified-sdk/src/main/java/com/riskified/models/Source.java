package com.riskified.models;

import com.google.gson.annotations.SerializedName;

public enum Source {

    @SerializedName("desktop_web")
    desktopWeb,
    @SerializedName("mobile_web")
    mobileWeb,
    @SerializedName("mobile_app")
    mobileApp,
    @SerializedName("web")
    web,
    @SerializedName("chat")
    chat,
    @SerializedName("third_party")
    thirdParty,
    @SerializedName("phone")
    phone,
    @SerializedName("in_store")
    inStore,
    @SerializedName("shopify_draft_order")
    shopifyDraftOrder,
    @SerializedName("unknown")
    unknown,
    @SerializedName("other")
    other,
    @SerializedName("mobile_app_ios")
    mobileAppIos,
    @SerializedName("mobile_app_android")
    mobileAppAndroid

}
