// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.text.input;

import android.view.inputmethod.ExtractedText;
import android.os.IBinder;
import android.view.inputmethod.InputMethodManager;
import android.view.View;
import kotlin.a;
import kotlin.LazyThreadSafetyMode;
import android.content.Context;
import pg2.f;
import o2.l;

public final class InputMethodManagerImpl implements l
{
    public final f a;
    
    public InputMethodManagerImpl(final Context context) {
        this.a = kotlin.a.a(LazyThreadSafetyMode.NONE, (zg2.a)new InputMethodManagerImpl$imm.InputMethodManagerImpl$imm$2(context));
    }
    
    @Override
    public final void a(final View view) {
        ah2.f.f((Object)view, "view");
        ((InputMethodManager)this.a.getValue()).showSoftInput(view, 0);
    }
    
    @Override
    public final void b(final IBinder binder) {
        ((InputMethodManager)this.a.getValue()).hideSoftInputFromWindow(binder, 0);
    }
    
    @Override
    public final void c(final View view, final int n, final int n2, final int n3, final int n4) {
        ah2.f.f((Object)view, "view");
        ((InputMethodManager)this.a.getValue()).updateSelection(view, n, n2, n3, n4);
    }
    
    @Override
    public final void d(final View view, final int n, final ExtractedText extractedText) {
        ((InputMethodManager)this.a.getValue()).updateExtractedText(view, n, extractedText);
    }
    
    @Override
    public final void e(final View view) {
        ah2.f.f((Object)view, "view");
        ((InputMethodManager)this.a.getValue()).restartInput(view);
    }
}
