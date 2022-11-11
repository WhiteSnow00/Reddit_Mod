// 
// Decompiled by Procyon v0.6.0
// 

package androidx.room;

import java.util.Collections;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import k5.a;
import java.util.List;
import android.content.Context;

public final class b
{
    public final n5.b.c a;
    public final Context b;
    public final String c;
    public final RoomDatabase.c d;
    public final List<RoomDatabase.b> e;
    public final List<Object> f;
    public final List<a> g;
    public final boolean h;
    public final RoomDatabase.JournalMode i;
    public final Executor j;
    public final Executor k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    
    public b(final Context b, final String c, final n5.b.c a, final RoomDatabase.c d, final ArrayList e, final boolean h, final RoomDatabase.JournalMode i, final Executor j, final Executor k, final boolean m, final boolean n) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = false;
        this.m = m;
        this.n = n;
        this.f = Collections.emptyList();
        this.g = Collections.emptyList();
    }
    
    public final boolean a(int n, final int n2) {
        boolean b = true;
        if (n > n2) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n != 0 && this.n) {
            return false;
        }
        if (!this.m) {
            b = false;
        }
        return b;
    }
}
