// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer;

import com.bytedance.covode.number.Covode;

public class AFVersionDeclaration
{
    public static String googleSdkIdentifier;
    
    static {
        Covode.recordClassIndex(2543);
    }
    
    public static void init() {
        AFVersionDeclaration.googleSdkIdentifier = "!SDK-VERSION-STRING!:com.appsflyer:af-android-sdk:6.4.0";
    }
}
