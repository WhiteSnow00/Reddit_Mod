// 
// Decompiled by Procyon v0.6.0
// 

package p3;

import java.util.ArrayList;

public final class e
{
    public final int[] a;
    public final float[] b;
    
    public e(final int n, final int n2) {
        this.a = new int[] { n, n2 };
        this.b = new float[] { 0.0f, 1.0f };
    }
    
    public e(final int n, final int n2, final int n3) {
        this.a = new int[] { n, n2, n3 };
        this.b = new float[] { 0.0f, 0.5f, 1.0f };
    }
    
    public e(final ArrayList list, final ArrayList list2) {
        final int size = list.size();
        this.a = new int[size];
        this.b = new float[size];
        for (int i = 0; i < size; ++i) {
            this.a[i] = (int)list.get(i);
            this.b[i] = (float)list2.get(i);
        }
    }
}
