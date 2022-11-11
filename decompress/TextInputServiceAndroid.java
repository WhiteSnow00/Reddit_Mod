// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.text.input;

import oj2.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;
import oj2.h$b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.AbstractChannel$a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import tg2.c;
import android.content.Context;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlin.a;
import kotlin.LazyThreadSafetyMode;
import i2.o;
import kotlinx.coroutines.channels.AbstractChannel;
import pg2.f;
import o2.q;
import o2.i;
import pg2.j;
import o2.d;
import java.util.List;
import o2.l;
import android.view.View;
import o2.p;

public final class TextInputServiceAndroid implements p
{
    public final View a;
    public final l b;
    public boolean c;
    public zg2.l<? super List<? extends d>, j> d;
    public zg2.l<? super i, j> e;
    public TextFieldValue f;
    public o2.j g;
    public q h;
    public final f i;
    public final AbstractChannel j;
    
    public TextInputServiceAndroid(final View a) {
        ah2.f.f((Object)a, "view");
        final Context context = a.getContext();
        ah2.f.e((Object)context, "view.context");
        final InputMethodManagerImpl b = new InputMethodManagerImpl(context);
        this.a = a;
        this.b = b;
        this.d = (zg2.l<? super List<? extends d>, j>)TextInputServiceAndroid$onEditCommand$1.INSTANCE;
        this.e = (zg2.l<? super i, j>)TextInputServiceAndroid$onImeActionPerformed$1.INSTANCE;
        this.f = new TextFieldValue("", o.b, 4);
        this.g = o2.j.f;
        this.i = kotlin.a.a(LazyThreadSafetyMode.NONE, (zg2.a)new TextInputServiceAndroid$baseInputConnection$2(this));
        this.j = yl.a.b(Integer.MAX_VALUE, (BufferOverflow)null, 6);
    }
    
    @Override
    public final void a() {
        this.c = false;
        this.d = (zg2.l<? super List<? extends d>, j>)TextInputServiceAndroid$stopInput.TextInputServiceAndroid$stopInput$1.INSTANCE;
        this.e = (zg2.l<? super i, j>)TextInputServiceAndroid$stopInput.TextInputServiceAndroid$stopInput$2.INSTANCE;
        ((oj2.a)this.j).e((Object)TextInputCommand.StopInput);
    }
    
    @Override
    public final void b(TextFieldValue f, final TextFieldValue textFieldValue) {
        final boolean a = o.a(this.f.b, textFieldValue.b);
        final boolean b = true;
        final int n = 0;
        final boolean b2 = !a || !ah2.f.a((Object)this.f.c, (Object)textFieldValue.c);
        this.f = textFieldValue;
        final q h = this.h;
        if (h != null) {
            h.d = textFieldValue;
        }
        final boolean a2 = ah2.f.a((Object)f, (Object)textFieldValue);
        int n2 = -1;
        if (a2) {
            if (b2) {
                final l b3 = this.b;
                final View a3 = this.a;
                final int f2 = o.f(textFieldValue.b);
                final int e = o.e(textFieldValue.b);
                final o c = this.f.c;
                int f3;
                if (c != null) {
                    f3 = o.f(c.a);
                }
                else {
                    f3 = -1;
                }
                final o c2 = this.f.c;
                if (c2 != null) {
                    n2 = o.e(c2.a);
                }
                b3.c(a3, f2, e, f3, n2);
            }
            return;
        }
        int n3 = n;
        if (f != null) {
            n3 = (b ? 1 : 0);
            if (ah2.f.a((Object)f.a.f, (Object)textFieldValue.a.f)) {
                if (o.a(f.b, textFieldValue.b) && !ah2.f.a((Object)f.c, (Object)textFieldValue.c)) {
                    n3 = (b ? 1 : 0);
                }
                else {
                    n3 = 0;
                }
            }
        }
        if (n3 != 0) {
            this.b.e(this.a);
        }
        else {
            final q h2 = this.h;
            if (h2 != null) {
                f = this.f;
                final l b4 = this.b;
                final View a4 = this.a;
                ah2.f.f((Object)f, "state");
                ah2.f.f((Object)b4, "inputMethodManager");
                ah2.f.f((Object)a4, "view");
                if (h2.h) {
                    h2.d = f;
                    if (h2.f) {
                        b4.d(a4, h2.e, at1.a.e2(f));
                    }
                    final o c3 = f.c;
                    int f4;
                    if (c3 != null) {
                        f4 = o.f(c3.a);
                    }
                    else {
                        f4 = -1;
                    }
                    final o c4 = f.c;
                    if (c4 != null) {
                        n2 = o.e(c4.a);
                    }
                    b4.c(a4, o.f(f.b), o.e(f.b), f4, n2);
                }
            }
        }
    }
    
    @Override
    public final void c(final TextFieldValue f, final o2.j g, final zg2.l<? super List<? extends d>, j> d, final zg2.l<? super i, j> e) {
        ah2.f.f((Object)f, "value");
        ah2.f.f((Object)g, "imeOptions");
        ah2.f.f((Object)e, "onImeActionPerformed");
        this.c = true;
        this.f = f;
        this.g = g;
        this.d = d;
        this.e = e;
        ((oj2.a)this.j).e((Object)TextInputCommand.StartInput);
    }
    
    @Override
    public final void d() {
        ((oj2.a)this.j).e((Object)TextInputCommand.HideKeyboard);
    }
    
    @Override
    public final void e() {
        ((oj2.a)this.j).e((Object)TextInputCommand.ShowKeyboard);
    }
    
    public final Object f(final c<? super j> c) {
        TextInputServiceAndroid$textInputCommandEventLoop.TextInputServiceAndroid$textInputCommandEventLoop$1 textInputServiceAndroid$textInputCommandEventLoop$2 = null;
        Label_0047: {
            if (c instanceof TextInputServiceAndroid$textInputCommandEventLoop.TextInputServiceAndroid$textInputCommandEventLoop$1) {
                final TextInputServiceAndroid$textInputCommandEventLoop.TextInputServiceAndroid$textInputCommandEventLoop$1 textInputServiceAndroid$textInputCommandEventLoop$1 = (TextInputServiceAndroid$textInputCommandEventLoop.TextInputServiceAndroid$textInputCommandEventLoop$1)c;
                final int label = textInputServiceAndroid$textInputCommandEventLoop$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    textInputServiceAndroid$textInputCommandEventLoop$1.label = label + Integer.MIN_VALUE;
                    textInputServiceAndroid$textInputCommandEventLoop$2 = textInputServiceAndroid$textInputCommandEventLoop$1;
                    break Label_0047;
                }
            }
            textInputServiceAndroid$textInputCommandEventLoop$2 = new TextInputServiceAndroid$textInputCommandEventLoop.TextInputServiceAndroid$textInputCommandEventLoop$1(this, (c)c);
        }
        Object result = textInputServiceAndroid$textInputCommandEventLoop$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = textInputServiceAndroid$textInputCommandEventLoop$2.label;
        while (true) {
            Object o = null;
            TextInputServiceAndroid textInputServiceAndroid = null;
            Label_0194: {
                Object l$1;
                TextInputServiceAndroid l$2;
                TextInputServiceAndroid$textInputCommandEventLoop.TextInputServiceAndroid$textInputCommandEventLoop$1 textInputServiceAndroid$textInputCommandEventLoop$3;
                if (label2 != 0) {
                    if (label2 == 1) {
                        o = textInputServiceAndroid$textInputCommandEventLoop$2.L$1;
                        textInputServiceAndroid = (TextInputServiceAndroid)textInputServiceAndroid$textInputCommandEventLoop$2.L$0;
                        aj2.c.Q0(result);
                        break Label_0194;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    aj2.c.Q0(result);
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
                return pg2.j.a;
            }
            TextInputCommand textInputCommand = (TextInputCommand)((g)o).next();
            if (!textInputServiceAndroid.a.isFocused()) {
                while (textInputServiceAndroid.j.j() instanceof h$b ^ true) {}
                final TextInputServiceAndroid$textInputCommandEventLoop.TextInputServiceAndroid$textInputCommandEventLoop$1 textInputServiceAndroid$textInputCommandEventLoop$3 = textInputServiceAndroid$textInputCommandEventLoop$2;
                final Object l$1 = o;
                final TextInputServiceAndroid l$2 = textInputServiceAndroid;
                continue;
            }
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            while (textInputCommand != null) {
                final int n = TextInputServiceAndroid.a.a[textInputCommand.ordinal()];
                if (n != 1) {
                    if (n != 2) {
                        if (n == 3 || n == 4) {
                            if (!ah2.f.a(ref$ObjectRef.element, (Object)Boolean.FALSE)) {
                                ref$ObjectRef2.element = (textInputCommand == TextInputCommand.ShowKeyboard);
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
                Object i = textInputServiceAndroid.j.j();
                if (i instanceof h$b) {
                    i = null;
                }
                textInputCommand = (TextInputCommand)i;
            }
            if (ah2.f.a(ref$ObjectRef.element, (Object)Boolean.TRUE)) {
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
            TextInputServiceAndroid$textInputCommandEventLoop.TextInputServiceAndroid$textInputCommandEventLoop$1 textInputServiceAndroid$textInputCommandEventLoop$3 = textInputServiceAndroid$textInputCommandEventLoop$2;
            Object l$1 = o;
            TextInputServiceAndroid l$2 = textInputServiceAndroid;
            if (ah2.f.a(ref$ObjectRef.element, (Object)Boolean.FALSE)) {
                textInputServiceAndroid.b.e(textInputServiceAndroid.a);
                textInputServiceAndroid$textInputCommandEventLoop$3 = textInputServiceAndroid$textInputCommandEventLoop$2;
                l$1 = o;
                l$2 = textInputServiceAndroid;
            }
            continue;
        }
    }
    
    @Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007" }, d2 = { "Landroidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand;", "", "(Ljava/lang/String;I)V", "StartInput", "StopInput", "ShowKeyboard", "HideKeyboard", "ui_release" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public enum TextInputCommand
    {
        HideKeyboard, 
        ShowKeyboard, 
        StartInput, 
        StopInput;
    }
}
