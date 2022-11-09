// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.view;

import zg2.p;
import tg2.c;
import jj2.n;
import ah2.f;
import a4.m1;
import android.view.ViewGroup;

public final class a
{
    public static final m1 a(final ViewGroup viewGroup) {
        f.f((Object)viewGroup, "<this>");
        return new m1(viewGroup);
    }
    
    public static final n b(final ViewGroup viewGroup) {
        f.f((Object)viewGroup, "<this>");
        return new n((p)new ViewGroupKt$descendants$1(viewGroup, null));
    }
}
