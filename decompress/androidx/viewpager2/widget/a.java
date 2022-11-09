// 
// Decompiled by Procyon v0.6.0
// 

package androidx.viewpager2.widget;

import java.util.Iterator;
import java.util.ConcurrentModificationException;
import java.util.ArrayList;

public final class a extends ViewPager2$e
{
    public final ArrayList a;
    
    public a() {
        this.a = new ArrayList(3);
    }
    
    public final void a(final int n) {
        try {
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                ((ViewPager2$e)iterator.next()).a(n);
            }
        }
        catch (final ConcurrentModificationException ex) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", ex);
        }
    }
    
    public final void b(final int n, final float n2, final int n3) {
        try {
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                ((ViewPager2$e)iterator.next()).b(n, n2, n3);
            }
        }
        catch (final ConcurrentModificationException ex) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", ex);
        }
    }
    
    public final void c(final int n) {
        try {
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                ((ViewPager2$e)iterator.next()).c(n);
            }
        }
        catch (final ConcurrentModificationException ex) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", ex);
        }
    }
}
