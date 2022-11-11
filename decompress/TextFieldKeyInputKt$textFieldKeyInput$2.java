// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text;

import d2.e;
import x1.b;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import v0.o;
import w0.k;
import z0.d$a;
import ah2.f;
import v0.s;
import pg2.j;
import androidx.compose.ui.text.input.TextFieldValue;
import zg2.l;
import o2.m;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import kotlin.Metadata;
import j1.d;
import zg2.q;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lj1/d;", "invoke", "(Lj1/d;Lz0/d;I)Lj1/d;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class TextFieldKeyInputKt$textFieldKeyInput$2 extends Lambda implements q<d, z0.d, Integer, d>
{
    public final /* synthetic */ boolean $editable;
    public final /* synthetic */ TextFieldSelectionManager $manager;
    public final /* synthetic */ m $offsetMapping;
    public final /* synthetic */ l<TextFieldValue, j> $onValueChange;
    public final /* synthetic */ boolean $singleLine;
    public final /* synthetic */ TextFieldState $state;
    public final /* synthetic */ s $undoManager;
    public final /* synthetic */ TextFieldValue $value;
    
    public TextFieldKeyInputKt$textFieldKeyInput$2(final TextFieldState $state, final TextFieldSelectionManager $manager, final TextFieldValue $value, final boolean $editable, final boolean $singleLine, final m $offsetMapping, final s $undoManager, final l<? super TextFieldValue, j> $onValueChange) {
        this.$state = $state;
        this.$manager = $manager;
        this.$value = $value;
        this.$editable = $editable;
        this.$singleLine = $singleLine;
        this.$offsetMapping = $offsetMapping;
        this.$undoManager = $undoManager;
        this.$onValueChange = (l<TextFieldValue, j>)$onValueChange;
        super(3);
    }
    
    public final d invoke(d a, final z0.d d, final int n) {
        f.f((Object)a, "$this$composed");
        d.A(58482146);
        d.A(-492369756);
        Object b;
        if ((b = d.B()) == d$a.a) {
            b = new k();
            d.v(b);
        }
        d.I();
        final o o = new o(this.$state, this.$manager, this.$value, this.$editable, this.$singleLine, (k)b, this.$offsetMapping, this.$undoManager, this.$onValueChange);
        final d.a f = j1.d.a.f;
        final TextFieldKeyInputKt$textFieldKeyInput$2$1 textFieldKeyInputKt$textFieldKeyInput$2$1 = new TextFieldKeyInputKt$textFieldKeyInput$2$1((Object)o);
        final e a2 = KeyInputModifierKt.a;
        a = InspectableValueKt.a((d)f, InspectableValueKt.a, (d)new x1.d((l<? super b, Boolean>)textFieldKeyInputKt$textFieldKeyInput$2$1, null));
        d.I();
        return a;
    }
}
