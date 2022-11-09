// 
// Decompiled by Procyon v0.6.0
// 

package v0;

import java.util.ArrayList;
import o2.e;
import o2.g;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.List;
import androidx.compose.foundation.text.KeyMappingKt$a;
import ah2.f;
import pg2.j;
import zg2.l;
import o2.m;
import w0.k;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.TextFieldState;

public final class o
{
    public final TextFieldState a;
    public final TextFieldSelectionManager b;
    public final TextFieldValue c;
    public final boolean d;
    public final boolean e;
    public final k f;
    public final m g;
    public final s h;
    public final b i;
    public final l<TextFieldValue, j> j;
    
    public o() {
        throw null;
    }
    
    public o(final TextFieldState a, final TextFieldSelectionManager b, final TextFieldValue c, final boolean d, final boolean e, final k f, final m g, final s h, final l j) {
        final KeyMappingKt$a a2 = v0.d.a;
        ah2.f.f((Object)a, "state");
        ah2.f.f((Object)b, "selectionManager");
        ah2.f.f((Object)c, "value");
        ah2.f.f((Object)f, "preparedSelectionState");
        ah2.f.f((Object)g, "offsetMapping");
        ah2.f.f((Object)a2, "keyMapping");
        ah2.f.f((Object)j, "onValueChange");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = (b)a2;
        this.j = (l<TextFieldValue, j>)j;
    }
    
    public final void a(final List<? extends o2.d> list) {
        final e c = this.a.c;
        final ArrayList i2 = CollectionsKt___CollectionsKt.i2((Collection)list);
        i2.add(0, new g());
        this.j.invoke((Object)c.a(i2));
    }
}
