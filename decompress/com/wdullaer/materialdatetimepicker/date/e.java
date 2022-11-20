// 
// Decompiled by Procyon v0.6.0
// 

package com.wdullaer.materialdatetimepicker.date;

import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.fragment.app.n;
import android.view.View$AccessibilityDelegate;
import android.view.View$MeasureSpec;
import android.view.MotionEvent;
import java.util.Iterator;
import be2.d;
import android.graphics.Canvas;
import java.util.Locale;
import android.text.format.DateFormat;
import android.content.res.Resources;
import android.graphics.Paint$Style;
import android.graphics.Paint$Align;
import android.graphics.Typeface;
import a4.l0$d;
import a4.l0;
import android.util.AttributeSet;
import android.content.Context;
import java.util.Calendar;
import android.graphics.Paint;
import java.text.SimpleDateFormat;
import android.view.View;

public abstract class e extends View
{
    public static int M;
    public static int N;
    public static int O;
    public static int P;
    public static int Q;
    public static int R;
    public static int S;
    public static int T;
    public final e.e$a A;
    public int B;
    public b C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public SimpleDateFormat K;
    public int L;
    public a f;
    public int g;
    public String h;
    public String i;
    public Paint j;
    public Paint k;
    public Paint l;
    public Paint m;
    public final StringBuilder n;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public final Calendar y;
    public final Calendar z;
    
    public e(final Context context, a f) {
        super(context, (AttributeSet)null);
        this.g = 0;
        this.r = 32;
        this.s = false;
        this.t = -1;
        this.u = -1;
        this.v = 1;
        this.w = 7;
        this.x = 7;
        this.B = 6;
        this.L = 0;
        this.f = f;
        final Resources resources = context.getResources();
        this.z = Calendar.getInstance(((DatePickerDialog)this.f).o0(), ((DatePickerDialog)this.f).L);
        this.y = Calendar.getInstance(((DatePickerDialog)this.f).o0(), ((DatePickerDialog)this.f).L);
        this.h = resources.getString(2131955722);
        this.i = resources.getString(2131955737);
        f = this.f;
        if (f != null && ((DatePickerDialog)f).v) {
            this.E = n3.a.getColor(context, 2131100193);
            this.G = n3.a.getColor(context, 2131100186);
            this.J = n3.a.getColor(context, 2131100189);
            this.I = n3.a.getColor(context, 2131100191);
        }
        else {
            this.E = n3.a.getColor(context, 2131100192);
            this.G = n3.a.getColor(context, 2131100185);
            this.J = n3.a.getColor(context, 2131100188);
            this.I = n3.a.getColor(context, 2131100190);
        }
        this.F = n3.a.getColor(context, 2131100212);
        this.H = ((DatePickerDialog)this.f).x;
        n3.a.getColor(context, 2131100212);
        this.n = new StringBuilder(50);
        e.M = resources.getDimensionPixelSize(2131166063);
        e.N = resources.getDimensionPixelSize(2131166078);
        e.O = resources.getDimensionPixelSize(2131166077);
        e.P = resources.getDimensionPixelOffset(2131166079);
        e.Q = resources.getDimensionPixelOffset(2131166080);
        final DatePickerDialog.Version i = ((DatePickerDialog)this.f).I;
        final DatePickerDialog.Version version_1 = DatePickerDialog.Version.VERSION_1;
        int r;
        if (i == version_1) {
            r = resources.getDimensionPixelSize(2131166061);
        }
        else {
            r = resources.getDimensionPixelSize(2131166062);
        }
        e.R = r;
        e.S = resources.getDimensionPixelSize(2131166060);
        e.T = resources.getDimensionPixelSize(2131166059);
        if (((DatePickerDialog)this.f).I == version_1) {
            this.r = (resources.getDimensionPixelOffset(2131166051) - this.getMonthHeaderSize()) / 6;
        }
        else {
            this.r = (resources.getDimensionPixelOffset(2131166052) - this.getMonthHeaderSize() - e.O * 2) / 6;
        }
        int dimensionPixelSize;
        if (((DatePickerDialog)this.f).I == version_1) {
            dimensionPixelSize = 0;
        }
        else {
            dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166056);
        }
        this.g = dimensionPixelSize;
        l0.l((View)this, (a4.a)(this.A = this.getMonthViewTouchHelper()));
        l0$d.s((View)this, 1);
        this.D = true;
        final Paint k = new Paint();
        this.k = k;
        if (((DatePickerDialog)this.f).I == version_1) {
            k.setFakeBoldText(true);
        }
        this.k.setAntiAlias(true);
        this.k.setTextSize((float)e.N);
        this.k.setTypeface(Typeface.create(this.i, 1));
        this.k.setColor(this.E);
        this.k.setTextAlign(Paint$Align.CENTER);
        this.k.setStyle(Paint$Style.FILL);
        (this.l = new Paint()).setFakeBoldText(true);
        this.l.setAntiAlias(true);
        this.l.setColor(this.H);
        this.l.setTextAlign(Paint$Align.CENTER);
        this.l.setStyle(Paint$Style.FILL);
        this.l.setAlpha(255);
        (this.m = new Paint()).setAntiAlias(true);
        this.m.setTextSize((float)e.O);
        this.m.setColor(this.G);
        this.k.setTypeface(Typeface.create(this.h, 1));
        this.m.setStyle(Paint$Style.FILL);
        this.m.setTextAlign(Paint$Align.CENTER);
        this.m.setFakeBoldText(true);
        (this.j = new Paint()).setAntiAlias(true);
        this.j.setTextSize((float)e.M);
        this.j.setStyle(Paint$Style.FILL);
        this.j.setTextAlign(Paint$Align.CENTER);
        this.j.setFakeBoldText(false);
    }
    
    private String getMonthAndYearString() {
        final Locale l = ((DatePickerDialog)this.f).L;
        final String bestDateTimePattern = DateFormat.getBestDateTimePattern(l, "MMMM yyyy");
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(bestDateTimePattern, l);
        simpleDateFormat.setTimeZone(((DatePickerDialog)this.f).o0());
        simpleDateFormat.applyLocalizedPattern(bestDateTimePattern);
        this.n.setLength(0);
        return simpleDateFormat.format(this.y.getTime());
    }
    
    public abstract void a(final Canvas p0, final int p1, final int p2, final int p3, final int p4, final int p5);
    
    public final int b(final float n, final float n2) {
        final int g = this.g;
        final float n3 = (float)g;
        int n7;
        if (n >= n3 && n <= this.q - g) {
            final int n4 = (int)(n2 - this.getMonthHeaderSize()) / this.r;
            final int w = this.w;
            final int n5 = (int)((n - n3) * w / (this.q - g - this.g));
            final int l = this.L;
            final int v = this.v;
            int n6;
            if ((n6 = l) < v) {
                n6 = l + w;
            }
            n7 = n4 * w + (n5 - (n6 - v) + 1);
        }
        else {
            n7 = -1;
        }
        if (n7 >= 1 && n7 <= this.x) {
            return n7;
        }
        return -1;
    }
    
    public final boolean c(final int n, final int n2, final int n3) {
        final DatePickerDialog datePickerDialog = (DatePickerDialog)this.f;
        final Calendar instance = Calendar.getInstance(datePickerDialog.o0());
        instance.set(1, n);
        instance.set(2, n2);
        instance.set(5, n3);
        d.d(instance);
        return datePickerDialog.u.contains(instance);
    }
    
    public final void d(final int n) {
        if (((DatePickerDialog)this.f).N.I(this.p, this.o, n)) {
            return;
        }
        final b c = this.C;
        if (c != null) {
            final com.wdullaer.materialdatetimepicker.date.d.a l = new com.wdullaer.materialdatetimepicker.date.d.a(this.p, this.o, n, ((DatePickerDialog)this.f).o0());
            final com.wdullaer.materialdatetimepicker.date.d d = (com.wdullaer.materialdatetimepicker.date.d)c;
            final DatePickerDialog datePickerDialog = (DatePickerDialog)d.k;
            if (datePickerDialog.y) {
                datePickerDialog.O.b();
            }
            final a k = d.k;
            final int b = l.b;
            final int c2 = l.c;
            final int d2 = l.d;
            final DatePickerDialog datePickerDialog2 = (DatePickerDialog)k;
            datePickerDialog2.f.set(1, b);
            datePickerDialog2.f.set(2, c2);
            datePickerDialog2.f.set(5, d2);
            final Iterator iterator = datePickerDialog2.h.iterator();
            while (iterator.hasNext()) {
                ((DatePickerDialog.a)iterator.next()).b();
            }
            datePickerDialog2.u0(true);
            if (datePickerDialog2.A) {
                datePickerDialog2.q0();
                ((n)datePickerDialog2).dismiss();
            }
            d.l = l;
            ((RecyclerView$Adapter)d).notifyDataSetChanged();
        }
        ((i4.a)this.A).p(n, 1);
    }
    
    public final boolean dispatchHoverEvent(final MotionEvent motionEvent) {
        return ((i4.a)this.A).d(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }
    
    public com.wdullaer.materialdatetimepicker.date.d.a getAccessibilityFocus() {
        final int i = ((i4.a)this.A).i;
        if (i >= 0) {
            return new com.wdullaer.materialdatetimepicker.date.d.a(this.p, this.o, i, ((DatePickerDialog)this.f).o0());
        }
        return null;
    }
    
    public int getCellWidth() {
        return (this.q - this.g * 2) / this.w;
    }
    
    public int getEdgePadding() {
        return this.g;
    }
    
    public int getMonth() {
        return this.o;
    }
    
    public int getMonthHeaderSize() {
        int n;
        if (((DatePickerDialog)this.f).I == DatePickerDialog.Version.VERSION_1) {
            n = e.P;
        }
        else {
            n = e.Q;
        }
        return n;
    }
    
    public int getMonthHeight() {
        int n;
        if (((DatePickerDialog)this.f).I == DatePickerDialog.Version.VERSION_1) {
            n = 2;
        }
        else {
            n = 3;
        }
        return this.getMonthHeaderSize() - e.O * n;
    }
    
    public e.e$a getMonthViewTouchHelper() {
        return new e.e$a(this, (View)this);
    }
    
    public int getYear() {
        return this.p;
    }
    
    public final void onDraw(final Canvas canvas) {
        final int n = this.q / 2;
        int n2;
        if (((DatePickerDialog)this.f).I == DatePickerDialog.Version.VERSION_1) {
            n2 = (this.getMonthHeaderSize() - e.O) / 2;
        }
        else {
            n2 = this.getMonthHeaderSize() / 2 - e.O;
        }
        canvas.drawText(this.getMonthAndYearString(), (float)n, (float)n2, this.k);
        final int monthHeaderSize = this.getMonthHeaderSize();
        final int n3 = e.O / 2;
        final int n4 = (this.q - this.g * 2) / (this.w * 2);
        int n5 = 0;
        while (true) {
            final int w = this.w;
            if (n5 >= w) {
                break;
            }
            final int g = this.g;
            this.z.set(7, (this.v + n5) % w);
            final Calendar z = this.z;
            final Locale l = ((DatePickerDialog)this.f).L;
            if (this.K == null) {
                this.K = new SimpleDateFormat("EEEEE", l);
            }
            canvas.drawText(this.K.format(z.getTime()), (float)((n5 * 2 + 1) * n4 + g), (float)(monthHeaderSize - n3), this.m);
            ++n5;
        }
        int n6 = this.getMonthHeaderSize() + ((this.r + e.M) / 2 - 1);
        final int q = this.q;
        final int g2 = this.g;
        final int w2 = this.w;
        final int n7 = (q - g2 * 2) / (w2 * 2);
        final int i = this.L;
        final int v = this.v;
        int n8;
        if ((n8 = i) < v) {
            n8 = i + w2;
        }
        int n9 = n8 - v;
        int n12;
        for (int j = 1; j <= this.x; ++j, n6 = n12) {
            final int g3 = this.g;
            final int n10 = (e.M + this.r) / 2;
            this.a(canvas, this.p, this.o, j, (n9 * 2 + 1) * n7 + g3, n6);
            final int n11 = n9 + 1;
            n12 = n6;
            if ((n9 = n11) == this.w) {
                n12 = n6 + this.r;
                n9 = 0;
            }
        }
    }
    
    public final void onMeasure(int b, int size) {
        size = View$MeasureSpec.getSize(b);
        final int r = this.r;
        b = this.B;
        this.setMeasuredDimension(size, this.getMonthHeaderSize() + r * b);
    }
    
    public final void onSizeChanged(final int q, final int n, final int n2, final int n3) {
        this.q = q;
        ((i4.a)this.A).g();
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            final int b = this.b(motionEvent.getX(), motionEvent.getY());
            if (b >= 0) {
                this.d(b);
            }
        }
        return true;
    }
    
    public void setAccessibilityDelegate(final View$AccessibilityDelegate accessibilityDelegate) {
        if (!this.D) {
            super.setAccessibilityDelegate(accessibilityDelegate);
        }
    }
    
    public void setOnDayClickListener(final b c) {
        this.C = c;
    }
    
    public void setSelectedDay(final int t) {
        this.t = t;
    }
    
    public interface b
    {
    }
}
