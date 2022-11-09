// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.api;

import android.content.IntentSender$SendIntentException;
import android.content.Intent;
import yd.a;
import android.app.Activity;
import android.app.PendingIntent;

public class ResolvableApiException extends ApiException
{
    public ResolvableApiException(final Status status) {
        super(status);
    }
    
    public PendingIntent getResolution() {
        return this.getStatus().i;
    }
    
    public void startResolutionForResult(final Activity activity, final int n) throws IntentSender$SendIntentException {
        final PendingIntent i = this.getStatus().i;
        if (i != null) {
            a.S0((Object)i);
            activity.startIntentSenderForResult(i.getIntentSender(), n, (Intent)null, 0, 0, 0);
        }
    }
}
