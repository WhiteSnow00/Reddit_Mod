// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.datepicker;

import androidx.appcompat.widget.AppCompatImageButton;
import android.os.BaseBundle;
import androidx.fragment.app.d0;
import androidx.fragment.app.Fragment;
import android.view.Window;
import android.view.View$OnTouchListener;
import android.graphics.drawable.InsetDrawable;
import android.graphics.Rect;
import java.util.Calendar;
import android.os.Parcelable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import a4.q0$g;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import a4.t1;
import java.util.WeakHashMap;
import android.view.View;
import a4.q0$i;
import a4.q0;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.app.Dialog;
import android.os.Bundle;
import java.util.Iterator;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import qf.b;
import android.content.res.Resources;
import al0.f0;
import android.content.Context;
import android.widget.Button;
import tf.f;
import com.google.android.material.internal.CheckableImageButton;
import android.widget.TextView;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnCancelListener;
import android.view.View$OnClickListener;
import java.util.LinkedHashSet;
import androidx.fragment.app.n;

public final class o<S> extends n
{
    public final LinkedHashSet<q<? super S>> f;
    public final LinkedHashSet<View$OnClickListener> g;
    public final LinkedHashSet<DialogInterface$OnCancelListener> h;
    public final LinkedHashSet<DialogInterface$OnDismissListener> i;
    public int j;
    public d<S> k;
    public x<S> l;
    public a m;
    public MaterialCalendar<S> n;
    public int o;
    public CharSequence p;
    public boolean q;
    public int r;
    public TextView s;
    public CheckableImageButton t;
    public f u;
    public Button v;
    
    public o() {
        this.f = new LinkedHashSet<q<? super S>>();
        this.g = new LinkedHashSet<View$OnClickListener>();
        this.h = new LinkedHashSet<DialogInterface$OnCancelListener>();
        this.i = new LinkedHashSet<DialogInterface$OnDismissListener>();
    }
    
    public static int F(final Context context) {
        final Resources resources = context.getResources();
        final int dimensionPixelOffset = resources.getDimensionPixelOffset(2131166189);
        final int j = new s(a0.c()).j;
        return f0.a(j, -1, resources.getDimensionPixelOffset(2131166209), resources.getDimensionPixelSize(2131166195) * j + dimensionPixelOffset * 2);
    }
    
    public static boolean p0(final Context context) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b.b(context, 2130969392, MaterialCalendar.class.getCanonicalName()), new int[] { 16843277 });
        final boolean boolean1 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return boolean1;
    }
    
    @Override
    public final void onCancel(final DialogInterface dialogInterface) {
        final Iterator<Object> iterator = this.h.iterator();
        while (iterator.hasNext()) {
            iterator.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }
    
    @Override
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = bundle;
        if (bundle == null) {
            arguments = this.getArguments();
        }
        this.j = ((BaseBundle)arguments).getInt("OVERRIDE_THEME_RES_ID");
        this.k = (d)arguments.getParcelable("DATE_SELECTOR_KEY");
        this.m = (a)arguments.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.o = ((BaseBundle)arguments).getInt("TITLE_TEXT_RES_ID_KEY");
        this.p = arguments.getCharSequence("TITLE_TEXT_KEY");
        this.r = ((BaseBundle)arguments).getInt("INPUT_MODE_KEY");
    }
    
    @Override
    public final Dialog onCreateDialog(final Bundle bundle) {
        final Context requireContext = this.requireContext();
        this.requireContext();
        int n = this.j;
        if (n == 0) {
            n = this.k.J();
        }
        final Dialog dialog = new Dialog(requireContext, n);
        final Context context = dialog.getContext();
        this.q = p0(context);
        final int b = qf.b.b(context, 2130968836, o.class.getCanonicalName());
        (this.u = new f(context, (AttributeSet)null, 2130969392, 2132018124)).i(context);
        this.u.l(ColorStateList.valueOf(b));
        final f u = this.u;
        final View decorView = dialog.getWindow().getDecorView();
        final WeakHashMap<View, t1> a = q0.a;
        u.k(q0$i.i(decorView));
        return dialog;
    }
    
    public final View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        int n;
        if (this.q) {
            n = 2131624909;
        }
        else {
            n = 2131624908;
        }
        final View inflate = layoutInflater.inflate(n, viewGroup);
        final Context context = inflate.getContext();
        if (this.q) {
            inflate.findViewById(2131430181).setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(F(context), -2));
        }
        else {
            final View viewById = inflate.findViewById(2131430182);
            final View viewById2 = inflate.findViewById(2131430181);
            viewById.setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(F(context), -1));
            final Resources resources = this.requireContext().getResources();
            final int dimensionPixelSize = resources.getDimensionPixelSize(2131166212);
            final int dimensionPixelOffset = resources.getDimensionPixelOffset(2131166213);
            final int dimensionPixelOffset2 = resources.getDimensionPixelOffset(2131166211);
            final int dimensionPixelSize2 = resources.getDimensionPixelSize(2131166196);
            final int j = com.google.android.material.datepicker.t.j;
            viewById2.setMinimumHeight(dimensionPixelOffset2 + (dimensionPixelOffset + dimensionPixelSize) + dimensionPixelSize2 + (resources.getDimensionPixelOffset(2131166210) * (j - 1) + resources.getDimensionPixelSize(2131166191) * j) + resources.getDimensionPixelOffset(2131166188));
        }
        final TextView s = (TextView)inflate.findViewById(2131430193);
        this.s = s;
        final WeakHashMap<View, t1> a = q0.a;
        q0$g.f((View)s, 1);
        this.t = (CheckableImageButton)inflate.findViewById(2131430195);
        final TextView textView = (TextView)inflate.findViewById(2131430199);
        final CharSequence p3 = this.p;
        if (p3 != null) {
            textView.setText(p3);
        }
        else {
            textView.setText(this.o);
        }
        ((View)this.t).setTag((Object)"TOGGLE_BUTTON_TAG");
        final CheckableImageButton t = this.t;
        final StateListDrawable imageDrawable = new StateListDrawable();
        imageDrawable.addState(new int[] { 16842912 }, wd.a.L(context, 2131232652));
        imageDrawable.addState(new int[0], wd.a.L(context, 2131232654));
        ((AppCompatImageButton)t).setImageDrawable((Drawable)imageDrawable);
        this.t.setChecked(this.r != 0);
        q0.l((View)this.t, null);
        this.s0(this.t);
        ((View)this.t).setOnClickListener((View$OnClickListener)new p(this));
        this.v = (Button)inflate.findViewById(2131428421);
        if (this.k.Y()) {
            ((View)this.v).setEnabled(true);
        }
        else {
            ((View)this.v).setEnabled(false);
        }
        ((View)this.v).setTag((Object)"CONFIRM_BUTTON_TAG");
        ((View)this.v).setOnClickListener((View$OnClickListener)new View$OnClickListener() {
            public final void onClick(final View view) {
                for (final q q : com.google.android.material.datepicker.o.this.f) {
                    com.google.android.material.datepicker.o.this.k.i();
                    q.a();
                }
                com.google.android.material.datepicker.o.this.dismiss();
            }
        });
        final Button button = (Button)inflate.findViewById(2131428146);
        ((View)button).setTag((Object)"CANCEL_BUTTON_TAG");
        ((View)button).setOnClickListener((View$OnClickListener)new View$OnClickListener() {
            public final void onClick(final View view) {
                final Iterator<Object> iterator = com.google.android.material.datepicker.o.this.g.iterator();
                while (iterator.hasNext()) {
                    iterator.next().onClick(view);
                }
                com.google.android.material.datepicker.o.this.dismiss();
            }
        });
        return inflate;
    }
    
    @Override
    public final void onDismiss(final DialogInterface dialogInterface) {
        final Iterator<Object> iterator = this.i.iterator();
        while (iterator.hasNext()) {
            iterator.next().onDismiss(dialogInterface);
        }
        final ViewGroup viewGroup = (ViewGroup)this.getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }
    
    @Override
    public final void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ((BaseBundle)bundle).putInt("OVERRIDE_THEME_RES_ID", this.j);
        bundle.putParcelable("DATE_SELECTOR_KEY", (Parcelable)this.k);
        final a.b b = new a.b(this.m);
        final s j = this.n.j;
        if (j != null) {
            b.c = j.l;
        }
        if (b.c == null) {
            long l = new s(a0.c()).l;
            final long a = b.a;
            if (a > l || l > b.b) {
                l = a;
            }
            b.c = l;
        }
        final Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", (Parcelable)b.d);
        final long a2 = b.a;
        final Calendar d = a0.d(null);
        d.setTimeInMillis(a2);
        final s s = new s(d);
        final long b2 = b.b;
        final Calendar d2 = a0.d(null);
        d2.setTimeInMillis(b2);
        final s s2 = new s(d2);
        final long longValue = b.c;
        final Calendar d3 = a0.d(null);
        d3.setTimeInMillis(longValue);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", (Parcelable)new a(s, s2, new s(d3), (a.c)bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY")));
        ((BaseBundle)bundle).putInt("TITLE_TEXT_RES_ID_KEY", this.o);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.p);
    }
    
    @Override
    public final void onStart() {
        super.onStart();
        final Window window = this.requireDialog().getWindow();
        if (this.q) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable((Drawable)this.u);
        }
        else {
            window.setLayout(-2, -2);
            final int dimensionPixelOffset = this.getResources().getDimensionPixelOffset(2131166197);
            final Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable((Drawable)new InsetDrawable((Drawable)this.u, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener((View$OnTouchListener)new kf.a(this.requireDialog(), rect));
        }
        this.q0();
    }
    
    @Override
    public final void onStop() {
        this.l.f.clear();
        super.onStop();
    }
    
    public final void q0() {
        final d<S> k = this.k;
        this.requireContext();
        int n = this.j;
        if (n == 0) {
            n = this.k.J();
        }
        final a m = this.m;
        final MaterialCalendar<S> n2 = new MaterialCalendar<S>();
        final Bundle arguments = new Bundle();
        ((BaseBundle)arguments).putInt("THEME_RES_ID_KEY", n);
        arguments.putParcelable("GRID_SELECTOR_KEY", (Parcelable)k);
        arguments.putParcelable("CALENDAR_CONSTRAINTS_KEY", (Parcelable)m);
        arguments.putParcelable("CURRENT_MONTH_KEY", (Parcelable)m.h);
        ((Fragment)n2).setArguments(arguments);
        this.n = n2;
        Object n3;
        if (this.t.isChecked()) {
            final d<S> i = this.k;
            final a j = this.m;
            n3 = new r<S>();
            final Bundle arguments2 = new Bundle();
            arguments2.putParcelable("DATE_SELECTOR_KEY", (Parcelable)i);
            arguments2.putParcelable("CALENDAR_CONSTRAINTS_KEY", (Parcelable)j);
            ((Fragment)n3).setArguments(arguments2);
        }
        else {
            n3 = this.n;
        }
        this.l = (x<S>)n3;
        this.r0();
        final d0 childFragmentManager = this.getChildFragmentManager();
        childFragmentManager.getClass();
        final androidx.fragment.app.a a = new androidx.fragment.app.a(childFragmentManager);
        a.f(2131430181, (Fragment)this.l, (String)null);
        a.m();
        this.l.f.add(new o$c(this));
    }
    
    public final void r0() {
        final d<S> k = this.k;
        this.getContext();
        final String h0 = k.H0();
        ((View)this.s).setContentDescription((CharSequence)String.format(this.getString(2131955995), h0));
        this.s.setText((CharSequence)h0);
    }
    
    public final void s0(final CheckableImageButton checkableImageButton) {
        String contentDescription;
        if (this.t.isChecked()) {
            contentDescription = ((View)checkableImageButton).getContext().getString(2131956020);
        }
        else {
            contentDescription = ((View)checkableImageButton).getContext().getString(2131956022);
        }
        ((View)this.t).setContentDescription((CharSequence)contentDescription);
    }
}
