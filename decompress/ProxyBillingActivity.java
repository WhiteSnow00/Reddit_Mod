// 
// Decompiled by Procyon v0.6.0
// 

package com.android.billingclient.api;

import android.os.BaseBundle;
import android.content.Context;
import android.os.Parcelable;
import android.content.IntentSender$SendIntentException;
import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.a;
import android.content.Intent;
import android.os.ResultReceiver;
import android.app.Activity;

public class ProxyBillingActivity extends Activity
{
    public ResultReceiver f;
    public boolean g;
    
    public final Intent a() {
        final Intent intent = new Intent("com.android.vending.billing.PURCHASES_UPDATED");
        intent.setPackage(((Context)this).getApplicationContext().getPackageName());
        return intent;
    }
    
    public final void onActivityResult(int n, final int n2, final Intent intent) {
        super.onActivityResult(n, n2, intent);
        if (n == 100) {
            final int a = com.google.android.gms.internal.play_billing.a.c(intent, "ProxyBillingActivity").a;
            Label_0101: {
                if ((n = n2) == -1) {
                    if (a == 0) {
                        n = 0;
                        break Label_0101;
                    }
                    n = -1;
                }
                final StringBuilder sb = new StringBuilder(85);
                sb.append("Activity finished with resultCode ");
                sb.append(n);
                sb.append(" and billing's responseCode: ");
                sb.append(a);
                com.google.android.gms.internal.play_billing.a.f("ProxyBillingActivity", sb.toString());
                n = a;
            }
            final ResultReceiver f = this.f;
            if (f != null) {
                Bundle extras;
                if (intent == null) {
                    extras = null;
                }
                else {
                    extras = intent.getExtras();
                }
                f.send(n, extras);
            }
            else {
                final Intent a2 = this.a();
                if (intent != null) {
                    if (intent.getExtras() != null) {
                        a2.putExtras(intent.getExtras());
                    }
                    else {
                        com.google.android.gms.internal.play_billing.a.f("ProxyBillingActivity", "Got null bundle!");
                        a2.putExtra("RESPONSE_CODE", 6);
                        a2.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    }
                }
                ((Context)this).sendBroadcast(a2);
            }
        }
        else {
            final StringBuilder sb2 = new StringBuilder(69);
            sb2.append("Got onActivityResult with wrong requestCode: ");
            sb2.append(n);
            sb2.append("; skipping...");
            a.f("ProxyBillingActivity", sb2.toString());
        }
        this.g = false;
        this.finish();
    }
    
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            a.e("ProxyBillingActivity", "Launching Play Store billing flow");
            PendingIntent pendingIntent;
            if (this.getIntent().hasExtra("BUY_INTENT")) {
                pendingIntent = (PendingIntent)this.getIntent().getParcelableExtra("BUY_INTENT");
            }
            else if (this.getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
                pendingIntent = (PendingIntent)this.getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                this.f = (ResultReceiver)this.getIntent().getParcelableExtra("result_receiver");
            }
            else {
                pendingIntent = null;
            }
            try {
                this.g = true;
                this.startIntentSenderForResult(pendingIntent.getIntentSender(), 100, new Intent(), 0, 0, 0);
                return;
            }
            catch (final IntentSender$SendIntentException ex) {
                final String value = String.valueOf(ex);
                final StringBuilder sb = new StringBuilder(value.length() + 53);
                sb.append("Got exception while trying to start a purchase flow: ");
                sb.append(value);
                a.f("ProxyBillingActivity", sb.toString());
                final ResultReceiver f = this.f;
                if (f != null) {
                    f.send(6, (Bundle)null);
                }
                else {
                    final Intent a = this.a();
                    a.putExtra("RESPONSE_CODE", 6);
                    a.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    ((Context)this).sendBroadcast(a);
                }
                this.g = false;
                this.finish();
                return;
            }
        }
        a.e("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
        this.g = ((BaseBundle)bundle).getBoolean("send_cancelled_broadcast_if_finished", false);
        if (((BaseBundle)bundle).containsKey("result_receiver")) {
            this.f = (ResultReceiver)bundle.getParcelable("result_receiver");
        }
    }
    
    public final void onDestroy() {
        super.onDestroy();
        if (!this.isFinishing()) {
            return;
        }
        if (!this.g) {
            return;
        }
        final Intent a = this.a();
        a.putExtra("RESPONSE_CODE", 1);
        a.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
        ((Context)this).sendBroadcast(a);
    }
    
    public final void onSaveInstanceState(final Bundle bundle) {
        final ResultReceiver f = this.f;
        if (f != null) {
            bundle.putParcelable("result_receiver", (Parcelable)f);
        }
        ((BaseBundle)bundle).putBoolean("send_cancelled_broadcast_if_finished", this.g);
    }
}
