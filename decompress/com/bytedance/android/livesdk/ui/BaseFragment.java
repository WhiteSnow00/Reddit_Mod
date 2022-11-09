// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.livesdk.ui;

import X.2fc;
import android.view.View;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import X.FH6;
import androidx.fragment.app.Fragment;

public class BaseFragment extends Fragment
{
    public final FH6 compositeDisposable;
    public boolean mStatusActive;
    public boolean mStatusDestroyed;
    public boolean mStatusViewValid;
    
    static {
        Covode.recordClassIndex(23339);
    }
    
    public BaseFragment() {
        this.compositeDisposable = new FH6();
    }
    
    public boolean isViewValid() {
        return this.mStatusViewValid;
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.mStatusActive = false;
        this.mStatusViewValid = false;
        this.mStatusDestroyed = false;
    }
    
    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mStatusViewValid = false;
        this.mStatusDestroyed = true;
        this.compositeDisposable.LIZ();
    }
    
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        this.mStatusViewValid = false;
    }
    
    @Override
    public void onPause() {
        super.onPause();
        this.mStatusActive = false;
    }
    
    @Override
    public void onResume() {
        super.onResume();
        if (this.getUserVisibleHint()) {
            this.onVisible();
        }
        this.mStatusActive = true;
    }
    
    @Override
    public void onViewCreated(final View view, final Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mStatusViewValid = true;
    }
    
    public void onVisible() {
    }
    
    public void register(final 2fc 2fc) {
        this.compositeDisposable.LIZ(2fc);
    }
    
    @Override
    public void setUserVisibleHint(final boolean userVisibleHint) {
        boolean b;
        if (userVisibleHint != this.getUserVisibleHint()) {
            b = true;
        }
        else {
            b = false;
        }
        super.setUserVisibleHint(userVisibleHint);
        if (this.isResumed() && b && this.getUserVisibleHint()) {
            this.onVisible();
        }
    }
}
