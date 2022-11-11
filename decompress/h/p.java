// 
// Decompiled by Procyon v0.6.0
// 

package h;

import android.content.ContextWrapper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import android.view.View$OnClickListener;
import android.widget.TextView;
import android.view.InflateException;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.q;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.d;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import java.lang.reflect.Constructor;
import j0.i;

public class p
{
    public static final Class<?>[] b;
    public static final int[] c;
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;
    public static final String[] g;
    public static final i<String, Constructor<? extends View>> h;
    public final Object[] a;
    
    static {
        b = new Class[] { Context.class, AttributeSet.class };
        c = new int[] { 16843375 };
        d = new int[] { 16844160 };
        e = new int[] { 16844156 };
        f = new int[] { 16844148 };
        g = new String[] { "android.widget.", "android.view.", "android.webkit." };
        h = new i();
    }
    
    public p() {
        this.a = new Object[2];
    }
    
    public d a(final Context context, final AttributeSet set) {
        return new d(context, set);
    }
    
    public AppCompatButton b(final Context context, final AttributeSet set) {
        return new AppCompatButton(context, set);
    }
    
    public f c(final Context context, final AttributeSet set) {
        return new f(context, set);
    }
    
    public q d(final Context context, final AttributeSet set) {
        return new q(context, set);
    }
    
    public AppCompatTextView e(final Context context, final AttributeSet set) {
        return new AppCompatTextView(context, set);
    }
    
    public final View f(final Context context, final String s, String string) throws ClassNotFoundException, InflateException {
        final i<String, Constructor<? extends View>> h = p.h;
        Label_0096: {
            Constructor<? extends View> constructor;
            if ((constructor = (Constructor)h.getOrDefault((Object)s, (Object)null)) != null) {
                break Label_0096;
            }
            Label_0063: {
                if (string == null) {
                    break Label_0063;
                }
                try {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    sb.append(s);
                    string = sb.toString();
                    while (true) {
                        constructor = Class.forName(string, false, context.getClassLoader()).asSubclass(View.class).getConstructor(p.b);
                        h.put((Object)s, (Object)constructor);
                        constructor.setAccessible(true);
                        return (View)constructor.newInstance(this.a);
                        string = s;
                        continue;
                    }
                }
                catch (final Exception ex) {
                    return null;
                }
            }
        }
    }
    
    public final void g(final TextView textView, final String s) {
        if (textView != null) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getName());
        sb.append(" asked to inflate view for <");
        sb.append(s);
        sb.append(">, but returned null");
        throw new IllegalStateException(sb.toString());
    }
    
    public static final class a implements View$OnClickListener
    {
        public final View f;
        public final String g;
        public Method h;
        public Context i;
        
        public a(final View f, final String g) {
            this.f = f;
            this.g = g;
        }
        
        public final void onClick(View ex) {
            Label_0198: {
                if (this.h != null) {
                    break Label_0198;
                }
                Object i = this.f.getContext();
            Label_0064_Outer:
                while (true) {
                    Label_0087: {
                        if (i == null) {
                            break Label_0087;
                        }
                        while (true) {
                            try {
                                if (!((Context)i).isRestricted()) {
                                    final Method method = ((Context)i).getClass().getMethod(this.g, View.class);
                                    if (method != null) {
                                        this.h = method;
                                        this.i = (Context)i;
                                        try {
                                            this.h.invoke(this.i, ex);
                                            return;
                                        }
                                        catch (final InvocationTargetException ex) {
                                            throw new IllegalStateException("Could not execute method for android:onClick", ex);
                                        }
                                        catch (final IllegalAccessException ex) {
                                            throw new IllegalStateException("Could not execute non-public method for android:onClick", ex);
                                        }
                                    }
                                }
                                if (i instanceof ContextWrapper) {
                                    i = ((ContextWrapper)i).getBaseContext();
                                    continue Label_0064_Outer;
                                }
                                i = null;
                                continue Label_0064_Outer;
                                final int id = this.f.getId();
                                iftrue(Label_0108:)(id != -1);
                                ex = (InvocationTargetException)"";
                                while (true) {
                                    i = a.r("Could not find method ");
                                    ((StringBuilder)i).append(this.g);
                                    ((StringBuilder)i).append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                                    ((StringBuilder)i).append(this.f.getClass());
                                    ((StringBuilder)i).append((String)ex);
                                    throw new IllegalStateException(((StringBuilder)i).toString());
                                    Label_0108: {
                                        ex = (InvocationTargetException)a.r(" with id '");
                                    }
                                    ((StringBuilder)ex).append(this.f.getContext().getResources().getResourceEntryName(id));
                                    ((StringBuilder)ex).append("'");
                                    ex = (InvocationTargetException)((StringBuilder)ex).toString();
                                    continue;
                                }
                            }
                            catch (final NoSuchMethodException ex2) {
                                continue;
                            }
                            break;
                        }
                    }
                    break;
                }
            }
        }
    }
}
