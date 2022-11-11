// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.load.resource.bitmap;

import o8.f;

public abstract class DownsampleStrategy
{
    public static final a a;
    public static final b b;
    public static final e c;
    public static final c d;
    public static final d e;
    public static final f f;
    public static final d g;
    public static final o8.f<DownsampleStrategy> h;
    public static final boolean i;
    
    static {
        a = new a();
        b = new b();
        c = new e();
        d = new c();
        final d g2 = e = new d();
        f = new f();
        g = g2;
        h = o8.f.a(g2, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        i = true;
    }
    
    public abstract SampleSizeRounding a(final int p0, final int p1, final int p2, final int p3);
    
    public abstract float b(final int p0, final int p1, final int p2, final int p3);
    
    public enum SampleSizeRounding
    {
        MEMORY, 
        QUALITY;
    }
    
    public static final class a extends DownsampleStrategy
    {
        @Override
        public final SampleSizeRounding a(final int n, final int n2, final int n3, final int n4) {
            return SampleSizeRounding.QUALITY;
        }
        
        @Override
        public final float b(int min, final int n, final int n2, final int n3) {
            min = Math.min(n / n3, min / n2);
            float n4 = 1.0f;
            if (min != 0) {
                n4 = 1.0f / Integer.highestOneBit(min);
            }
            return n4;
        }
    }
    
    public static final class b extends DownsampleStrategy
    {
        @Override
        public final SampleSizeRounding a(final int n, final int n2, final int n3, final int n4) {
            return SampleSizeRounding.MEMORY;
        }
        
        @Override
        public final float b(int n, int n2, int n3, final int n4) {
            n3 = (int)Math.ceil(Math.max(n2 / (float)n4, n / (float)n3));
            n2 = Integer.highestOneBit(n3);
            n = 1;
            n2 = Math.max(1, n2);
            if (n2 >= n3) {
                n = 0;
            }
            return 1.0f / (n2 << n);
        }
    }
    
    public static final class c extends DownsampleStrategy
    {
        @Override
        public final SampleSizeRounding a(final int n, final int n2, final int n3, final int n4) {
            Enum<SampleSizeRounding> enum1;
            if (this.b(n, n2, n3, n4) == 1.0f) {
                enum1 = SampleSizeRounding.QUALITY;
            }
            else {
                enum1 = DownsampleStrategy.c.a(n, n2, n3, n4);
            }
            return (SampleSizeRounding)enum1;
        }
        
        @Override
        public final float b(final int n, final int n2, final int n3, final int n4) {
            return Math.min(1.0f, DownsampleStrategy.c.b(n, n2, n3, n4));
        }
    }
    
    public static final class d extends DownsampleStrategy
    {
        @Override
        public final SampleSizeRounding a(final int n, final int n2, final int n3, final int n4) {
            return SampleSizeRounding.QUALITY;
        }
        
        @Override
        public final float b(final int n, final int n2, final int n3, final int n4) {
            return Math.max(n3 / (float)n, n4 / (float)n2);
        }
    }
    
    public static final class e extends DownsampleStrategy
    {
        @Override
        public final SampleSizeRounding a(final int n, final int n2, final int n3, final int n4) {
            if (DownsampleStrategy.i) {
                return SampleSizeRounding.QUALITY;
            }
            return SampleSizeRounding.MEMORY;
        }
        
        @Override
        public final float b(int max, final int n, final int n2, final int n3) {
            if (DownsampleStrategy.i) {
                return Math.min(n2 / (float)max, n3 / (float)n);
            }
            max = Math.max(n / n3, max / n2);
            float n4 = 1.0f;
            if (max != 0) {
                n4 = 1.0f / Integer.highestOneBit(max);
            }
            return n4;
        }
    }
    
    public static final class f extends DownsampleStrategy
    {
        @Override
        public final SampleSizeRounding a(final int n, final int n2, final int n3, final int n4) {
            return SampleSizeRounding.QUALITY;
        }
        
        @Override
        public final float b(final int n, final int n2, final int n3, final int n4) {
            return 1.0f;
        }
    }
}
