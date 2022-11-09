// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.datepicker;

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
import eg.n0;
import android.graphics.drawable.StateListDrawable;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.WeakHashMap;
import android.view.View;
import a4.p0;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.app.Dialog;
import android.os.Bundle;
import java.util.Iterator;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import sf.b;
import android.content.res.Resources;
import android.content.Context;
import android.widget.Button;
import vf.f;
import com.google.android.material.internal.CheckableImageButton;
import android.widget.TextView;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnCancelListener;
import android.view.View$OnClickListener;
import java.util.LinkedHashSet;
import androidx.fragment.app.n;

public final class o<S> extends n
{
    public static final /* synthetic */ int w = 0;
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
    
    public static int n0(final Context context) {
        final Resources resources = context.getResources();
        final int dimensionPixelOffset = resources.getDimensionPixelOffset(2131166194);
        final int j = new s(a0.c()).j;
        return a.w(j, -1, resources.getDimensionPixelOffset(2131166214), resources.getDimensionPixelSize(2131166200) * j + dimensionPixelOffset * 2);
    }
    
    public static boolean o0(final Context context) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b.b(context, 2130969399, MaterialCalendar.class.getCanonicalName()), new int[] { 16843277 });
        final boolean boolean1 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return boolean1;
    }
    
    public final void onCancel(final DialogInterface dialogInterface) {
        final Iterator<Object> iterator = this.h.iterator();
        while (iterator.hasNext()) {
            iterator.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }
    
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = bundle;
        if (bundle == null) {
            arguments = ((Fragment)this).getArguments();
        }
        this.j = ((BaseBundle)arguments).getInt("OVERRIDE_THEME_RES_ID");
        this.k = (d<S>)arguments.getParcelable("DATE_SELECTOR_KEY");
        this.m = (a)arguments.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.o = ((BaseBundle)arguments).getInt("TITLE_TEXT_RES_ID_KEY");
        this.p = arguments.getCharSequence("TITLE_TEXT_KEY");
        this.r = ((BaseBundle)arguments).getInt("INPUT_MODE_KEY");
    }
    
    public final Dialog onCreateDialog(final Bundle bundle) {
        final Context requireContext = ((Fragment)this).requireContext();
        ((Fragment)this).requireContext();
        int n = this.j;
        if (n == 0) {
            n = this.k.I();
        }
        final Dialog dialog = new Dialog(requireContext, n);
        final Context context = dialog.getContext();
        this.q = o0(context);
        final int b = sf.b.b(context, 2130968836, o.class.getCanonicalName());
        (this.u = new f(context, (AttributeSet)null, 2130969399, 2132018126)).i(context);
        this.u.l(ColorStateList.valueOf(b));
        final f u = this.u;
        final View decorView = dialog.getWindow().getDecorView();
        final WeakHashMap a = p0.a;
        u.k(p0.i.i(decorView));
        return dialog;
    }
    
    public final View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        int n;
        if (this.q) {
            n = 2131624918;
        }
        else {
            n = 2131624917;
        }
        final View inflate = layoutInflater.inflate(n, viewGroup);
        final Context context = inflate.getContext();
        if (this.q) {
            inflate.findViewById(2131430191).setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(n0(context), -2));
        }
        else {
            final View viewById = inflate.findViewById(2131430192);
            final View viewById2 = inflate.findViewById(2131430191);
            viewById.setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(n0(context), -1));
            final Resources resources = ((Fragment)this).requireContext().getResources();
            final int dimensionPixelSize = resources.getDimensionPixelSize(2131166217);
            final int dimensionPixelOffset = resources.getDimensionPixelOffset(2131166218);
            final int dimensionPixelOffset2 = resources.getDimensionPixelOffset(2131166216);
            final int dimensionPixelSize2 = resources.getDimensionPixelSize(2131166201);
            final int j = com.google.android.material.datepicker.t.j;
            viewById2.setMinimumHeight(dimensionPixelOffset2 + (dimensionPixelOffset + dimensionPixelSize) + dimensionPixelSize2 + (resources.getDimensionPixelOffset(2131166215) * (j - 1) + resources.getDimensionPixelSize(2131166196) * j) + resources.getDimensionPixelOffset(2131166193));
        }
        final TextView s = (TextView)inflate.findViewById(2131430203);
        this.s = s;
        final WeakHashMap a = p0.a;
        p0.g.f((View)s, 1);
        this.t = (CheckableImageButton)inflate.findViewById(2131430205);
        final TextView textView = (TextView)inflate.findViewById(2131430209);
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
        imageDrawable.addState(new int[] { 16842912 }, n0.L(context, 2131232650));
        imageDrawable.addState(new int[0], n0.L(context, 2131232652));
        t.setImageDrawable((Drawable)imageDrawable);
        this.t.setChecked(this.r != 0);
        p0.l((View)this.t, (a4.a)null);
        this.r0(this.t);
        ((View)this.t).setOnClickListener((View$OnClickListener)new p(this));
        this.v = (Button)inflate.findViewById(2131428428);
        if (this.k.Z()) {
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
        final Button button = (Button)inflate.findViewById(2131428147);
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
    
    public final void onDismiss(final DialogInterface dialogInterface) {
        final Iterator<Object> iterator = this.i.iterator();
        while (iterator.hasNext()) {
            iterator.next().onDismiss(dialogInterface);
        }
        final ViewGroup viewGroup = (ViewGroup)((Fragment)this).getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }
    
    public final void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ((BaseBundle)bundle).putInt("OVERRIDE_THEME_RES_ID", this.j);
        bundle.putParcelable("DATE_SELECTOR_KEY", (Parcelable)this.k);
        final a$b a$b = new a$b(this.m);
        final s j = this.n.j;
        if (j != null) {
            a$b.c = j.l;
        }
        if (a$b.c == null) {
            final long l = new s(a0.c()).l;
            long a = a$b.a;
            if (a <= l && l <= a$b.b) {
                a = l;
            }
            a$b.c = a;
        }
        final Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", (Parcelable)a$b.d);
        final long a2 = a$b.a;
        final Calendar d = a0.d((Calendar)null);
        d.setTimeInMillis(a2);
        final s s = new s(d);
        final long b = a$b.b;
        final Calendar d2 = a0.d((Calendar)null);
        d2.setTimeInMillis(b);
        final s s2 = new s(d2);
        final long longValue = a$b.c;
        final Calendar d3 = a0.d((Calendar)null);
        d3.setTimeInMillis(longValue);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", (Parcelable)new a(s, s2, new s(d3), (a$c)bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY")));
        ((BaseBundle)bundle).putInt("TITLE_TEXT_RES_ID_KEY", this.o);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.p);
    }
    
    public final void onStart() {
        super.onStart();
        final Window window = this.requireDialog().getWindow();
        if (this.q) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable((Drawable)this.u);
        }
        else {
            window.setLayout(-2, -2);
            final int dimensionPixelOffset = ((Fragment)this).getResources().getDimensionPixelOffset(2131166202);
            final Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable((Drawable)new InsetDrawable((Drawable)this.u, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener((View$OnTouchListener)new mf.a(this.requireDialog(), rect));
        }
        this.p0();
    }
    
    public final void onStop() {
        this.l.f.clear();
        super.onStop();
    }
    
    public final void p0() {
        final d<S> k = this.k;
        ((Fragment)this).requireContext();
        int n = this.j;
        if (n == 0) {
            n = this.k.I();
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
        this.q0();
        final d0 childFragmentManager = ((Fragment)this).getChildFragmentManager();
        childFragmentManager.getClass();
        final androidx.fragment.app.a a = new androidx.fragment.app.a(childFragmentManager);
        a.f(2131430191, (Fragment)this.l, null);
        a.m();
        this.l.f.add(new w<S>() {
            @Override
            public final void a(final S n) {
                final o a = com.google.android.material.datepicker.o.this;
                final int w = com.google.android.material.datepicker.o.w;
                a.q0();
                final o a2 = com.google.android.material.datepicker.o.this;
                ((View)a2.v).setEnabled(a2.k.Z());
            }
        });
    }
    
    public final void q0() {
        final d<S> k = this.k;
        ((Fragment)this).getContext();
        final String g0 = k.G0();
        ((View)this.s).setContentDescription((CharSequence)String.format(((Fragment)this).getString(2131956000), g0));
        this.s.setText((CharSequence)g0);
    }
    
    public final void r0(final CheckableImageButton checkableImageButton) {
        String contentDescription;
        if (this.t.isChecked()) {
            contentDescription = ((View)checkableImageButton).getContext().getString(2131956025);
        }
        else {
            contentDescription = ((View)checkableImageButton).getContext().getString(2131956027);
        }
        ((View)this.t).setContentDescription((CharSequence)contentDescription);
    }
}
