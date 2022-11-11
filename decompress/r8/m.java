// 
// Decompiled by Procyon v0.6.0
// 

package r8;

import java.util.Iterator;
import k9.j;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Arrays;
import android.os.Build$VERSION;
import java.util.NavigableMap;
import java.util.Map;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;

public class m implements k
{
    private static final Bitmap$Config[] ALPHA_8_IN_CONFIGS;
    private static final Bitmap$Config[] ARGB_4444_IN_CONFIGS;
    private static final Bitmap$Config[] ARGB_8888_IN_CONFIGS;
    private static final int MAX_SIZE_MULTIPLE = 8;
    private static final Bitmap$Config[] RGBA_F16_IN_CONFIGS;
    private static final Bitmap$Config[] RGB_565_IN_CONFIGS;
    private final g<b, Bitmap> groupedMap;
    private final c keyPool;
    private final Map<Bitmap$Config, NavigableMap<Integer, Integer>> sortedSizes;
    
    static {
        Bitmap$Config[] array2;
        final Bitmap$Config[] array = array2 = new Bitmap$Config[] { Bitmap$Config.ARGB_8888, null };
        if (Build$VERSION.SDK_INT >= 26) {
            array2 = Arrays.copyOf(array, 3);
            array2[array2.length - 1] = Bitmap$Config.RGBA_F16;
        }
        ARGB_8888_IN_CONFIGS = array2;
        RGBA_F16_IN_CONFIGS = array2;
        RGB_565_IN_CONFIGS = new Bitmap$Config[] { Bitmap$Config.RGB_565 };
        ARGB_4444_IN_CONFIGS = new Bitmap$Config[] { Bitmap$Config.ARGB_4444 };
        ALPHA_8_IN_CONFIGS = new Bitmap$Config[] { Bitmap$Config.ALPHA_8 };
    }
    
    public m() {
        this.keyPool = new c();
        this.groupedMap = (g<b, Bitmap>)new g();
        this.sortedSizes = new HashMap<Bitmap$Config, NavigableMap<Integer, Integer>>();
    }
    
    private void decrementBitmapOfSize(final Integer n, final Bitmap bitmap) {
        final NavigableMap<Integer, Integer> sizesForConfig = this.getSizesForConfig(bitmap.getConfig());
        final Integer n2 = sizesForConfig.get(n);
        if (n2 != null) {
            if (n2 == 1) {
                sizesForConfig.remove(n);
            }
            else {
                sizesForConfig.put(n, n2 - 1);
            }
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Tried to decrement empty size, size: ");
        sb.append(n);
        sb.append(", removed: ");
        sb.append(this.logBitmap(bitmap));
        sb.append(", this: ");
        sb.append(this);
        throw new NullPointerException(sb.toString());
    }
    
    private b findBestKey(int intValue, final Bitmap$Config c) {
        final b b = (b)this.keyPool.b();
        b.b = intValue;
        b.c = c;
        final Bitmap$Config[] inConfigs = getInConfigs(c);
        final int length = inConfigs.length;
        int n = 0;
        b b2;
        while (true) {
            b2 = b;
            if (n >= length) {
                break;
            }
            final Bitmap$Config c2 = inConfigs[n];
            final Integer n2 = this.getSizesForConfig(c2).ceilingKey(intValue);
            if (n2 != null && n2 <= intValue * 8) {
                if (n2 == intValue) {
                    if (c2 == null) {
                        b2 = b;
                        if (c == null) {
                            break;
                        }
                    }
                    else {
                        b2 = b;
                        if (c2.equals(c)) {
                            break;
                        }
                    }
                }
                this.keyPool.c((l)b);
                final c keyPool = this.keyPool;
                intValue = n2;
                b2 = (b)keyPool.b();
                b2.b = intValue;
                b2.c = c2;
                break;
            }
            ++n;
        }
        return b2;
    }
    
    public static String getBitmapString(final int n, final Bitmap$Config bitmap$Config) {
        final StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(n);
        sb.append("](");
        sb.append(bitmap$Config);
        sb.append(")");
        return sb.toString();
    }
    
    private static Bitmap$Config[] getInConfigs(final Bitmap$Config bitmap$Config) {
        if (Build$VERSION.SDK_INT >= 26 && Bitmap$Config.RGBA_F16.equals(bitmap$Config)) {
            return m.RGBA_F16_IN_CONFIGS;
        }
        final int n = m$a.a[((Enum)bitmap$Config).ordinal()];
        if (n == 1) {
            return m.ARGB_8888_IN_CONFIGS;
        }
        if (n == 2) {
            return m.RGB_565_IN_CONFIGS;
        }
        if (n == 3) {
            return m.ARGB_4444_IN_CONFIGS;
        }
        if (n != 4) {
            return new Bitmap$Config[] { bitmap$Config };
        }
        return m.ALPHA_8_IN_CONFIGS;
    }
    
    private NavigableMap<Integer, Integer> getSizesForConfig(final Bitmap$Config bitmap$Config) {
        NavigableMap navigableMap;
        if ((navigableMap = this.sortedSizes.get(bitmap$Config)) == null) {
            navigableMap = new TreeMap();
            this.sortedSizes.put(bitmap$Config, navigableMap);
        }
        return navigableMap;
    }
    
    public Bitmap get(final int n, final int n2, final Bitmap$Config bitmap$Config) {
        final b bestKey = this.findBestKey(j.c(n, n2, bitmap$Config), bitmap$Config);
        final Bitmap bitmap = (Bitmap)this.groupedMap.a((l)bestKey);
        if (bitmap != null) {
            this.decrementBitmapOfSize(bestKey.b, bitmap);
            bitmap.reconfigure(n, n2, bitmap$Config);
        }
        return bitmap;
    }
    
    public int getSize(final Bitmap bitmap) {
        return j.d(bitmap);
    }
    
    public String logBitmap(final int n, final int n2, final Bitmap$Config bitmap$Config) {
        return getBitmapString(j.c(n, n2, bitmap$Config), bitmap$Config);
    }
    
    public String logBitmap(final Bitmap bitmap) {
        return getBitmapString(j.d(bitmap), bitmap.getConfig());
    }
    
    public void put(final Bitmap bitmap) {
        final int d = j.d(bitmap);
        final c keyPool = this.keyPool;
        final Bitmap$Config config = bitmap.getConfig();
        final b b = (b)keyPool.b();
        b.b = d;
        b.c = config;
        this.groupedMap.b((l)b, (Object)bitmap);
        final NavigableMap<Integer, Integer> sizesForConfig = this.getSizesForConfig(bitmap.getConfig());
        final Integer n = sizesForConfig.get(b.b);
        final int b2 = b.b;
        int n2 = 1;
        if (n != null) {
            n2 = 1 + n;
        }
        sizesForConfig.put(b2, n2);
    }
    
    public Bitmap removeLast() {
        final Bitmap bitmap = (Bitmap)this.groupedMap.c();
        if (bitmap != null) {
            this.decrementBitmapOfSize(j.d(bitmap), bitmap);
        }
        return bitmap;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("SizeConfigStrategy{groupedMap=");
        r.append(this.groupedMap);
        r.append(", sortedSizes=(");
        for (final Map.Entry<Object, V> entry : this.sortedSizes.entrySet()) {
            r.append(entry.getKey());
            r.append('[');
            r.append(entry.getValue());
            r.append("], ");
        }
        if (!this.sortedSizes.isEmpty()) {
            r.replace(r.length() - 2, r.length(), "");
        }
        r.append(")}");
        return r.toString();
    }
    
    public static final class b implements l
    {
        public final c a;
        public int b;
        public Bitmap$Config c;
        
        public b(final c a) {
            this.a = a;
        }
        
        public final void a() {
            this.a.c((l)this);
        }
        
        @Override
        public final boolean equals(final Object o) {
            final boolean b = o instanceof b;
            boolean b3;
            final boolean b2 = b3 = false;
            if (b) {
                final b b4 = (b)o;
                b3 = b2;
                if (this.b == b4.b) {
                    b3 = b2;
                    if (j.b((Object)this.c, (Object)b4.c)) {
                        b3 = true;
                    }
                }
            }
            return b3;
        }
        
        @Override
        public final int hashCode() {
            final int b = this.b;
            final Bitmap$Config c = this.c;
            int hashCode;
            if (c != null) {
                hashCode = c.hashCode();
            }
            else {
                hashCode = 0;
            }
            return b * 31 + hashCode;
        }
        
        @Override
        public final String toString() {
            return m.getBitmapString(this.b, this.c);
        }
    }
    
    public static final class c extends r8.c
    {
        public final l a() {
            return (l)new b(this);
        }
    }
}
