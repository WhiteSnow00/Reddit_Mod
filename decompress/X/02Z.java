// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.SubMenu;
import android.content.res.TypedArray;
import android.os.Build$VERSION;
import android.view.View;
import java.lang.reflect.Constructor;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.view.MenuItem;
import java.lang.reflect.Method;
import android.view.MenuItem$OnMenuItemClickListener;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import android.view.InflateException;
import android.util.Xml;
import android.content.ContextWrapper;
import android.app.Activity;
import android.view.Menu;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import com.bytedance.covode.number.Covode;
import android.content.Context;
import android.view.MenuInflater;

public final class 02Z extends MenuInflater
{
    public static final Class<?>[] LIZ;
    public static final Class<?>[] LIZIZ;
    public final Object[] LIZJ;
    public final Object[] LIZLLL;
    public Context LJ;
    public Object LJFF;
    
    static {
        Covode.recordClassIndex(325);
        LIZIZ = (LIZ = new Class[] { Context.class });
    }
    
    public 02Z(final Context lj) {
        super(lj);
        this.LJ = lj;
        final Object[] array = { lj };
        this.LIZJ = array;
        this.LIZLLL = array;
    }
    
    private void LIZ(final XmlPullParser xmlPullParser, final AttributeSet set, final Menu menu) {
        final b b = new b(menu);
        int i = xmlPullParser.getEventType();
        while (i != 2) {
            if ((i = xmlPullParser.next()) == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
        }
        final String name = xmlPullParser.getName();
        if (name.equals("menu")) {
            int j = xmlPullParser.next();
            String s = null;
            int n = 0;
            int n2 = 0;
            while (j != 1) {
                int n3;
                int n4;
                String name2;
                if (j != 2) {
                    if (j != 3) {
                        n3 = n;
                        n4 = n2;
                        name2 = s;
                    }
                    else {
                        final String name3 = xmlPullParser.getName();
                        if (n2 != 0 && name3.equals(s)) {
                            name2 = null;
                            n4 = 0;
                            n3 = n;
                        }
                        else if (name3.equals("group")) {
                            b.LIZ();
                            name2 = s;
                            n4 = n2;
                            n3 = n;
                        }
                        else if (name3.equals("item")) {
                            name2 = s;
                            n4 = n2;
                            n3 = n;
                            if (!b.LIZ) {
                                if (b.LIZIZ != null && b.LIZIZ.LIZJ()) {
                                    b.LIZJ();
                                    name2 = s;
                                    n4 = n2;
                                    n3 = n;
                                }
                                else {
                                    b.LIZIZ();
                                    name2 = s;
                                    n4 = n2;
                                    n3 = n;
                                }
                            }
                        }
                        else {
                            name2 = s;
                            n4 = n2;
                            n3 = n;
                            if (name3.equals("menu")) {
                                n3 = 1;
                                name2 = s;
                                n4 = n2;
                            }
                        }
                    }
                }
                else {
                    name2 = s;
                    n4 = n2;
                    n3 = n;
                    if (n2 == 0) {
                        name2 = xmlPullParser.getName();
                        if (name2.equals("group")) {
                            b.LIZ(set);
                            name2 = s;
                            n4 = n2;
                            n3 = n;
                        }
                        else if (name2.equals("item")) {
                            b.LIZIZ(set);
                            name2 = s;
                            n4 = n2;
                            n3 = n;
                        }
                        else if (name2.equals("menu")) {
                            this.LIZ(xmlPullParser, set, (Menu)b.LIZJ());
                            name2 = s;
                            n4 = n2;
                            n3 = n;
                        }
                        else {
                            n4 = 1;
                            n3 = n;
                        }
                    }
                }
                j = xmlPullParser.next();
                if (n3 != 0) {
                    return;
                }
                s = name2;
                n2 = n4;
                n = n3;
            }
            throw new RuntimeException("Unexpected end of document");
        }
        throw new RuntimeException("Expecting menu, got ".concat(String.valueOf(name)));
    }
    
    public final Object LIZ(Object baseContext) {
        while (!(baseContext instanceof Activity)) {
            if (!(baseContext instanceof ContextWrapper)) {
                return baseContext;
            }
            baseContext = ((ContextWrapper)baseContext).getBaseContext();
        }
        return baseContext;
    }
    
    public final void inflate(final int n, final Menu menu) {
        if (!(menu instanceof 05n)) {
            super.inflate(n, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        XmlResourceParser xmlResourceParser2 = null;
        XmlResourceParser layout = null;
        try {
            final XmlResourceParser xmlResourceParser3 = xmlResourceParser2 = (xmlResourceParser = (layout = this.LJ.getResources().getLayout(n)));
            this.LIZ((XmlPullParser)xmlResourceParser3, Xml.asAttributeSet((XmlPullParser)xmlResourceParser3), menu);
        }
        catch (final IOException ex) {
            xmlResourceParser2 = layout;
            xmlResourceParser2 = layout;
            final InflateException ex2 = new InflateException("Error inflating menu XML", (Throwable)ex);
            xmlResourceParser2 = layout;
            throw ex2;
        }
        catch (final XmlPullParserException ex3) {
            xmlResourceParser2 = xmlResourceParser;
            xmlResourceParser2 = xmlResourceParser;
            final InflateException ex4 = new InflateException("Error inflating menu XML", (Throwable)ex3);
            xmlResourceParser2 = xmlResourceParser;
            throw ex4;
        }
        finally {
            if (xmlResourceParser2 != null) {
                xmlResourceParser2.close();
            }
        }
    }
    
    public static final class a implements MenuItem$OnMenuItemClickListener
    {
        public static final Class<?>[] LIZ;
        public Object LIZIZ;
        public Method LIZJ;
        
        static {
            Covode.recordClassIndex(326);
            LIZ = new Class[] { MenuItem.class };
        }
        
        public a(final Object liziz, final String s) {
            this.LIZIZ = liziz;
            final Class<?> class1 = liziz.getClass();
            try {
                this.LIZJ = class1.getMethod(s, a.LIZ);
            }
            catch (final Exception ex) {
                final StringBuilder sb = new StringBuilder("Couldn't resolve menu item onClick handler ");
                sb.append(s);
                sb.append(" in class ");
                sb.append(class1.getName());
                final InflateException ex2 = new InflateException(sb.toString());
                ex2.initCause((Throwable)ex);
                throw ex2;
            }
        }
        
        public final boolean onMenuItemClick(final MenuItem menuItem) {
            try {
                if (this.LIZJ.getReturnType() == Boolean.TYPE) {
                    return (boolean)this.LIZJ.invoke(this.LIZIZ, menuItem);
                }
                this.LIZJ.invoke(this.LIZIZ, menuItem);
                return true;
            }
            catch (final Exception ex) {
                throw new RuntimeException(ex);
            }
        }
    }
    
    public final class b
    {
        public boolean LIZ;
        public 07t LIZIZ;
        public Menu LIZLLL;
        public int LJ;
        public int LJFF;
        public int LJI;
        public int LJII;
        public boolean LJIIIIZZ;
        public boolean LJIIIZ;
        public int LJIIJ;
        public int LJIIJJI;
        public CharSequence LJIIL;
        public CharSequence LJIILIIL;
        public int LJIILJJIL;
        public char LJIILL;
        public int LJIILLIIL;
        public char LJIIZILJ;
        public int LJIJ;
        public int LJIJI;
        public boolean LJIJJ;
        public boolean LJIJJLI;
        public boolean LJIL;
        public int LJJ;
        public int LJJI;
        public String LJJIFFI;
        public String LJJII;
        public String LJJIII;
        public CharSequence LJJIIJ;
        public CharSequence LJJIIJZLJL;
        public ColorStateList LJJIIZ;
        public PorterDuff$Mode LJJIIZI;
        
        static {
            Covode.recordClassIndex(327);
        }
        
        public b(final Menu lizlll) {
            this.LIZLLL = lizlll;
            this.LIZ();
        }
        
        private char LIZ(final String s) {
            if (s == null) {
                return '\0';
            }
            return s.charAt(0);
        }
        
        private <T> T LIZ(final String s, final Class<?>[] array, final Object[] array2) {
            try {
                final Constructor<?> constructor = Class.forName(s, false, 02Z.this.LJ.getClassLoader()).getConstructor(array);
                constructor.setAccessible(true);
                return (T)constructor.newInstance(array2);
            }
            catch (final Exception ex) {
                return null;
            }
        }
        
        private void LIZ(final MenuItem menuItem) {
            final MenuItem setEnabled = menuItem.setChecked(this.LJIJJ).setVisible(this.LJIJJLI).setEnabled(this.LJIL);
            final int ljiji = this.LJIJI;
            int ljij = 0;
            Label_0596: {
                if (ljiji <= 0) {
                    break Label_0596;
                }
                boolean checkable = true;
            Label_0176_Outer:
                while (true) {
                    setEnabled.setCheckable(checkable).setTitleCondensed(this.LJIILIIL).setIcon(this.LJIILJJIL);
                    final int ljj = this.LJJ;
                    if (ljj >= 0) {
                        menuItem.setShowAsAction(ljj);
                    }
                    Label_0619: {
                        if (this.LJJIII != null) {
                            if (02Z.this.LJ.isRestricted()) {
                                break Label_0619;
                            }
                            final 02Z lizj = 02Z.this;
                            if (lizj.LJFF == null) {
                                lizj.LJFF = lizj.LIZ(lizj.LJ);
                            }
                            menuItem.setOnMenuItemClickListener((MenuItem$OnMenuItemClickListener)new a(lizj.LJFF, this.LJJIII));
                        }
                    Block_30_Outer:
                        while (true) {
                            Label_0602: {
                                Block_26: {
                                    if (this.LJIJI >= 2) {
                                        if (menuItem instanceof 130) {
                                            ((130)menuItem).LIZ(true);
                                        }
                                        else if (menuItem instanceof 133) {
                                            break Block_26;
                                        }
                                    }
                                    final String ljjiffi = this.LJJIFFI;
                                    if (ljjiffi != null) {
                                        menuItem.setActionView((View)this.LIZ(ljjiffi, 02Z.LIZ, 02Z.this.LIZJ));
                                        ljij = 1;
                                    }
                                    final int ljji = this.LJJI;
                                    if (ljji > 0 && ljij == 0) {
                                        menuItem.setActionView(ljji);
                                    }
                                    final 07t liziz = this.LIZIZ;
                                    if (liziz != null && menuItem instanceof 05o) {
                                        ((05o)menuItem).LIZ(liziz);
                                    }
                                    final CharSequence ljjiij = this.LJJIIJ;
                                    final boolean b = menuItem instanceof 05o;
                                    if (b) {
                                        ((05o)menuItem).LIZ(ljjiij);
                                    }
                                    else if (Build$VERSION.SDK_INT >= 26) {
                                        menuItem.setContentDescription(ljjiij);
                                    }
                                    final CharSequence ljjiijzljl = this.LJJIIJZLJL;
                                    if (b) {
                                        ((05o)menuItem).LIZIZ(ljjiijzljl);
                                    }
                                    else if (Build$VERSION.SDK_INT >= 26) {
                                        menuItem.setTooltipText(ljjiijzljl);
                                    }
                                    final char ljiill = this.LJIILL;
                                    final int ljiilliil = this.LJIILLIIL;
                                    if (b) {
                                        ((05o)menuItem).setAlphabeticShortcut(ljiill, ljiilliil);
                                    }
                                    else if (Build$VERSION.SDK_INT >= 26) {
                                        menuItem.setAlphabeticShortcut(ljiill, ljiilliil);
                                    }
                                    final char ljiizilj = this.LJIIZILJ;
                                    ljij = this.LJIJ;
                                    if (b) {
                                        ((05o)menuItem).setNumericShortcut(ljiizilj, ljij);
                                    }
                                    else if (Build$VERSION.SDK_INT >= 26) {
                                        menuItem.setNumericShortcut(ljiizilj, ljij);
                                    }
                                    final PorterDuff$Mode ljjiizi = this.LJJIIZI;
                                    if (ljjiizi != null) {
                                        if (b) {
                                            ((05o)menuItem).setIconTintMode(ljjiizi);
                                        }
                                        else if (Build$VERSION.SDK_INT >= 26) {
                                            menuItem.setIconTintMode(ljjiizi);
                                        }
                                    }
                                    final ColorStateList ljjiiz = this.LJJIIZ;
                                    if (ljjiiz == null) {
                                        return;
                                    }
                                    if (b) {
                                        ((05o)menuItem).setIconTintList(ljjiiz);
                                        return;
                                    }
                                    break Label_0602;
                                }
                                final 133 133 = (133)menuItem;
                                try {
                                    if (133.LIZJ == null) {
                                        133.LIZJ = 133.LIZIZ.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                                    }
                                    133.LIZJ.invoke(133.LIZIZ, true);
                                    continue Block_30_Outer;
                                    while (true) {
                                        final ColorStateList ljjiiz;
                                        menuItem.setIconTintList(ljjiiz);
                                        return;
                                        iftrue(Label_0618:)(Build$VERSION.SDK_INT < 26);
                                        continue;
                                    }
                                    Label_0618: {
                                        return;
                                    }
                                    checkable = false;
                                    continue Label_0176_Outer;
                                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                                }
                                catch (final Exception ex) {
                                    continue;
                                }
                            }
                            break;
                        }
                    }
                    break;
                }
            }
        }
        
        public final void LIZ() {
            this.LJ = 0;
            this.LJFF = 0;
            this.LJI = 0;
            this.LJII = 0;
            this.LJIIIIZZ = true;
            this.LJIIIZ = true;
        }
        
        public final void LIZ(final AttributeSet set) {
            final TypedArray obtainStyledAttributes = 02Z.this.LJ.obtainStyledAttributes(set, new int[] { 16842766, 16842960, 16843156, 16843230, 16843231, 16843232 });
            this.LJ = obtainStyledAttributes.getResourceId(1, 0);
            this.LJFF = obtainStyledAttributes.getInt(3, 0);
            this.LJI = obtainStyledAttributes.getInt(4, 0);
            this.LJII = obtainStyledAttributes.getInt(5, 0);
            this.LJIIIIZZ = obtainStyledAttributes.getBoolean(2, true);
            this.LJIIIZ = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }
        
        public final void LIZIZ() {
            this.LIZ = true;
            this.LIZ(this.LIZLLL.add(this.LJ, this.LJIIJ, this.LJIIJJI, this.LJIIL));
        }
        
        public final void LIZIZ(final AttributeSet set) {
            final 043 liz = 043.LIZ(02Z.this.LJ, set, new int[] { 16842754, 16842766, 16842960, 16843014, 16843156, 16843230, 16843231, 16843233, 16843234, 16843235, 16843236, 16843237, 16843375, 2130968997, 2130969015, 2130969016, 2130969041, 2130969382, 2130969658, 2130969659, 2130970703, 2130970960, 2130971274 });
            this.LJIIJ = liz.LJFF(2, 0);
            this.LJIIJJI = ((liz.LIZ(5, this.LJFF) & 0xFFFF0000) | (liz.LIZ(6, this.LJI) & 0xFFFF));
            this.LJIIL = liz.LIZJ(7);
            this.LJIILIIL = liz.LIZJ(8);
            this.LJIILJJIL = liz.LJFF(0, 0);
            this.LJIILL = this.LIZ(liz.LIZLLL(9));
            this.LJIILLIIL = liz.LIZ(16, 4096);
            this.LJIIZILJ = this.LIZ(liz.LIZLLL(10));
            this.LJIJ = liz.LIZ(20, 4096);
            if (liz.LJFF(11)) {
                this.LJIJI = (liz.LIZ(11, false) ? 1 : 0);
            }
            else {
                this.LJIJI = this.LJII;
            }
            this.LJIJJ = liz.LIZ(3, false);
            this.LJIJJLI = liz.LIZ(4, this.LJIIIIZZ);
            final boolean ljiiiz = this.LJIIIZ;
            boolean b = true;
            this.LJIL = liz.LIZ(1, ljiiiz);
            this.LJJ = liz.LIZ(21, -1);
            this.LJJIII = liz.LIZLLL(12);
            this.LJJI = liz.LJFF(13, 0);
            this.LJJIFFI = liz.LIZLLL(15);
            final String lizlll = liz.LIZLLL(14);
            this.LJJII = lizlll;
            if (lizlll == null) {
                b = false;
            }
            if (b && this.LJJI == 0 && this.LJJIFFI == null) {
                this.LIZIZ = (07t)this.LIZ(lizlll, 02Z.LIZIZ, 02Z.this.LIZLLL);
            }
            else {
                this.LIZIZ = null;
            }
            this.LJJIIJ = liz.LIZJ(17);
            this.LJJIIJZLJL = liz.LIZJ(22);
            if (liz.LJFF(19)) {
                this.LJJIIZI = 04a.LIZ(liz.LIZ(19, -1), this.LJJIIZI);
            }
            else {
                this.LJJIIZI = null;
            }
            if (liz.LJFF(18)) {
                this.LJJIIZ = liz.LJ(18);
            }
            else {
                this.LJJIIZ = null;
            }
            liz.LIZ.recycle();
            this.LIZ = false;
        }
        
        public final SubMenu LIZJ() {
            this.LIZ = true;
            final SubMenu addSubMenu = this.LIZLLL.addSubMenu(this.LJ, this.LJIIJ, this.LJIIJJI, this.LJIIL);
            this.LIZ(addSubMenu.getItem());
            return addSubMenu;
        }
    }
}
