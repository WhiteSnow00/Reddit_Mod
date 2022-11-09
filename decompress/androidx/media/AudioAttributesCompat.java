// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media;

import android.util.SparseIntArray;
import w5.c;

public class AudioAttributesCompat implements c
{
    public AudioAttributesImpl a;
    
    static {
        final SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof AudioAttributesCompat;
        boolean b2 = false;
        if (!b) {
            return false;
        }
        final AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat)o;
        final AudioAttributesImpl a = this.a;
        if (a == null) {
            if (audioAttributesCompat.a == null) {
                b2 = true;
            }
            return b2;
        }
        return a.equals(audioAttributesCompat.a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
}
