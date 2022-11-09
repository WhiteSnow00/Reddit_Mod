// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.widget.LinearLayout;
import android.widget.FrameLayout;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import com.bytedance.covode.number.Covode;
import android.widget.AdapterView$OnItemClickListener;
import android.os.Handler;
import android.widget.TextView;
import android.view.View;
import android.widget.ListView;
import android.widget.ListAdapter;

public class ListFragment extends Fragment
{
    public ListAdapter LIZ;
    public ListView LIZIZ;
    public View LIZJ;
    public TextView LIZLLL;
    public View LJ;
    public View LJFF;
    public CharSequence LJI;
    public boolean LJII;
    public final Handler LJIIIIZZ;
    public final Runnable LJIIIZ;
    public final AdapterView$OnItemClickListener LJIIJ;
    
    static {
        Covode.recordClassIndex(1047);
    }
    
    public ListFragment() {
        this.LJIIIIZZ = new Handler();
        this.LJIIIZ = new Runnable() {
            static {
                Covode.recordClassIndex(1048);
            }
            
            @Override
            public final void run() {
                ListFragment.this.LIZIZ.focusableViewAvailable((View)ListFragment.this.LIZIZ);
            }
        };
        this.LJIIJ = (AdapterView$OnItemClickListener)new AdapterView$OnItemClickListener() {
            static {
                Covode.recordClassIndex(1049);
            }
            
            public final void onItemClick(final AdapterView<?> adapterView, final View view, final int n, final long n2) {
            }
        };
    }
    
    private void LIZ() {
        if (this.LIZIZ != null) {
            return;
        }
        final View view = this.getView();
        if (view != null) {
            if (view instanceof ListView) {
                this.LIZIZ = (ListView)view;
            }
            else {
                final TextView lizlll = (TextView)view.findViewById(16711681);
                if ((this.LIZLLL = lizlll) == null) {
                    this.LIZJ = view.findViewById(16908292);
                }
                else {
                    lizlll.setVisibility(8);
                }
                this.LJ = view.findViewById(16711682);
                this.LJFF = view.findViewById(16711683);
                final View viewById = view.findViewById(16908298);
                if (!(viewById instanceof ListView)) {
                    if (viewById == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    }
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                else {
                    final ListView liziz = (ListView)viewById;
                    this.LIZIZ = liziz;
                    final View lizj = this.LIZJ;
                    if (lizj != null) {
                        liziz.setEmptyView(lizj);
                    }
                    else {
                        final CharSequence lji = this.LJI;
                        if (lji != null) {
                            this.LIZLLL.setText(lji);
                            this.LIZIZ.setEmptyView((View)this.LIZLLL);
                        }
                    }
                }
            }
            this.LJII = true;
            this.LIZIZ.setOnItemClickListener(this.LJIIJ);
            final ListAdapter liz = this.LIZ;
            if (liz != null) {
                this.LIZ = null;
                this.LIZ(liz);
            }
            else if (this.LJ != null) {
                this.LIZ(false, false);
            }
            this.LJIIIIZZ.post(this.LJIIIZ);
            return;
        }
        throw new IllegalStateException("Content view not yet created");
    }
    
    private void LIZ(final ListAdapter listAdapter) {
        final ListAdapter liz = this.LIZ;
        boolean b = false;
        boolean b2;
        if (liz != null) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        this.LIZ = listAdapter;
        final ListView liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.setAdapter(listAdapter);
            if (!this.LJII && !b2) {
                if (this.requireView().getWindowToken() != null) {
                    b = true;
                }
                this.LIZ(true, b);
            }
        }
    }
    
    private void LIZ(final boolean ljii, final boolean b) {
        this.LIZ();
        final View lj = this.LJ;
        if (lj == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        if (this.LJII == ljii) {
            return;
        }
        this.LJII = ljii;
        if (ljii) {
            if (b) {
                lj.startAnimation(AnimationUtils.loadAnimation(this.getContext(), 17432577));
                this.LJFF.startAnimation(AnimationUtils.loadAnimation(this.getContext(), 17432576));
            }
            else {
                lj.clearAnimation();
                this.LJFF.clearAnimation();
            }
            this.LJ.setVisibility(8);
            this.LJFF.setVisibility(0);
            return;
        }
        if (b) {
            lj.startAnimation(AnimationUtils.loadAnimation(this.getContext(), 17432576));
            this.LJFF.startAnimation(AnimationUtils.loadAnimation(this.getContext(), 17432577));
        }
        else {
            lj.clearAnimation();
            this.LJFF.clearAnimation();
        }
        this.LJ.setVisibility(0);
        this.LJFF.setVisibility(8);
    }
    
    @Override
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final Context requireContext = this.requireContext();
        final FrameLayout frameLayout = new FrameLayout(requireContext);
        final LinearLayout linearLayout = new LinearLayout(requireContext);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView((View)new ProgressBar(requireContext, (AttributeSet)null, 16842874), (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -2));
        frameLayout.addView((View)linearLayout, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
        final FrameLayout frameLayout2 = new FrameLayout(requireContext);
        frameLayout2.setId(16711683);
        final TextView textView = new TextView(requireContext);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView((View)textView, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
        final ListView listView = new ListView(requireContext);
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView((View)listView, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
        frameLayout.addView((View)frameLayout2, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
        frameLayout.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
        return (View)frameLayout;
    }
    
    @Override
    public void onDestroyView() {
        this.LJIIIIZZ.removeCallbacks(this.LJIIIZ);
        this.LIZIZ = null;
        this.LJII = false;
        this.LJFF = null;
        this.LJ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
        super.onDestroyView();
    }
    
    @Override
    public void onViewCreated(final View view, final Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LIZ();
    }
}
