// 
// Decompiled by Procyon v0.6.0
// 

package x1;

import java.nio.ShortBuffer;
import hg.u;
import d40.d;
import v0.i;
import e9.f;
import java.lang.reflect.Method;
import com.google.android.play.core.internal.zzbx;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import java.nio.ByteBuffer;
import l9.a$b;
import p8.g;
import r8.m;
import hg.v;
import java.util.HashSet;
import ng2.e;
import android.view.KeyEvent;
import ot2.b;
import java.security.NoSuchAlgorithmException;
import android.text.TextUtils;
import java.security.MessageDigest;
import v9.l;
import su2.a;
import hg.r;
import hg.t;

public final class c implements d9.c, t, r, a
{
    public static String b(String s) {
        final int lastIndex = s.lastIndexOf(46);
        final int lastIndex2 = s.lastIndexOf(47);
        String substring;
        if (lastIndex != -1 && lastIndex > lastIndex2 && lastIndex + 2 + 4 > s.length()) {
            substring = s.substring(lastIndex + 1, s.length());
        }
        else {
            substring = "";
        }
        final b a = l.a;
        try {
            final byte[] digest = MessageDigest.getInstance("MD5").digest(s.getBytes());
            final StringBuffer sb = new StringBuffer();
            for (int length = digest.length, i = 0; i < length; ++i) {
                sb.append(String.format("%02x", digest[i]));
            }
            s = sb.toString();
            if (!TextUtils.isEmpty((CharSequence)substring)) {
                s = a.n(s, ".", substring);
            }
            return s;
        }
        catch (final NoSuchAlgorithmException ex) {
            throw new IllegalStateException(ex);
        }
    }
    
    public static final long c(final KeyEvent keyEvent) {
        e.f((Object)keyEvent, "$this$key");
        return ah0.b.n(keyEvent.getKeyCode());
    }
    
    public static final int e(final KeyEvent keyEvent) {
        e.f((Object)keyEvent, "$this$type");
        final int action = keyEvent.getAction();
        int n = 1;
        if (action != 0) {
            if (action != 1) {
                n = 0;
            }
        }
        else {
            n = 2;
        }
        return n;
    }
    
    public final String a(final String s) {
        return s.replaceAll("\\[", "").replaceAll("]", "");
    }
    
    public final void d(final ClassLoader classLoader, final HashSet set) {
        vi.b.f(classLoader, set, (v)new dn.a(0));
    }
    
    public final m f(final m m, final g g) {
        final ByteBuffer readOnlyBuffer = m.get().f.a.a.getData().asReadOnlyBuffer();
        final AtomicReference a = l9.a.a;
        a$b a$b;
        if (!readOnlyBuffer.isReadOnly() && readOnlyBuffer.hasArray()) {
            a$b = new a$b(readOnlyBuffer.array(), readOnlyBuffer.arrayOffset(), readOnlyBuffer.limit());
        }
        else {
            a$b = null;
        }
        byte[] array;
        if (a$b != null && a$b.a == 0 && a$b.b == a$b.c.length) {
            array = readOnlyBuffer.array();
        }
        else {
            final ByteBuffer readOnlyBuffer2 = readOnlyBuffer.asReadOnlyBuffer();
            array = new byte[readOnlyBuffer2.limit()];
            readOnlyBuffer2.position(0);
            readOnlyBuffer2.get(array);
        }
        return new z8.b(array);
    }
    
    public final boolean g(Object class1, final File file, final File file2) {
        class1 = class1.getClass();
        final Method m = com.google.android.play.core.internal.a.m((Class)class1, "optimizedPathFor", new Class[] { File.class, File.class });
        try {
            return new File(String.class.cast(m.invoke(null, file, file2))).exists();
        }
        catch (final Exception ex) {
            throw new zzbx(String.format("Failed to invoke static method %s on type %s", "optimizedPathFor", class1), (Throwable)ex);
        }
    }
    
    public final boolean h(final ClassLoader classLoader, final File file, final File file2, final boolean b) {
        return d.m(classLoader, file, file2, b, (u)new f(), "path", (t)new i());
    }
    
    public final int p(final int n, final int n2, final int n3) {
        return n;
    }
    
    public final void r(final int n, final int n2, final ShortBuffer shortBuffer, final ShortBuffer shortBuffer2) {
        shortBuffer2.put(shortBuffer);
    }
}
