// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.auth.api.signin.internal;

import android.os.BaseBundle;
import androidx.activity.ComponentActivity;
import android.app.Activity;
import java.util.Set;
import ld.g;
import com.google.android.gms.common.api.c;
import x4.b;
import android.content.ActivityNotFoundException;
import android.util.Log;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import w4.a$a;
import android.content.Context;
import ld.n;
import com.google.android.gms.auth.api.signin.SignInAccount;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import android.view.accessibility.AccessibilityEvent;
import android.content.Intent;
import com.google.android.gms.common.annotation.KeepName;
import androidx.fragment.app.r;

@KeepName
public class SignInHubActivity extends r
{
    public static boolean k;
    public boolean f;
    public SignInConfiguration g;
    public boolean h;
    public int i;
    public Intent j;
    
    public SignInHubActivity() {
        this.f = false;
    }
    
    public final boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        return true;
    }
    
    public final void g0(final int n) {
        final Status status = new Status(n, (String)null);
        final Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", (Parcelable)status);
        ((Activity)this).setResult(0, intent);
        ((Activity)this).finish();
        SignInHubActivity.k = false;
    }
    
    public final void onActivityResult(int n, int intExtra, final Intent j) {
        if (this.f) {
            return;
        }
        ((Activity)this).setResult(0);
        if (n == 40962) {
            if (j != null) {
                final SignInAccount signInAccount = (SignInAccount)j.getParcelableExtra("signInAccount");
                if (signInAccount != null) {
                    final GoogleSignInAccount g = signInAccount.g;
                    if (g != null) {
                        final n b = n.b((Context)this);
                        final GoogleSignInOptions g2 = this.g.g;
                        synchronized (b) {
                            b.a.d(g, g2);
                            monitorexit(b);
                            j.removeExtra("signInAccount");
                            j.putExtra("googleSignInAccount", (Parcelable)g);
                            this.h = true;
                            this.i = intExtra;
                            this.j = j;
                            this.getSupportLoaderManager().b(0, (a$a)new a());
                            SignInHubActivity.k = false;
                            return;
                        }
                    }
                }
                if (j.hasExtra("errorCode")) {
                    intExtra = j.getIntExtra("errorCode", 8);
                    if ((n = intExtra) == 13) {
                        n = 12501;
                    }
                    this.g0(n);
                    return;
                }
            }
            this.g0(8);
        }
    }
    
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Intent intent = ((Activity)this).getIntent();
        final String action = intent.getAction();
        action.getClass();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            this.g0(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            final String value = String.valueOf(intent.getAction());
            String concat;
            if (value.length() != 0) {
                concat = "Unknown action: ".concat(value);
            }
            else {
                concat = new String("Unknown action: ");
            }
            Log.e("AuthSignInClient", concat);
            ((Activity)this).finish();
            return;
        }
        final Bundle bundleExtra = intent.getBundleExtra("config");
        bundleExtra.getClass();
        final SignInConfiguration g = (SignInConfiguration)bundleExtra.getParcelable("config");
        if (g == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            ((Activity)this).setResult(0);
            ((Activity)this).finish();
            return;
        }
        this.g = g;
        if (bundle == null) {
            if (SignInHubActivity.k) {
                ((Activity)this).setResult(0);
                this.g0(12502);
                return;
            }
            SignInHubActivity.k = true;
            final Intent intent2 = new Intent(action);
            if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                intent2.setPackage("com.google.android.gms");
            }
            else {
                intent2.setPackage(((Context)this).getPackageName());
            }
            intent2.putExtra("config", (Parcelable)this.g);
            try {
                ((ComponentActivity)this).startActivityForResult(intent2, 40962);
                return;
            }
            catch (final ActivityNotFoundException ex) {
                this.f = true;
                Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                this.g0(17);
                return;
            }
        }
        final boolean boolean1 = ((BaseBundle)bundle).getBoolean("signingInGoogleApiClients");
        this.h = boolean1;
        if (boolean1) {
            this.i = ((BaseBundle)bundle).getInt("signInResultCode");
            final Intent j = (Intent)bundle.getParcelable("signInResultData");
            j.getClass();
            this.j = j;
            this.getSupportLoaderManager().b(0, (a$a)new a());
            SignInHubActivity.k = false;
        }
    }
    
    public final void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ((BaseBundle)bundle).putBoolean("signingInGoogleApiClients", this.h);
        if (this.h) {
            ((BaseBundle)bundle).putInt("signInResultCode", this.i);
            bundle.putParcelable("signInResultData", (Parcelable)this.j);
        }
    }
    
    public final class a implements a$a<Void>
    {
        public final void M() {
        }
        
        public final b W() {
            final SignInHubActivity f = SignInHubActivity.this;
            final Set f2 = c.f;
            synchronized (f2) {
                monitorexit(f2);
                return new g(f, f2);
            }
        }
    }
}
