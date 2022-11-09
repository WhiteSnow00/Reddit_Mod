// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.view.View;
import p4.g;
import mj2.c0;
import androidx.emoji2.text.f;
import p4.c;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p4.e;
import android.text.method.NumberKeyListener;
import android.text.method.KeyListener;
import p4.a;
import android.widget.EditText;

public final class k
{
    public final EditText a;
    public final a b;
    
    public k(final EditText a) {
        this.a = a;
        this.b = new a(a);
    }
    
    public final KeyListener a(final KeyListener keyListener) {
        Object o = keyListener;
        if (keyListener instanceof NumberKeyListener ^ true) {
            this.b.a.getClass();
            if (keyListener instanceof e) {
                o = keyListener;
            }
            else if (keyListener == null) {
                o = null;
            }
            else if (keyListener instanceof NumberKeyListener) {
                o = keyListener;
            }
            else {
                o = new e(keyListener);
            }
        }
        return (KeyListener)o;
    }
    
    public final void b(final AttributeSet set, final int n) {
        final TypedArray obtainStyledAttributes = ((View)this.a).getContext().obtainStyledAttributes(set, gn.a.Y, n, 0);
        try {
            final boolean hasValue = obtainStyledAttributes.hasValue(14);
            boolean boolean1 = true;
            if (hasValue) {
                boolean1 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            this.d(boolean1);
        }
        finally {
            obtainStyledAttributes.recycle();
        }
    }
    
    public final InputConnection c(InputConnection inputConnection, final EditorInfo editorInfo) {
        final a b = this.b;
        if (inputConnection == null) {
            b.getClass();
            inputConnection = null;
        }
        else {
            final a.a$a a = b.a;
            a.getClass();
            if (!(inputConnection instanceof c)) {
                inputConnection = (InputConnection)new c(a.a, inputConnection, editorInfo);
            }
        }
        return inputConnection;
    }
    
    public final void d(final boolean i) {
        final g b = this.b.a.b;
        if (b.i != i) {
            if (b.h != null) {
                final f a = f.a();
                final g.g$a h = b.h;
                a.getClass();
                c0.s((Object)h, "initCallback cannot be null");
                a.a.writeLock().lock();
                try {
                    a.b.remove((Object)h);
                }
                finally {
                    a.a.writeLock().unlock();
                }
            }
            b.i = i;
            if (i) {
                g.a(b.f, f.a().b());
            }
        }
    }
}
