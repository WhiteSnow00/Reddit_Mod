// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Paint$Join;
import android.graphics.Paint$Cap;
import java.util.ArrayList;
import android.graphics.Shader;
import android.graphics.Paint$Style;
import android.graphics.Path$FillType;
import android.graphics.PathMeasure;
import android.graphics.Path;
import android.util.TypedValue;
import android.graphics.Region;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.Paint;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import android.content.res.TypedArray;
import java.util.ArrayDeque;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.content.res.XmlResourceParser;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParser;
import android.util.Xml;
import android.os.Build$VERSION;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.graphics.Color;
import com.bytedance.covode.number.Covode;
import android.graphics.Rect;
import android.graphics.Matrix;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff$Mode;

public final class 1gf extends 16e
{
    public static final PorterDuff$Mode LIZ;
    public g LIZJ;
    public boolean LIZLLL;
    public PorterDuffColorFilter LJ;
    public ColorFilter LJFF;
    public boolean LJI;
    public final float[] LJII;
    public final Matrix LJIIIIZZ;
    public final Rect LJIIIZ;
    
    static {
        Covode.recordClassIndex(1488);
        LIZ = PorterDuff$Mode.SRC_IN;
    }
    
    public 1gf() {
        this.LIZLLL = true;
        this.LJII = new float[9];
        this.LJIIIIZZ = new Matrix();
        this.LJIIIZ = new Rect();
        this.LIZJ = new g();
    }
    
    public 1gf(final g lizj) {
        this.LIZLLL = true;
        this.LJII = new float[9];
        this.LJIIIIZZ = new Matrix();
        this.LJIIIZ = new Rect();
        this.LIZJ = lizj;
        this.LJ = this.LIZ(lizj.LIZJ, lizj.LIZLLL);
    }
    
    public static int LIZ(final int n, final float n2) {
        return (n & 0xFFFFFF) | (int)(Color.alpha(n) * n2) << 24;
    }
    
    public static 1gf LIZ(final Resources resources, int i, final Resources$Theme resources$Theme) {
        if (Build$VERSION.SDK_INT >= 24) {
            final 1gf 1gf = new 1gf();
            1gf.LIZIZ = resources.getDrawable(i, resources$Theme);
            new h(1gf.LIZIZ.getConstantState());
            return 1gf;
        }
        try {
            final XmlResourceParser xml = resources.getXml(i);
            final AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xml);
            do {
                i = ((XmlPullParser)xml).next();
                if (i != 2) {
                    continue;
                }
                return LIZ(resources, (XmlPullParser)xml, attributeSet, resources$Theme);
            } while (i != 1);
            throw new XmlPullParserException("No start tag found");
        }
        catch (final XmlPullParserException | IOException ex) {
            return null;
        }
    }
    
    public static 1gf LIZ(final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
        final 1gf 1gf = new 1gf();
        1gf.inflate(resources, xmlPullParser, set, resources$Theme);
        return 1gf;
    }
    
    private PorterDuffColorFilter LIZ(final ColorStateList list, final PorterDuff$Mode porterDuff$Mode) {
        if (list == null || porterDuff$Mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(list.getColorForState(this.getState(), 0), porterDuff$Mode);
    }
    
    private void LIZIZ(final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
        final g lizj = this.LIZJ;
        final f liziz = lizj.LIZIZ;
        final ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(liziz.LIZJ);
        int n = xmlPullParser.getEventType();
        final int depth = xmlPullParser.getDepth();
        int n2 = 1;
        while (n != 1 && (xmlPullParser.getDepth() >= depth + 1 || n != 3)) {
            int n3;
            if (n == 2) {
                final String name = xmlPullParser.getName();
                final c c = arrayDeque.peek();
                if ("path".equals(name)) {
                    final b b = new b();
                    final TypedArray liz = 06u.LIZ(resources, resources$Theme, set, 0Dt.LIZJ);
                    b.LIZ(liz, xmlPullParser, resources$Theme);
                    liz.recycle();
                    c.LIZIZ.add(b);
                    if (((e)b).getPathName() != null) {
                        liziz.LJIIJ.put(((e)b).getPathName(), b);
                    }
                    lizj.LIZ |= ((e)b).LJIILJJIL;
                    n3 = 0;
                }
                else if ("clip-path".equals(name)) {
                    final a a = new a();
                    if (06u.LIZ(xmlPullParser, "pathData")) {
                        final TypedArray liz2 = 06u.LIZ(resources, resources$Theme, set, 0Dt.LIZLLL);
                        a.LIZ(liz2, xmlPullParser);
                        liz2.recycle();
                    }
                    c.LIZIZ.add(a);
                    if (((e)a).getPathName() != null) {
                        liziz.LJIIJ.put(((e)a).getPathName(), a);
                    }
                    lizj.LIZ |= ((e)a).LJIILJJIL;
                    n3 = n2;
                }
                else {
                    n3 = n2;
                    if ("group".equals(name)) {
                        final c c2 = new c();
                        final TypedArray liz3 = 06u.LIZ(resources, resources$Theme, set, 0Dt.LIZIZ);
                        c2.LJIIJJI = null;
                        c2.LIZJ = 06u.LIZ(liz3, xmlPullParser, "rotation", 5, c2.LIZJ);
                        c2.LIZLLL = liz3.getFloat(1, c2.LIZLLL);
                        c2.LJ = liz3.getFloat(2, c2.LJ);
                        c2.LJFF = 06u.LIZ(liz3, xmlPullParser, "scaleX", 3, c2.LJFF);
                        c2.LJI = 06u.LIZ(liz3, xmlPullParser, "scaleY", 4, c2.LJI);
                        c2.LJII = 06u.LIZ(liz3, xmlPullParser, "translateX", 6, c2.LJII);
                        c2.LJIIIIZZ = 06u.LIZ(liz3, xmlPullParser, "translateY", 7, c2.LJIIIIZZ);
                        final String string = liz3.getString(0);
                        if (string != null) {
                            c2.LJIIL = string;
                        }
                        c2.LIZ();
                        liz3.recycle();
                        c.LIZIZ.add(c2);
                        arrayDeque.push(c2);
                        if (c2.getGroupName() != null) {
                            liziz.LJIIJ.put(c2.getGroupName(), c2);
                        }
                        lizj.LIZ |= c2.LJIIJ;
                        n3 = n2;
                    }
                }
            }
            else {
                n3 = n2;
                if (n == 3) {
                    n3 = n2;
                    if ("group".equals(xmlPullParser.getName())) {
                        arrayDeque.pop();
                        n3 = n2;
                    }
                }
            }
            n = xmlPullParser.next();
            n2 = n3;
        }
        if (n2 == 0) {
            return;
        }
        throw new XmlPullParserException("no path defined");
    }
    
    public final boolean canApplyTheme() {
        if (super.LIZIZ != null) {
            super.LIZIZ.canApplyTheme();
        }
        return false;
    }
    
    public final void draw(final Canvas canvas) {
        if (super.LIZIZ != null) {
            super.LIZIZ.draw(canvas);
            return;
        }
        this.copyBounds(this.LJIIIZ);
        if (this.LJIIIZ.width() > 0 && this.LJIIIZ.height() > 0) {
            Object colorFilter;
            if ((colorFilter = this.LJFF) == null) {
                colorFilter = this.LJ;
            }
            canvas.getMatrix(this.LJIIIIZZ);
            this.LJIIIIZZ.getValues(this.LJII);
            final float[] ljii = this.LJII;
            boolean b = false;
            float abs = Math.abs(ljii[0]);
            float abs2 = Math.abs(this.LJII[4]);
            final float abs3 = Math.abs(this.LJII[1]);
            final float abs4 = Math.abs(this.LJII[3]);
            if (abs3 != 0.0f || abs4 != 0.0f) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            final int n = (int)(this.LJIIIZ.width() * abs);
            final int n2 = (int)(this.LJIIIZ.height() * abs2);
            final int min = Math.min(2048, n);
            final int min2 = Math.min(2048, n2);
            if (min > 0) {
                if (min2 > 0) {
                    final int save = canvas.save();
                    canvas.translate((float)this.LJIIIZ.left, (float)this.LJIIIZ.top);
                    if (this.isAutoMirrored() && 08U.LIZJ(this) == 1) {
                        canvas.translate((float)this.LJIIIZ.width(), 0.0f);
                        canvas.scale(-1.0f, 1.0f);
                    }
                    this.LJIIIZ.offsetTo(0, 0);
                    final g lizj = this.LIZJ;
                    if (lizj.LJFF == null || min != lizj.LJFF.getWidth() || min2 != lizj.LJFF.getHeight()) {
                        lizj.LJFF = Bitmap.createBitmap(min, min2, Bitmap$Config.ARGB_8888);
                        lizj.LJIIJ = true;
                    }
                    if (!this.LIZLLL) {
                        this.LIZJ.LIZ(min, min2);
                    }
                    else {
                        final g lizj2 = this.LIZJ;
                        if (lizj2.LJIIJ || lizj2.LJI != lizj2.LIZJ || lizj2.LJII != lizj2.LIZLLL || lizj2.LJIIIZ != lizj2.LJ || lizj2.LJIIIIZZ != lizj2.LIZIZ.getRootAlpha()) {
                            this.LIZJ.LIZ(min, min2);
                            final g lizj3 = this.LIZJ;
                            lizj3.LJI = lizj3.LIZJ;
                            lizj3.LJII = lizj3.LIZLLL;
                            lizj3.LJIIIIZZ = lizj3.LIZIZ.getRootAlpha();
                            lizj3.LJIIIZ = lizj3.LJ;
                            lizj3.LJIIJ = false;
                        }
                    }
                    final g lizj4 = this.LIZJ;
                    final Rect ljiiiz = this.LJIIIZ;
                    if (lizj4.LIZIZ.getRootAlpha() < 255) {
                        b = true;
                    }
                    Paint ljiijji;
                    if (!b && colorFilter == null) {
                        ljiijji = null;
                    }
                    else {
                        if (lizj4.LJIIJJI == null) {
                            (lizj4.LJIIJJI = new Paint()).setFilterBitmap(true);
                        }
                        lizj4.LJIIJJI.setAlpha(lizj4.LIZIZ.getRootAlpha());
                        lizj4.LJIIJJI.setColorFilter((ColorFilter)colorFilter);
                        ljiijji = lizj4.LJIIJJI;
                    }
                    canvas.drawBitmap(lizj4.LJFF, (Rect)null, ljiiiz, ljiijji);
                    canvas.restoreToCount(save);
                }
            }
        }
    }
    
    public final int getAlpha() {
        if (super.LIZIZ != null) {
            return super.LIZIZ.getAlpha();
        }
        return this.LIZJ.LIZIZ.getRootAlpha();
    }
    
    public final int getChangingConfigurations() {
        if (super.LIZIZ != null) {
            return super.LIZIZ.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.LIZJ.getChangingConfigurations();
    }
    
    public final ColorFilter getColorFilter() {
        if (super.LIZIZ != null) {
            return super.LIZIZ.getColorFilter();
        }
        return this.LJFF;
    }
    
    public final Drawable$ConstantState getConstantState() {
        if (super.LIZIZ != null && Build$VERSION.SDK_INT >= 24) {
            return new h(super.LIZIZ.getConstantState());
        }
        this.LIZJ.LIZ = this.getChangingConfigurations();
        return this.LIZJ;
    }
    
    public final int getIntrinsicHeight() {
        if (super.LIZIZ != null) {
            return super.LIZIZ.getIntrinsicHeight();
        }
        return (int)this.LIZJ.LIZIZ.LJ;
    }
    
    public final int getIntrinsicWidth() {
        if (super.LIZIZ != null) {
            return super.LIZIZ.getIntrinsicWidth();
        }
        return (int)this.LIZJ.LIZIZ.LIZLLL;
    }
    
    public final int getOpacity() {
        if (super.LIZIZ != null) {
            return super.LIZIZ.getOpacity();
        }
        return -3;
    }
    
    public final void inflate(final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set) {
        if (super.LIZIZ != null) {
            super.LIZIZ.inflate(resources, xmlPullParser, set);
            return;
        }
        this.inflate(resources, xmlPullParser, set, null);
    }
    
    public final void inflate(final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
        if (super.LIZIZ != null) {
            08U.LIZ(super.LIZIZ, resources, xmlPullParser, set, resources$Theme);
            return;
        }
        final g lizj = this.LIZJ;
        lizj.LIZIZ = new f();
        final TypedArray liz = 06u.LIZ(resources, resources$Theme, set, 0Dt.LIZ);
        final g lizj2 = this.LIZJ;
        final f liziz = lizj2.LIZIZ;
        final int liz2 = 06u.LIZ(liz, xmlPullParser, "tintMode", 6, -1);
        PorterDuff$Mode lizlll = PorterDuff$Mode.SRC_IN;
        if (liz2 != 3) {
            if (liz2 != 5) {
                if (liz2 != 9) {
                    switch (liz2) {
                        case 16: {
                            lizlll = PorterDuff$Mode.ADD;
                            break;
                        }
                        case 15: {
                            lizlll = PorterDuff$Mode.SCREEN;
                            break;
                        }
                        case 14: {
                            lizlll = PorterDuff$Mode.MULTIPLY;
                            break;
                        }
                    }
                }
                else {
                    lizlll = PorterDuff$Mode.SRC_ATOP;
                }
            }
            else {
                lizlll = PorterDuff$Mode.SRC_IN;
            }
        }
        else {
            lizlll = PorterDuff$Mode.SRC_OVER;
        }
        lizj2.LIZLLL = lizlll;
        if (06u.LIZ(xmlPullParser, "tint")) {
            final TypedValue typedValue = new TypedValue();
            liz.getValue(1, typedValue);
            if (typedValue.type == 2) {
                final StringBuilder sb = new StringBuilder("Failed to resolve attribute at index 1: ");
                sb.append(typedValue);
                throw new UnsupportedOperationException(sb.toString());
            }
            ColorStateList lizj3;
            if (typedValue.type >= 28 && typedValue.type <= 31) {
                lizj3 = ColorStateList.valueOf(typedValue.data);
            }
            else {
                lizj3 = 06h.LIZ(liz.getResources(), liz.getResourceId(1, 0), resources$Theme);
            }
            if (lizj3 != null) {
                lizj2.LIZJ = lizj3;
            }
        }
        boolean lj = lizj2.LJ;
        if (06u.LIZ(xmlPullParser, "autoMirrored")) {
            lj = liz.getBoolean(5, lj);
        }
        lizj2.LJ = lj;
        liziz.LJFF = 06u.LIZ(liz, xmlPullParser, "viewportWidth", 7, liziz.LJFF);
        liziz.LJI = 06u.LIZ(liz, xmlPullParser, "viewportHeight", 8, liziz.LJI);
        if (liziz.LJFF <= 0.0f) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(liz.getPositionDescription());
            sb2.append("<vector> tag requires viewportWidth > 0");
            throw new XmlPullParserException(sb2.toString());
        }
        if (liziz.LJI <= 0.0f) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(liz.getPositionDescription());
            sb3.append("<vector> tag requires viewportHeight > 0");
            throw new XmlPullParserException(sb3.toString());
        }
        liziz.LIZLLL = liz.getDimension(3, liziz.LIZLLL);
        liziz.LJ = liz.getDimension(2, liziz.LJ);
        if (liziz.LIZLLL <= 0.0f) {
            final StringBuilder sb4 = new StringBuilder();
            sb4.append(liz.getPositionDescription());
            sb4.append("<vector> tag requires width > 0");
            throw new XmlPullParserException(sb4.toString());
        }
        if (liziz.LJ > 0.0f) {
            liziz.setAlpha(06u.LIZ(liz, xmlPullParser, "alpha", 4, liziz.getAlpha()));
            final String string = liz.getString(0);
            if (string != null) {
                liziz.LJIIIIZZ = string;
                liziz.LJIIJ.put(string, liziz);
            }
            liz.recycle();
            lizj.LIZ = this.getChangingConfigurations();
            lizj.LJIIJ = true;
            this.LIZIZ(resources, xmlPullParser, set, resources$Theme);
            this.LJ = this.LIZ(lizj.LIZJ, lizj.LIZLLL);
            return;
        }
        final StringBuilder sb5 = new StringBuilder();
        sb5.append(liz.getPositionDescription());
        sb5.append("<vector> tag requires height > 0");
        throw new XmlPullParserException(sb5.toString());
    }
    
    public final void invalidateSelf() {
        if (super.LIZIZ != null) {
            super.LIZIZ.invalidateSelf();
            return;
        }
        super.invalidateSelf();
    }
    
    public final boolean isAutoMirrored() {
        if (super.LIZIZ != null) {
            return super.LIZIZ.isAutoMirrored();
        }
        return this.LIZJ.LJ;
    }
    
    public final boolean isStateful() {
        if (super.LIZIZ != null) {
            return super.LIZIZ.isStateful();
        }
        if (!super.isStateful()) {
            final g lizj = this.LIZJ;
            if (lizj == null || (!lizj.LIZIZ.LIZ() && (this.LIZJ.LIZJ == null || !this.LIZJ.LIZJ.isStateful()))) {
                return false;
            }
        }
        return true;
    }
    
    public final Drawable mutate() {
        if (super.LIZIZ != null) {
            super.LIZIZ.mutate();
            return this;
        }
        if (!this.LJI && super.mutate() == this) {
            this.LIZJ = new g(this.LIZJ);
            this.LJI = true;
        }
        return this;
    }
    
    @Override
    public final void onBoundsChange(final Rect bounds) {
        if (super.LIZIZ != null) {
            super.LIZIZ.setBounds(bounds);
        }
    }
    
    public final boolean onStateChange(final int[] state) {
        if (super.LIZIZ != null) {
            return super.LIZIZ.setState(state);
        }
        final boolean b = false;
        final g lizj = this.LIZJ;
        final ColorStateList lizj2 = lizj.LIZJ;
        final boolean b2 = true;
        boolean b3 = b;
        if (lizj2 != null) {
            b3 = b;
            if (lizj.LIZLLL != null) {
                this.LJ = this.LIZ(lizj.LIZJ, lizj.LIZLLL);
                this.invalidateSelf();
                b3 = true;
            }
        }
        if (lizj.LIZIZ.LIZ()) {
            final boolean liz = ((d)lizj.LIZIZ.LIZJ).LIZ(state);
            lizj.LJIIJ |= liz;
            if (liz) {
                this.invalidateSelf();
                b3 = b2;
            }
        }
        return b3;
    }
    
    public final void scheduleSelf(final Runnable runnable, final long n) {
        if (super.LIZIZ != null) {
            super.LIZIZ.scheduleSelf(runnable, n);
            return;
        }
        super.scheduleSelf(runnable, n);
    }
    
    public final void setAlpha(final int n) {
        if (super.LIZIZ != null) {
            super.LIZIZ.setAlpha(n);
            return;
        }
        if (this.LIZJ.LIZIZ.getRootAlpha() != n) {
            this.LIZJ.LIZIZ.setRootAlpha(n);
            this.invalidateSelf();
        }
    }
    
    public final void setAutoMirrored(final boolean b) {
        if (super.LIZIZ != null) {
            super.LIZIZ.setAutoMirrored(b);
            return;
        }
        this.LIZJ.LJ = b;
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        if (super.LIZIZ != null) {
            super.LIZIZ.setColorFilter(colorFilter);
            return;
        }
        this.LJFF = colorFilter;
        this.invalidateSelf();
    }
    
    public final void setTint(final int tint) {
        if (super.LIZIZ != null) {
            super.LIZIZ.setTint(tint);
            return;
        }
        this.setTintList(ColorStateList.valueOf(tint));
    }
    
    public final void setTintList(final ColorStateList list) {
        if (super.LIZIZ != null) {
            super.LIZIZ.setTintList(list);
            return;
        }
        final g lizj = this.LIZJ;
        if (lizj.LIZJ != list) {
            lizj.LIZJ = list;
            this.LJ = this.LIZ(list, lizj.LIZLLL);
            this.invalidateSelf();
        }
    }
    
    public final void setTintMode(final PorterDuff$Mode porterDuff$Mode) {
        if (super.LIZIZ != null) {
            super.LIZIZ.setTintMode(porterDuff$Mode);
            return;
        }
        final g lizj = this.LIZJ;
        if (lizj.LIZLLL != porterDuff$Mode) {
            lizj.LIZLLL = porterDuff$Mode;
            this.LJ = this.LIZ(lizj.LIZJ, porterDuff$Mode);
            this.invalidateSelf();
        }
    }
    
    public final boolean setVisible(final boolean b, final boolean b2) {
        if (super.LIZIZ != null) {
            return super.LIZIZ.setVisible(b, b2);
        }
        return super.setVisible(b, b2);
    }
    
    public final void unscheduleSelf(final Runnable runnable) {
        if (super.LIZIZ != null) {
            super.LIZIZ.unscheduleSelf(runnable);
            return;
        }
        super.unscheduleSelf(runnable);
    }
    
    public abstract static class d
    {
        static {
            Covode.recordClassIndex(1492);
        }
        
        public boolean LIZ(final int[] array) {
            return false;
        }
        
        public boolean LIZIZ() {
            return false;
        }
    }
    
    public static final class f
    {
        public static final Matrix LJIILIIL;
        public Paint LIZ;
        public Paint LIZIZ;
        public final c LIZJ;
        public float LIZLLL;
        public float LJ;
        public float LJFF;
        public float LJI;
        public int LJII;
        public String LJIIIIZZ;
        public Boolean LJIIIZ;
        public final 13j<String, Object> LJIIJ;
        public final Path LJIIJJI;
        public final Path LJIIL;
        public final Matrix LJIILJJIL;
        public PathMeasure LJIILL;
        public int LJIILLIIL;
        
        static {
            Covode.recordClassIndex(1494);
            LJIILIIL = new Matrix();
        }
        
        public f() {
            this.LJIILJJIL = new Matrix();
            this.LIZLLL = 0.0f;
            this.LJ = 0.0f;
            this.LJFF = 0.0f;
            this.LJI = 0.0f;
            this.LJII = 255;
            this.LJIIIIZZ = null;
            this.LJIIIZ = null;
            this.LJIIJ = new 13j<String, Object>();
            this.LIZJ = new c();
            this.LJIIJJI = new Path();
            this.LJIIL = new Path();
        }
        
        public f(final f f) {
            this.LJIILJJIL = new Matrix();
            this.LIZLLL = 0.0f;
            this.LJ = 0.0f;
            this.LJFF = 0.0f;
            this.LJI = 0.0f;
            this.LJII = 255;
            this.LJIIIIZZ = null;
            this.LJIIIZ = null;
            final 13j ljiij = new 13j();
            this.LJIIJ = ljiij;
            this.LIZJ = new c(f.LIZJ, ljiij);
            this.LJIIJJI = new Path(f.LJIIJJI);
            this.LJIIL = new Path(f.LJIIL);
            this.LIZLLL = f.LIZLLL;
            this.LJ = f.LJ;
            this.LJFF = f.LJFF;
            this.LJI = f.LJI;
            this.LJIILLIIL = f.LJIILLIIL;
            this.LJII = f.LJII;
            this.LJIIIIZZ = f.LJIIIIZZ;
            final String ljiiiizz = f.LJIIIIZZ;
            if (ljiiiizz != null) {
                ljiij.put(ljiiiizz, this);
            }
            this.LJIIIZ = f.LJIIIZ;
        }
        
        private void LIZ(final c c, final Matrix matrix, final Canvas canvas, final int n, final int n2, final ColorFilter colorFilter) {
            f f = this;
            c.LIZ.set(matrix);
            c.LIZ.preConcat(c.LJIIIZ);
            canvas.save();
            f f2;
            for (int i = 0; i < c.LIZIZ.size(); ++i, f = f2) {
                final d d = c.LIZIZ.get(i);
                if (d instanceof c) {
                    this.LIZ((c)d, c.LIZ, canvas, n, n2, colorFilter);
                    f2 = f;
                }
                else {
                    f2 = f;
                    if (d instanceof e) {
                        final e e = (e)d;
                        final float n3 = n / f.LJFF;
                        final float n4 = n2 / f.LJI;
                        final float min = Math.min(n3, n4);
                        final Matrix liz = c.LIZ;
                        f.LJIILJJIL.set(liz);
                        f.LJIILJJIL.postScale(n3, n4);
                        final float[] array2;
                        final float[] array = array2 = new float[4];
                        array2[0] = 0.0f;
                        array2[2] = (array2[1] = 1.0f);
                        array2[3] = 0.0f;
                        liz.mapVectors(array);
                        final float n5 = (float)Math.hypot(array[0], array[1]);
                        final float n6 = (float)Math.hypot(array[2], array[3]);
                        final float n7 = array[0];
                        final float n8 = array[1];
                        final float n9 = array[2];
                        final float n10 = array[3];
                        final float max = Math.max(n5, n6);
                        if (max > 0.0f) {
                            final float n11 = Math.abs(n7 * n10 - n8 * n9) / max;
                            if (n11 != 0.0f) {
                                e.LIZ(this.LJIIJJI);
                                final Path ljiijji = this.LJIIJJI;
                                this.LJIIL.reset();
                                if (e.LIZ()) {
                                    final Path ljiil = this.LJIIL;
                                    Path$FillType fillType;
                                    if (e.LJIILIIL == 0) {
                                        fillType = Path$FillType.WINDING;
                                    }
                                    else {
                                        fillType = Path$FillType.EVEN_ODD;
                                    }
                                    ljiil.setFillType(fillType);
                                    this.LJIIL.addPath(ljiijji, this.LJIILJJIL);
                                    canvas.clipPath(this.LJIIL);
                                    f2 = this;
                                    continue;
                                }
                                final b b = (b)e;
                                if (b.LJFF != 0.0f || b.LJI != 1.0f) {
                                    final float ljff = b.LJFF;
                                    final float ljii = b.LJII;
                                    final float lji = b.LJI;
                                    final float ljii2 = b.LJII;
                                    if (this.LJIILL == null) {
                                        this.LJIILL = new PathMeasure();
                                    }
                                    this.LJIILL.setPath(this.LJIIJJI, false);
                                    final float length = this.LJIILL.getLength();
                                    final float n12 = (ljff + ljii) % 1.0f * length;
                                    final float n13 = (lji + ljii2) % 1.0f * length;
                                    ljiijji.reset();
                                    if (n12 > n13) {
                                        this.LJIILL.getSegment(n12, length, ljiijji, true);
                                        this.LJIILL.getSegment(0.0f, n13, ljiijji, true);
                                    }
                                    else {
                                        this.LJIILL.getSegment(n12, n13, ljiijji, true);
                                    }
                                    ljiijji.rLineTo(0.0f, 0.0f);
                                }
                                this.LJIIL.addPath(ljiijji, this.LJIILJJIL);
                                if (b.LIZJ.LIZJ()) {
                                    final 06i lizj = b.LIZJ;
                                    if (this.LIZIZ == null) {
                                        (this.LIZIZ = new Paint(1)).setStyle(Paint$Style.FILL);
                                    }
                                    final Paint liziz = this.LIZIZ;
                                    if (lizj.LIZ()) {
                                        final Shader liz2 = lizj.LIZ;
                                        liz2.setLocalMatrix(this.LJIILJJIL);
                                        liziz.setShader(liz2);
                                        liziz.setAlpha(Math.round(b.LJ * 255.0f));
                                    }
                                    else {
                                        liziz.setShader((Shader)null);
                                        liziz.setAlpha(255);
                                        liziz.setColor(1gf.LIZ(lizj.LIZIZ, b.LJ));
                                    }
                                    liziz.setColorFilter(colorFilter);
                                    final Path ljiil2 = this.LJIIL;
                                    Path$FillType fillType2;
                                    if (b.LJIILIIL == 0) {
                                        fillType2 = Path$FillType.WINDING;
                                    }
                                    else {
                                        fillType2 = Path$FillType.EVEN_ODD;
                                    }
                                    ljiil2.setFillType(fillType2);
                                    canvas.drawPath(this.LJIIL, liziz);
                                }
                                f2 = this;
                                if (b.LIZ.LIZJ()) {
                                    final 06i liz3 = b.LIZ;
                                    if (this.LIZ == null) {
                                        (this.LIZ = new Paint(1)).setStyle(Paint$Style.STROKE);
                                    }
                                    final Paint liz4 = this.LIZ;
                                    if (b.LJIIIZ != null) {
                                        liz4.setStrokeJoin(b.LJIIIZ);
                                    }
                                    if (b.LJIIIIZZ != null) {
                                        liz4.setStrokeCap(b.LJIIIIZZ);
                                    }
                                    liz4.setStrokeMiter(b.LJIIJ);
                                    if (liz3.LIZ()) {
                                        final Shader liz5 = liz3.LIZ;
                                        liz5.setLocalMatrix(this.LJIILJJIL);
                                        liz4.setShader(liz5);
                                        liz4.setAlpha(Math.round(b.LIZLLL * 255.0f));
                                    }
                                    else {
                                        liz4.setShader((Shader)null);
                                        liz4.setAlpha(255);
                                        liz4.setColor(1gf.LIZ(liz3.LIZIZ, b.LIZLLL));
                                    }
                                    liz4.setColorFilter(colorFilter);
                                    liz4.setStrokeWidth(b.LIZIZ * (n11 * min));
                                    canvas.drawPath(this.LJIIL, liz4);
                                    f2 = this;
                                }
                                continue;
                            }
                        }
                        f2 = this;
                    }
                }
            }
            canvas.restore();
        }
        
        public final void LIZ(final Canvas canvas, final int n, final int n2) {
            this.LIZ(this.LIZJ, f.LJIILIIL, canvas, n, n2, null);
        }
        
        public final boolean LIZ() {
            if (this.LJIIIZ == null) {
                this.LJIIIZ = ((d)this.LIZJ).LIZIZ();
            }
            return this.LJIIIZ;
        }
        
        public final float getAlpha() {
            return this.getRootAlpha() / 255.0f;
        }
        
        public final int getRootAlpha() {
            return this.LJII;
        }
        
        public final void setAlpha(final float n) {
            this.setRootAlpha((int)(n * 255.0f));
        }
        
        public final void setRootAlpha(final int ljii) {
            this.LJII = ljii;
        }
    }
    
    public static final class g extends Drawable$ConstantState
    {
        public int LIZ;
        public f LIZIZ;
        public ColorStateList LIZJ;
        public PorterDuff$Mode LIZLLL;
        public boolean LJ;
        public Bitmap LJFF;
        public ColorStateList LJI;
        public PorterDuff$Mode LJII;
        public int LJIIIIZZ;
        public boolean LJIIIZ;
        public boolean LJIIJ;
        public Paint LJIIJJI;
        
        static {
            Covode.recordClassIndex(1495);
        }
        
        public g() {
            this.LIZLLL = 1gf.LIZ;
            this.LIZIZ = new f();
        }
        
        public g(final g g) {
            this.LIZLLL = 1gf.LIZ;
            if (g != null) {
                this.LIZ = g.LIZ;
                this.LIZIZ = new f(g.LIZIZ);
                if (g.LIZIZ.LIZIZ != null) {
                    this.LIZIZ.LIZIZ = new Paint(g.LIZIZ.LIZIZ);
                }
                if (g.LIZIZ.LIZ != null) {
                    this.LIZIZ.LIZ = new Paint(g.LIZIZ.LIZ);
                }
                this.LIZJ = g.LIZJ;
                this.LIZLLL = g.LIZLLL;
                this.LJ = g.LJ;
            }
        }
        
        public final void LIZ(final int n, final int n2) {
            this.LJFF.eraseColor(0);
            this.LIZIZ.LIZ(new Canvas(this.LJFF), n, n2);
        }
        
        public final int getChangingConfigurations() {
            return this.LIZ;
        }
        
        public final Drawable newDrawable() {
            return new 1gf(this);
        }
        
        public final Drawable newDrawable(final Resources resources) {
            return new 1gf(this);
        }
    }
    
    public static final class h extends Drawable$ConstantState
    {
        public final Drawable$ConstantState LIZ;
        
        static {
            Covode.recordClassIndex(1496);
        }
        
        public h(final Drawable$ConstantState liz) {
            this.LIZ = liz;
        }
        
        public final boolean canApplyTheme() {
            return this.LIZ.canApplyTheme();
        }
        
        public final int getChangingConfigurations() {
            return this.LIZ.getChangingConfigurations();
        }
        
        public final Drawable newDrawable() {
            final 1gf 1gf = new 1gf();
            1gf.LIZIZ = this.LIZ.newDrawable();
            return 1gf;
        }
        
        public final Drawable newDrawable(final Resources resources) {
            final 1gf 1gf = new 1gf();
            1gf.LIZIZ = this.LIZ.newDrawable(resources);
            return 1gf;
        }
        
        public final Drawable newDrawable(final Resources resources, final Resources$Theme resources$Theme) {
            final 1gf 1gf = new 1gf();
            1gf.LIZIZ = this.LIZ.newDrawable(resources, resources$Theme);
            return 1gf;
        }
    }
    
    public static final class c extends d
    {
        public final Matrix LIZ;
        public final ArrayList<d> LIZIZ;
        public float LIZJ;
        public float LIZLLL;
        public float LJ;
        public float LJFF;
        public float LJI;
        public float LJII;
        public float LJIIIIZZ;
        public final Matrix LJIIIZ;
        public int LJIIJ;
        public int[] LJIIJJI;
        public String LJIIL;
        
        static {
            Covode.recordClassIndex(1491);
        }
        
        public c() {
            super((byte)0);
            this.LIZ = new Matrix();
            this.LIZIZ = new ArrayList<d>();
            this.LIZJ = 0.0f;
            this.LIZLLL = 0.0f;
            this.LJ = 0.0f;
            this.LJFF = 1.0f;
            this.LJI = 1.0f;
            this.LJII = 0.0f;
            this.LJIIIIZZ = 0.0f;
            this.LJIIIZ = new Matrix();
            this.LJIIL = null;
        }
        
        public c(c c, final 13j<String, Object> 13j) {
            int i = 0;
            super((byte)0);
            this.LIZ = new Matrix();
            this.LIZIZ = new ArrayList<d>();
            this.LIZJ = 0.0f;
            this.LIZLLL = 0.0f;
            this.LJ = 0.0f;
            this.LJFF = 1.0f;
            this.LJI = 1.0f;
            this.LJII = 0.0f;
            this.LJIIIIZZ = 0.0f;
            final Matrix ljiiiz = new Matrix();
            this.LJIIIZ = ljiiiz;
            this.LJIIL = null;
            this.LIZJ = c.LIZJ;
            this.LIZLLL = c.LIZLLL;
            this.LJ = c.LJ;
            this.LJFF = c.LJFF;
            this.LJI = c.LJI;
            this.LJII = c.LJII;
            this.LJIIIIZZ = c.LJIIIIZZ;
            this.LJIIJJI = c.LJIIJJI;
            final String ljiil = c.LJIIL;
            this.LJIIL = ljiil;
            this.LJIIJ = c.LJIIJ;
            if (ljiil != null) {
                13j.put(ljiil, this);
            }
            ljiiiz.set(c.LJIIIZ);
            for (ArrayList<d> liziz = c.LIZIZ; i < liziz.size(); ++i) {
                final d value = liziz.get(i);
                if (value instanceof c) {
                    c = (c)value;
                    this.LIZIZ.add(new c(c, 13j));
                }
                else {
                    e e;
                    if (value instanceof b) {
                        e = new b((b)value);
                    }
                    else {
                        if (!(value instanceof a)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        e = new a((a)value);
                    }
                    this.LIZIZ.add(e);
                    if (e.LJIIL != null) {
                        13j.put(e.LJIIL, e);
                    }
                }
            }
        }
        
        public final void LIZ() {
            this.LJIIIZ.reset();
            this.LJIIIZ.postTranslate(-this.LIZLLL, -this.LJ);
            this.LJIIIZ.postScale(this.LJFF, this.LJI);
            this.LJIIIZ.postRotate(this.LIZJ, 0.0f, 0.0f);
            this.LJIIIZ.postTranslate(this.LJII + this.LIZLLL, this.LJIIIIZZ + this.LJ);
        }
        
        @Override
        public final boolean LIZ(final int[] array) {
            int i = 0;
            boolean b = false;
            while (i < this.LIZIZ.size()) {
                b |= this.LIZIZ.get(i).LIZ(array);
                ++i;
            }
            return b;
        }
        
        @Override
        public final boolean LIZIZ() {
            for (int i = 0; i < this.LIZIZ.size(); ++i) {
                if (this.LIZIZ.get(i).LIZIZ()) {
                    return true;
                }
            }
            return false;
        }
        
        public final String getGroupName() {
            return this.LJIIL;
        }
        
        public final Matrix getLocalMatrix() {
            return this.LJIIIZ;
        }
        
        public final float getPivotX() {
            return this.LIZLLL;
        }
        
        public final float getPivotY() {
            return this.LJ;
        }
        
        public final float getRotation() {
            return this.LIZJ;
        }
        
        public final float getScaleX() {
            return this.LJFF;
        }
        
        public final float getScaleY() {
            return this.LJI;
        }
        
        public final float getTranslateX() {
            return this.LJII;
        }
        
        public final float getTranslateY() {
            return this.LJIIIIZZ;
        }
        
        public final void setPivotX(final float lizlll) {
            if (lizlll != this.LIZLLL) {
                this.LIZLLL = lizlll;
                this.LIZ();
            }
        }
        
        public final void setPivotY(final float lj) {
            if (lj != this.LJ) {
                this.LJ = lj;
                this.LIZ();
            }
        }
        
        public final void setRotation(final float lizj) {
            if (lizj != this.LIZJ) {
                this.LIZJ = lizj;
                this.LIZ();
            }
        }
        
        public final void setScaleX(final float ljff) {
            if (ljff != this.LJFF) {
                this.LJFF = ljff;
                this.LIZ();
            }
        }
        
        public final void setScaleY(final float lji) {
            if (lji != this.LJI) {
                this.LJI = lji;
                this.LIZ();
            }
        }
        
        public final void setTranslateX(final float ljii) {
            if (ljii != this.LJII) {
                this.LJII = ljii;
                this.LIZ();
            }
        }
        
        public final void setTranslateY(final float ljiiiizz) {
            if (ljiiiizz != this.LJIIIIZZ) {
                this.LJIIIIZZ = ljiiiizz;
                this.LIZ();
            }
        }
    }
    
    public abstract static class e extends d
    {
        public 08T.b[] LJIIJJI;
        public String LJIIL;
        public int LJIILIIL;
        public int LJIILJJIL;
        
        static {
            Covode.recordClassIndex(1493);
        }
        
        public e() {
            super((byte)0);
        }
        
        public e(final e e) {
            super((byte)0);
            this.LJIIL = e.LJIIL;
            this.LJIILJJIL = e.LJIILJJIL;
            this.LJIIJJI = 08T.LIZ(e.LJIIJJI);
        }
        
        public final void LIZ(final Path path) {
            path.reset();
            final 08T.b[] ljiijji = this.LJIIJJI;
            if (ljiijji != null) {
                08T.b.LIZ(ljiijji, path);
            }
        }
        
        public boolean LIZ() {
            return false;
        }
        
        public 08T.b[] getPathData() {
            return this.LJIIJJI;
        }
        
        public String getPathName() {
            return this.LJIIL;
        }
        
        public void setPathData(final 08T.b[] array) {
            if (!08T.LIZ(this.LJIIJJI, array)) {
                this.LJIIJJI = 08T.LIZ(array);
                return;
            }
            final 08T.b[] ljiijji = this.LJIIJJI;
            for (int i = 0; i < array.length; ++i) {
                ljiijji[i].LIZ = array[i].LIZ;
                for (int j = 0; j < array[i].LIZIZ.length; ++j) {
                    ljiijji[i].LIZIZ[j] = array[i].LIZIZ[j];
                }
            }
        }
    }
    
    public static final class a extends e
    {
        static {
            Covode.recordClassIndex(1489);
        }
        
        public a() {
        }
        
        public a(final a a) {
            super((e)a);
        }
        
        public final void LIZ(final TypedArray typedArray, final XmlPullParser xmlPullParser) {
            final String string = typedArray.getString(0);
            if (string != null) {
                super.LJIIL = string;
            }
            final String string2 = typedArray.getString(1);
            if (string2 != null) {
                super.LJIIJJI = 08T.LIZIZ(string2);
            }
            super.LJIILIIL = 06u.LIZ(typedArray, xmlPullParser, "fillType", 2, 0);
        }
        
        @Override
        public final boolean LIZ() {
            return true;
        }
    }
    
    public static final class b extends e
    {
        public 06i LIZ;
        public float LIZIZ;
        public 06i LIZJ;
        public float LIZLLL;
        public float LJ;
        public float LJFF;
        public float LJI;
        public float LJII;
        public Paint$Cap LJIIIIZZ;
        public Paint$Join LJIIIZ;
        public float LJIIJ;
        public int[] LJIILL;
        
        static {
            Covode.recordClassIndex(1490);
        }
        
        public b() {
            this.LIZLLL = 1.0f;
            this.LJ = 1.0f;
            this.LJI = 1.0f;
            this.LJIIIIZZ = Paint$Cap.BUTT;
            this.LJIIIZ = Paint$Join.MITER;
            this.LJIIJ = 4.0f;
        }
        
        public b(final b b) {
            super((e)b);
            this.LIZLLL = 1.0f;
            this.LJ = 1.0f;
            this.LJI = 1.0f;
            this.LJIIIIZZ = Paint$Cap.BUTT;
            this.LJIIIZ = Paint$Join.MITER;
            this.LJIIJ = 4.0f;
            this.LJIILL = b.LJIILL;
            this.LIZ = b.LIZ;
            this.LIZIZ = b.LIZIZ;
            this.LIZLLL = b.LIZLLL;
            this.LIZJ = b.LIZJ;
            super.LJIILIIL = b.LJIILIIL;
            this.LJ = b.LJ;
            this.LJFF = b.LJFF;
            this.LJI = b.LJI;
            this.LJII = b.LJII;
            this.LJIIIIZZ = b.LJIIIIZZ;
            this.LJIIIZ = b.LJIIIZ;
            this.LJIIJ = b.LJIIJ;
        }
        
        public final void LIZ(final TypedArray typedArray, final XmlPullParser xmlPullParser, final Resources$Theme resources$Theme) {
            this.LJIILL = null;
            if (!06u.LIZ(xmlPullParser, "pathData")) {
                return;
            }
            final String string = typedArray.getString(0);
            if (string != null) {
                super.LJIIL = string;
            }
            final String string2 = typedArray.getString(2);
            if (string2 != null) {
                super.LJIIJJI = 08T.LIZIZ(string2);
            }
            this.LIZJ = 06u.LIZ(typedArray, xmlPullParser, resources$Theme, "fillColor", 1);
            this.LJ = 06u.LIZ(typedArray, xmlPullParser, "fillAlpha", 12, this.LJ);
            final int liz = 06u.LIZ(typedArray, xmlPullParser, "strokeLineCap", 8, -1);
            Paint$Cap ljiiiizz = this.LJIIIIZZ;
            if (liz != 0) {
                if (liz != 1) {
                    if (liz == 2) {
                        ljiiiizz = Paint$Cap.SQUARE;
                    }
                }
                else {
                    ljiiiizz = Paint$Cap.ROUND;
                }
            }
            else {
                ljiiiizz = Paint$Cap.BUTT;
            }
            this.LJIIIIZZ = ljiiiizz;
            final int liz2 = 06u.LIZ(typedArray, xmlPullParser, "strokeLineJoin", 9, -1);
            Paint$Join ljiiiz = this.LJIIIZ;
            if (liz2 != 0) {
                if (liz2 != 1) {
                    if (liz2 == 2) {
                        ljiiiz = Paint$Join.BEVEL;
                    }
                }
                else {
                    ljiiiz = Paint$Join.ROUND;
                }
            }
            else {
                ljiiiz = Paint$Join.MITER;
            }
            this.LJIIIZ = ljiiiz;
            this.LJIIJ = 06u.LIZ(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.LJIIJ);
            this.LIZ = 06u.LIZ(typedArray, xmlPullParser, resources$Theme, "strokeColor", 3);
            this.LIZLLL = 06u.LIZ(typedArray, xmlPullParser, "strokeAlpha", 11, this.LIZLLL);
            this.LIZIZ = 06u.LIZ(typedArray, xmlPullParser, "strokeWidth", 4, this.LIZIZ);
            this.LJI = 06u.LIZ(typedArray, xmlPullParser, "trimPathEnd", 6, this.LJI);
            this.LJII = 06u.LIZ(typedArray, xmlPullParser, "trimPathOffset", 7, this.LJII);
            this.LJFF = 06u.LIZ(typedArray, xmlPullParser, "trimPathStart", 5, this.LJFF);
            super.LJIILIIL = 06u.LIZ(typedArray, xmlPullParser, "fillType", 13, super.LJIILIIL);
        }
        
        @Override
        public final boolean LIZ(final int[] array) {
            return this.LIZ.LIZ(array) | this.LIZJ.LIZ(array);
        }
        
        @Override
        public final boolean LIZIZ() {
            return this.LIZJ.LIZIZ() || this.LIZ.LIZIZ();
        }
        
        public final float getFillAlpha() {
            return this.LJ;
        }
        
        public final int getFillColor() {
            return this.LIZJ.LIZIZ;
        }
        
        public final float getStrokeAlpha() {
            return this.LIZLLL;
        }
        
        public final int getStrokeColor() {
            return this.LIZ.LIZIZ;
        }
        
        public final float getStrokeWidth() {
            return this.LIZIZ;
        }
        
        public final float getTrimPathEnd() {
            return this.LJI;
        }
        
        public final float getTrimPathOffset() {
            return this.LJII;
        }
        
        public final float getTrimPathStart() {
            return this.LJFF;
        }
        
        public final void setFillAlpha(final float lj) {
            this.LJ = lj;
        }
        
        public final void setFillColor(final int liziz) {
            this.LIZJ.LIZIZ = liziz;
        }
        
        public final void setStrokeAlpha(final float lizlll) {
            this.LIZLLL = lizlll;
        }
        
        public final void setStrokeColor(final int liziz) {
            this.LIZ.LIZIZ = liziz;
        }
        
        public final void setStrokeWidth(final float liziz) {
            this.LIZIZ = liziz;
        }
        
        public final void setTrimPathEnd(final float lji) {
            this.LJI = lji;
        }
        
        public final void setTrimPathOffset(final float ljii) {
            this.LJII = ljii;
        }
        
        public final void setTrimPathStart(final float ljff) {
            this.LJFF = ljff;
        }
    }
}
