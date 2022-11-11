// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.design.view.sheet;

import android.app.Dialog;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import androidx.appcompat.app.AppCompatDialogFragment;

public class LiveBottomSheetDialogFragment extends AppCompatDialogFragment
{
    static {
        Covode.recordClassIndex(6071);
    }
    
    @Override
    public Dialog onCreateDialog(final Bundle bundle) {
        return new LiveBottomSheetDialog(this.getContext(), this.getTheme());
    }
}
