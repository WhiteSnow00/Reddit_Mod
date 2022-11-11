// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy;

import l0.f;
import l0.e;
import q0.j;
import kotlin.Metadata;
import java.util.concurrent.CancellationException;

@Metadata(bv = {}, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011" }, d2 = { "Landroidx/compose/foundation/lazy/ItemFoundInScroll;", "Ljava/util/concurrent/CancellationException;", "Lkotlin/coroutines/cancellation/CancellationException;", "Lq0/j;", "item", "Lq0/j;", "getItem", "()Lq0/j;", "Ll0/e;", "", "Ll0/f;", "previousAnimation", "Ll0/e;", "getPreviousAnimation", "()Ll0/e;", "<init>", "(Lq0/j;Ll0/e;)V", "foundation_release" }, k = 1, mv = { 1, 6, 0 })
final class ItemFoundInScroll extends CancellationException
{
    private final j item;
    private final e<Float, f> previousAnimation;
    
    public ItemFoundInScroll(final j item, final e<Float, f> previousAnimation) {
        ah2.f.f((Object)item, "item");
        ah2.f.f((Object)previousAnimation, "previousAnimation");
        this.item = item;
        this.previousAnimation = previousAnimation;
    }
    
    public final j getItem() {
        return this.item;
    }
    
    public final e<Float, f> getPreviousAnimation() {
        return this.previousAnimation;
    }
}
