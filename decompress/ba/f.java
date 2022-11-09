// 
// Decompiled by Procyon v0.6.0
// 

package ba;

public final class f implements c
{
    public final String a(final String s) {
        if (s.startsWith("lib") && s.endsWith(".so")) {
            return s;
        }
        return System.mapLibraryName(s);
    }
}
