// 
// Decompiled by Procyon v0.6.0
// 

package androidx.biometric;

import androidx.lifecycle.LiveData;
import androidx.appcompat.app.e;
import android.view.View;
import android.content.DialogInterface$OnClickListener;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.appcompat.app.e$a;
import android.app.Dialog;
import n3.a;
import android.os.Build$VERSION;
import androidx.lifecycle.y;
import androidx.lifecycle.q;
import androidx.lifecycle.q0;
import androidx.lifecycle.n0;
import android.os.Bundle;
import androidx.lifecycle.x;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import androidx.fragment.app.r;
import android.content.Context;
import android.util.Log;
import android.util.TypedValue;
import android.os.Looper;
import android.widget.TextView;
import android.widget.ImageView;
import android.os.Handler;
import androidx.fragment.app.n;

public class w extends n
{
    public final Handler f;
    public final w$a g;
    public s h;
    public int i;
    public int j;
    public ImageView k;
    public TextView l;
    
    public w() {
        this.f = new Handler(Looper.getMainLooper());
        this.g = new w$a(this);
    }
    
    public final int F(int color) {
        final Context context = this.getContext();
        final r activity = this.getActivity();
        if (context != null && activity != null) {
            final TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(color, typedValue, true);
            final TypedArray obtainStyledAttributes = ((Context)activity).obtainStyledAttributes(typedValue.data, new int[] { color });
            color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            return color;
        }
        Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
        return 0;
    }
    
    @Override
    public final void onCancel(final DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        final s h = this.h;
        if (h.x == null) {
            h.x = new x();
        }
        s.i(h.x, (Object)Boolean.TRUE);
    }
    
    @Override
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final r activity = this.getActivity();
        if (activity != null) {
            final s h = new n0((q0)activity).a(s.class);
            this.h = h;
            if (h.z == null) {
                h.z = new x();
            }
            ((LiveData<Object>)h.z).e((q)this, (y<? super Object>)new androidx.biometric.x(this));
            final s h2 = this.h;
            if (h2.A == null) {
                h2.A = new x();
            }
            ((LiveData<Object>)h2.A).e((q)this, (y<? super Object>)new androidx.biometric.y(this));
        }
        if (Build$VERSION.SDK_INT >= 26) {
            this.i = this.F(w.w$d.a());
        }
        else {
            final Context context = this.getContext();
            int color;
            if (context != null) {
                color = a.getColor(context, 2131099746);
            }
            else {
                color = 0;
            }
            this.i = color;
        }
        this.j = this.F(16842808);
    }
    
    @Override
    public final Dialog onCreateDialog(final Bundle bundle) {
        final e$a e$a = new e$a(this.requireContext());
        final BiometricPrompt$d f = this.h.f;
        CharSequence a;
        if (f != null) {
            a = f.a;
        }
        else {
            a = null;
        }
        e$a.setTitle(a);
        final View inflate = LayoutInflater.from(e$a.getContext()).inflate(2131624265, (ViewGroup)null);
        final TextView textView = (TextView)inflate.findViewById(2131429074);
        if (textView != null) {
            this.h.getClass();
            if (TextUtils.isEmpty((CharSequence)null)) {
                ((View)textView).setVisibility(8);
            }
            else {
                ((View)textView).setVisibility(0);
                textView.setText((CharSequence)null);
            }
        }
        final TextView textView2 = (TextView)inflate.findViewById(2131429071);
        if (textView2 != null) {
            this.h.getClass();
            if (TextUtils.isEmpty((CharSequence)null)) {
                ((View)textView2).setVisibility(8);
            }
            else {
                ((View)textView2).setVisibility(0);
                textView2.setText((CharSequence)null);
            }
        }
        this.k = (ImageView)inflate.findViewById(2131429073);
        this.l = (TextView)inflate.findViewById(2131429072);
        CharSequence charSequence;
        if (c.a(this.h.c())) {
            charSequence = this.getString(2131952723);
        }
        else {
            charSequence = this.h.d();
        }
        e$a.setNegativeButton(charSequence, (DialogInterface$OnClickListener)new w$b(this));
        e$a.setView(inflate);
        final e create = e$a.create();
        ((Dialog)create).setCanceledOnTouchOutside(false);
        return (Dialog)create;
    }
    
    public final void onPause() {
        super.onPause();
        this.f.removeCallbacksAndMessages((Object)null);
    }
    
    public final void onResume() {
        super.onResume();
        final s h = this.h;
        h.y = 0;
        h.g(1);
        this.h.f((CharSequence)this.getString(2131953546));
    }
}
