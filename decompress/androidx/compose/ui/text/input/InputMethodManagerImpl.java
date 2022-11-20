// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.text.input;

import android.view.inputmethod.ExtractedText;
import android.os.IBinder;
import android.view.inputmethod.InputMethodManager;
import ng2.e;
import android.view.View;
import kotlin.a;
import kotlin.LazyThreadSafetyMode;
import android.content.Context;
import cg2.f;
import o2.k;

public final class InputMethodManagerImpl implements k
{
    public final f a;
    
    public InputMethodManagerImpl(final Context context) {
        this.a = kotlin.a.a(LazyThreadSafetyMode.NONE, (mg2.a)new InputMethodManagerImpl$imm$2(context));
    }
    
    public final void a(final View view) {
        e.f((Object)view, "view");
        ((InputMethodManager)this.a.getValue()).showSoftInput(view, 0);
    }
    
    public final void b(final IBinder binder) {
        ((InputMethodManager)this.a.getValue()).hideSoftInputFromWindow(binder, 0);
    }
    
    public final void c(final View view, final int n, final int n2, final int n3, final int n4) {
        e.f((Object)view, "view");
        ((InputMethodManager)this.a.getValue()).updateSelection(view, n, n2, n3, n4);
    }
    
    public final void d(final View view, final int n, final ExtractedText extractedText) {
        ((InputMethodManager)this.a.getValue()).updateExtractedText(view, n, extractedText);
    }
    
    public final void e(final View view) {
        e.f((Object)view, "view");
        ((InputMethodManager)this.a.getValue()).restartInput(view);
    }
}
