// 
// Decompiled by Procyon v0.6.0
// 

package vj2;

public final class f
{
    public static final f d;
    public static final f[] e;
    public final int a;
    public final int b;
    public final int[] c;
    
    static {
        e = new f[] { new f(0, 96000, new int[] { 33, 512 }), new f(1, 88200, new int[] { 33, 512 }), new f(2, 64000, new int[] { 38, 664 }), new f(3, 48000, new int[] { 40, 672 }), new f(4, 44100, new int[] { 40, 672 }), new f(5, 32000, new int[] { 40, 672 }), new f(6, 24000, new int[] { 41, 652 }), new f(7, 22050, new int[] { 41, 652 }), new f(8, 16000, new int[] { 37, 664 }), new f(9, 12000, new int[] { 37, 664 }), new f(10, 11025, new int[] { 37, 664 }), new f(11, 8000, new int[] { 34, 664 }), d = new f(-1, 0, new int[] { 0, 0 }) };
    }
    
    public f(final int a, final int b, final int[] c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.b);
    }
}
