// 
// Decompiled by Procyon v0.6.0
// 

package v0;

import eg.n0;
import android.net.Uri;
import ig.w;
import com.instabug.library.internal.video.InternalAutoScreenRecorderHelper;
import android.app.Activity;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import com.google.android.play.core.internal.zzbt;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import ig.u;
import ig.v;
import java.util.Iterator;
import ng.b0;
import java.util.Collection;
import java.util.Arrays;
import ig.x;
import android.util.Log;
import java.io.File;
import java.util.HashSet;
import d9.b;
import ig.h0;
import java.math.BigInteger;
import ah2.f;
import java.util.HashMap;
import com.instabug.library.internal.video.ScreenRecordingContract;
import al.a;
import wk.c;
import ig.s;
import e9.g;

public final class j implements g, s, c, a, ScreenRecordingContract
{
    public static j g;
    public static j h;
    public static j i;
    public final /* synthetic */ int f;
    
    public j() {
        this.f = 15;
        new HashMap();
    }
    
    public static j r() {
        if (j.i == null) {
            j.i = new j(17);
        }
        return j.i;
    }
    
    public static final int s(int i, final CharSequence charSequence) {
        f.f((Object)charSequence, "<this>");
        ++i;
        while (i < charSequence.length()) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            ++i;
        }
        return charSequence.length();
    }
    
    public static byte[] t(final int n, final BigInteger bigInteger) {
        final byte[] byteArray = bigInteger.toByteArray();
        if (n < byteArray.length) {
            final byte[] array = new byte[n];
            System.arraycopy(byteArray, byteArray.length - n, array, 0, n);
            return array;
        }
        if (n > byteArray.length) {
            final byte[] array2 = new byte[n];
            System.arraycopy(byteArray, 0, array2, n - byteArray.length, byteArray.length);
            return array2;
        }
        return byteArray;
    }
    
    public static Object u(final ClassLoader classLoader) {
        return new b(classLoader, h0.g((Object)classLoader, "pathList"), Object.class).e();
    }
    
    public static void w(final ClassLoader classLoader, final HashSet set) {
        if (set.isEmpty()) {
            return;
        }
        final HashSet set2 = new HashSet();
        for (final File file : set) {
            final String value = String.valueOf(file.getParentFile().getAbsolutePath());
            String concat;
            if (value.length() != 0) {
                concat = "Adding native library parent directory: ".concat(value);
            }
            else {
                concat = new String("Adding native library parent directory: ");
            }
            Log.d("Splitcompat", concat);
            set2.add(file.getParentFile());
        }
        final Object u = u(classLoader);
        final x x = new x(u, (Class)File.class, h0.g(u, "nativeLibraryDirectories"));
        set2.removeAll(Arrays.asList((File[])((b)x).e()));
        synchronized (b0.class) {
            final int size = set2.size();
            final StringBuilder sb = new StringBuilder(30);
            sb.append("Adding directories ");
            sb.append(size);
            Log.d("Splitcompat", sb.toString());
            x.h((Collection)set2);
        }
    }
    
    public static boolean x(final ClassLoader classLoader, final File file, final File file2, final boolean b, final v v, final String s, final u u) {
        final ArrayList list = new ArrayList();
        final Object u2 = u(classLoader);
        final x x = new x(u2, (Class)Object.class, h0.g(u2, "dexElements"));
        final List<Object> list2 = Arrays.asList((Object[])((b)x).e());
        final ArrayList list3 = new ArrayList();
        for (final Object next : list2) {
            list3.add(new b(next, h0.g(next, s), File.class).e());
        }
        if (list3.contains(file2)) {
            return true;
        }
        int i = 0;
        if (!b && !u.e(u2, file2, file)) {
            final String value = String.valueOf(file2.getPath());
            String concat;
            if (value.length() != 0) {
                concat = "Should be optimized ".concat(value);
            }
            else {
                concat = new String("Should be optimized ");
            }
            Log.w("SplitCompat", concat);
            return false;
        }
        x.g((List)Arrays.asList(v.d(u2, new ArrayList((Collection<? extends E>)Collections.singleton(file2)), file, list)));
        if (!list.isEmpty()) {
            final zzbt zzbt = new zzbt("DexPathList.makeDexElement failed");
            while (i < list.size()) {
                Log.e("SplitCompat", "DexPathList.makeDexElement failed", (Throwable)list.get(i));
                ++i;
            }
            new x(u2, (Class)IOException.class, h0.g(u2, "dexElementsSuppressedExceptions")).g((List)list);
            throw zzbt;
        }
        return true;
    }
    
    public final nk.g A(final long[] array, long d) {
        if (array.length == 11) {
            final nk.g g = new nk.g();
            g.d = d;
            final TimeUnit nanoseconds = TimeUnit.NANOSECONDS;
            d = array[10];
            final long n = 0L;
            final int n2 = 1;
            long n3;
            if (d != 0L && d > array[8]) {
                n3 = array[0];
            }
            else {
                d = array[8];
                n3 = array[0];
            }
            g.c = nanoseconds.toMicros(d - n3);
            g.a("ac_on_c_mus", Long.valueOf(nanoseconds.toMicros(array[2] - array[0])));
            g.a("ac_on_st_mus", Long.valueOf(nanoseconds.toMicros(array[5] - array[3])));
            g.a("ac_on_r_mus", Long.valueOf(nanoseconds.toMicros(array[8] - array[6])));
            final long n4 = array[10];
            if (n4 != 0L) {
                final long n5 = array[8];
                int n6;
                if (n4 > n5) {
                    n6 = n2;
                }
                else {
                    n6 = 0;
                }
                d = n;
                if (n6 != 0) {
                    d = n4 - n5;
                }
                g.a("esl_mus", Long.valueOf(nanoseconds.toMicros(d)));
            }
            return g;
        }
        return null;
    }
    
    public final void a() {
    }
    
    public final void a(final Activity activity, final boolean b) {
    }
    
    public final void b() {
        switch (this.f) {
            default: {
                InternalAutoScreenRecorderHelper.getInstance().start();
            }
            case 10: {}
        }
    }
    
    public final void b(final Activity activity, final long n) {
    }
    
    public final void c() {
    }
    
    public final void c(final Activity activity, final long n, final String s) {
    }
    
    public final void clear() {
        InternalAutoScreenRecorderHelper.getInstance().clear();
    }
    
    public final void d() {
    }
    
    public final void d(final Activity activity, final String s, final long n, final long n2) {
    }
    
    public final void delete() {
        InternalAutoScreenRecorderHelper.getInstance().delete();
    }
    
    public final void e() {
    }
    
    public final void e(final Activity activity, final long n, final long n2) {
    }
    
    public final void f() {
    }
    
    public final void f(final Activity activity, final long n, final long n2) {
    }
    
    public final void g(final ClassLoader classLoader, final HashSet set) {
        switch (this.f) {
            default: {
                h3.b.a(classLoader, set, (w)new gn.a());
                return;
            }
            case 7: {
                h3.b.a(classLoader, set, (w)new ah2.c());
                return;
            }
            case 6: {
                w(classLoader, set);
            }
        }
    }
    
    public final Uri getAutoScreenRecordingFileUri() {
        return InternalAutoScreenRecorderHelper.getInstance().getAutoScreenRecordingFileUri();
    }
    
    public final void h() {
    }
    
    public final void i(final Class clazz, final long n) {
    }
    
    public final boolean isEnabled() {
        return InternalAutoScreenRecorderHelper.getInstance().isEnabled();
    }
    
    public final void j(final Activity activity, final long n, final long n2) {
    }
    
    public final void k(final Activity activity, final long n) {
    }
    
    public final void l(final Activity activity, final long n) {
    }
    
    public final void m(final Activity activity, final long n) {
    }
    
    public final void n(final Activity activity, final long n) {
    }
    
    public final void o(final Activity activity, final long n) {
    }
    
    public final void p(final Activity activity, final long n) {
    }
    
    public final void q(final Activity activity, final long n) {
    }
    
    public final boolean v(final ClassLoader classLoader, final File file, final File file2, final boolean b) {
        switch (this.f) {
            default: {
                return x(classLoader, file, file2, b, (v)new n0(), "path", (u)new lc.a(3));
            }
            case 7: {
                return h3.b.c(classLoader, file, file2, b);
            }
            case 6: {
                return x(classLoader, file, file2, b, (v)new h3.b(9), "zip", (u)new lc.a(2));
            }
        }
    }
}
