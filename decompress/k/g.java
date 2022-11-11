// 
// Decompiled by Procyon v0.6.0
// 

package k;

import a4.y;
import android.os.Build$VERSION;
import android.view.View;
import l.c;
import java.lang.reflect.Constructor;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.view.InflateException;
import al0.f0;
import android.view.MenuItem;
import java.lang.reflect.Method;
import android.view.MenuItem$OnMenuItemClickListener;
import org.xmlpull.v1.XmlPullParser;
import android.util.Xml;
import t3.a;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import android.view.SubMenu;
import android.content.res.TypedArray;
import androidx.appcompat.widget.d0;
import android.util.Log;
import a4.b;
import androidx.appcompat.widget.z0;
import a4.a0;
import android.view.Menu;
import android.util.AttributeSet;
import android.content.res.XmlResourceParser;
import android.content.ContextWrapper;
import android.app.Activity;
import android.content.Context;
import android.view.MenuInflater;

public final class g extends MenuInflater
{
    public static final Class<?>[] e;
    public static final Class<?>[] f;
    public final Object[] a;
    public final Object[] b;
    public Context c;
    public Object d;
    
    static {
        f = (e = new Class[] { Context.class });
    }
    
    public g(final Context c) {
        super(c);
        this.c = c;
        final Object[] array = { c };
        this.a = array;
        this.b = array;
    }
    
    public static Object a(final Context context) {
        if (context instanceof Activity) {
            return context;
        }
        Object a = context;
        if (context instanceof ContextWrapper) {
            a = a(((ContextWrapper)context).getBaseContext());
        }
        return a;
    }
    
    public final void b(final XmlResourceParser xmlResourceParser, final AttributeSet set, final Menu menu) throws XmlPullParserException, IOException {
        final b b = new b(menu);
        int i = ((XmlPullParser)xmlResourceParser).getEventType();
        String name3;
        while (true) {
            while (i != 2) {
                i = ((XmlPullParser)xmlResourceParser).next();
                if (i == 1) {
                    Object o = null;
                    int n;
                    int j = n = 0;
                    int next = i;
                    while (j == 0) {
                        if (next == 1) {
                            throw new RuntimeException("Unexpected end of document");
                        }
                        int n3 = 0;
                        Label_1151: {
                            int n2;
                            if (next != 2) {
                                if (next != 3) {
                                    n2 = j;
                                }
                                else {
                                    final String name = ((XmlPullParser)xmlResourceParser).getName();
                                    if (n != 0 && name.equals(o)) {
                                        o = null;
                                        n3 = 0;
                                        break Label_1151;
                                    }
                                    if (name.equals("group")) {
                                        b.b = 0;
                                        b.c = 0;
                                        b.d = 0;
                                        b.e = 0;
                                        b.f = true;
                                        b.g = true;
                                        n2 = j;
                                    }
                                    else if (name.equals("item")) {
                                        n2 = j;
                                        if (!b.h) {
                                            final a4.b z = b.z;
                                            if (z != null && z.a()) {
                                                b.h = true;
                                                b.b(b.a.addSubMenu(b.b, b.i, b.j, b.k).getItem());
                                                n2 = j;
                                            }
                                            else {
                                                b.h = true;
                                                b.b(b.a.add(b.b, b.i, b.j, b.k));
                                                n2 = j;
                                            }
                                        }
                                    }
                                    else {
                                        n2 = j;
                                        if (name.equals("menu")) {
                                            n2 = 1;
                                        }
                                    }
                                }
                            }
                            else if (n != 0) {
                                n2 = j;
                            }
                            else {
                                final String name2 = ((XmlPullParser)xmlResourceParser).getName();
                                if (name2.equals("group")) {
                                    final TypedArray obtainStyledAttributes = b.E.c.obtainStyledAttributes(set, a0.z);
                                    b.b = obtainStyledAttributes.getResourceId(1, 0);
                                    b.c = obtainStyledAttributes.getInt(3, 0);
                                    b.d = obtainStyledAttributes.getInt(4, 0);
                                    b.e = obtainStyledAttributes.getInt(5, 0);
                                    b.f = obtainStyledAttributes.getBoolean(2, true);
                                    b.g = obtainStyledAttributes.getBoolean(0, true);
                                    obtainStyledAttributes.recycle();
                                    n2 = j;
                                }
                                else if (name2.equals("item")) {
                                    final Context c = b.E.c;
                                    final z0 z2 = new z0(c, c.obtainStyledAttributes(set, a0.A));
                                    b.i = z2.i(2, 0);
                                    b.j = ((z2.h(5, b.c) & 0xFFFF0000) | (z2.h(6, b.d) & 0xFFFF));
                                    b.k = z2.k(7);
                                    b.l = z2.k(8);
                                    b.m = z2.i(0, 0);
                                    final String k = z2.j(9);
                                    char char1;
                                    if (k == null) {
                                        char1 = '\0';
                                    }
                                    else {
                                        char1 = k.charAt(0);
                                    }
                                    b.n = char1;
                                    b.o = z2.h(16, 4096);
                                    final String l = z2.j(10);
                                    char char2;
                                    if (l == null) {
                                        char2 = '\0';
                                    }
                                    else {
                                        char2 = l.charAt(0);
                                    }
                                    b.p = char2;
                                    b.q = z2.h(20, 4096);
                                    if (z2.l(11)) {
                                        b.r = (z2.a(11, false) ? 1 : 0);
                                    }
                                    else {
                                        b.r = b.e;
                                    }
                                    b.s = z2.a(3, false);
                                    b.t = z2.a(4, b.f);
                                    b.u = z2.a(1, b.g);
                                    b.v = z2.h(21, -1);
                                    b.y = z2.j(12);
                                    b.w = z2.i(13, 0);
                                    b.x = z2.j(15);
                                    final String m = z2.j(14);
                                    final boolean b2 = m != null;
                                    if (b2 && b.w == 0 && b.x == null) {
                                        b.z = (a4.b)b.a(m, g.f, b.E.b);
                                    }
                                    else {
                                        if (b2) {
                                            Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                        }
                                        b.z = null;
                                    }
                                    b.A = z2.k(17);
                                    b.B = z2.k(22);
                                    if (z2.l(19)) {
                                        b.D = d0.c(z2.h(19, -1), b.D);
                                    }
                                    else {
                                        b.D = null;
                                    }
                                    if (z2.l(18)) {
                                        b.C = z2.b(18);
                                    }
                                    else {
                                        b.C = null;
                                    }
                                    z2.n();
                                    b.h = false;
                                    n2 = j;
                                }
                                else {
                                    if (name2.equals("menu")) {
                                        b.h = true;
                                        final SubMenu addSubMenu = b.a.addSubMenu(b.b, b.i, b.j, b.k);
                                        b.b(addSubMenu.getItem());
                                        this.b(xmlResourceParser, set, (Menu)addSubMenu);
                                        n3 = n;
                                        break Label_1151;
                                    }
                                    o = name2;
                                    n3 = 1;
                                    break Label_1151;
                                }
                            }
                            j = n2;
                            n3 = n;
                        }
                        next = ((XmlPullParser)xmlResourceParser).next();
                        n = n3;
                    }
                    return;
                }
            }
            name3 = ((XmlPullParser)xmlResourceParser).getName();
            if (name3.equals("menu")) {
                i = ((XmlPullParser)xmlResourceParser).next();
                continue;
            }
            break;
        }
        throw new RuntimeException(al0.b.h("Expecting menu, got ", name3));
    }
    
    public final void inflate(final int n, final Menu menu) {
        if (!(menu instanceof t3.a)) {
            super.inflate(n, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                final XmlResourceParser xmlResourceParser = layout = this.c.getResources().getLayout(n);
                this.b(xmlResourceParser, Xml.asAttributeSet((XmlPullParser)xmlResourceParser), menu);
                xmlResourceParser.close();
            }
            finally {
                if (layout != null) {
                    layout.close();
                }
            }
        }
        catch (final IOException ex) {}
        catch (final XmlPullParserException ex2) {}
    }
    
    public static final class a implements MenuItem$OnMenuItemClickListener
    {
        public static final Class<?>[] c;
        public Object a;
        public Method b;
        
        static {
            c = new Class[] { MenuItem.class };
        }
        
        public a(final Object a, final String s) {
            this.a = a;
            final Class<?> class1 = a.getClass();
            try {
                this.b = class1.getMethod(s, a.c);
            }
            catch (final Exception ex) {
                final InflateException ex2 = new InflateException(f0.i((Class)class1, al0.a.p("Couldn't resolve menu item onClick handler ", s, " in class ")));
                ((Throwable)ex2).initCause(ex);
                throw ex2;
            }
        }
        
        public final boolean onMenuItemClick(final MenuItem menuItem) {
            try {
                if (this.b.getReturnType() == Boolean.TYPE) {
                    return (boolean)this.b.invoke(this.a, menuItem);
                }
                this.b.invoke(this.a, menuItem);
                return true;
            }
            catch (final Exception ex) {
                throw new RuntimeException(ex);
            }
        }
    }
    
    public final class b
    {
        public CharSequence A;
        public CharSequence B;
        public ColorStateList C;
        public PorterDuff$Mode D;
        public final /* synthetic */ g E;
        public Menu a;
        public int b;
        public int c;
        public int d;
        public int e;
        public boolean f;
        public boolean g;
        public boolean h;
        public int i;
        public int j;
        public CharSequence k;
        public CharSequence l;
        public int m;
        public char n;
        public int o;
        public char p;
        public int q;
        public int r;
        public boolean s;
        public boolean t;
        public boolean u;
        public int v;
        public int w;
        public String x;
        public String y;
        public a4.b z;
        
        public b(final Menu a) {
            this.C = null;
            this.D = null;
            this.a = a;
            this.b = 0;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = true;
            this.g = true;
        }
        
        public final <T> T a(final String s, final Class<?>[] array, final Object[] array2) {
            try {
                final Constructor<?> constructor = Class.forName(s, false, k.g.this.c.getClassLoader()).getConstructor(array);
                constructor.setAccessible(true);
                return (T)constructor.newInstance(array2);
            }
            catch (final Exception ex) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Cannot instantiate class: ");
                sb.append(s);
                Log.w("SupportMenuInflater", sb.toString(), (Throwable)ex);
                return null;
            }
        }
        
        public final void b(final MenuItem menuItem) {
            final MenuItem setEnabled = menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u);
            final int r = this.r;
            boolean b = false;
            setEnabled.setCheckable(r >= 1).setTitleCondensed(this.l).setIcon(this.m);
            final int v = this.v;
            if (v >= 0) {
                menuItem.setShowAsAction(v);
            }
            if (this.y != null) {
                if (k.g.this.c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                final g e = k.g.this;
                if (e.d == null) {
                    e.d = k.g.a(e.c);
                }
                menuItem.setOnMenuItemClickListener((MenuItem$OnMenuItemClickListener)new a(e.d, this.y));
            }
            if (this.r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.g) {
                    final androidx.appcompat.view.menu.g g = (androidx.appcompat.view.menu.g)menuItem;
                    g.x = ((g.x & 0xFFFFFFFB) | 0x4);
                }
                else if (menuItem instanceof c) {
                    final c c = (c)menuItem;
                    try {
                        if (c.e == null) {
                            c.e = c.d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        c.e.invoke(c.d, Boolean.TRUE);
                    }
                    catch (final Exception ex) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", (Throwable)ex);
                    }
                }
            }
            final String x = this.x;
            if (x != null) {
                menuItem.setActionView((View)this.a(x, k.g.e, k.g.this.a));
                b = true;
            }
            final int w = this.w;
            if (w > 0) {
                if (!b) {
                    menuItem.setActionView(w);
                }
                else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            final a4.b z = this.z;
            if (z != null) {
                if (menuItem instanceof t3.b) {
                    ((t3.b)menuItem).a(z);
                }
                else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            final CharSequence a = this.A;
            final boolean b2 = menuItem instanceof t3.b;
            if (b2) {
                ((t3.b)menuItem).setContentDescription(a);
            }
            else if (Build$VERSION.SDK_INT >= 26) {
                a4.y.h(menuItem, a);
            }
            final CharSequence b3 = this.B;
            if (b2) {
                ((t3.b)menuItem).setTooltipText(b3);
            }
            else if (Build$VERSION.SDK_INT >= 26) {
                a4.y.m(menuItem, b3);
            }
            final char n = this.n;
            final int o = this.o;
            if (b2) {
                ((t3.b)menuItem).setAlphabeticShortcut(n, o);
            }
            else if (Build$VERSION.SDK_INT >= 26) {
                a4.y.g(menuItem, n, o);
            }
            final char p = this.p;
            final int q = this.q;
            if (b2) {
                ((t3.b)menuItem).setNumericShortcut(p, q);
            }
            else if (Build$VERSION.SDK_INT >= 26) {
                a4.y.k(menuItem, p, q);
            }
            final PorterDuff$Mode d = this.D;
            if (d != null) {
                if (b2) {
                    ((t3.b)menuItem).setIconTintMode(d);
                }
                else if (Build$VERSION.SDK_INT >= 26) {
                    a4.y.j(menuItem, d);
                }
            }
            final ColorStateList c2 = this.C;
            if (c2 != null) {
                if (b2) {
                    ((t3.b)menuItem).setIconTintList(c2);
                }
                else if (Build$VERSION.SDK_INT >= 26) {
                    a4.y.i(menuItem, c2);
                }
            }
        }
    }
}
