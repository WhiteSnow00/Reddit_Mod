// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.ui;

import android.widget.TextView;
import xc.g;
import java.util.ArrayList;
import java.util.List;
import android.content.res.TypedArray;
import android.view.View;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import ac.u;
import lq0.k;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import wc.e;
import android.util.SparseArray;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;

public class TrackSelectionView extends LinearLayout
{
    public final CheckedTextView f;
    public final CheckedTextView g;
    public final SparseArray<e.e> h;
    public boolean i;
    public boolean j;
    public boolean k;
    
    public TrackSelectionView(final Context context, final AttributeSet set) {
        super(context, set, 0);
        this.setOrientation(1);
        this.h = (SparseArray<e.e>)new SparseArray();
        ((View)this).setSaveFromParentEnabled(false);
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[] { 16843534 });
        final int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        final LayoutInflater from = LayoutInflater.from(context);
        final a a = new a();
        new k(((View)this).getResources());
        final u i = u.i;
        final CheckedTextView f = (CheckedTextView)from.inflate(17367055, (ViewGroup)this, false);
        ((View)(this.f = f)).setBackgroundResource(resourceId);
        ((TextView)f).setText(2131953441);
        ((View)f).setEnabled(false);
        ((View)f).setFocusable(true);
        ((View)f).setOnClickListener((View$OnClickListener)a);
        f.setVisibility(8);
        ((ViewGroup)this).addView((View)f);
        ((ViewGroup)this).addView(from.inflate(2131624246, (ViewGroup)this, false));
        final CheckedTextView g = (CheckedTextView)from.inflate(17367055, (ViewGroup)this, false);
        ((View)(this.g = g)).setBackgroundResource(resourceId);
        ((TextView)g).setText(2131953440);
        ((View)g).setEnabled(false);
        ((View)g).setFocusable(true);
        ((View)g).setOnClickListener((View$OnClickListener)a);
        ((ViewGroup)this).addView((View)g);
    }
    
    public final void a() {
        for (int i = ((ViewGroup)this).getChildCount() - 1; i >= 3; --i) {
            ((ViewGroup)this).removeViewAt(i);
        }
        ((View)this.f).setEnabled(false);
        ((View)this.g).setEnabled(false);
    }
    
    public boolean getIsDisabled() {
        return this.k;
    }
    
    public List<e.e> getOverrides() {
        final ArrayList list = new ArrayList(this.h.size());
        for (int i = 0; i < this.h.size(); ++i) {
            list.add(this.h.valueAt(i));
        }
        return list;
    }
    
    public void setAllowAdaptiveSelections(final boolean i) {
        if (this.i != i) {
            this.i = i;
            this.a();
        }
    }
    
    public void setAllowMultipleOverrides(final boolean j) {
        if (this.j != j) {
            this.j = j;
            if (!j && this.h.size() > 1) {
                for (int i = this.h.size() - 1; i > 0; --i) {
                    this.h.remove(i);
                }
            }
            this.a();
        }
    }
    
    public void setShowDisableOption(final boolean b) {
        final CheckedTextView f = this.f;
        int visibility;
        if (b) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        f.setVisibility(visibility);
    }
    
    public void setTrackNameProvider(final g g) {
        g.getClass();
        this.a();
    }
    
    public final class a implements View$OnClickListener
    {
        public final void onClick(final View view) {
            final TrackSelectionView f = TrackSelectionView.this;
            final CheckedTextView f2 = f.f;
            boolean checked = true;
            if (view == f2) {
                f.k = true;
                f.h.clear();
            }
            else {
                if (view != f.g) {
                    f.k = false;
                    final Object tag = view.getTag();
                    tag.getClass();
                    final b b = (b)tag;
                    final e.e e = (e.e)f.h.get(0);
                    throw null;
                }
                f.k = false;
                f.h.clear();
            }
            f.f.setChecked(f.k);
            final CheckedTextView g = f.g;
            if (f.k || f.h.size() != 0) {
                checked = false;
            }
            g.setChecked(checked);
            throw null;
        }
    }
    
    public static final class b
    {
        public b() {
            throw null;
        }
    }
}
