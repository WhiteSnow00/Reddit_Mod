// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.ads.identifier;

import java.net.HttpURLConnection;
import java.io.IOException;
import android.util.Log;
import java.net.URLConnection;
import java.net.URL;

public final class zzc
{
    public static final void zza(final String s) {
        try {
            Object message = new URL(s);
            message = ((URL)message).openConnection();
            try {
                final int responseCode = ((HttpURLConnection)message).getResponseCode();
                if (responseCode < 200 || responseCode >= 300) {
                    final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 65);
                    sb.append("Received non-success response code ");
                    sb.append(responseCode);
                    sb.append(" from pinging URL: ");
                    sb.append(s);
                    Log.w("HttpUrlPinger", sb.toString());
                }
            }
            finally {
                ((HttpURLConnection)message).disconnect();
            }
        }
        catch (final RuntimeException message) {}
        catch (final IOException ex) {
            final Object message;
            final String message2 = ((Throwable)message).getMessage();
            final StringBuilder sb2 = new StringBuilder(String.valueOf(s).length() + 27 + String.valueOf(message2).length());
            sb2.append("Error while pinging URL: ");
            sb2.append(s);
            sb2.append(". ");
            sb2.append(message2);
            Log.w("HttpUrlPinger", sb2.toString(), (Throwable)message);
        }
        catch (final IndexOutOfBoundsException ex2) {
            final Object message = ex2.getMessage();
            final StringBuilder sb3 = new StringBuilder(String.valueOf(s).length() + 32 + String.valueOf(message).length());
            sb3.append("Error while parsing ping URL: ");
            sb3.append(s);
            sb3.append(". ");
            sb3.append((String)message);
            Log.w("HttpUrlPinger", sb3.toString(), (Throwable)ex2);
        }
    }
}
