// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import com.google.android.play.core.splitinstall.SplitInstallException;
import ng.c;
import ah2.f;
import rd.i;
import java.io.Serializable;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import yd.a;
import rd.l;
import java.util.List;
import android.util.Log;
import bf2.e;
import uj2.g;
import pg.j;
import l0.m0;

public final class gc implements m0, j, g
{
    public final int f;
    
    public static gc j() {
        final l c = l.c;
        c.getClass();
        a.Q0("Please provide a valid libraryName", "firebase-auth");
        String s = null;
        Label_0545: {
            if (c.a.containsKey("firebase-auth")) {
                s = c.a.get("firebase-auth");
            }
            else {
                final Properties properties = new Properties();
                final InputStream inputStream = null;
                Object o = null;
                Object property = null;
                Serializable s2 = null;
                Label_0578: {
                    Object resourceAsStream;
                    try {
                        try {
                            resourceAsStream = l.class.getResourceAsStream(String.format("/%s.properties", "firebase-auth"));
                            if (resourceAsStream == null) {
                                goto Label_0262;
                            }
                            property = inputStream;
                            try {
                                properties.load((InputStream)resourceAsStream);
                                property = inputStream;
                                s2 = (Serializable)(property = properties.getProperty("version", null));
                                final i b = l.b;
                                property = s2;
                                final int length = String.valueOf(s2).length();
                                property = s2;
                                o = new(java.lang.StringBuilder.class)();
                                property = s2;
                                new StringBuilder(25 + length);
                                property = s2;
                                ((StringBuilder)o).append("firebase-auth");
                                property = s2;
                                ((StringBuilder)o).append(" version is ");
                                property = s2;
                                ((StringBuilder)o).append((String)s2);
                                property = s2;
                                final String string = ((StringBuilder)o).toString();
                                o = s2;
                                property = s2;
                                if (Log.isLoggable(b.a, 2)) {
                                    property = s2;
                                    o = b.b;
                                    if (o == null) {
                                        o = string;
                                    }
                                    else {
                                        property = s2;
                                        o = ((String)o).concat(string);
                                    }
                                    property = s2;
                                    Log.v("LibraryVersion", (String)o);
                                    o = s2;
                                    goto Label_0341;
                                }
                                goto Label_0341;
                            }
                            catch (final IOException s2) {
                                o = property;
                            }
                        }
                        catch (final IOException s2) {
                            property = null;
                            resourceAsStream = o;
                        }
                        property = resourceAsStream;
                        final i b2 = l.b;
                        property = resourceAsStream;
                        String s3 = "Failed to get app version for libraryName: ".concat("firebase-auth");
                        property = resourceAsStream;
                        if (Log.isLoggable(b2.a, 6)) {
                            property = resourceAsStream;
                            final String b3 = b2.b;
                            if (b3 != null) {
                                property = resourceAsStream;
                                s3 = b3.concat(s3);
                            }
                            property = resourceAsStream;
                            Log.e("LibraryVersion", s3, (Throwable)s2);
                        }
                    }
                    finally {
                        break Label_0578;
                    }
                    if (resourceAsStream != null) {
                        wd.e.a((Closeable)resourceAsStream);
                    }
                    final String s4;
                    property = s4;
                    String s5;
                    if ((s5 = (String)property) == null) {
                        final i b4 = l.b;
                        if (Log.isLoggable(b4.a, 3)) {
                            String concat = ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used";
                            final String b5 = b4.b;
                            if (b5 != null) {
                                concat = b5.concat(".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
                            }
                            Log.d("LibraryVersion", concat);
                        }
                        s5 = "UNKNOWN";
                    }
                    c.a.put("firebase-auth", s5);
                    s = s5;
                    break Label_0545;
                }
                Object resourceAsStream = property;
                if (resourceAsStream != null) {
                    wd.e.a((Closeable)resourceAsStream);
                }
            }
        }
        if (!TextUtils.isEmpty((CharSequence)s)) {
            final String s6 = s;
            if (!s.equals("UNKNOWN")) {
                return new gc(s6);
            }
        }
        final String s6 = "-1";
        return new gc(s6);
    }
    
    public l0.i c(final long n, final l0.i i, final l0.i j, final l0.i k) {
        ah2.f.f((Object)i, "initialValue");
        ah2.f.f((Object)j, "targetValue");
        ah2.f.f((Object)k, "initialVelocity");
        if (n < this.f * 1000000L) {
            return i;
        }
        return j;
    }
    
    public void e() {
    }
    
    @Override
    public int f() {
        return this.f;
    }
    
    public l0.i g(final long n, final l0.i i, final l0.i j, final l0.i k) {
        ah2.f.f((Object)i, "initialValue");
        ah2.f.f((Object)j, "targetValue");
        ah2.f.f((Object)k, "initialVelocity");
        return k;
    }
    
    @Override
    public int getDurationMillis() {
        return 0;
    }
    
    @Override
    public ng.e h(final c c) {
        final int f = this.f;
        final int p = pg.a.p;
        if (c != null && f == c.g()) {
            final int h = c.h();
            if (h == 1 || h == 2 || h == 8 || h == 9 || h == 7) {
                return c.b(f, 7, c.c(), c.a(), c.i(), (List)c.e(), (List)c.d());
            }
        }
        throw new SplitInstallException(-3);
    }
    
    public int i() {
        return this.f;
    }
    
    public String k() {
        return String.format("X%s", Integer.toString(this.f));
    }
}
