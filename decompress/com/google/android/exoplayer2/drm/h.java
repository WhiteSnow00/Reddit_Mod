// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.drm;

import android.media.MediaDrm$KeyRequest;
import java.nio.charset.Charset;
import kb.i$a;
import android.text.TextUtils;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import xm2.a;
import u10.o;
import android.util.Log;
import bd.t;
import kb.i;
import java.util.HashMap;
import java.util.List;
import bb.f;
import xa.d0;
import android.media.MediaDrm$OnEventListener;
import android.media.MediaCryptoException;
import android.media.MediaCrypto;
import android.media.DeniedByServerException;
import android.media.NotProvisionedException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.media.MediaDrmException;
import android.media.MediaDrm$ProvisionRequest;
import java.util.Map;
import android.media.UnsupportedSchemeException;
import bd.c0;
import wa.b;
import android.media.MediaDrm;
import java.util.UUID;
import b5.k;

public final class h implements g
{
    public static final k d;
    public final UUID a;
    public final MediaDrm b;
    public int c;
    
    static {
        d = new k();
    }
    
    public h(final UUID a) throws UnsupportedSchemeException {
        a.getClass();
        UUID b = wa.b.b;
        ah0.b.D(b.equals(a) ^ true, "Use C.CLEARKEY_UUID instead");
        this.a = a;
        if (c0.a >= 27 || !wa.b.c.equals(a)) {
            b = a;
        }
        final MediaDrm b2 = new MediaDrm(b);
        this.b = b2;
        this.c = 1;
        if (wa.b.d.equals(a) && "ASUS_Z00AD".equals(c0.d)) {
            b2.setPropertyString("securityLevel", "L3");
        }
    }
    
    public final Map<String, String> a(final byte[] array) {
        return this.b.queryKeyStatus(array);
    }
    
    public final g$d b() {
        final MediaDrm$ProvisionRequest provisionRequest = this.b.getProvisionRequest();
        return new g$d(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }
    
    public final byte[] c() throws MediaDrmException {
        return this.b.openSession();
    }
    
    public final void d(final byte[] array, final byte[] array2) {
        this.b.restoreKeys(array, array2);
    }
    
    public final byte[] e(final byte[] array, final byte[] array2) throws NotProvisionedException, DeniedByServerException {
        byte[] c = array2;
        if (wa.b.c.equals(this.a)) {
            if (c0.a >= 27) {
                c = array2;
            }
            else {
                try {
                    final JSONObject jsonObject = new JSONObject(c0.o(array2));
                    final StringBuilder sb = new StringBuilder("{\"keys\":[");
                    final JSONArray jsonArray = jsonObject.getJSONArray("keys");
                    for (int i = 0; i < jsonArray.length(); ++i) {
                        if (i != 0) {
                            sb.append(",");
                        }
                        final JSONObject jsonObject2 = jsonArray.getJSONObject(i);
                        sb.append("{\"k\":\"");
                        sb.append(jsonObject2.getString("k").replace('-', '+').replace('_', '/'));
                        sb.append("\",\"kid\":\"");
                        sb.append(jsonObject2.getString("kid").replace('-', '+').replace('_', '/'));
                        sb.append("\",\"kty\":\"");
                        sb.append(jsonObject2.getString("kty"));
                        sb.append("\"}");
                    }
                    sb.append("]}");
                    c = c0.C(sb.toString());
                }
                catch (final JSONException ex) {
                    final String o = c0.o(array2);
                    String concat;
                    if (o.length() != 0) {
                        concat = "Failed to adjust response data: ".concat(o);
                    }
                    else {
                        concat = new String("Failed to adjust response data: ");
                    }
                    ah0.b.U("ClearKeyUtil", concat, (Throwable)ex);
                    c = array2;
                }
            }
        }
        return this.b.provideKeyResponse(array, c);
    }
    
    public final boolean f(final String s, byte[] array) {
        if (c0.a >= 31) {
            return h.h$a.a(this.b, s);
        }
        try {
            array = (byte[])(Object)new MediaCrypto(this.a, array);
            try {
                return ((MediaCrypto)(Object)array).requiresSecureDecoderComponent(s);
            }
            finally {
                ((MediaCrypto)(Object)array).release();
            }
        }
        catch (final MediaCryptoException ex) {
            return true;
        }
    }
    
    public final void g(final byte[] array) throws DeniedByServerException {
        this.b.provideProvisionResponse(array);
    }
    
    public final void h(final DefaultDrmSessionManager.c c) {
        this.b.setOnEventListener((MediaDrm$OnEventListener)new bb.g(this, c));
    }
    
    public final int i() {
        return 2;
    }
    
    public final void j(final byte[] array, final d0 d0) {
        if (c0.a >= 31) {
            h.h$a.b(this.b, array, d0);
        }
    }
    
    public final ab.b k(final byte[] array) throws MediaCryptoException {
        final int a = c0.a;
        final boolean b = a < 21 && wa.b.d.equals(this.a) && "L3".equals(this.b.getPropertyString("securityLevel"));
        UUID uuid2;
        final UUID uuid = uuid2 = this.a;
        if (a < 27) {
            uuid2 = uuid;
            if (wa.b.c.equals(uuid)) {
                uuid2 = wa.b.b;
            }
        }
        return (ab.b)new f(uuid2, array, b);
    }
    
    public final void l(final byte[] array) {
        this.b.closeSession(array);
    }
    
    public final g$a m(byte[] array, final List<b$b> list, final int n, final HashMap<String, String> hashMap) throws NotProvisionedException {
        final b$b b$b = null;
        b$b b$b2 = null;
        byte[] a3;
        String i2;
        if (list != null) {
            Label_0417: {
                if (!wa.b.d.equals(this.a)) {
                    b$b2 = list.get(0);
                }
                else {
                    Label_0296: {
                        if (c0.a >= 28 && list.size() > 1) {
                            final b$b b$b3 = list.get(0);
                            int i = 0;
                            int n2 = 0;
                            while (true) {
                                while (i < list.size()) {
                                    final b$b b$b4 = list.get(i);
                                    final byte[] j = b$b4.j;
                                    j.getClass();
                                    if (c0.a((Object)b$b4.i, (Object)b$b3.i) && c0.a((Object)b$b4.h, (Object)b$b3.h) && kb.i.b(j) != null) {
                                        n2 += j.length;
                                        ++i;
                                    }
                                    else {
                                        final boolean b = false;
                                        if (b) {
                                            final byte[] array2 = new byte[n2];
                                            int k = 0;
                                            int n3 = 0;
                                            while (k < list.size()) {
                                                final byte[] l = list.get(k).j;
                                                l.getClass();
                                                final int length = l.length;
                                                System.arraycopy(l, 0, array2, n3, length);
                                                n3 += length;
                                                ++k;
                                            }
                                            b$b2 = new b$b(b$b3.g, b$b3.h, b$b3.i, array2);
                                            break Label_0417;
                                        }
                                        break Label_0296;
                                    }
                                }
                                final boolean b = true;
                                continue;
                            }
                        }
                    }
                    int n4 = 0;
                    while (n4 < list.size()) {
                        final b$b b$b5 = list.get(n4);
                        final byte[] m = b$b5.j;
                        m.getClass();
                        final i$a b2 = i.b(m);
                        int b3;
                        if (b2 == null) {
                            b3 = -1;
                        }
                        else {
                            b3 = b2.b;
                        }
                        final int a = c0.a;
                        if (a >= 23 || b3 != 0) {
                            if (a < 23 || b3 != 1) {
                                ++n4;
                                continue;
                            }
                        }
                        b$b2 = b$b5;
                        break Label_0417;
                    }
                    b$b2 = list.get(0);
                }
            }
            final UUID a2 = this.a;
            final byte[] j2 = b$b2.j;
            j2.getClass();
            final UUID e = wa.b.e;
            a3 = j2;
            if (e.equals(a2)) {
                byte[] array3 = i.c(a2, j2);
                if (array3 == null) {
                    array3 = j2;
                }
                final t t = new t(array3);
                int e2 = t.e();
                final short g = t.g();
                final short g2 = t.g();
                if (g == 1 && g2 == 1) {
                    final short g3 = t.g();
                    final Charset d = sg.b.d;
                    final String p4 = t.p(g3, d);
                    if (!p4.contains("<LA_URL>")) {
                        final int index = p4.indexOf("</DATA>");
                        if (index == -1) {
                            Log.w("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
                        }
                        final String substring = p4.substring(0, index);
                        final String substring2 = p4.substring(index);
                        final String a4 = xm2.a.a(o.e(substring2, o.e(substring, 26)), substring, "<LA_URL>https://x</LA_URL>", substring2);
                        e2 += 52;
                        final ByteBuffer allocate = ByteBuffer.allocate(e2);
                        allocate.order(ByteOrder.LITTLE_ENDIAN);
                        allocate.putInt(e2);
                        allocate.putShort(g);
                        allocate.putShort(g2);
                        allocate.putShort((short)(a4.length() * 2));
                        allocate.put(a4.getBytes(d));
                        array3 = allocate.array();
                    }
                }
                else {
                    Log.i("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
                }
                a3 = i.a(e, (UUID[])null, array3);
            }
            final int a5 = c0.a;
            Label_0845: {
                if (a5 >= 23 || !wa.b.d.equals(a2)) {
                    if (!e.equals(a2) || !"Amazon".equals(c0.c)) {
                        break Label_0845;
                    }
                    final String d2 = c0.d;
                    if (!"AFTB".equals(d2) && !"AFTS".equals(d2) && !"AFTM".equals(d2) && !"AFTT".equals(d2)) {
                        break Label_0845;
                    }
                }
                final byte[] c = i.c(a2, a3);
                if (c != null) {
                    a3 = c;
                }
            }
            final UUID a6 = this.a;
            i2 = b$b2.i;
            if (a5 < 26 && wa.b.c.equals(a6) && ("video/mp4".equals(i2) || "audio/mp4".equals(i2))) {
                i2 = "cenc";
            }
        }
        else {
            a3 = null;
            i2 = null;
            b$b2 = b$b;
        }
        final MediaDrm$KeyRequest keyRequest = this.b.getKeyRequest(array, a3, i2, n, (HashMap)hashMap);
        final UUID a7 = this.a;
        byte[] array4;
        array = (array4 = keyRequest.getData());
        if (wa.b.c.equals(a7)) {
            if (c0.a >= 27) {
                array4 = array;
            }
            else {
                array4 = c0.C(c0.o(array).replace('+', '-').replace('/', '_'));
            }
        }
        String defaultUrl;
        if ("https://x".equals(defaultUrl = keyRequest.getDefaultUrl())) {
            defaultUrl = "";
        }
        String h = defaultUrl;
        if (TextUtils.isEmpty((CharSequence)defaultUrl)) {
            h = defaultUrl;
            if (b$b2 != null) {
                h = defaultUrl;
                if (!TextUtils.isEmpty((CharSequence)b$b2.h)) {
                    h = b$b2.h;
                }
            }
        }
        if (c0.a >= 23) {
            keyRequest.getRequestType();
        }
        return new g$a(h, array4);
    }
    
    public final void release() {
        synchronized (this) {
            final int c = this.c - 1;
            this.c = c;
            if (c == 0) {
                this.b.release();
            }
        }
    }
}
