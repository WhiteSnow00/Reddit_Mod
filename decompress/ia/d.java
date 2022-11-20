// 
// Decompiled by Procyon v0.6.0
// 

package ia;

import ja.h;
import com.google.android.datatransport.runtime.EventInternal$a;
import java.util.Iterator;
import java.net.ConnectException;
import java.net.UnknownHostException;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import ja.j;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import java.net.HttpURLConnection;
import ja.g;
import com.google.android.datatransport.runtime.backends.BackendResponse$Status;
import com.google.android.datatransport.cct.internal.c;
import android.util.Log;
import java.nio.charset.Charset;
import com.google.android.datatransport.cct.internal.ClientInfo$ClientType;
import com.google.android.datatransport.cct.internal.QosTier;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import android.net.NetworkInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.telephony.TelephonyManager;
import java.util.Locale;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType;
import java.util.TimeZone;
import java.util.Calendar;
import android.os.Build;
import android.os.Build$VERSION;
import com.google.android.datatransport.runtime.EventInternal;
import java.net.MalformedURLException;
import ci.b;
import di.e;
import ua.a;
import java.net.URL;
import android.content.Context;
import android.net.ConnectivityManager;
import la.k;

public final class d implements k
{
    public final di.d a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final a e;
    public final a f;
    public final int g;
    
    public d(final Context c, final a f, final a e) {
        final e e2 = new e();
        com.google.android.datatransport.cct.internal.a.a.configure((b<?>)e2);
        e2.d = true;
        this.a = new di.d(e2);
        this.c = c;
        this.b = (ConnectivityManager)c.getSystemService("connectivity");
        this.d = c(ia.a.c);
        this.e = e;
        this.f = f;
        this.g = 130000;
    }
    
    public static URL c(final String s) {
        try {
            return new URL(s);
        }
        catch (final MalformedURLException ex) {
            throw new IllegalArgumentException(b.l("Invalid url: ", s), ex);
        }
    }
    
    public final com.google.android.datatransport.runtime.a a(EventInternal builder) {
        final NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        builder = (EventInternal)builder.toBuilder();
        final int sdk_INT = Build$VERSION.SDK_INT;
        builder.getClass();
        final Map<String, String> f = ((com.google.android.datatransport.runtime.a.a)builder).f;
        if (f == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        f.put("sdk-version", String.valueOf(sdk_INT));
        ((EventInternal$a)builder).a("model", Build.MODEL);
        ((EventInternal$a)builder).a("hardware", Build.HARDWARE);
        ((EventInternal$a)builder).a("device", Build.DEVICE);
        ((EventInternal$a)builder).a("product", Build.PRODUCT);
        ((EventInternal$a)builder).a("os-uild", Build.ID);
        ((EventInternal$a)builder).a("manufacturer", Build.MANUFACTURER);
        ((EventInternal$a)builder).a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        final long n = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        final com.google.android.datatransport.runtime.a.a a = (com.google.android.datatransport.runtime.a.a)builder;
        final Map<String, String> f2 = a.f;
        if (f2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        f2.put("tz-offset", String.valueOf(n));
        int n2;
        if (activeNetworkInfo == null) {
            n2 = NetworkConnectionInfo$NetworkType.NONE.getValue();
        }
        else {
            n2 = activeNetworkInfo.getType();
        }
        final Map<String, String> f3 = a.f;
        if (f3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        f3.put("net-type", String.valueOf(n2));
        final int n3 = -1;
        int n4;
        if (activeNetworkInfo == null) {
            n4 = NetworkConnectionInfo$MobileSubtype.UNKNOWN_MOBILE_SUBTYPE.getValue();
        }
        else {
            n4 = activeNetworkInfo.getSubtype();
            if (n4 == -1) {
                n4 = NetworkConnectionInfo$MobileSubtype.COMBINED.getValue();
            }
            else if (NetworkConnectionInfo$MobileSubtype.forNumber(n4) == null) {
                n4 = 0;
            }
        }
        final Map<String, String> f4 = a.f;
        if (f4 != null) {
            f4.put("mobile-subtype", String.valueOf(n4));
            ((EventInternal$a)builder).a("country", Locale.getDefault().getCountry());
            ((EventInternal$a)builder).a("locale", Locale.getDefault().getLanguage());
            ((EventInternal$a)builder).a("mcc_mnc", ((TelephonyManager)this.c.getSystemService("phone")).getSimOperator());
            final Context c = this.c;
            int versionCode;
            try {
                versionCode = c.getPackageManager().getPackageInfo(c.getPackageName(), 0).versionCode;
            }
            catch (final PackageManager$NameNotFoundException ex) {
                pa.a.b("CctTransportBackend", "Unable to find version code for package", (Exception)ex);
                versionCode = n3;
            }
            ((EventInternal$a)builder).a("application_build", Integer.toString(versionCode));
            return ((EventInternal$a)builder).b();
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }
    
    public final com.google.android.datatransport.runtime.backends.a b(la.a a) {
        final HashMap hashMap = new HashMap();
        for (final EventInternal eventInternal : a.a) {
            final String transportName = eventInternal.getTransportName();
            if (!hashMap.containsKey(transportName)) {
                final ArrayList<EventInternal> list = new ArrayList<EventInternal>();
                list.add(eventInternal);
                hashMap.put(transportName, list);
            }
            else {
                ((List<EventInternal>)hashMap.get(transportName)).add(eventInternal);
            }
        }
        final ArrayList<ja.e> list2 = new ArrayList<ja.e>();
        for (final Map.Entry<K, List> entry : hashMap.entrySet()) {
            final EventInternal eventInternal2 = entry.getValue().get(0);
            final ja.e.a a2 = new ja.e.a();
            a2.g = QosTier.DEFAULT;
            a2.a = this.f.a();
            a2.b = this.e.a();
            final com.google.android.datatransport.cct.internal.b.a a3 = new com.google.android.datatransport.cct.internal.b.a();
            a3.a = ClientInfo$ClientType.ANDROID_FIREBASE;
            final ja.b.a a4 = new ja.b.a();
            a4.a = eventInternal2.getInteger("sdk-version");
            a4.b = eventInternal2.get("model");
            a4.c = eventInternal2.get("hardware");
            a4.d = eventInternal2.get("device");
            a4.e = eventInternal2.get("product");
            a4.f = eventInternal2.get("os-uild");
            a4.g = eventInternal2.get("manufacturer");
            a4.h = eventInternal2.get("fingerprint");
            a4.j = eventInternal2.get("country");
            a4.i = eventInternal2.get("locale");
            a4.k = eventInternal2.get("mcc_mnc");
            a2.c = new com.google.android.datatransport.cct.internal.b(a3.a, new ja.b(a4.a, a4.b, a4.c, a4.d, a4.e, a4.f, a4.g, a4.h, a4.i, a4.j, a4.k, eventInternal2.get("application_build")));
            try {
                a2.d = Integer.parseInt((String)entry.getKey());
            }
            catch (final NumberFormatException ex) {
                a2.e = (String)entry.getKey();
            }
            final ArrayList<ja.d> f = new ArrayList<ja.d>();
            final Iterator iterator3 = entry.getValue().iterator();
            while (true) {
                final boolean hasNext = iterator3.hasNext();
                String s = "";
                if (hasNext) {
                    final EventInternal eventInternal3 = (EventInternal)iterator3.next();
                    final ka.e encodedPayload = eventInternal3.getEncodedPayload();
                    final ha.b a5 = encodedPayload.a;
                    ja.d.a a6;
                    if (a5.equals((Object)new ha.b("proto"))) {
                        final byte[] b = encodedPayload.b;
                        a6 = new ja.d.a();
                        a6.d = b;
                    }
                    else if (a5.equals((Object)new ha.b("json"))) {
                        final String e = new String(encodedPayload.b, Charset.forName("UTF-8"));
                        a6 = new ja.d.a();
                        a6.e = e;
                    }
                    else {
                        final String c = pa.a.c("CctTransportBackend");
                        if (Log.isLoggable(c, 5)) {
                            Log.w(c, String.format("Received event of unsupported encoding %s. Skipping...", a5));
                            continue;
                        }
                        continue;
                    }
                    a6.a = eventInternal3.getEventMillis();
                    a6.c = eventInternal3.getUptimeMillis();
                    a6.f = eventInternal3.getLong("tz-offset");
                    final c.a a7 = new c.a();
                    a7.a = NetworkConnectionInfo$NetworkType.forNumber(eventInternal3.getInteger("net-type"));
                    a6.g = new c(a7.a, NetworkConnectionInfo$MobileSubtype.forNumber(eventInternal3.getInteger("mobile-subtype")));
                    if (eventInternal3.getCode() != null) {
                        a6.b = eventInternal3.getCode();
                    }
                    String s2 = s;
                    if (a6.a == null) {
                        s2 = " eventTimeMs";
                    }
                    String l = s2;
                    if (a6.c == null) {
                        l = b.l(s2, " eventUptimeMs");
                    }
                    String i = l;
                    if (a6.f == null) {
                        i = b.l(l, " timezoneOffsetSeconds");
                    }
                    if (!i.isEmpty()) {
                        throw new IllegalStateException(b.l("Missing required properties:", i));
                    }
                    f.add(new ja.d(a6.a, a6.b, a6.c, a6.d, a6.e, a6.f, a6.g));
                }
                else {
                    a2.f = (List<h>)f;
                    if (a2.a == null) {
                        s = " requestTimeMs";
                    }
                    String j = s;
                    if (a2.b == null) {
                        j = b.l(s, " requestUptimeMs");
                    }
                    if (j.isEmpty()) {
                        list2.add(new ja.e(a2.a, a2.b, a2.c, a2.d, a2.e, a2.f, a2.g));
                        break;
                    }
                    throw new IllegalStateException(b.l("Missing required properties:", j));
                }
            }
        }
        final ja.c c2 = new ja.c(list2);
        URL url = this.d;
        final byte[] b2 = a.b;
        Label_1209: {
            if (b2 != null) {
                try {
                    final ia.a a8 = a.a(b2);
                    String b3 = a8.b;
                    if (b3 == null) {
                        b3 = null;
                    }
                    final String a9 = a8.a;
                    String s3 = b3;
                    if (a9 != null) {
                        url = c(a9);
                        s3 = b3;
                    }
                    break Label_1209;
                }
                catch (final IllegalArgumentException ex2) {
                    return new com.google.android.datatransport.runtime.backends.a(BackendResponse$Status.FATAL_ERROR, -1L);
                }
            }
            String s3 = null;
            try {
                final d.d$a d$a = new d.d$a(url, (g)c2, s3);
                final ia.b b4 = new ia.b(this, 0);
                int k = 5;
                d.d$a d$a2 = d$a;
                Object o2 = null;
                do {
                    final d d = (d)b4.g;
                    d.getClass();
                    final URL a10 = d$a2.a;
                    final String c3 = pa.a.c("CctTransportBackend");
                    if (Log.isLoggable(c3, 4)) {
                        Log.i(c3, String.format("Making request to: %s", a10));
                    }
                    final HttpURLConnection httpURLConnection = (HttpURLConnection)d$a2.a.openConnection();
                    httpURLConnection.setConnectTimeout(30000);
                    httpURLConnection.setReadTimeout(d.g);
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.7"));
                    httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                    httpURLConnection.setRequestProperty("Content-Type", "application/json");
                    httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                    final String c4 = d$a2.c;
                    if (c4 != null) {
                        httpURLConnection.setRequestProperty("X-Goog-Api-Key", c4);
                    }
                    Label_1936: {
                        Label_1912: {
                            Label_1906: {
                                try {
                                    a = (la.a)httpURLConnection.getOutputStream();
                                    try {
                                        Object inputStream = new GZIPOutputStream((OutputStream)a);
                                        try {
                                            d.a.a((Writer)new BufferedWriter(new OutputStreamWriter((OutputStream)inputStream)), (Object)d$a2.b);
                                            ((OutputStream)inputStream).close();
                                            if (a != null) {
                                                ((OutputStream)a).close();
                                            }
                                            final int responseCode = httpURLConnection.getResponseCode();
                                            a = (la.a)pa.a.c("CctTransportBackend");
                                            if (Log.isLoggable((String)a, 4)) {
                                                Log.i((String)a, String.format("Status Code: %d", responseCode));
                                            }
                                            pa.a.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                                            pa.a.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                                            Label_1819: {
                                                if (responseCode != 302 && responseCode != 301) {
                                                    if (responseCode != 307) {
                                                        if (responseCode != 200) {
                                                            a = (la.a)new d.d$b(responseCode, (URL)null, 0L);
                                                            break Label_1906;
                                                        }
                                                        inputStream = httpURLConnection.getInputStream();
                                                        try {
                                                            if ("gzip".equals(httpURLConnection.getHeaderField("Content-Encoding"))) {
                                                                a = (la.a)new GZIPInputStream((InputStream)inputStream);
                                                            }
                                                            else {
                                                                a = (la.a)inputStream;
                                                            }
                                                            try {
                                                                final Object o = new d.d$b(responseCode, (URL)null, j.a(new BufferedReader(new InputStreamReader((InputStream)a))).a);
                                                                if (a != null) {
                                                                    ((InputStream)a).close();
                                                                }
                                                                a = (la.a)o;
                                                                if (inputStream != null) {
                                                                    ((InputStream)inputStream).close();
                                                                    a = (la.a)o;
                                                                }
                                                                break Label_1819;
                                                            }
                                                            finally {
                                                                if (a != null) {
                                                                    try {
                                                                        ((InputStream)a).close();
                                                                    }
                                                                    finally {
                                                                        final Throwable t;
                                                                        ((Throwable)d$a2).addSuppressed(t);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            if (inputStream != null) {
                                                                try {
                                                                    ((InputStream)inputStream).close();
                                                                }
                                                                finally {
                                                                    ((Throwable)a).addSuppressed((Throwable)d$a2);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                final String headerField = httpURLConnection.getHeaderField("Location");
                                                a = new(ia.d.d$b.class)();
                                                inputStream = new URL(headerField);
                                                new d.d$b(responseCode, (URL)inputStream, 0L);
                                            }
                                        }
                                        finally {
                                            try {
                                                ((OutputStream)inputStream).close();
                                            }
                                            finally {
                                                final Throwable t2;
                                                final Throwable t3;
                                                t2.addSuppressed(t3);
                                            }
                                        }
                                    }
                                    finally {
                                        if (a != null) {
                                            try {
                                                ((OutputStream)a).close();
                                            }
                                            finally {
                                                final Throwable t4;
                                                t4.addSuppressed((Throwable)a);
                                            }
                                        }
                                    }
                                }
                                catch (final IOException ex3) {}
                                catch (final EncodingException ex3) {}
                                catch (final UnknownHostException ex4) {
                                    break Label_1912;
                                }
                                catch (final ConnectException ex4) {
                                    break Label_1912;
                                }
                                final IOException ex3;
                                pa.a.b("CctTransportBackend", "Couldn't encode request, returning with 400", ex3);
                                a = (la.a)new d.d$b(400, (URL)null, 0L);
                            }
                            o2 = a;
                            break Label_1936;
                        }
                        final UnknownHostException ex4;
                        pa.a.b("CctTransportBackend", "Couldn't open connection, returning with 500", ex4);
                        o2 = new d.d$b(500, (URL)null, 0L);
                    }
                    final URL b5 = ((d.d$b)o2).b;
                    d.d$a d$a3;
                    if (b5 != null) {
                        pa.a.a(b5, "CctTransportBackend", "Following redirect to: %s");
                        d$a3 = new d.d$a(((d.d$b)o2).b, d$a2.b, d$a2.c);
                    }
                    else {
                        d$a3 = null;
                    }
                    if (d$a3 == null) {
                        break;
                    }
                    --k;
                    d$a2 = d$a3;
                } while (k >= 1);
                final int a11 = ((d.d$b)o2).a;
                if (a11 == 200) {
                    return new com.google.android.datatransport.runtime.backends.a(BackendResponse$Status.OK, ((d.d$b)o2).c);
                }
                if (a11 >= 500 || a11 == 404) {
                    return new com.google.android.datatransport.runtime.backends.a(BackendResponse$Status.TRANSIENT_ERROR, -1L);
                }
                if (a11 == 400) {
                    return new com.google.android.datatransport.runtime.backends.a(BackendResponse$Status.INVALID_PAYLOAD, -1L);
                }
                return new com.google.android.datatransport.runtime.backends.a(BackendResponse$Status.FATAL_ERROR, -1L);
            }
            catch (final IOException ex5) {
                pa.a.b("CctTransportBackend", "Could not make request to the backend", ex5);
                return new com.google.android.datatransport.runtime.backends.a(BackendResponse$Status.TRANSIENT_ERROR, -1L);
            }
        }
    }
}
