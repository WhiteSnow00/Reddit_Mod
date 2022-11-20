// 
// Decompiled by Procyon v0.6.0
// 

package com.android.billingclient.api;

import com.google.gson.JsonIOException;
import java.util.IllegalFormatException;
import xm2.a;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import android.os.Process;
import jj.j;

public final class l implements j
{
    public String f;
    
    public l() {
    }
    
    public l(final String f) {
        this.f = f;
    }
    
    public l(String concat, int myUid) {
        if (myUid != 2) {
            myUid = Process.myUid();
            final int myPid = Process.myPid();
            final StringBuilder sb = new StringBuilder(39);
            sb.append("UID: [");
            sb.append(myUid);
            sb.append("]  PID: [");
            sb.append(myPid);
            sb.append("] ");
            final String value = String.valueOf(sb.toString());
            if (concat.length() != 0) {
                concat = value.concat(concat);
            }
            else {
                concat = new String(value);
            }
            this.f = concat;
            return;
        }
        this.f = concat;
    }
    
    public static String f(final String s, final String s2, final Object... array) {
        String s3 = s2;
        if (array.length > 0) {
            try {
                s3 = String.format(Locale.US, s2, array);
            }
            catch (final IllegalFormatException ex) {
                final String value = String.valueOf(s2);
                String concat;
                if (value.length() != 0) {
                    concat = "Unable to format ".concat(value);
                }
                else {
                    concat = new String("Unable to format ");
                }
                Log.e("PlayCore", concat, (Throwable)ex);
                final String join = TextUtils.join((CharSequence)", ", array);
                s3 = a.b(new StringBuilder(String.valueOf(s2).length() + 3 + String.valueOf(join).length()), s2, " [", join, "]");
            }
        }
        return a.r(new StringBuilder(String.valueOf(s).length() + 3 + String.valueOf(s3).length()), s, " : ", s3);
    }
    
    public Object E() {
        throw new JsonIOException(this.f);
    }
    
    public void a(final String s, final Object... array) {
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", f(this.f, s, array));
        }
    }
    
    public void b(final String s, final Object... array) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", f(this.f, s, array));
        }
    }
    
    public void c(final Exception ex, final String s, final Object... array) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", f(this.f, s, array), (Throwable)ex);
        }
    }
    
    public void d(final String s, final Object... array) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", f(this.f, s, array));
        }
    }
    
    public void e(final String s, final Object... array) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", f(this.f, s, array));
        }
    }
}
