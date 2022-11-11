// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.ui;

import java.util.AbstractCollection;
import android.os.Looper;
import com.google.android.exoplayer2.PlaybackException;
import ad.h;
import android.view.MotionEvent;
import com.google.android.exoplayer2.f0;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.BitmapFactory;
import com.google.android.exoplayer2.f0$a;
import android.view.View$OnLayoutChangeListener;
import bd.q;
import ad.d0;
import java.util.Collection;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import android.view.KeyEvent;
import android.graphics.RectF;
import android.graphics.Matrix;
import android.content.res.TypedArray;
import android.content.res.Resources;
import n3.a;
import android.view.View$OnClickListener;
import android.view.TextureView;
import android.view.SurfaceView;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import pd.r;
import android.content.res.Resources$Theme;
import ad.c0;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.exoplayer2.w;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;
import android.widget.FrameLayout;

@Deprecated
public class PlayerView extends FrameLayout
{
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public boolean E;
    public final PlayerView.PlayerView$a f;
    public final AspectRatioFrameLayout g;
    public final View h;
    public final View i;
    public final boolean j;
    public final ImageView k;
    public final SubtitleView l;
    public final View m;
    public final TextView n;
    public final c o;
    public final FrameLayout p;
    public final FrameLayout q;
    public w r;
    public boolean s;
    public c.d t;
    public boolean u;
    public Drawable v;
    public int w;
    public boolean x;
    public CharSequence y;
    public int z;
    
    public PlayerView(final Context context, final AttributeSet set) {
        super(context, set, 0);
        final PlayerView.PlayerView$a playerView$a = new PlayerView.PlayerView$a(this);
        this.f = playerView$a;
        if (((View)this).isInEditMode()) {
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = false;
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = null;
            this.o = null;
            this.p = null;
            this.q = null;
            final ImageView imageView = new ImageView(context);
            if (c0.a >= 23) {
                final Resources resources = ((View)this).getResources();
                imageView.setImageDrawable(resources.getDrawable(2131231220, (Resources$Theme)null));
                ((View)imageView).setBackgroundColor(resources.getColor(2131099994, (Resources$Theme)null));
            }
            else {
                final Resources resources2 = ((View)this).getResources();
                imageView.setImageDrawable(resources2.getDrawable(2131231220));
                ((View)imageView).setBackgroundColor(resources2.getColor(2131099994));
            }
            ((ViewGroup)this).addView((View)imageView);
        }
        else {
            int resourceId = 2131624248;
            boolean hasValue = false;
            int color = 0;
            boolean boolean1 = false;
            int resourceId2 = 0;
            boolean boolean2 = false;
            int int1 = 0;
            int int2 = 0;
            int int3 = 0;
            boolean boolean3 = false;
            boolean boolean4 = false;
            int integer = 0;
            boolean boolean5 = false;
            Label_0386: {
                if (set != null) {
                    final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(set, pd.r.a0, 0, 0);
                    try {
                        hasValue = obtainStyledAttributes.hasValue(23);
                        color = obtainStyledAttributes.getColor(23, 0);
                        resourceId = obtainStyledAttributes.getResourceId(12, 2131624248);
                        boolean1 = obtainStyledAttributes.getBoolean(28, true);
                        resourceId2 = obtainStyledAttributes.getResourceId(6, 0);
                        boolean2 = obtainStyledAttributes.getBoolean(29, true);
                        int1 = obtainStyledAttributes.getInt(24, 1);
                        int2 = obtainStyledAttributes.getInt(14, 0);
                        int3 = obtainStyledAttributes.getInt(22, 5000);
                        boolean3 = obtainStyledAttributes.getBoolean(8, true);
                        boolean4 = obtainStyledAttributes.getBoolean(2, true);
                        integer = obtainStyledAttributes.getInteger(20, 0);
                        this.x = obtainStyledAttributes.getBoolean(9, this.x);
                        boolean5 = obtainStyledAttributes.getBoolean(7, true);
                        break Label_0386;
                    }
                    finally {
                        obtainStyledAttributes.recycle();
                    }
                }
                int3 = 5000;
                boolean5 = true;
                color = 0;
                boolean4 = true;
                int2 = 0;
                int1 = 1;
                integer = 0;
                boolean3 = true;
                hasValue = false;
                boolean1 = true;
                resourceId2 = 0;
                boolean2 = true;
            }
            LayoutInflater.from(context).inflate(resourceId, (ViewGroup)this);
            ((ViewGroup)this).setDescendantFocusability(262144);
            final AspectRatioFrameLayout g = (AspectRatioFrameLayout)((View)this).findViewById(2131428937);
            this.g = g;
            if (g != null) {
                g.setResizeMode(int2);
            }
            final View viewById = ((View)this).findViewById(2131428981);
            this.h = viewById;
            if (viewById != null && hasValue) {
                viewById.setBackgroundColor(color);
            }
            boolean j = false;
            if (g != null && int1 != 0) {
                final ViewGroup$LayoutParams layoutParams = new ViewGroup$LayoutParams(-1, -1);
                Label_0635: {
                    Label_0632: {
                        if (int1 != 2) {
                            if (int1 != 3) {
                                Label_0552: {
                                    if (int1 != 4) {
                                        this.i = (View)new SurfaceView(context);
                                        break Label_0552;
                                    }
                                    try {
                                        this.i = (View)Class.forName("bd.h").getConstructor(Context.class).newInstance(context);
                                        break Label_0632;
                                    }
                                    catch (final Exception ex) {
                                        throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", ex);
                                    }
                                }
                            }
                            try {
                                this.i = (View)Class.forName("cd.j").getConstructor(Context.class).newInstance(context);
                                j = true;
                                break Label_0635;
                            }
                            catch (final Exception ex2) {
                                throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", ex2);
                            }
                        }
                        this.i = (View)new TextureView(context);
                    }
                    j = false;
                }
                this.i.setLayoutParams(layoutParams);
                this.i.setOnClickListener((View$OnClickListener)playerView$a);
                this.i.setClickable(false);
                ((ViewGroup)g).addView(this.i, 0);
            }
            else {
                this.i = null;
                j = false;
            }
            this.j = j;
            this.p = (FrameLayout)((View)this).findViewById(2131428927);
            this.q = (FrameLayout)((View)this).findViewById(2131428961);
            final ImageView k = (ImageView)((View)this).findViewById(2131428928);
            this.k = k;
            this.u = (boolean1 && k != null);
            if (resourceId2 != 0) {
                this.v = a.getDrawable(((View)this).getContext(), resourceId2);
            }
            final SubtitleView l = (SubtitleView)((View)this).findViewById(2131428987);
            if ((this.l = l) != null) {
                l.j();
                l.t();
            }
            final View viewById2 = ((View)this).findViewById(2131428933);
            if ((this.m = viewById2) != null) {
                viewById2.setVisibility(8);
            }
            this.w = integer;
            final TextView n = (TextView)((View)this).findViewById(2131428944);
            if ((this.n = n) != null) {
                ((View)n).setVisibility(8);
            }
            final c o = (c)((View)this).findViewById(2131428938);
            final View viewById3 = ((View)this).findViewById(2131428939);
            if (o != null) {
                this.o = o;
            }
            else if (viewById3 != null) {
                final c o2 = new c(context, set);
                ((View)(this.o = o2)).setId(2131428938);
                ((View)o2).setLayoutParams(viewById3.getLayoutParams());
                final ViewGroup viewGroup = (ViewGroup)viewById3.getParent();
                final int indexOfChild = viewGroup.indexOfChild(viewById3);
                viewGroup.removeView(viewById3);
                viewGroup.addView((View)o2, indexOfChild);
            }
            else {
                this.o = null;
            }
            final c o3 = this.o;
            if (o3 == null) {
                int3 = 0;
            }
            this.z = int3;
            this.C = boolean3;
            this.A = boolean4;
            this.B = boolean5;
            this.s = (boolean2 && o3 != null);
            if (o3 != null) {
                o3.c();
            }
            this.k();
            final c o4 = this.o;
            if (o4 != null) {
                o4.g.add((c.d)playerView$a);
            }
        }
    }
    
    public static void a(final TextureView textureView, final int n) {
        final Matrix transform = new Matrix();
        final float n2 = (float)((View)textureView).getWidth();
        final float n3 = (float)((View)textureView).getHeight();
        if (n2 != 0.0f && n3 != 0.0f && n != 0) {
            final float n4 = n2 / 2.0f;
            final float n5 = n3 / 2.0f;
            transform.postRotate((float)n, n4, n5);
            final RectF rectF = new RectF(0.0f, 0.0f, n2, n3);
            final RectF rectF2 = new RectF();
            transform.mapRect(rectF2, rectF);
            transform.postScale(n2 / rectF2.width(), n3 / rectF2.height(), n4, n5);
        }
        textureView.setTransform(transform);
    }
    
    public final void b() {
        final ImageView k = this.k;
        if (k != null) {
            k.setImageResource(17170445);
            this.k.setVisibility(4);
        }
    }
    
    public final boolean c() {
        final w r = this.r;
        return r != null && r.b() && this.r.o();
    }
    
    public final void d(final boolean b) {
        if (this.c() && this.B) {
            return;
        }
        if (this.n()) {
            final boolean b2 = this.o.e() && this.o.getShowTimeoutMs() <= 0;
            final boolean f = this.f();
            if (b || b2 || f) {
                this.g(f);
            }
        }
    }
    
    public final boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        final w r = this.r;
        if (r != null && r.b()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        final int keyCode = keyEvent.getKeyCode();
        final boolean b = false;
        final boolean b2 = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        if (b2 && this.n() && !this.o.e()) {
            this.d(true);
        }
        else if ((!this.n() || !this.o.a(keyEvent)) && !super.dispatchKeyEvent(keyEvent)) {
            boolean b3 = b;
            if (!b2) {
                return b3;
            }
            b3 = b;
            if (this.n()) {
                this.d(true);
                b3 = b;
                return b3;
            }
            return b3;
        }
        else {
            this.d(true);
        }
        return true;
    }
    
    public final boolean e(final Drawable imageDrawable) {
        if (imageDrawable != null) {
            final int intrinsicWidth = imageDrawable.getIntrinsicWidth();
            final int intrinsicHeight = imageDrawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                final float aspectRatio = intrinsicWidth / (float)intrinsicHeight;
                final AspectRatioFrameLayout g = this.g;
                if (g != null) {
                    g.setAspectRatio(aspectRatio);
                }
                this.k.setImageDrawable(imageDrawable);
                this.k.setVisibility(0);
                return true;
            }
        }
        return false;
    }
    
    public final boolean f() {
        final w r = this.r;
        final boolean b = true;
        if (r == null) {
            return true;
        }
        final int g = r.g();
        if (this.A) {
            boolean b2 = b;
            if (g == 1) {
                return b2;
            }
            b2 = b;
            if (g == 4) {
                return b2;
            }
            if (!this.r.o()) {
                b2 = b;
                return b2;
            }
        }
        return false;
    }
    
    public final void g(final boolean b) {
        if (!this.n()) {
            return;
        }
        final c o = this.o;
        int z;
        if (b) {
            z = 0;
        }
        else {
            z = this.z;
        }
        o.setShowTimeoutMs(z);
        final c o2 = this.o;
        Label_0217: {
            if (!o2.e()) {
                ((View)o2).setVisibility(0);
                for (final c.d d : o2.g) {
                    ((View)o2).getVisibility();
                    d.j();
                }
                o2.i();
                o2.h();
                o2.k();
                o2.l();
                o2.m();
                final boolean f = o2.f();
                Label_0165: {
                    if (!f) {
                        final View j = o2.j;
                        if (j != null) {
                            j.requestFocus();
                            break Label_0165;
                        }
                    }
                    if (f) {
                        final View k = o2.k;
                        if (k != null) {
                            k.requestFocus();
                        }
                    }
                }
                final boolean f2 = o2.f();
                if (!f2) {
                    final View i = o2.j;
                    if (i != null) {
                        i.sendAccessibilityEvent(8);
                        break Label_0217;
                    }
                }
                if (f2) {
                    final View l = o2.k;
                    if (l != null) {
                        l.sendAccessibilityEvent(8);
                    }
                }
            }
        }
        o2.d();
    }
    
    public List<xc.a> getAdOverlayInfos() {
        final ArrayList list = new ArrayList();
        final FrameLayout q = this.q;
        if (q != null) {
            list.add(new xc.a(q));
        }
        final c o = this.o;
        if (o != null) {
            list.add(new xc.a((FrameLayout)o));
        }
        return (List<xc.a>)ImmutableList.copyOf((Collection)list);
    }
    
    public ViewGroup getAdViewGroup() {
        final FrameLayout p = this.p;
        if (p != null) {
            return (ViewGroup)p;
        }
        throw new IllegalStateException("exo_ad_overlay must be present for ad playback");
    }
    
    public boolean getControllerAutoShow() {
        return this.A;
    }
    
    public boolean getControllerHideOnTouch() {
        return this.C;
    }
    
    public int getControllerShowTimeoutMs() {
        return this.z;
    }
    
    public Drawable getDefaultArtwork() {
        return this.v;
    }
    
    public FrameLayout getOverlayFrameLayout() {
        return this.q;
    }
    
    public w getPlayer() {
        return this.r;
    }
    
    public int getResizeMode() {
        d0.g(this.g);
        return this.g.getResizeMode();
    }
    
    public SubtitleView getSubtitleView() {
        return this.l;
    }
    
    public boolean getUseArtwork() {
        return this.u;
    }
    
    public boolean getUseController() {
        return this.s;
    }
    
    public View getVideoSurfaceView() {
        return this.i;
    }
    
    public final boolean h() {
        if (this.n() && this.r != null) {
            if (!this.o.e()) {
                this.d(true);
            }
            else if (this.C) {
                this.o.c();
            }
            return true;
        }
        return false;
    }
    
    public final void i() {
        final w r = this.r;
        q q;
        if (r != null) {
            q = r.getVideoSize();
        }
        else {
            q = bd.q.j;
        }
        final int f = q.f;
        final int g = q.g;
        final int h = q.h;
        final float n = 0.0f;
        float n2;
        if (g != 0 && f != 0) {
            n2 = f * q.i / g;
        }
        else {
            n2 = 0.0f;
        }
        final View i = this.i;
        float n3 = n2;
        if (i instanceof TextureView) {
            n3 = n2;
            Label_0123: {
                if (n2 > 0.0f) {
                    if (h != 90) {
                        n3 = n2;
                        if (h != 270) {
                            break Label_0123;
                        }
                    }
                    n3 = 1.0f / n2;
                }
            }
            if (this.D != 0) {
                i.removeOnLayoutChangeListener((View$OnLayoutChangeListener)this.f);
            }
            if ((this.D = h) != 0) {
                this.i.addOnLayoutChangeListener((View$OnLayoutChangeListener)this.f);
            }
            a((TextureView)this.i, this.D);
        }
        final AspectRatioFrameLayout g2 = this.g;
        float aspectRatio;
        if (this.j) {
            aspectRatio = n;
        }
        else {
            aspectRatio = n3;
        }
        if (g2 != null) {
            g2.setAspectRatio(aspectRatio);
        }
    }
    
    public final void j() {
        if (this.m != null) {
            final w r = this.r;
            final boolean b = true;
            final int n = 0;
            int n2 = 0;
            Label_0072: {
                if (r != null && r.g() == 2) {
                    final int w = this.w;
                    n2 = (b ? 1 : 0);
                    if (w == 2) {
                        break Label_0072;
                    }
                    if (w == 1 && this.r.o()) {
                        n2 = (b ? 1 : 0);
                        break Label_0072;
                    }
                }
                n2 = 0;
            }
            final View m = this.m;
            int visibility;
            if (n2 != 0) {
                visibility = n;
            }
            else {
                visibility = 8;
            }
            m.setVisibility(visibility);
        }
    }
    
    public final void k() {
        final c o = this.o;
        CharSequence string = null;
        if (o != null && this.s) {
            if (((View)o).getVisibility() == 0) {
                if (this.C) {
                    string = ((View)this).getResources().getString(2131953403);
                }
                ((View)this).setContentDescription(string);
            }
            else {
                ((View)this).setContentDescription((CharSequence)((View)this).getResources().getString(2131953417));
            }
        }
        else {
            ((View)this).setContentDescription((CharSequence)null);
        }
    }
    
    public final void l() {
        final TextView n = this.n;
        if (n != null) {
            final CharSequence y = this.y;
            if (y != null) {
                n.setText(y);
                ((View)this.n).setVisibility(0);
                return;
            }
            final w r = this.r;
            if (r != null) {
                r.a();
            }
            ((View)this.n).setVisibility(8);
        }
    }
    
    public final void m(final boolean b) {
        final w r = this.r;
        final int n = 0;
        if (r == null || !r.n(30) || ((AbstractCollection)r.H().f).isEmpty()) {
            if (!this.x) {
                this.b();
                final View h = this.h;
                if (h != null) {
                    h.setVisibility(0);
                }
            }
            return;
        }
        if (b && !this.x) {
            final View h2 = this.h;
            if (h2 != null) {
                h2.setVisibility(0);
            }
        }
        final f0 h3 = r.H();
        int n2 = 0;
        int n3 = 0;
        boolean b3 = false;
    Label_0191:
        while (true) {
            final int size = ((AbstractCollection)h3.f).size();
            n3 = 1;
            if (n2 < size) {
                final f0$a f0$a = ((List<f0$a>)h3.f).get(n2);
                final boolean[] i = f0$a.i;
                final int length = i.length;
                int j = 0;
                while (true) {
                    while (j < length) {
                        if (i[j]) {
                            final boolean b2 = true;
                            if (b2 && f0$a.h == 2) {
                                b3 = true;
                                break Label_0191;
                            }
                            ++n2;
                            continue Label_0191;
                        }
                        else {
                            ++j;
                        }
                    }
                    final boolean b2 = false;
                    continue;
                }
            }
            b3 = false;
            break;
        }
        if (b3) {
            this.b();
            return;
        }
        final View h4 = this.h;
        if (h4 != null) {
            h4.setVisibility(0);
        }
        int n4;
        if (this.u) {
            d0.g(this.k);
            n4 = n3;
        }
        else {
            n4 = 0;
        }
        if (n4 != 0) {
            final byte[] p = r.X().p;
            int e;
            if (p == null) {
                e = n;
            }
            else {
                e = (this.e((Drawable)new BitmapDrawable(((View)this).getResources(), BitmapFactory.decodeByteArray(p, 0, p.length))) ? 1 : 0);
            }
            if (e != 0) {
                return;
            }
            if (this.e(this.v)) {
                return;
            }
        }
        this.b();
    }
    
    public final boolean n() {
        if (this.s) {
            d0.g(this.o);
            return true;
        }
        return false;
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        if (!this.n() || this.r == null) {
            return false;
        }
        final int action = motionEvent.getAction();
        if (action == 0) {
            return this.E = true;
        }
        if (action != 1) {
            return false;
        }
        if (this.E) {
            this.E = false;
            this.performClick();
            return true;
        }
        return false;
    }
    
    public final boolean onTrackballEvent(final MotionEvent motionEvent) {
        if (this.n() && this.r != null) {
            this.d(true);
            return true;
        }
        return false;
    }
    
    public final boolean performClick() {
        super.performClick();
        return this.h();
    }
    
    public void setAspectRatioListener(final AspectRatioFrameLayout.a aspectRatioListener) {
        d0.g(this.g);
        this.g.setAspectRatioListener(aspectRatioListener);
    }
    
    public void setControllerAutoShow(final boolean a) {
        this.A = a;
    }
    
    public void setControllerHideDuringAds(final boolean b) {
        this.B = b;
    }
    
    public void setControllerHideOnTouch(final boolean c) {
        d0.g(this.o);
        this.C = c;
        this.k();
    }
    
    public void setControllerShowTimeoutMs(final int z) {
        d0.g(this.o);
        this.z = z;
        if (this.o.e()) {
            this.g(this.f());
        }
    }
    
    public void setControllerVisibilityListener(final c.d t) {
        d0.g(this.o);
        final c.d t2 = this.t;
        if (t2 == t) {
            return;
        }
        if (t2 != null) {
            this.o.g.remove(t2);
        }
        if ((this.t = t) != null) {
            final c o = this.o;
            o.getClass();
            o.g.add(t);
        }
    }
    
    public void setCustomErrorMessage(final CharSequence y) {
        d0.f(this.n != null);
        this.y = y;
        this.l();
    }
    
    public void setDefaultArtwork(final Drawable v) {
        if (this.v != v) {
            this.v = v;
            this.m(false);
        }
    }
    
    public void setErrorMessageProvider(final h<? super PlaybackException> h) {
        if (h != null) {
            this.l();
        }
    }
    
    public void setKeepContentOnPlayerReset(final boolean x) {
        if (this.x != x) {
            this.x = x;
            this.m(false);
        }
    }
    
    public void setPlayer(final w w) {
        d0.f(Looper.myLooper() == Looper.getMainLooper());
        d0.c(w == null || w.J() == Looper.getMainLooper());
        final w r = this.r;
        if (r == w) {
            return;
        }
        if (r != null) {
            r.h((w.c)this.f);
            if (r.n(27)) {
                final View i = this.i;
                if (i instanceof TextureView) {
                    r.t((TextureView)i);
                }
                else if (i instanceof SurfaceView) {
                    r.T((SurfaceView)i);
                }
            }
        }
        final SubtitleView l = this.l;
        if (l != null) {
            l.setCues((List)null);
        }
        this.r = w;
        if (this.n()) {
            this.o.setPlayer(w);
        }
        this.j();
        this.l();
        this.m(true);
        if (w != null) {
            if (w.n(27)) {
                final View j = this.i;
                if (j instanceof TextureView) {
                    w.L((TextureView)j);
                }
                else if (j instanceof SurfaceView) {
                    w.i((SurfaceView)j);
                }
                this.i();
            }
            if (this.l != null && w.n(28)) {
                this.l.setCues((List)w.E());
            }
            w.R((w.c)this.f);
            this.d(false);
        }
        else {
            final c o = this.o;
            if (o != null) {
                o.c();
            }
        }
    }
    
    public void setRepeatToggleModes(final int repeatToggleModes) {
        d0.g(this.o);
        this.o.setRepeatToggleModes(repeatToggleModes);
    }
    
    public void setResizeMode(final int resizeMode) {
        d0.g(this.g);
        this.g.setResizeMode(resizeMode);
    }
    
    public void setShowBuffering(final int w) {
        if (this.w != w) {
            this.w = w;
            this.j();
        }
    }
    
    public void setShowFastForwardButton(final boolean showFastForwardButton) {
        d0.g(this.o);
        this.o.setShowFastForwardButton(showFastForwardButton);
    }
    
    public void setShowMultiWindowTimeBar(final boolean showMultiWindowTimeBar) {
        d0.g(this.o);
        this.o.setShowMultiWindowTimeBar(showMultiWindowTimeBar);
    }
    
    public void setShowNextButton(final boolean showNextButton) {
        d0.g(this.o);
        this.o.setShowNextButton(showNextButton);
    }
    
    public void setShowPreviousButton(final boolean showPreviousButton) {
        d0.g(this.o);
        this.o.setShowPreviousButton(showPreviousButton);
    }
    
    public void setShowRewindButton(final boolean showRewindButton) {
        d0.g(this.o);
        this.o.setShowRewindButton(showRewindButton);
    }
    
    public void setShowShuffleButton(final boolean showShuffleButton) {
        d0.g(this.o);
        this.o.setShowShuffleButton(showShuffleButton);
    }
    
    public void setShutterBackgroundColor(final int backgroundColor) {
        final View h = this.h;
        if (h != null) {
            h.setBackgroundColor(backgroundColor);
        }
    }
    
    public void setUseArtwork(final boolean u) {
        d0.f(!u || this.k != null);
        if (this.u != u) {
            this.u = u;
            this.m(false);
        }
    }
    
    public void setUseController(final boolean s) {
        d0.f(!s || this.o != null);
        if (this.s == s) {
            return;
        }
        this.s = s;
        if (this.n()) {
            this.o.setPlayer(this.r);
        }
        else {
            final c o = this.o;
            if (o != null) {
                o.c();
                this.o.setPlayer(null);
            }
        }
        this.k();
    }
    
    public void setVisibility(final int n) {
        super.setVisibility(n);
        final View i = this.i;
        if (i instanceof SurfaceView) {
            i.setVisibility(n);
        }
    }
}
