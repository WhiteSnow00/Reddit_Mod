// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android;

import sg2.e;
import java.util.concurrent.atomic.AtomicReference;
import android.util.Log;
import ni.v;
import kotlin.Metadata;
import com.google.firebase.messaging.FirebaseMessagingService;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004" }, d2 = { "Lcom/sendbird/android/SendBirdFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "sendbird_release" }, k = 1, mv = { 1, 4, 2 })
public final class SendBirdFirebaseMessagingService extends FirebaseMessagingService
{
    public final void d(final v v) {
        final StringBuilder sb = new StringBuilder();
        sb.append("++ onMessageReceived : ");
        sb.append(v);
        Log.d("SENDBIRD_PUSH", sb.toString());
        final AtomicReference a = SendBirdPushHelper.a;
        final StringBuilder r = a.r(">> SendBirdPushHelper::onMessageReceived(). remoteMessage : ");
        r.append(v.class.getName());
        ec2.a.a(r.toString());
    }
    
    public final void e(final String s) {
        e.f((Object)s, "s");
        final StringBuilder sb = new StringBuilder();
        sb.append("++ onNewToken : ");
        sb.append(s);
        Log.d("SENDBIRD_PUSH", sb.toString());
        final AtomicReference a = SendBirdPushHelper.a;
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("onNewToken: ");
        sb2.append(s);
        sb2.append(", handler : ");
        sb2.append((Object)null);
        ec2.a.a(sb2.toString());
    }
}
