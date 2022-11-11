// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.content.res.TypedArray;
import java.util.Collection;
import android.animation.AnimatorSet;
import android.animation.Animator;
import java.util.ArrayList;
import android.animation.AnimatorInflater;
import android.graphics.Region;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.ColorFilter;
import android.graphics.Canvas;
import android.content.res.Resources$Theme;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import android.content.Context;
import android.graphics.drawable.Drawable$Callback;

public final class 1gc extends 16e implements 0Du
{
    public final Drawable$Callback LIZ;
    public a LIZJ;
    public Context LIZLLL;
    
    static {
        Covode.recordClassIndex(1480);
    }
    
    public 1gc() {
        this(null, (byte)0);
    }
    
    public 1gc(final Context context) {
        this(context, (byte)0);
    }
    
    public 1gc(final Context lizlll, final byte b) {
        this.LIZ = (Drawable$Callback)new 0Dv(this);
        this.LIZLLL = lizlll;
        this.LIZJ = new a();
    }
    
    public static 1gc LIZ(final Context context, final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
        final 1gc 1gc = new 1gc(context);
        1gc.inflate(resources, xmlPullParser, set, resources$Theme);
        return 1gc;
    }
    
    @Override
    public final void applyTheme(final Resources$Theme resources$Theme) {
        if (super.LIZIZ != null) {
            super.LIZIZ.applyTheme(resources$Theme);
        }
    }
    
    public final boolean canApplyTheme() {
        return super.LIZIZ != null && super.LIZIZ.canApplyTheme();
    }
    
    public final void draw(final Canvas canvas) {
        if (super.LIZIZ != null) {
            super.LIZIZ.draw(canvas);
            return;
        }
        this.LIZJ.LIZIZ.draw(canvas);
        if (this.LIZJ.LIZJ.isStarted()) {
            this.invalidateSelf();
        }
    }
    
    public final int getAlpha() {
        if (super.LIZIZ != null) {
            return super.LIZIZ.getAlpha();
        }
        return this.LIZJ.LIZIZ.getAlpha();
    }
    
    public final int getChangingConfigurations() {
        if (super.LIZIZ != null) {
            return super.LIZIZ.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.LIZJ.LIZ;
    }
    
    public final Drawable$ConstantState getConstantState() {
        if (super.LIZIZ != null && Build$VERSION.SDK_INT >= 24) {
            return new b(super.LIZIZ.getConstantState());
        }
        return null;
    }
    
    public final int getIntrinsicHeight() {
        if (super.LIZIZ != null) {
            return super.LIZIZ.getIntrinsicHeight();
        }
        return this.LIZJ.LIZIZ.getIntrinsicHeight();
    }
    
    public final int getIntrinsicWidth() {
        if (super.LIZIZ != null) {
            return super.LIZIZ.getIntrinsicWidth();
        }
        return this.LIZJ.LIZIZ.getIntrinsicWidth();
    }
    
    public final int getOpacity() {
        if (super.LIZIZ != null) {
            return super.LIZIZ.getOpacity();
        }
        return this.LIZJ.LIZIZ.getOpacity();
    }
    
    public final void inflate(final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set) {
        this.inflate(resources, xmlPullParser, set, null);
    }
    
    public final void inflate(final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
        if (super.LIZIZ != null) {
            08U.LIZ(super.LIZIZ, resources, xmlPullParser, set, resources$Theme);
            return;
        }
        for (int n = xmlPullParser.getEventType(), depth = xmlPullParser.getDepth(); n != 1 && (xmlPullParser.getDepth() >= depth + 1 || n != 3); n = xmlPullParser.next()) {
            if (n == 2) {
                final String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    final TypedArray liz = 06u.LIZ(resources, resources$Theme, set, 0Dt.LJ);
                    final int resourceId = liz.getResourceId(0, 0);
                    if (resourceId != 0) {
                        final 1gf liz2 = 1gf.LIZ(resources, resourceId, resources$Theme);
                        liz2.LIZLLL = false;
                        liz2.setCallback(this.LIZ);
                        if (this.LIZJ.LIZIZ != null) {
                            this.LIZJ.LIZIZ.setCallback((Drawable$Callback)null);
                        }
                        this.LIZJ.LIZIZ = liz2;
                    }
                    liz.recycle();
                }
                else if ("target".equals(name)) {
                    final TypedArray obtainAttributes = resources.obtainAttributes(set, 0Dt.LJFF);
                    final String string = obtainAttributes.getString(0);
                    final int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        final Context lizlll = this.LIZLLL;
                        if (lizlll == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator animator;
                        if (Build$VERSION.SDK_INT >= 24) {
                            animator = AnimatorInflater.loadAnimator(lizlll, resourceId2);
                        }
                        else {
                            animator = 0Dz.LIZ(lizlll, lizlll.getResources(), lizlll.getTheme(), resourceId2);
                        }
                        animator.setTarget(this.LIZJ.LIZIZ.LIZJ.LIZIZ.LJIIJ.get(string));
                        if (this.LIZJ.LIZLLL == null) {
                            this.LIZJ.LIZLLL = new ArrayList<Animator>();
                            this.LIZJ.LJ = new 13j<Animator, String>();
                        }
                        this.LIZJ.LIZLLL.add(animator);
                        this.LIZJ.LJ.put(animator, string);
                    }
                    obtainAttributes.recycle();
                }
            }
        }
        final a lizj = this.LIZJ;
        if (lizj.LIZJ == null) {
            lizj.LIZJ = new AnimatorSet();
        }
        lizj.LIZJ.playTogether((Collection)lizj.LIZLLL);
    }
    
    public final boolean isAutoMirrored() {
        if (super.LIZIZ != null) {
            return super.LIZIZ.isAutoMirrored();
        }
        return this.LIZJ.LIZIZ.isAutoMirrored();
    }
    
    public final boolean isRunning() {
        if (super.LIZIZ != null) {
            return ((AnimatedVectorDrawable)super.LIZIZ).isRunning();
        }
        return this.LIZJ.LIZJ.isRunning();
    }
    
    public final boolean isStateful() {
        if (super.LIZIZ != null) {
            return super.LIZIZ.isStateful();
        }
        return this.LIZJ.LIZIZ.isStateful();
    }
    
    public final Drawable mutate() {
        if (super.LIZIZ != null) {
            super.LIZIZ.mutate();
        }
        return this;
    }
    
    @Override
    public final void onBoundsChange(final Rect rect) {
        if (super.LIZIZ != null) {
            super.LIZIZ.setBounds(rect);
            return;
        }
        this.LIZJ.LIZIZ.setBounds(rect);
    }
    
    @Override
    public final boolean onLevelChange(final int n) {
        if (super.LIZIZ != null) {
            return super.LIZIZ.setLevel(n);
        }
        return this.LIZJ.LIZIZ.setLevel(n);
    }
    
    public final boolean onStateChange(final int[] array) {
        if (super.LIZIZ != null) {
            return super.LIZIZ.setState(array);
        }
        return this.LIZJ.LIZIZ.setState(array);
    }
    
    public final void setAlpha(final int n) {
        if (super.LIZIZ != null) {
            super.LIZIZ.setAlpha(n);
            return;
        }
        this.LIZJ.LIZIZ.setAlpha(n);
    }
    
    public final void setAutoMirrored(final boolean b) {
        if (super.LIZIZ != null) {
            super.LIZIZ.setAutoMirrored(b);
            return;
        }
        this.LIZJ.LIZIZ.setAutoMirrored(b);
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        if (super.LIZIZ != null) {
            super.LIZIZ.setColorFilter(colorFilter);
            return;
        }
        this.LIZJ.LIZIZ.setColorFilter(colorFilter);
    }
    
    public final void setTint(final int n) {
        if (super.LIZIZ != null) {
            super.LIZIZ.setTint(n);
            return;
        }
        this.LIZJ.LIZIZ.setTint(n);
    }
    
    public final void setTintList(final ColorStateList list) {
        if (super.LIZIZ != null) {
            super.LIZIZ.setTintList(list);
            return;
        }
        this.LIZJ.LIZIZ.setTintList(list);
    }
    
    public final void setTintMode(final PorterDuff$Mode porterDuff$Mode) {
        if (super.LIZIZ != null) {
            super.LIZIZ.setTintMode(porterDuff$Mode);
            return;
        }
        this.LIZJ.LIZIZ.setTintMode(porterDuff$Mode);
    }
    
    public final boolean setVisible(final boolean b, final boolean b2) {
        if (super.LIZIZ != null) {
            return super.LIZIZ.setVisible(b, b2);
        }
        this.LIZJ.LIZIZ.setVisible(b, b2);
        return super.setVisible(b, b2);
    }
    
    public final void start() {
        if (super.LIZIZ != null) {
            ((AnimatedVectorDrawable)super.LIZIZ).start();
            return;
        }
        if (this.LIZJ.LIZJ.isStarted()) {
            return;
        }
        this.LIZJ.LIZJ.start();
        this.invalidateSelf();
    }
    
    public final void stop() {
        if (super.LIZIZ != null) {
            ((AnimatedVectorDrawable)super.LIZIZ).stop();
            return;
        }
        this.LIZJ.LIZJ.end();
    }
    
    public static final class a extends Drawable$ConstantState
    {
        public int LIZ;
        public 1gf LIZIZ;
        public AnimatorSet LIZJ;
        public ArrayList<Animator> LIZLLL;
        public 13j<Animator, String> LJ;
        
        static {
            Covode.recordClassIndex(1482);
        }
        
        public final int getChangingConfigurations() {
            return this.LIZ;
        }
        
        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
        
        public final Drawable newDrawable(final Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }
    
    public static final class b extends Drawable$ConstantState
    {
        public final Drawable$ConstantState LIZ;
        
        static {
            Covode.recordClassIndex(1483);
        }
        
        public b(final Drawable$ConstantState liz) {
            this.LIZ = liz;
        }
        
        public final boolean canApplyTheme() {
            return this.LIZ.canApplyTheme();
        }
        
        public final int getChangingConfigurations() {
            return this.LIZ.getChangingConfigurations();
        }
        
        public final Drawable newDrawable() {
            final 1gc 1gc = new 1gc();
            (1gc.LIZIZ = this.LIZ.newDrawable()).setCallback(1gc.LIZ);
            return 1gc;
        }
        
        public final Drawable newDrawable(final Resources resources) {
            final 1gc 1gc = new 1gc();
            (1gc.LIZIZ = this.LIZ.newDrawable(resources)).setCallback(1gc.LIZ);
            return 1gc;
        }
        
        public final Drawable newDrawable(final Resources resources, final Resources$Theme resources$Theme) {
            final 1gc 1gc = new 1gc();
            (1gc.LIZIZ = this.LIZ.newDrawable(resources, resources$Theme)).setCallback(1gc.LIZ);
            return 1gc;
        }
    }
}
