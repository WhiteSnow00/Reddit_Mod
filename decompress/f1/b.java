// 
// Decompiled by Procyon v0.6.0
// 

package f1;

import gg.w;
import gg.q0;
import android.view.View;
import java.util.concurrent.TimeUnit;
import kk.g;
import android.net.Uri;
import java.nio.ShortBuffer;
import java.util.Map;
import com.apollographql.apollo.api.ResponseField;
import com.instabug.library.internal.video.InternalAutoScreenRecorderHelper;
import android.app.Activity;
import v0.i;
import d9.f;
import java.io.IOException;
import com.google.android.play.core.internal.zzbt;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import gg.u;
import gg.v;
import java.util.Iterator;
import lg.a0;
import java.util.Collection;
import java.util.Arrays;
import gg.x;
import android.util.Log;
import java.io.File;
import java.util.HashSet;
import gg.h0;
import java.security.NoSuchAlgorithmException;
import android.text.TextUtils;
import java.security.MessageDigest;
import u9.l;
import java.util.HashMap;
import java.lang.reflect.Field;
import com.instabug.library.internal.video.ScreenRecordingContract;
import xk.a;
import tk.c;
import gg.s;

public class b implements j7.b, s, c, a, ScreenRecordingContract, vu2.a
{
    public static Field g;
    public static boolean h;
    public static b i;
    public static b j;
    public static b k;
    public final /* synthetic */ int f;
    
    public b() {
        this.f = 17;
        new HashMap();
    }
    
    public static b r() {
        if (b.k == null) {
            b.k = new b(19);
        }
        return b.k;
    }
    
    public static String s(String s) {
        final int lastIndex = s.lastIndexOf(46);
        final int lastIndex2 = s.lastIndexOf(47);
        String substring;
        if (lastIndex != -1 && lastIndex > lastIndex2 && lastIndex + 2 + 4 > s.length()) {
            substring = s.substring(lastIndex + 1, s.length());
        }
        else {
            substring = "";
        }
        final rt2.b a = l.a;
        try {
            final byte[] digest = MessageDigest.getInstance("MD5").digest(s.getBytes());
            final StringBuffer sb = new StringBuffer();
            for (int length = digest.length, i = 0; i < length; ++i) {
                sb.append(String.format("%02x", digest[i]));
            }
            s = sb.toString();
            if (!TextUtils.isEmpty((CharSequence)substring)) {
                s = a.k(s, ".", substring);
            }
            return s;
        }
        catch (final NoSuchAlgorithmException ex) {
            throw new IllegalStateException(ex);
        }
    }
    
    public static Object u(final ClassLoader classLoader) {
        return new z5.c((Object)classLoader, (Object)h0.g((Object)classLoader, "pathList"), (Object)Object.class).c();
    }
    
    public static void v(final ClassLoader classLoader, final HashSet set) {
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
        set2.removeAll(Arrays.asList((File[])((z5.c)x).c()));
        synchronized (a0.class) {
            final int size = set2.size();
            final StringBuilder sb = new StringBuilder(30);
            sb.append("Adding directories ");
            sb.append(size);
            Log.d("Splitcompat", sb.toString());
            x.f((Collection)set2);
        }
    }
    
    public static boolean w(final ClassLoader classLoader, final File file, final File file2, final boolean b, final v v, final String s, final u u) {
        final ArrayList list = new ArrayList();
        final Object u2 = u(classLoader);
        final x x = new x(u2, (Class)Object.class, h0.g(u2, "dexElements"));
        final List<Object> list2 = Arrays.asList((Object[])((z5.c)x).c());
        final ArrayList list3 = new ArrayList();
        for (final Object next : list2) {
            list3.add(new z5.c(next, (Object)h0.g(next, s), (Object)File.class).c());
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
        x.e((List)Arrays.asList(v.d(u2, new ArrayList((Collection<? extends E>)Collections.singleton(file2)), file, list)));
        if (!list.isEmpty()) {
            final zzbt zzbt = new zzbt("DexPathList.makeDexElement failed");
            while (i < list.size()) {
                Log.e("SplitCompat", "DexPathList.makeDexElement failed", (Throwable)list.get(i));
                ++i;
            }
            new x(u2, (Class)IOException.class, h0.g(u2, "dexElementsSuppressedExceptions")).e((List)list);
            throw zzbt;
        }
        return true;
    }
    
    public final boolean Y0(final ClassLoader classLoader, final File file, final File file2, final boolean b) {
        switch (this.f) {
            default: {
                return w(classLoader, file, file2, b, (v)new a4.a0(), "path", (u)new f(3));
            }
            case 9: {
                return v0.i.f(classLoader, file, file2, b);
            }
            case 8: {
                return w(classLoader, file, file2, b, (v)new i(8), "zip", (u)new f(2));
            }
        }
    }
    
    public final void a() {
    }
    
    public final void a(final Activity activity, final boolean b) {
    }
    
    public final int a2(final int n, final int n2, final int n3) {
        return n / 2;
    }
    
    public final void b() {
        switch (this.f) {
            default: {
                InternalAutoScreenRecorderHelper.getInstance().start();
            }
            case 12: {}
        }
    }
    
    public final void b(final Activity activity, final long n) {
    }
    
    public final Object c(final ResponseField responseField, final Object o) {
        return ((Map)o).get(responseField.b);
    }
    
    public final void c() {
    }
    
    public final void clear() {
        InternalAutoScreenRecorderHelper.getInstance().clear();
    }
    
    public final void d() {
    }
    
    public final void d(final Activity activity, final long n, final String s) {
    }
    
    public final void delete() {
        InternalAutoScreenRecorderHelper.getInstance().delete();
    }
    
    public final void e() {
    }
    
    public final void e(final Activity activity, final String s, final long n, final long n2) {
    }
    
    public final void f() {
    }
    
    public final void f(final Activity activity, final long n, final long n2) {
    }
    
    public final void g(final Activity activity, final long n, final long n2) {
    }
    
    public final void g2(int n, int i, final ShortBuffer shortBuffer, final ShortBuffer shortBuffer2) {
        int min;
        int n2;
        int n3;
        for (min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining()), i = 0; i < min; ++i) {
            n = shortBuffer.get() + 32768;
            n2 = shortBuffer.get() + 32768;
            n3 = 65535;
            if (n >= 32768 && n2 >= 32768) {
                n = (n + n2) * 2 - n * n2 / 32768 - 65535;
            }
            else {
                n = n * n2 / 32768;
            }
            if (n == 65536) {
                n = n3;
            }
            shortBuffer2.put((short)(n - 32768));
        }
    }
    
    public final Uri getAutoScreenRecordingFileUri() {
        return InternalAutoScreenRecorderHelper.getInstance().getAutoScreenRecordingFileUri();
    }
    
    public final void h(final Class clazz, final long n) {
    }
    
    public final void i(final Activity activity, final long n, final long n2) {
    }
    
    public final boolean isEnabled() {
        return InternalAutoScreenRecorderHelper.getInstance().isEnabled();
    }
    
    public final void j(final Activity activity, final long n) {
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
    
    public final g p(final long[] array, long d) {
        if (array.length == 11) {
            final g g = new g();
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
    
    public final void q(final Activity activity, final long n) {
    }
    
    public void t(final int n, final View view) {
        if (!b.h) {
            try {
                (b.g = View.class.getDeclaredField("mViewFlags")).setAccessible(true);
            }
            catch (final NoSuchFieldException ex) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            b.h = true;
        }
        final Field g = b.g;
        if (g == null) {
            return;
        }
        try {
            b.g.setInt(view, n | (g.getInt(view) & 0xFFFFFFF3));
        }
        catch (final IllegalAccessException ex2) {}
    }
    
    public final void z(final ClassLoader classLoader, final HashSet set) {
        switch (this.f) {
            default: {
                v0.i.e(classLoader, set, (w)new q0());
                return;
            }
            case 9: {
                v0.i.e(classLoader, set, (w)new a92.b());
                return;
            }
            case 8: {
                v(classLoader, set);
            }
        }
    }
}
