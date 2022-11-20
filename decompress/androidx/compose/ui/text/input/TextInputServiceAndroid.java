// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.text.input;

import bj2.g;
import kotlin.jvm.internal.Ref$ObjectRef;
import bj2.h$b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.AbstractChannel$a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import gg2.c;
import java.lang.ref.WeakReference;
import o2.p;
import android.content.Context;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlin.a;
import kotlin.LazyThreadSafetyMode;
import ng2.e;
import kotlinx.coroutines.channels.AbstractChannel;
import cg2.f;
import java.util.ArrayList;
import o2.i;
import o2.h;
import cg2.j;
import o2.d;
import java.util.List;
import mg2.l;
import o2.k;
import android.view.View;
import o2.o;

public final class TextInputServiceAndroid implements o
{
    public final View a;
    public final k b;
    public boolean c;
    public l<? super List<? extends d>, j> d;
    public l<? super h, j> e;
    public TextFieldValue f;
    public i g;
    public ArrayList h;
    public final f i;
    public final AbstractChannel j;
    
    public TextInputServiceAndroid(final View a) {
        ng2.e.f((Object)a, "view");
        final Context context = a.getContext();
        ng2.e.e((Object)context, "view.context");
        final InputMethodManagerImpl b = new InputMethodManagerImpl(context);
        this.a = a;
        this.b = (k)b;
        this.d = (l<? super List<? extends d>, j>)TextInputServiceAndroid$onEditCommand$1.INSTANCE;
        this.e = (l<? super h, j>)TextInputServiceAndroid$onImeActionPerformed$1.INSTANCE;
        this.f = new TextFieldValue("", i2.o.b, 4);
        this.g = o2.i.f;
        this.h = new ArrayList();
        this.i = kotlin.a.a(LazyThreadSafetyMode.NONE, (mg2.a)new TextInputServiceAndroid$baseInputConnection$2(this));
        this.j = zg.a.e(Integer.MAX_VALUE, (BufferOverflow)null, 6);
    }
    
    public final void a() {
        this.c = false;
        this.d = (l<? super List<? extends d>, j>)TextInputServiceAndroid$stopInput$1.INSTANCE;
        this.e = (l<? super h, j>)TextInputServiceAndroid$stopInput$2.INSTANCE;
        ((bj2.a<TextInputServiceAndroid.TextInputServiceAndroid$TextInputCommand>)this.j).i(TextInputServiceAndroid.TextInputServiceAndroid$TextInputCommand.StopInput);
    }
    
    public final void b(TextFieldValue f, final TextFieldValue textFieldValue) {
        final boolean a = i2.o.a(this.f.b, textFieldValue.b);
        final boolean b = true;
        final int n = 0;
        final boolean b2 = !a || !ng2.e.a((Object)this.f.c, (Object)textFieldValue.c);
        this.f = textFieldValue;
        for (int size = this.h.size(), i = 0; i < size; ++i) {
            final p p2 = this.h.get(i).get();
            if (p2 != null) {
                p2.d = textFieldValue;
            }
        }
        final boolean a2 = ng2.e.a((Object)f, (Object)textFieldValue);
        int e = -1;
        if (a2) {
            if (b2) {
                final k b3 = this.b;
                final View a3 = this.a;
                final int f2 = i2.o.f(textFieldValue.b);
                final int e2 = i2.o.e(textFieldValue.b);
                final i2.o c = this.f.c;
                int f3;
                if (c != null) {
                    f3 = i2.o.f(c.a);
                }
                else {
                    f3 = -1;
                }
                final i2.o c2 = this.f.c;
                if (c2 != null) {
                    e = i2.o.e(c2.a);
                }
                b3.c(a3, f2, e2, f3, e);
            }
            return;
        }
        int n2 = 0;
        Label_0291: {
            if (f != null) {
                n2 = (b ? 1 : 0);
                if (!ng2.e.a((Object)f.a.f, (Object)textFieldValue.a.f)) {
                    break Label_0291;
                }
                if (i2.o.a(f.b, textFieldValue.b) && !ng2.e.a((Object)f.c, (Object)textFieldValue.c)) {
                    n2 = (b ? 1 : 0);
                    break Label_0291;
                }
            }
            n2 = 0;
        }
        if (n2 != 0) {
            this.b.e(this.a);
        }
        else {
            for (int size2 = this.h.size(), j = n; j < size2; ++j) {
                final p p3 = this.h.get(j).get();
                if (p3 != null) {
                    f = this.f;
                    final k b4 = this.b;
                    final View a4 = this.a;
                    ng2.e.f((Object)f, "state");
                    ng2.e.f((Object)b4, "inputMethodManager");
                    ng2.e.f((Object)a4, "view");
                    if (p3.h) {
                        p3.d = f;
                        if (p3.f) {
                            b4.d(a4, p3.e, xd.a.D1(f));
                        }
                        final i2.o c3 = f.c;
                        int f4;
                        if (c3 != null) {
                            f4 = i2.o.f(c3.a);
                        }
                        else {
                            f4 = -1;
                        }
                        final i2.o c4 = f.c;
                        int e3;
                        if (c4 != null) {
                            e3 = i2.o.e(c4.a);
                        }
                        else {
                            e3 = -1;
                        }
                        b4.c(a4, i2.o.f(f.b), i2.o.e(f.b), f4, e3);
                    }
                }
            }
        }
    }
    
    public final void c() {
        ((bj2.a<TextInputServiceAndroid.TextInputServiceAndroid$TextInputCommand>)this.j).i(TextInputServiceAndroid.TextInputServiceAndroid$TextInputCommand.HideKeyboard);
    }
    
    public final void d() {
        ((bj2.a<TextInputServiceAndroid.TextInputServiceAndroid$TextInputCommand>)this.j).i(TextInputServiceAndroid.TextInputServiceAndroid$TextInputCommand.ShowKeyboard);
    }
    
    public final void e(final TextFieldValue f, final i g, final l<? super List<? extends d>, j> d, final l<? super h, j> e) {
        e.f((Object)f, "value");
        e.f((Object)g, "imeOptions");
        e.f((Object)e, "onImeActionPerformed");
        this.c = true;
        this.f = f;
        this.g = g;
        this.d = d;
        this.e = e;
        ((bj2.a<TextInputServiceAndroid.TextInputServiceAndroid$TextInputCommand>)this.j).i(TextInputServiceAndroid.TextInputServiceAndroid$TextInputCommand.StartInput);
    }
    
    public final Object f(final c<? super j> c) {
        TextInputServiceAndroid$textInputCommandEventLoop$1 textInputServiceAndroid$textInputCommandEventLoop$2 = null;
        Label_0051: {
            if (c instanceof TextInputServiceAndroid$textInputCommandEventLoop$1) {
                final TextInputServiceAndroid$textInputCommandEventLoop$1 textInputServiceAndroid$textInputCommandEventLoop$1 = (TextInputServiceAndroid$textInputCommandEventLoop$1)c;
                final int label = textInputServiceAndroid$textInputCommandEventLoop$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    textInputServiceAndroid$textInputCommandEventLoop$1.label = label + Integer.MIN_VALUE;
                    textInputServiceAndroid$textInputCommandEventLoop$2 = textInputServiceAndroid$textInputCommandEventLoop$1;
                    break Label_0051;
                }
            }
            textInputServiceAndroid$textInputCommandEventLoop$2 = new TextInputServiceAndroid$textInputCommandEventLoop$1(this, (c)c);
        }
        Object result = textInputServiceAndroid$textInputCommandEventLoop$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = textInputServiceAndroid$textInputCommandEventLoop$2.label;
        while (true) {
            Object o = null;
            TextInputServiceAndroid textInputServiceAndroid = null;
            Label_0203: {
                Object l$1;
                TextInputServiceAndroid l$2;
                TextInputServiceAndroid$textInputCommandEventLoop$1 textInputServiceAndroid$textInputCommandEventLoop$3;
                if (label2 != 0) {
                    if (label2 == 1) {
                        o = textInputServiceAndroid$textInputCommandEventLoop$2.L$1;
                        textInputServiceAndroid = (TextInputServiceAndroid)textInputServiceAndroid$textInputCommandEventLoop$2.L$0;
                        cg.d.b4(result);
                        break Label_0203;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    cg.d.b4(result);
                    final AbstractChannel j = this.j;
                    j.getClass();
                    l$1 = new AbstractChannel$a(j);
                    l$2 = this;
                    textInputServiceAndroid$textInputCommandEventLoop$3 = textInputServiceAndroid$textInputCommandEventLoop$2;
                }
                textInputServiceAndroid$textInputCommandEventLoop$3.L$0 = l$2;
                textInputServiceAndroid$textInputCommandEventLoop$3.L$1 = l$1;
                textInputServiceAndroid$textInputCommandEventLoop$3.label = 1;
                final Object a = ((g)l$1).a((ContinuationImpl)textInputServiceAndroid$textInputCommandEventLoop$3);
                textInputServiceAndroid$textInputCommandEventLoop$2 = textInputServiceAndroid$textInputCommandEventLoop$3;
                o = l$1;
                textInputServiceAndroid = l$2;
                if ((result = a) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
            }
            if (!(boolean)result) {
                return cg2.j.a;
            }
            TextInputServiceAndroid.TextInputServiceAndroid$TextInputCommand textInputServiceAndroid$TextInputCommand = (TextInputServiceAndroid.TextInputServiceAndroid$TextInputCommand)((g)o).next();
            if (!textInputServiceAndroid.a.isFocused()) {
                while (textInputServiceAndroid.j.y() instanceof h$b ^ true) {}
                final TextInputServiceAndroid$textInputCommandEventLoop$1 textInputServiceAndroid$textInputCommandEventLoop$3 = textInputServiceAndroid$textInputCommandEventLoop$2;
                final Object l$1 = o;
                final TextInputServiceAndroid l$2 = textInputServiceAndroid;
                continue;
            }
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            while (textInputServiceAndroid$TextInputCommand != null) {
                final int n = TextInputServiceAndroid.TextInputServiceAndroid$a.a[((Enum)textInputServiceAndroid$TextInputCommand).ordinal()];
                if (n != 1) {
                    if (n != 2) {
                        if (n == 3 || n == 4) {
                            if (!ng2.e.a(ref$ObjectRef.element, (Object)Boolean.FALSE)) {
                                ref$ObjectRef2.element = (textInputServiceAndroid$TextInputCommand == TextInputServiceAndroid.TextInputServiceAndroid$TextInputCommand.ShowKeyboard);
                            }
                        }
                    }
                    else {
                        final Boolean false = Boolean.FALSE;
                        ref$ObjectRef.element = false;
                        ref$ObjectRef2.element = false;
                    }
                }
                else {
                    final Boolean true = Boolean.TRUE;
                    ref$ObjectRef.element = true;
                    ref$ObjectRef2.element = true;
                }
                Object y = textInputServiceAndroid.j.y();
                if (y instanceof h$b) {
                    y = null;
                }
                textInputServiceAndroid$TextInputCommand = (TextInputServiceAndroid.TextInputServiceAndroid$TextInputCommand)y;
            }
            if (ng2.e.a(ref$ObjectRef.element, (Object)Boolean.TRUE)) {
                textInputServiceAndroid.b.e(textInputServiceAndroid.a);
            }
            final Boolean b = (Boolean)ref$ObjectRef2.element;
            if (b != null) {
                if (b) {
                    textInputServiceAndroid.b.a(textInputServiceAndroid.a);
                }
                else {
                    textInputServiceAndroid.b.b(textInputServiceAndroid.a.getWindowToken());
                }
            }
            TextInputServiceAndroid$textInputCommandEventLoop$1 textInputServiceAndroid$textInputCommandEventLoop$3 = textInputServiceAndroid$textInputCommandEventLoop$2;
            Object l$1 = o;
            TextInputServiceAndroid l$2 = textInputServiceAndroid;
            if (ng2.e.a(ref$ObjectRef.element, (Object)Boolean.FALSE)) {
                textInputServiceAndroid.b.e(textInputServiceAndroid.a);
                textInputServiceAndroid$textInputCommandEventLoop$3 = textInputServiceAndroid$textInputCommandEventLoop$2;
                l$1 = o;
                l$2 = textInputServiceAndroid;
            }
            continue;
        }
    }
}
