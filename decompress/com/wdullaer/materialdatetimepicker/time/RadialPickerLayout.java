// 
// Decompiled by Procyon v0.6.0
// 

package com.wdullaer.materialdatetimepicker.time;

import android.view.accessibility.AccessibilityRecord;
import android.os.Bundle;
import nb2.t0;
import android.view.ViewGroup;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo;
import android.util.Log;
import android.text.format.DateUtils;
import java.util.Calendar;
import android.view.accessibility.AccessibilityEvent;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.os.Handler;
import android.animation.AnimatorSet;
import android.view.accessibility.AccessibilityManager;
import android.view.View$OnTouchListener;
import android.widget.FrameLayout;

public class RadialPickerLayout extends FrameLayout implements View$OnTouchListener
{
    public boolean A;
    public boolean B;
    public int C;
    public float D;
    public float E;
    public AccessibilityManager F;
    public AnimatorSet G;
    public Handler H;
    public final int f;
    public final int g;
    public Timepoint h;
    public e i;
    public a j;
    public boolean k;
    public Timepoint l;
    public boolean m;
    public int n;
    public com.wdullaer.materialdatetimepicker.time.a o;
    public de2.a p;
    public d q;
    public d r;
    public d s;
    public c t;
    public c u;
    public c v;
    public View w;
    public int[] x;
    public boolean y;
    public int z;
    
    public RadialPickerLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.z = -1;
        this.H = new Handler();
        ((View)this).setOnTouchListener((View$OnTouchListener)this);
        this.f = ViewConfiguration.get(context).getScaledTouchSlop();
        this.g = ViewConfiguration.getTapTimeout();
        this.A = false;
        ((ViewGroup)this).addView((View)(this.o = new com.wdullaer.materialdatetimepicker.time.a(context)));
        ((ViewGroup)this).addView((View)(this.p = new de2.a(context)));
        ((ViewGroup)this).addView((View)(this.t = new c(context)));
        ((ViewGroup)this).addView((View)(this.u = new c(context)));
        ((ViewGroup)this).addView((View)(this.v = new c(context)));
        ((ViewGroup)this).addView((View)(this.q = new d(context)));
        ((ViewGroup)this).addView((View)(this.r = new d(context)));
        ((ViewGroup)this).addView((View)(this.s = new d(context)));
        this.x = new int[361];
        int n = 8;
        int n2 = 0;
        int n3 = 0;
        int n4 = 1;
        while (true) {
            final int n5 = 4;
            if (n2 >= 361) {
                break;
            }
            this.x[n2] = n3;
            if (n4 == n) {
                n3 += 6;
                int n6;
                if (n3 == 360) {
                    n6 = 7;
                }
                else {
                    n6 = n5;
                    if (n3 % 30 == 0) {
                        n6 = 14;
                    }
                }
                final int n7 = 1;
                n = n6;
                n4 = n7;
            }
            else {
                ++n4;
            }
            ++n2;
        }
        this.h = null;
        this.y = true;
        (this.w = new View(context)).setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
        this.w.setBackgroundColor(n3.a.getColor(context, 2131100211));
        this.w.setVisibility(4);
        ((ViewGroup)this).addView(this.w);
        this.F = (AccessibilityManager)context.getSystemService("accessibility");
        this.k = false;
    }
    
    private int getCurrentlyShowingValue() {
        final int currentItemShowing = this.getCurrentItemShowing();
        if (currentItemShowing == 0) {
            return this.l.f;
        }
        if (currentItemShowing == 1) {
            return this.l.g;
        }
        if (currentItemShowing != 2) {
            return -1;
        }
        return this.l.h;
    }
    
    public final int a(final float n, final float n2, final boolean b, final Boolean[] array) {
        final int currentItemShowing = this.getCurrentItemShowing();
        if (currentItemShowing == 0) {
            return this.t.a(n, n2, b, array);
        }
        if (currentItemShowing == 1) {
            return this.u.a(n, n2, b, array);
        }
        if (currentItemShowing != 2) {
            return -1;
        }
        return this.v.a(n, n2, b, array);
    }
    
    public final Timepoint b(int n, final boolean b, final boolean b2) {
        final int n2 = -1;
        if (n == -1) {
            return null;
        }
        final int currentItemShowing = this.getCurrentItemShowing();
        final int n3 = 0;
        final boolean b3 = !b2 && (currentItemShowing == 1 || currentItemShowing == 2);
        int n4 = 30;
        int n5;
        if (b3) {
            final int[] x = this.x;
            if (x == null) {
                n5 = n2;
            }
            else {
                n5 = x[n];
            }
        }
        else {
            final int n6 = n / 30 * 30;
            if (n - n6 < (n5 = n6 + 30) - n) {
                n5 = n6;
            }
        }
        if (currentItemShowing != 0) {
            n4 = 6;
        }
        Label_0212: {
            Label_0210: {
                if (currentItemShowing == 0) {
                    if (this.m) {
                        if (n5 != 0 || !b) {
                            if ((n = n5) != 360) {
                                break Label_0212;
                            }
                            n = n5;
                            if (!b) {
                                break Label_0210;
                            }
                            break Label_0212;
                        }
                    }
                    else if ((n = n5) != 0) {
                        break Label_0212;
                    }
                    n = 360;
                    break Label_0212;
                }
                if ((n = n5) != 360) {
                    break Label_0212;
                }
                if (currentItemShowing != 1) {
                    n = n5;
                    if (currentItemShowing != 2) {
                        break Label_0212;
                    }
                }
            }
            n = 0;
        }
        int n8;
        final int n7 = n8 = n / n4;
        if (currentItemShowing == 0) {
            n8 = n7;
            if (this.m) {
                n8 = n7;
                if (!b) {
                    n8 = n7;
                    if (n != 0) {
                        n8 = n7 + 12;
                    }
                }
            }
        }
        int n9 = n8;
        if (currentItemShowing == 0) {
            n9 = n8;
            if (((TimePickerDialog)this.i).P != TimePickerDialog.Version.VERSION_1) {
                n9 = n8;
                if (this.m) {
                    n9 = (n8 + 12) % 24;
                }
            }
        }
        Timepoint l;
        if (currentItemShowing != 0) {
            if (currentItemShowing != 1) {
                if (currentItemShowing != 2) {
                    l = this.l;
                }
                else {
                    final Timepoint i = this.l;
                    l = new Timepoint(i.f, i.g, n9);
                }
            }
            else {
                final Timepoint j = this.l;
                l = new Timepoint(j.f, n9, j.h);
            }
        }
        else {
            int n10 = n9;
            if (!this.m) {
                n10 = n9;
                if (this.getIsCurrentlyAmOrPm() == 1) {
                    n10 = n9;
                    if (n != 360) {
                        n10 = n9 + 12;
                    }
                }
            }
            if (!this.m && this.getIsCurrentlyAmOrPm() == 0 && n == 360) {
                n = n3;
            }
            else {
                n = n10;
            }
            final Timepoint k = this.l;
            l = new Timepoint(n, k.g, k.h);
        }
        return l;
    }
    
    public final boolean c(int n) {
        final boolean b = false;
        if (n <= 12 && n != 0) {
            n = 1;
        }
        else {
            n = 0;
        }
        int n2 = n;
        if (((TimePickerDialog)this.i).P != TimePickerDialog.Version.VERSION_1) {
            n2 = (n ^ 0x1);
        }
        boolean b2 = b;
        if (this.m) {
            b2 = b;
            if (n2 != 0) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public final void d(final Timepoint timepoint, final boolean b, int n) {
        if (n != 0) {
            if (n != 1) {
                if (n == 2) {
                    n = timepoint.h;
                    this.v.c(n * 6, false, b);
                    this.s.setSelection(timepoint.h);
                }
            }
            else {
                n = timepoint.g;
                this.u.c(n * 6, false, b);
                this.r.setSelection(timepoint.g);
                n = timepoint.h;
                if (n != this.l.h) {
                    this.v.c(n * 6, false, b);
                    this.s.setSelection(timepoint.h);
                }
            }
        }
        else {
            n = timepoint.f;
            final boolean c = this.c(n);
            final int n2 = n % 12;
            final int n3 = n2 * 360 / 12;
            final boolean m = this.m;
            if (!m) {
                n = n2;
            }
            int selection = n;
            if (!m && (selection = n) == 0) {
                selection = n + 12;
            }
            this.t.c(n3, c, b);
            this.q.setSelection(selection);
            n = timepoint.g;
            if (n != this.l.g) {
                this.u.c(n * 6, c, b);
                this.r.setSelection(timepoint.g);
            }
            n = timepoint.h;
            if (n != this.l.h) {
                this.v.c(n * 6, c, b);
                this.s.setSelection(timepoint.h);
            }
        }
        n = this.getCurrentItemShowing();
        if (n != 0) {
            if (n != 1) {
                if (n == 2) {
                    ((View)this.v).invalidate();
                    ((View)this.s).invalidate();
                }
            }
            else {
                ((View)this.u).invalidate();
                ((View)this.r).invalidate();
            }
        }
        else {
            ((View)this.t).invalidate();
            ((View)this.q).invalidate();
        }
    }
    
    public final boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            ((AccessibilityRecord)accessibilityEvent).getText().clear();
            final Calendar instance = Calendar.getInstance();
            instance.set(10, this.getHours());
            instance.set(12, this.getMinutes());
            instance.set(13, this.getSeconds());
            final long timeInMillis = instance.getTimeInMillis();
            int n;
            if (this.m) {
                n = 129;
            }
            else {
                n = 1;
            }
            ((AccessibilityRecord)accessibilityEvent).getText().add(DateUtils.formatDateTime(((View)this).getContext(), timeInMillis, n));
            return true;
        }
        return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }
    
    public final Timepoint e(final int n, final Timepoint timepoint) {
        if (n == 0) {
            final TimePickerDialog timePickerDialog = (TimePickerDialog)this.i;
            final f r = timePickerDialog.R;
            Timepoint.TYPE type;
            if (timePickerDialog.H) {
                type = Timepoint.TYPE.SECOND;
            }
            else if (timePickerDialog.I) {
                type = Timepoint.TYPE.MINUTE;
            }
            else {
                type = Timepoint.TYPE.HOUR;
            }
            return r.L(timepoint, (Timepoint.TYPE)null, type);
        }
        if (n != 1) {
            final e i = this.i;
            final Timepoint.TYPE minute = Timepoint.TYPE.MINUTE;
            final TimePickerDialog timePickerDialog2 = (TimePickerDialog)i;
            final f r2 = timePickerDialog2.R;
            Enum<Timepoint.TYPE> enum1;
            if (timePickerDialog2.H) {
                enum1 = Timepoint.TYPE.SECOND;
            }
            else if (timePickerDialog2.I) {
                enum1 = minute;
            }
            else {
                enum1 = Timepoint.TYPE.HOUR;
            }
            return r2.L(timepoint, minute, (Timepoint.TYPE)enum1);
        }
        final e j = this.i;
        final Timepoint.TYPE hour = Timepoint.TYPE.HOUR;
        final TimePickerDialog timePickerDialog3 = (TimePickerDialog)j;
        final f r3 = timePickerDialog3.R;
        Enum<Timepoint.TYPE> enum2;
        if (timePickerDialog3.H) {
            enum2 = Timepoint.TYPE.SECOND;
        }
        else if (timePickerDialog3.I) {
            enum2 = Timepoint.TYPE.MINUTE;
        }
        else {
            enum2 = hour;
        }
        return r3.L(timepoint, hour, (Timepoint.TYPE)enum2);
    }
    
    public final void f(final int n) {
        int n2 = 0;
        final int n3 = (n == 0) ? 1 : 0;
        final int n4 = (n == 1) ? 1 : 0;
        if (n == 2) {
            n2 = 1;
        }
        final d q = this.q;
        final float n5 = (float)n3;
        ((View)q).setAlpha(n5);
        ((View)this.t).setAlpha(n5);
        final d r = this.r;
        final float n6 = (float)n4;
        ((View)r).setAlpha(n6);
        ((View)this.u).setAlpha(n6);
        final d s = this.s;
        final float n7 = (float)n2;
        ((View)s).setAlpha(n7);
        ((View)this.v).setAlpha(n7);
    }
    
    public int getCurrentItemShowing() {
        int n2;
        final int n = n2 = this.n;
        if (n != 0 && (n2 = n) != 1 && (n2 = n) != 2) {
            final StringBuilder t = a.t("Current item showing was unfortunately set to ");
            t.append(this.n);
            Log.e("RadialPickerLayout", t.toString());
            n2 = -1;
        }
        return n2;
    }
    
    public int getHours() {
        return this.l.f;
    }
    
    public int getIsCurrentlyAmOrPm() {
        final int f = this.l.f;
        final int n = 0;
        if (f < 12) {
            return 0;
        }
        int n2 = n;
        if (f < 12) {
            n2 = 1;
        }
        if ((n2 ^ 0x1) != 0x0) {
            return 1;
        }
        return -1;
    }
    
    public int getMinutes() {
        return this.l.g;
    }
    
    public int getSeconds() {
        return this.l.h;
    }
    
    public Timepoint getTime() {
        return this.l;
    }
    
    public final void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_BACKWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_FORWARD);
    }
    
    public final boolean onTouch(final View view, final MotionEvent motionEvent) {
        final float x = motionEvent.getX();
        final float y = motionEvent.getY();
        final Boolean[] array = { Boolean.FALSE };
        final int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (!this.y) {
                        Log.e("RadialPickerLayout", "Input was disabled, but received ACTION_MOVE.");
                        return true;
                    }
                    final float abs = Math.abs(y - this.E);
                    final float abs2 = Math.abs(x - this.D);
                    if (!this.A) {
                        final float n = (float)this.f;
                        if (abs2 <= n && abs <= n) {
                            return false;
                        }
                    }
                    final int z = this.z;
                    if (z != 0 && z != 1) {
                        if (this.C != -1) {
                            this.A = true;
                            this.H.removeCallbacksAndMessages((Object)null);
                            final int a = this.a(x, y, true, array);
                            if (a != -1) {
                                final Timepoint e = this.e(this.getCurrentItemShowing(), this.b(a, array[0], false));
                                this.d(e, true, this.getCurrentItemShowing());
                                if (e != null) {
                                    final Timepoint h = this.h;
                                    if (h == null || !h.equals(e)) {
                                        ((TimePickerDialog)this.i).H0();
                                        this.h = e;
                                        ((TimePickerDialog)this.j).y0(e);
                                    }
                                }
                            }
                            return true;
                        }
                    }
                    else {
                        this.H.removeCallbacksAndMessages((Object)null);
                        if (this.p.a(x, y) != this.z) {
                            this.p.setAmOrPmPressed(-1);
                            ((View)this.p).invalidate();
                            this.z = -1;
                        }
                    }
                }
            }
            else {
                if (!this.y) {
                    Log.d("RadialPickerLayout", "Input was disabled, but received ACTION_UP.");
                    final TimePickerDialog timePickerDialog = (TimePickerDialog)this.j;
                    if (!timePickerDialog.w0()) {
                        timePickerDialog.X.clear();
                    }
                    timePickerDialog.q0(true);
                    return true;
                }
                this.H.removeCallbacksAndMessages((Object)null);
                this.B = false;
                final int z2 = this.z;
                if (z2 != 0 && z2 != 1) {
                    if (this.C != -1) {
                        final int a2 = this.a(x, y, this.A, array);
                        if (a2 != -1) {
                            final Timepoint e2 = this.e(this.getCurrentItemShowing(), this.b(a2, array[0], this.A ^ true));
                            this.d(e2, false, this.getCurrentItemShowing());
                            this.l = e2;
                            ((TimePickerDialog)this.j).y0(e2);
                            final a j = this.j;
                            final int currentItemShowing = this.getCurrentItemShowing();
                            final TimePickerDialog timePickerDialog2 = (TimePickerDialog)j;
                            if (timePickerDialog2.y) {
                                if (currentItemShowing == 0 && timePickerDialog2.I) {
                                    timePickerDialog2.z0(true, true, false, 1);
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append(timePickerDialog2.c0);
                                    sb.append(". ");
                                    sb.append(timePickerDialog2.t.getMinutes());
                                    be2.d.e((ViewGroup)timePickerDialog2.t, sb.toString());
                                }
                                else if (currentItemShowing == 1 && timePickerDialog2.H) {
                                    timePickerDialog2.z0(true, true, false, 2);
                                    final StringBuilder sb2 = new StringBuilder();
                                    sb2.append(timePickerDialog2.e0);
                                    sb2.append(". ");
                                    sb2.append(timePickerDialog2.t.getSeconds());
                                    be2.d.e((ViewGroup)timePickerDialog2.t, sb2.toString());
                                }
                            }
                        }
                    }
                    this.A = false;
                    return true;
                }
                final int a3 = this.p.a(x, y);
                this.p.setAmOrPmPressed(-1);
                ((View)this.p).invalidate();
                if (a3 == this.z) {
                    this.p.setAmOrPm(a3);
                    if (this.getIsCurrentlyAmOrPm() != a3) {
                        final Timepoint timepoint = new Timepoint(this.l);
                        final int z3 = this.z;
                        if (z3 == 0) {
                            final int f = timepoint.f;
                            if (f >= 12) {
                                timepoint.f = f % 12;
                            }
                        }
                        else if (z3 == 1) {
                            final int f2 = timepoint.f;
                            if (f2 < 12) {
                                timepoint.f = (f2 + 12) % 24;
                            }
                        }
                        final Timepoint e3 = this.e(0, timepoint);
                        this.d(e3, false, 0);
                        this.l = e3;
                        ((TimePickerDialog)this.j).y0(e3);
                    }
                }
                this.z = -1;
            }
            return false;
        }
        if (!this.y) {
            return true;
        }
        this.D = x;
        this.E = y;
        this.h = null;
        this.A = false;
        this.B = true;
        if (!this.m && ((TimePickerDialog)this.i).P == TimePickerDialog.Version.VERSION_1) {
            this.z = this.p.a(x, y);
        }
        else {
            this.z = -1;
        }
        final int z4 = this.z;
        if (z4 != 0 && z4 != 1) {
            final int a4 = this.a(x, y, this.F.isTouchExplorationEnabled(), array);
            this.C = a4;
            final Timepoint b = this.b(a4, array[0], false);
            final e i = this.i;
            final int currentItemShowing2 = this.getCurrentItemShowing();
            final TimePickerDialog timePickerDialog3 = (TimePickerDialog)i;
            final f r = timePickerDialog3.R;
            Timepoint.TYPE type;
            if (timePickerDialog3.H) {
                type = Timepoint.TYPE.SECOND;
            }
            else if (timePickerDialog3.I) {
                type = Timepoint.TYPE.MINUTE;
            }
            else {
                type = Timepoint.TYPE.HOUR;
            }
            if (r.e0(b, currentItemShowing2, type)) {
                this.C = -1;
            }
            if (this.C != -1) {
                ((TimePickerDialog)this.i).H0();
                this.H.postDelayed((Runnable)new t0((ViewGroup)this, 1, array), (long)this.g);
            }
        }
        else {
            ((TimePickerDialog)this.i).H0();
            this.C = -1;
            this.H.postDelayed((Runnable)new wp1.f((Object)this, 16), (long)this.g);
        }
        return true;
    }
    
    public final boolean performAccessibilityAction(int n, final Bundle bundle) {
        if (super.performAccessibilityAction(n, bundle)) {
            return true;
        }
        if (n == 4096) {
            n = 1;
        }
        else if (n == 8192) {
            n = -1;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            int currentlyShowingValue = this.getCurrentlyShowingValue();
            final int currentItemShowing = this.getCurrentItemShowing();
            int n2 = 6;
            if (currentItemShowing == 0) {
                currentlyShowingValue %= 12;
                n2 = 30;
            }
            else if (currentItemShowing != 1) {
                if (currentItemShowing != 2) {
                    n2 = 0;
                }
            }
            final int n3 = currentlyShowingValue * n2;
            final int n4 = n3 / 30 * 30;
            final int n5 = n4 + 30;
            Label_0171: {
                if (n != 1) {
                    if (n == -1) {
                        if (n3 == (n = n4)) {
                            n = n4 - 30;
                        }
                        break Label_0171;
                    }
                    else if (n3 - n4 < n5 - n3) {
                        n = n4;
                        break Label_0171;
                    }
                }
                n = n5;
            }
            final int n6 = n / n2;
            int n7 = 0;
            Label_0207: {
                if (currentItemShowing == 0) {
                    if (!this.m) {
                        n = 12;
                        n7 = 1;
                        break Label_0207;
                    }
                    n = 23;
                }
                else {
                    n = 55;
                }
                n7 = 0;
            }
            int n8;
            if (n6 > n) {
                n8 = n7;
            }
            else if ((n8 = n6) < n7) {
                n8 = n;
            }
            Timepoint l;
            if (currentItemShowing != 0) {
                if (currentItemShowing != 1) {
                    if (currentItemShowing != 2) {
                        l = this.l;
                    }
                    else {
                        final Timepoint i = this.l;
                        l = new Timepoint(i.f, i.g, n8);
                    }
                }
                else {
                    final Timepoint j = this.l;
                    l = new Timepoint(j.f, n8, j.h);
                }
            }
            else {
                final Timepoint k = this.l;
                l = new Timepoint(n8, k.g, k.h);
            }
            this.d(this.l = this.e(currentItemShowing, l), false, currentItemShowing);
            ((TimePickerDialog)this.j).y0(l);
            return true;
        }
        return false;
    }
    
    public void setAmOrPm(int amOrPm) {
        this.p.setAmOrPm(amOrPm);
        ((View)this.p).invalidate();
        final Timepoint timepoint = new Timepoint(this.l);
        if (amOrPm == 0) {
            amOrPm = timepoint.f;
            if (amOrPm >= 12) {
                timepoint.f = amOrPm % 12;
            }
        }
        else if (amOrPm == 1) {
            amOrPm = timepoint.f;
            if (amOrPm < 12) {
                timepoint.f = (amOrPm + 12) % 24;
            }
        }
        final Timepoint e = this.e(0, timepoint);
        this.d(e, false, 0);
        this.l = e;
        ((TimePickerDialog)this.j).y0(e);
    }
    
    public void setOnValueSelectedListener(final a j) {
        this.j = j;
    }
    
    public void setTime(Timepoint e) {
        e = this.e(0, e);
        this.d(this.l = e, false, 0);
    }
    
    public interface a
    {
    }
}
