// 
// Decompiled by Procyon v0.6.0
// 

package com.android.billingclient.api;

public final class z
{
    public static final k a;
    public static final k b;
    public static final k c;
    public static final k d;
    public static final k e;
    public static final k f;
    public static final k g;
    public static final k h;
    public static final k i;
    public static final k j;
    public static final k k;
    public static final k l;
    public static final k m;
    public static final k n;
    public static final k o;
    
    static {
        final k.a a2 = com.android.billingclient.api.k.a();
        a2.a = 3;
        a2.b = "Google Play In-app Billing API version is less than 3";
        a = a2.a();
        final k.a a3 = com.android.billingclient.api.k.a();
        a3.a = 3;
        a3.b = "Google Play In-app Billing API version is less than 9";
        b = a3.a();
        final k.a a4 = com.android.billingclient.api.k.a();
        a4.a = 3;
        a4.b = "Billing service unavailable on device.";
        c = a4.a();
        final k.a a5 = com.android.billingclient.api.k.a();
        a5.a = 5;
        a5.b = "Client is already in the process of connecting to billing service.";
        d = a5.a();
        final k.a a6 = com.android.billingclient.api.k.a();
        a6.a = 3;
        a6.b = "Play Store version installed does not support cross selling products.";
        a6.a();
        final k.a a7 = com.android.billingclient.api.k.a();
        a7.a = 5;
        a7.b = "The list of SKUs can't be empty.";
        e = a7.a();
        final k.a a8 = com.android.billingclient.api.k.a();
        a8.a = 5;
        a8.b = "SKU type can't be empty.";
        f = a8.a();
        final k.a a9 = com.android.billingclient.api.k.a();
        a9.a = -2;
        a9.b = "Client does not support extra params.";
        g = a9.a();
        final k.a a10 = com.android.billingclient.api.k.a();
        a10.a = -2;
        a10.b = "Client does not support the feature.";
        h = a10.a();
        final k.a a11 = com.android.billingclient.api.k.a();
        a11.a = -2;
        a11.b = "Client does not support get purchase history.";
        a11.a();
        final k.a a12 = com.android.billingclient.api.k.a();
        a12.a = 5;
        a12.b = "Invalid purchase token.";
        i = a12.a();
        final k.a a13 = com.android.billingclient.api.k.a();
        a13.a = 6;
        a13.b = "An internal error occurred.";
        j = a13.a();
        final k.a a14 = com.android.billingclient.api.k.a();
        a14.a = 4;
        a14.b = "Item is unavailable for purchase.";
        a14.a();
        final k.a a15 = com.android.billingclient.api.k.a();
        a15.a = 5;
        a15.b = "SKU can't be null.";
        a15.a();
        final k.a a16 = com.android.billingclient.api.k.a();
        a16.a = 5;
        a16.b = "SKU type can't be null.";
        a16.a();
        final k.a a17 = com.android.billingclient.api.k.a();
        a17.a = 0;
        k = a17.a();
        final k.a a18 = com.android.billingclient.api.k.a();
        a18.a = -1;
        a18.b = "Service connection is disconnected.";
        l = a18.a();
        final k.a a19 = com.android.billingclient.api.k.a();
        a19.a = -3;
        a19.b = "Timeout communicating with service.";
        m = a19.a();
        final k.a a20 = com.android.billingclient.api.k.a();
        a20.a = -2;
        a20.b = "Client doesn't support subscriptions.";
        n = a20.a();
        final k.a a21 = com.android.billingclient.api.k.a();
        a21.a = -2;
        a21.b = "Client doesn't support subscriptions update.";
        a21.a();
        final k.a a22 = com.android.billingclient.api.k.a();
        a22.a = -2;
        a22.b = "Client doesn't support multi-item purchases.";
        o = a22.a();
        final k.a a23 = com.android.billingclient.api.k.a();
        a23.a = 5;
        a23.b = "Unknown feature";
        a23.a();
    }
}
