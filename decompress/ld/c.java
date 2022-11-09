// 
// Decompiled by Procyon v0.6.0
// 

package ld;

import android.accounts.Account;
import java.util.Iterator;
import android.net.Uri;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;
import com.google.android.gms.common.api.Scope;
import org.json.JSONArray;
import org.json.JSONObject;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import org.json.JSONException;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import yd.a;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

public final class c
{
    public static final ReentrantLock c;
    public static c d;
    public final ReentrantLock a;
    public final SharedPreferences b;
    
    static {
        c = new ReentrantLock();
    }
    
    public c(final Context context) {
        this.a = new ReentrantLock();
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }
    
    public static c a(final Context context) {
        a.S0((Object)context);
        final ReentrantLock c = ld.c.c;
        c.lock();
        try {
            if (ld.c.d == null) {
                ld.c.d = new c(context.getApplicationContext());
            }
            final c d = ld.c.d;
            c.unlock();
            return d;
        }
        finally {
            ld.c.c.unlock();
        }
    }
    
    public static final String g(final String s, final String s2) {
        return a.i(new StringBuilder(s.length() + 1 + String.valueOf(s2).length()), s, ":", s2);
    }
    
    public final GoogleSignInAccount b() {
        final String e = this.e("defaultGoogleSignInAccount");
        Label_0040: {
            if (TextUtils.isEmpty((CharSequence)e)) {
                break Label_0040;
            }
            final String e2 = this.e(g("googleSignInAccount", e));
            if (e2 == null) {
                break Label_0040;
            }
            try {
                return GoogleSignInAccount.j(e2);
                j = null;
                return j;
            }
            catch (final JSONException ex) {
                return null;
            }
        }
    }
    
    public final GoogleSignInOptions c() {
        final String e = this.e("defaultGoogleSignInAccount");
        final boolean empty = TextUtils.isEmpty((CharSequence)e);
        final GoogleSignInOptions googleSignInOptions = null;
        if (empty) {
            return googleSignInOptions;
        }
        final String e2 = this.e(g("googleSignInOptions", e));
        GoogleSignInOptions f = googleSignInOptions;
        if (e2 == null) {
            return f;
        }
        try {
            f = GoogleSignInOptions.f(e2);
            return f;
        }
        catch (final JSONException ex) {
            f = googleSignInOptions;
            return f;
        }
    }
    
    public final void d(final GoogleSignInAccount googleSignInAccount, final GoogleSignInOptions googleSignInOptions) {
        yd.a.S0((Object)googleSignInOptions);
        this.f("defaultGoogleSignInAccount", googleSignInAccount.n);
        final String n = googleSignInAccount.n;
        final String g = g("googleSignInAccount", n);
        final JSONObject jsonObject = new JSONObject();
        try {
            final String g2 = googleSignInAccount.g;
            if (g2 != null) {
                jsonObject.put("id", (Object)g2);
            }
            final String h = googleSignInAccount.h;
            if (h != null) {
                jsonObject.put("tokenId", (Object)h);
            }
            final String i = googleSignInAccount.i;
            if (i != null) {
                jsonObject.put("email", (Object)i);
            }
            final String j = googleSignInAccount.j;
            if (j != null) {
                jsonObject.put("displayName", (Object)j);
            }
            final String p2 = googleSignInAccount.p;
            if (p2 != null) {
                jsonObject.put("givenName", (Object)p2);
            }
            final String q = googleSignInAccount.q;
            if (q != null) {
                jsonObject.put("familyName", (Object)q);
            }
            final Uri k = googleSignInAccount.k;
            if (k != null) {
                jsonObject.put("photoUrl", (Object)k.toString());
            }
            final String l = googleSignInAccount.l;
            if (l != null) {
                jsonObject.put("serverAuthCode", (Object)l);
            }
            jsonObject.put("expirationTime", googleSignInAccount.m);
            jsonObject.put("obfuscatedIdentifier", (Object)googleSignInAccount.n);
            final JSONArray jsonArray = new JSONArray();
            final List o = googleSignInAccount.o;
            final Scope[] array = o.toArray(new Scope[o.size()]);
            Arrays.sort(array, kd.c.f);
            for (int length = array.length, n2 = 0; n2 < length; ++n2) {
                jsonArray.put((Object)array[n2].g);
            }
            jsonObject.put("grantedScopes", (Object)jsonArray);
            jsonObject.remove("serverAuthCode");
            this.f(g, jsonObject.toString());
            final String g3 = g("googleSignInOptions", n);
            final JSONObject jsonObject2 = new JSONObject();
            try {
                final JSONArray jsonArray2 = new JSONArray();
                Collections.sort((List<Object>)googleSignInOptions.g, (Comparator<? super Object>)GoogleSignInOptions.v);
                final Iterator iterator = googleSignInOptions.g.iterator();
                while (iterator.hasNext()) {
                    jsonArray2.put((Object)((Scope)iterator.next()).g);
                }
                jsonObject2.put("scopes", (Object)jsonArray2);
                final Account h2 = googleSignInOptions.h;
                if (h2 != null) {
                    jsonObject2.put("accountName", (Object)h2.name);
                }
                jsonObject2.put("idTokenRequested", googleSignInOptions.i);
                jsonObject2.put("forceCodeForRefreshToken", googleSignInOptions.k);
                jsonObject2.put("serverAuthRequested", googleSignInOptions.j);
                if (!TextUtils.isEmpty((CharSequence)googleSignInOptions.l)) {
                    jsonObject2.put("serverClientId", (Object)googleSignInOptions.l);
                }
                if (!TextUtils.isEmpty((CharSequence)googleSignInOptions.m)) {
                    jsonObject2.put("hostedDomain", (Object)googleSignInOptions.m);
                }
                this.f(g3, jsonObject2.toString());
            }
            catch (final JSONException ex) {
                throw new RuntimeException((Throwable)ex);
            }
        }
        catch (final JSONException ex2) {
            throw new RuntimeException((Throwable)ex2);
        }
    }
    
    public final String e(String string) {
        this.a.lock();
        try {
            string = this.b.getString(string, (String)null);
            return string;
        }
        finally {
            this.a.unlock();
        }
    }
    
    public final void f(final String s, final String s2) {
        this.a.lock();
        try {
            this.b.edit().putString(s, s2).apply();
        }
        finally {
            this.a.unlock();
        }
    }
}
