// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.drm;

import java.util.Collections;
import u10.o;
import com.google.common.collect.ImmutableMap;
import java.util.UUID;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import java.io.Closeable;
import java.util.List;
import java.io.ByteArrayOutputStream;
import bd.c0;
import android.net.Uri;
import com.google.android.exoplayer2.upstream.b$a;
import com.google.android.exoplayer2.upstream.a;
import zc.r;
import java.util.Map;
import ah0.b;
import android.text.TextUtils;
import com.google.android.exoplayer2.upstream.e$a;
import java.util.HashMap;
import com.google.android.exoplayer2.upstream.HttpDataSource$a;

public final class i implements j
{
    public final HttpDataSource$a a;
    public final String b;
    public final boolean c;
    public final HashMap d;
    
    public i(final String b, final boolean c, final e$a a) {
        ah0.b.C(!c || !TextUtils.isEmpty((CharSequence)b));
        this.a = (HttpDataSource$a)a;
        this.b = b;
        this.c = c;
        this.d = new HashMap();
    }
    
    public static byte[] b(final HttpDataSource$a httpDataSource$a, String s, byte[] a, final Map<String, String> e) throws MediaDrmCallbackException {
        final r r = new r((a)httpDataSource$a.a());
        final b$a b$a = new b$a();
        b$a.a = Uri.parse(s);
        b$a.e = e;
        b$a.c = 2;
        b$a.d = a;
        b$a.i = 1;
        a = (byte[])(Object)b$a.a();
        int n = 0;
        Object a2 = a;
        try {
            zc.i i;
            while (true) {
                i = new zc.i((a)r, (com.google.android.exoplayer2.upstream.b)a2);
                Label_0127: {
                    try {
                        try {
                            final int a3 = c0.a;
                            final byte[] array = new byte[4096];
                            s = (String)new ByteArrayOutputStream();
                            while (true) {
                                final int read = i.read(array);
                                if (read == -1) {
                                    break Label_0127;
                                }
                                ((ByteArrayOutputStream)s).write(array, 0, read);
                            }
                        }
                        finally {}
                    }
                    catch (final HttpDataSource$InvalidResponseCodeException ex) {
                        final int responseCode = ex.responseCode;
                        final boolean b = (responseCode == 307 || responseCode == 308) && n < 5;
                        final String s2 = null;
                        if (!b) {
                            s = s2;
                        }
                        else {
                            final Map headerFields = ex.headerFields;
                            s = s2;
                            if (headerFields != null) {
                                final List list = headerFields.get("Location");
                                s = s2;
                                if (list != null) {
                                    s = s2;
                                    if (!list.isEmpty()) {
                                        s = (String)list.get(0);
                                    }
                                }
                            }
                        }
                        if (s != null) {
                            ++n;
                            final b$a b$a2 = new b$a((com.google.android.exoplayer2.upstream.b)httpDataSource$a);
                            b$a2.a = Uri.parse(s);
                            a2 = b$a2.a();
                            c0.g((Closeable)i);
                            continue;
                        }
                        throw ex;
                        final byte[] byteArray = ((ByteArrayOutputStream)s).toByteArray();
                        c0.g((Closeable)i);
                        return byteArray;
                    }
                }
                break;
            }
            c0.g((Closeable)i);
        }
        catch (final Exception ex2) {
            final Uri c = r.c;
            c.getClass();
            throw new MediaDrmCallbackException((com.google.android.exoplayer2.upstream.b)(Object)a, c, r.e(), r.b, (Throwable)ex2);
        }
    }
    
    public final byte[] a(final UUID uuid, final g$a g$a) throws MediaDrmCallbackException {
        final String b = g$a.b;
        String b2 = null;
        Label_0028: {
            if (!this.c) {
                b2 = b;
                if (!TextUtils.isEmpty((CharSequence)b)) {
                    break Label_0028;
                }
            }
            b2 = this.b;
        }
        if (!TextUtils.isEmpty((CharSequence)b2)) {
            final HashMap<String, String> hashMap = new HashMap<String, String>();
            final UUID e = wa.b.e;
            String s;
            if (e.equals(uuid)) {
                s = "text/xml";
            }
            else if (wa.b.c.equals(uuid)) {
                s = "application/json";
            }
            else {
                s = "application/octet-stream";
            }
            hashMap.put("Content-Type", s);
            if (e.equals(uuid)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (this.d) {
                hashMap.putAll(this.d);
                monitorexit(this.d);
                return b(this.a, b2, g$a.a, hashMap);
            }
        }
        final b$a b$a = new b$a();
        b$a.a = Uri.EMPTY;
        throw new MediaDrmCallbackException(b$a.a(), Uri.EMPTY, (Map)ImmutableMap.of(), 0L, (Throwable)new IllegalStateException("No license URL"));
    }
    
    public final byte[] c(final g$d g$d) throws MediaDrmCallbackException {
        final String b = g$d.b;
        final String o = c0.o(g$d.a);
        return b(this.a, xm2.a.a(o.length() + u10.o.e(b, 15), b, "&signedRequest=", o), null, Collections.emptyMap());
    }
}
