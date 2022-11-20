// 
// Decompiled by Procyon v0.6.0
// 

package wk2;

import kk2.m;

public interface b
{
    public static final m a = new m("1", m5);
    public static final m b = new m("2", m5);
    public static final m c = new m("3", m5);
    public static final m d = new m("4", m5);
    public static final m e = new m("5", m5);
    public static final m f = new m("6", m5);
    public static final m g = new m("7", m5);
    public static final m h = new m("8", m5);
    public static final m i = new m("9", m5);
    public static final m j = new m("10", m5);
    public static final m k = new m("11", m5);
    public static final m l = new m("12", m5);
    public static final m m = new m("13", m5);
    public static final m n = new m("14", m5);
    
    default static {
        final m m2 = new m("1.3.36.3");
        m2.z("2.1");
        m2.z("2.2");
        m2.z("2.3");
        final m m3 = new m("3.1", m2);
        m3.z("2");
        m3.z("3");
        m3.z("4");
        final m m4 = new m("3.2", m2);
        m4.z("1");
        m4.z("2");
        final m m5 = new m("1", new m("1", new m("3.2.8", m2)));
    }
}
